// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterVideoResourceRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("ResourceName")
    @Validation(required = true)
    public String resourceName;

    @NameInMap("LocationId")
    public String locationId;

    @NameInMap("LiveStreamUrl")
    public String liveStreamUrl;

    @NameInMap("StreamId")
    public String streamId;

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

    public static AddCasterVideoResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterVideoResourceRequest self = new AddCasterVideoResourceRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterVideoResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterVideoResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public AddCasterVideoResourceRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

    public AddCasterVideoResourceRequest setLiveStreamUrl(String liveStreamUrl) {
        this.liveStreamUrl = liveStreamUrl;
        return this;
    }
    public String getLiveStreamUrl() {
        return this.liveStreamUrl;
    }

    public AddCasterVideoResourceRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

    public AddCasterVideoResourceRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public AddCasterVideoResourceRequest setVodUrl(String vodUrl) {
        this.vodUrl = vodUrl;
        return this;
    }
    public String getVodUrl() {
        return this.vodUrl;
    }

    public AddCasterVideoResourceRequest setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }
    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    public AddCasterVideoResourceRequest setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }
    public Integer getEndOffset() {
        return this.endOffset;
    }

    public AddCasterVideoResourceRequest setRepeatNum(Integer repeatNum) {
        this.repeatNum = repeatNum;
        return this;
    }
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    public AddCasterVideoResourceRequest setPtsCallbackInterval(Integer ptsCallbackInterval) {
        this.ptsCallbackInterval = ptsCallbackInterval;
        return this;
    }
    public Integer getPtsCallbackInterval() {
        return this.ptsCallbackInterval;
    }

}
