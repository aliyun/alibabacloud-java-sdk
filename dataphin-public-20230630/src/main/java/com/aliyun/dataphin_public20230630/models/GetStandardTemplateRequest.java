// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardTemplateRequest extends TeaModel {
    @NameInMap("FilterQuery")
    public GetStandardTemplateRequestFilterQuery filterQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Nullable")
    public Boolean nullable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetStandardTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardTemplateRequest self = new GetStandardTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardTemplateRequest setFilterQuery(GetStandardTemplateRequestFilterQuery filterQuery) {
        this.filterQuery = filterQuery;
        return this;
    }
    public GetStandardTemplateRequestFilterQuery getFilterQuery() {
        return this.filterQuery;
    }

    public GetStandardTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetStandardTemplateRequest setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public GetStandardTemplateRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetStandardTemplateRequestFilterQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetStandardTemplateRequestFilterQuery build(java.util.Map<String, ?> map) throws Exception {
            GetStandardTemplateRequestFilterQuery self = new GetStandardTemplateRequestFilterQuery();
            return TeaModel.build(map, self);
        }

        public GetStandardTemplateRequestFilterQuery setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
