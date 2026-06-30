// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdByOpenDingtalkIdRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetUserIdByOpenDingtalkIdRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DTOJdYJ2IQC4HuexhtjsS8QiEiE</p>
     */
    @NameInMap("openDingtalkId")
    public String openDingtalkId;

    public static GetUserIdByOpenDingtalkIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByOpenDingtalkIdRequest self = new GetUserIdByOpenDingtalkIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByOpenDingtalkIdRequest setTenantContext(GetUserIdByOpenDingtalkIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetUserIdByOpenDingtalkIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetUserIdByOpenDingtalkIdRequest setOpenDingtalkId(String openDingtalkId) {
        this.openDingtalkId = openDingtalkId;
        return this;
    }
    public String getOpenDingtalkId() {
        return this.openDingtalkId;
    }

    public static class GetUserIdByOpenDingtalkIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetUserIdByOpenDingtalkIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserIdByOpenDingtalkIdRequestTenantContext self = new GetUserIdByOpenDingtalkIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetUserIdByOpenDingtalkIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
