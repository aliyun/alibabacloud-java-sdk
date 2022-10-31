// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamWatermarkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("Name")
    public String name;

    @NameInMap("OffsetCorner")
    public String offsetCorner;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PictureUrl")
    public String pictureUrl;

    @NameInMap("RefHeight")
    public Integer refHeight;

    @NameInMap("RefWidth")
    public Integer refWidth;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Transparency")
    public Integer transparency;

    @NameInMap("XOffset")
    public Float XOffset;

    @NameInMap("YOffset")
    public Float YOffset;

    public static UpdateLiveStreamWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamWatermarkRequest self = new UpdateLiveStreamWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamWatermarkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLiveStreamWatermarkRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public UpdateLiveStreamWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveStreamWatermarkRequest setOffsetCorner(String offsetCorner) {
        this.offsetCorner = offsetCorner;
        return this;
    }
    public String getOffsetCorner() {
        return this.offsetCorner;
    }

    public UpdateLiveStreamWatermarkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveStreamWatermarkRequest setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public UpdateLiveStreamWatermarkRequest setRefHeight(Integer refHeight) {
        this.refHeight = refHeight;
        return this;
    }
    public Integer getRefHeight() {
        return this.refHeight;
    }

    public UpdateLiveStreamWatermarkRequest setRefWidth(Integer refWidth) {
        this.refWidth = refWidth;
        return this;
    }
    public Integer getRefWidth() {
        return this.refWidth;
    }

    public UpdateLiveStreamWatermarkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateLiveStreamWatermarkRequest setTransparency(Integer transparency) {
        this.transparency = transparency;
        return this;
    }
    public Integer getTransparency() {
        return this.transparency;
    }

    public UpdateLiveStreamWatermarkRequest setXOffset(Float XOffset) {
        this.XOffset = XOffset;
        return this;
    }
    public Float getXOffset() {
        return this.XOffset;
    }

    public UpdateLiveStreamWatermarkRequest setYOffset(Float YOffset) {
        this.YOffset = YOffset;
        return this;
    }
    public Float getYOffset() {
        return this.YOffset;
    }

}
