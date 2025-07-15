// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAISubtitleRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the subtitle template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("SubtitleId")
    public String subtitleId;

    /**
     * <p>The name of the subtitle template. The name can contain only digits, letters, and hyphens (-). The name cannot start with a hyphen.</p>
     * 
     * <strong>example:</strong>
     * <p>sub01</p>
     */
    @NameInMap("SubtitleName")
    public String subtitleName;

    public static DeleteLiveAISubtitleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAISubtitleRequest self = new DeleteLiveAISubtitleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAISubtitleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveAISubtitleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLiveAISubtitleRequest setSubtitleId(String subtitleId) {
        this.subtitleId = subtitleId;
        return this;
    }
    public String getSubtitleId() {
        return this.subtitleId;
    }

    public DeleteLiveAISubtitleRequest setSubtitleName(String subtitleName) {
        this.subtitleName = subtitleName;
        return this;
    }
    public String getSubtitleName() {
        return this.subtitleName;
    }

}
