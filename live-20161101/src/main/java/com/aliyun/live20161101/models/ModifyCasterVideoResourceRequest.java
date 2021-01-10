// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterVideoResourceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("LiveStreamUrl")
    public String liveStreamUrl;

    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("VodUrl")
    public String vodUrl;

    @NameInMap("BeginOffset")
    public Integer beginOffset;

    @NameInMap("EndOffset")
    public Integer endOffset;

    @NameInMap("RepeatNum")
    public Integer repeatNum;

    @NameInMap("PtsCallbackInterval")
    public Integer ptsCallbackInterval;

    public static ModifyCasterVideoResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterVideoResourceRequest self = new ModifyCasterVideoResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCasterVideoResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCasterVideoResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterVideoResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ModifyCasterVideoResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ModifyCasterVideoResourceRequest setLiveStreamUrl(String liveStreamUrl) {
        this.liveStreamUrl = liveStreamUrl;
        return this;
    }
    public String getLiveStreamUrl() {
        return this.liveStreamUrl;
    }

    public ModifyCasterVideoResourceRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public ModifyCasterVideoResourceRequest setVodUrl(String vodUrl) {
        this.vodUrl = vodUrl;
        return this;
    }
    public String getVodUrl() {
        return this.vodUrl;
    }

    public ModifyCasterVideoResourceRequest setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }
    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    public ModifyCasterVideoResourceRequest setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }
    public Integer getEndOffset() {
        return this.endOffset;
    }

    public ModifyCasterVideoResourceRequest setRepeatNum(Integer repeatNum) {
        this.repeatNum = repeatNum;
        return this;
    }
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    public ModifyCasterVideoResourceRequest setPtsCallbackInterval(Integer ptsCallbackInterval) {
        this.ptsCallbackInterval = ptsCallbackInterval;
        return this;
    }
    public Integer getPtsCallbackInterval() {
        return this.ptsCallbackInterval;
    }

}
