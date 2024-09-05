// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetUserIdRequestTenantContext tenantContext;

    /**
     * <p>unionId</p>
     * 
     * <strong>example:</strong>
     * <p>****iE</p>
     */
    @NameInMap("UnionId")
    public String unionId;

    public static GetUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdRequest self = new GetUserIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdRequest setTenantContext(GetUserIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetUserIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetUserIdRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public static class GetUserIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetUserIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserIdRequestTenantContext self = new GetUserIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetUserIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
