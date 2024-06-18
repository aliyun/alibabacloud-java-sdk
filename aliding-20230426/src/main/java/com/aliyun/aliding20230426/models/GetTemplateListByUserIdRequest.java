// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTemplateListByUserIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Long size;

    @NameInMap("TenantContext")
    public GetTemplateListByUserIdRequestTenantContext tenantContext;

    public static GetTemplateListByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateListByUserIdRequest self = new GetTemplateListByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateListByUserIdRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public GetTemplateListByUserIdRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetTemplateListByUserIdRequest setTenantContext(GetTemplateListByUserIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetTemplateListByUserIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetTemplateListByUserIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetTemplateListByUserIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateListByUserIdRequestTenantContext self = new GetTemplateListByUserIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetTemplateListByUserIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
