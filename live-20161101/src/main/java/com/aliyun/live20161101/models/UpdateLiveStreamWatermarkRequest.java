// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamWatermarkRequest extends TeaModel {
    /**
     * <p>The description of the watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>my watermark</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The height of the watermark image, in pixels. This value is relative to <code>RefHeight</code> and will be scaled proportionally with the actual video resolution.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>The name of the watermark template.</p>
     * 
     * <strong>example:</strong>
     * <p>livewatermark****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The anchor point for the watermark\&quot;s position. Valid values:</p>
     * <ul>
     * <li><p>TopLeft</p>
     * </li>
     * <li><p>TopRight</p>
     * </li>
     * <li><p>BottomLeft</p>
     * </li>
     * <li><p>BottomRight</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TopRight</p>
     */
    @NameInMap("OffsetCorner")
    public String offsetCorner;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The URL of the watermark image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com">http://example.com</a></p>
     */
    @NameInMap("PictureUrl")
    public String pictureUrl;

    /**
     * <p>The reference height of the video background, in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("RefHeight")
    public Integer refHeight;

    /**
     * <p>The reference width of the video background, in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("RefWidth")
    public Integer refWidth;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the watermark template.</p>
     * <blockquote>
     * <p>You can get the template ID from the response of the <a href="https://help.aliyun.com/document_detail/2848096.html">AddLiveStreamWatermark</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The opacity of the watermark. Value range: <code>0</code> (fully transparent) to <code>255</code> (fully opaque).</p>
     * 
     * <strong>example:</strong>
     * <p>255</p>
     */
    @NameInMap("Transparency")
    public Integer transparency;

    /**
     * <p>The X-axis offset of the watermark, in pixels.</p>
     * <blockquote>
     * <p>Relative to RefWidth. If OffsetCorner is TopLeft, XOffset is the horizontal distance between the top‑left corner of the watermark and the top‑left corner of the background video. Positive X points to the right.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>50.0</p>
     */
    @NameInMap("XOffset")
    public Float XOffset;

    /**
     * <p>The Y-axis offset of the watermark, in pixels.</p>
     * <blockquote>
     * <p>Relative to RefHeight. If OffsetCorner is TopLeft, YOffset is the vertical distance between the top‑left corner of the watermark and the top‑left corner of the background video. Positive Y points downward.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100.0</p>
     */
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

    public UpdateLiveStreamWatermarkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
