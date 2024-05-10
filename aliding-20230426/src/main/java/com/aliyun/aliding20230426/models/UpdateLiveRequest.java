// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateLiveRequest extends TeaModel {
    @NameInMap("CoverUrl")
    public String coverUrl;

    @NameInMap("Introduction")
    public String introduction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LiveId")
    public String liveId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PreEndTime")
    public Long preEndTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PreStartTime")
    public Long preStartTime;

    @NameInMap("TenantContext")
    public UpdateLiveRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateLiveRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRequest self = new UpdateLiveRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public UpdateLiveRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public UpdateLiveRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public UpdateLiveRequest setPreEndTime(Long preEndTime) {
        this.preEndTime = preEndTime;
        return this;
    }
    public Long getPreEndTime() {
        return this.preEndTime;
    }

    public UpdateLiveRequest setPreStartTime(Long preStartTime) {
        this.preStartTime = preStartTime;
        return this;
    }
    public Long getPreStartTime() {
        return this.preStartTime;
    }

    public UpdateLiveRequest setTenantContext(UpdateLiveRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateLiveRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateLiveRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class UpdateLiveRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateLiveRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRequestTenantContext self = new UpdateLiveRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
