// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetUserIdByOpenDingtalkIdRequest extends TeaModel {
    @NameInMap("TenantContext")
    public BatchGetUserIdByOpenDingtalkIdRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;DTOJdYJ2IQC4HuexhtjsS8Qxxxx&quot;,&quot;D8301AKf6lmZbXiilcB4P2MVxxxx&quot;]</p>
     */
    @NameInMap("openDingtalkIds")
    public java.util.List<String> openDingtalkIds;

    public static BatchGetUserIdByOpenDingtalkIdRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetUserIdByOpenDingtalkIdRequest self = new BatchGetUserIdByOpenDingtalkIdRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetUserIdByOpenDingtalkIdRequest setTenantContext(BatchGetUserIdByOpenDingtalkIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public BatchGetUserIdByOpenDingtalkIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public BatchGetUserIdByOpenDingtalkIdRequest setOpenDingtalkIds(java.util.List<String> openDingtalkIds) {
        this.openDingtalkIds = openDingtalkIds;
        return this;
    }
    public java.util.List<String> getOpenDingtalkIds() {
        return this.openDingtalkIds;
    }

    public static class BatchGetUserIdByOpenDingtalkIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static BatchGetUserIdByOpenDingtalkIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            BatchGetUserIdByOpenDingtalkIdRequestTenantContext self = new BatchGetUserIdByOpenDingtalkIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public BatchGetUserIdByOpenDingtalkIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
