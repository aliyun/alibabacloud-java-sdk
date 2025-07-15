// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamWatermarkRequest extends TeaModel {
    /**
     * <p>The description of the watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>my watermark</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The height of the watermark. Unit: pixels. The height of the watermark is scaled in proportion to the height of the background video.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>The name of the watermark.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>livewatermark****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The location of the watermark. Valid values:</p>
     * <ul>
     * <li>TopLeft: the upper-left corner.</li>
     * <li>TopRight: the upper-right corner.</li>
     * <li>BottomLeft: the lower-left corner.</li>
     * <li>BottomRight: the lower-right corner.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com">http://example.com</a></p>
     */
    @NameInMap("PictureUrl")
    public String pictureUrl;

    /**
     * <p>The height of the background video. Unit: pixels.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("RefHeight")
    public Integer refHeight;

    /**
     * <p>The width of the background video. Unit: pixels.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("RefWidth")
    public Integer refWidth;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The transparency of the watermark. A smaller value indicates a more transparent watermark. Valid values: 0 to 255.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>255</p>
     */
    @NameInMap("Transparency")
    public Integer transparency;

    /**
     * <p>The type of the watermark. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: image.</li>
     * <li><strong>1</strong>: text. Only image watermarks are supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>The offset of the watermark along the x-axis. Unit: pixels.</p>
     * <blockquote>
     * <p> In this case, the value of the RefWidth parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the XOffset parameter indicates the x-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the x-axis is positive toward the right.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50.0</p>
     */
    @NameInMap("XOffset")
    public Float XOffset;

    /**
     * <p>The offset of the watermark along the y-axis. Unit: pixels.</p>
     * <blockquote>
     * <p> In this case, the value of the RefHeight parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the YOffset parameter indicates the y-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the y-axis is positive downward.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100.0</p>
     */
    @NameInMap("YOffset")
    public Float YOffset;

    public static AddLiveStreamWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamWatermarkRequest self = new AddLiveStreamWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamWatermarkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddLiveStreamWatermarkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddLiveStreamWatermarkRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AddLiveStreamWatermarkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddLiveStreamWatermarkRequest setOffsetCorner(String offsetCorner) {
        this.offsetCorner = offsetCorner;
        return this;
    }
    public String getOffsetCorner() {
        return this.offsetCorner;
    }

    public AddLiveStreamWatermarkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveStreamWatermarkRequest setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
    public String getPictureUrl() {
        return this.pictureUrl;
    }

    public AddLiveStreamWatermarkRequest setRefHeight(Integer refHeight) {
        this.refHeight = refHeight;
        return this;
    }
    public Integer getRefHeight() {
        return this.refHeight;
    }

    public AddLiveStreamWatermarkRequest setRefWidth(Integer refWidth) {
        this.refWidth = refWidth;
        return this;
    }
    public Integer getRefWidth() {
        return this.refWidth;
    }

    public AddLiveStreamWatermarkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLiveStreamWatermarkRequest setTransparency(Integer transparency) {
        this.transparency = transparency;
        return this;
    }
    public Integer getTransparency() {
        return this.transparency;
    }

    public AddLiveStreamWatermarkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public AddLiveStreamWatermarkRequest setXOffset(Float XOffset) {
        this.XOffset = XOffset;
        return this;
    }
    public Float getXOffset() {
        return this.XOffset;
    }

    public AddLiveStreamWatermarkRequest setYOffset(Float YOffset) {
        this.YOffset = YOffset;
        return this;
    }
    public Float getYOffset() {
        return this.YOffset;
    }

}
