// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetLiveReplayUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("TenantContext")
    public GetLiveReplayUrlRequestTenantContext tenantContext;

    public static GetLiveReplayUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveReplayUrlRequest self = new GetLiveReplayUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveReplayUrlRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public GetLiveReplayUrlRequest setTenantContext(GetLiveReplayUrlRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetLiveReplayUrlRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetLiveReplayUrlRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetLiveReplayUrlRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetLiveReplayUrlRequestTenantContext self = new GetLiveReplayUrlRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetLiveReplayUrlRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
