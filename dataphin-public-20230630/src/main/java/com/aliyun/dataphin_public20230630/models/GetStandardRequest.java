// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StandardGetQuery")
    public GetStandardRequestStandardGetQuery standardGetQuery;

    public static GetStandardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardRequest self = new GetStandardRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetStandardRequest setStandardGetQuery(GetStandardRequestStandardGetQuery standardGetQuery) {
        this.standardGetQuery = standardGetQuery;
        return this;
    }
    public GetStandardRequestStandardGetQuery getStandardGetQuery() {
        return this.standardGetQuery;
    }

    public static class GetStandardRequestStandardGetQuery extends TeaModel {
        @NameInMap("NeedRelation")
        public Boolean needRelation;

        @NameInMap("Nullable")
        public Boolean nullable;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("StandardStage")
        public String standardStage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static GetStandardRequestStandardGetQuery build(java.util.Map<String, ?> map) throws Exception {
            GetStandardRequestStandardGetQuery self = new GetStandardRequestStandardGetQuery();
            return TeaModel.build(map, self);
        }

        public GetStandardRequestStandardGetQuery setNeedRelation(Boolean needRelation) {
            this.needRelation = needRelation;
            return this;
        }
        public Boolean getNeedRelation() {
            return this.needRelation;
        }

        public GetStandardRequestStandardGetQuery setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetStandardRequestStandardGetQuery setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public GetStandardRequestStandardGetQuery setStandardStage(String standardStage) {
            this.standardStage = standardStage;
            return this;
        }
        public String getStandardStage() {
            return this.standardStage;
        }

        public GetStandardRequestStandardGetQuery setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
