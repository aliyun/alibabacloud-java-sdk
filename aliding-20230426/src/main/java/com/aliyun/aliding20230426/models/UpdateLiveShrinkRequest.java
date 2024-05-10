// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateLiveShrinkRequest extends TeaModel {
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
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateLiveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveShrinkRequest self = new UpdateLiveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveShrinkRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public UpdateLiveShrinkRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public UpdateLiveShrinkRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public UpdateLiveShrinkRequest setPreEndTime(Long preEndTime) {
        this.preEndTime = preEndTime;
        return this;
    }
    public Long getPreEndTime() {
        return this.preEndTime;
    }

    public UpdateLiveShrinkRequest setPreStartTime(Long preStartTime) {
        this.preStartTime = preStartTime;
        return this;
    }
    public Long getPreStartTime() {
        return this.preStartTime;
    }

    public UpdateLiveShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UpdateLiveShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
