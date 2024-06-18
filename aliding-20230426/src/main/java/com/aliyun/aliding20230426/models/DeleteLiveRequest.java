// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteLiveRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4d38xxxxx</p>
     */
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("TenantContext")
    public DeleteLiveRequestTenantContext tenantContext;

    public static DeleteLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRequest self = new DeleteLiveRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public DeleteLiveRequest setTenantContext(DeleteLiveRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteLiveRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DeleteLiveRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteLiveRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteLiveRequestTenantContext self = new DeleteLiveRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteLiveRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
