// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamWatermarksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64- af62-20e91b9676b3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of watermark templates that meet the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>Details of the watermark templates.</p>
     */
    @NameInMap("WatermarkList")
    public DescribeLiveStreamWatermarksResponseBodyWatermarkList watermarkList;

    public static DescribeLiveStreamWatermarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamWatermarksResponseBody self = new DescribeLiveStreamWatermarksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamWatermarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamWatermarksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeLiveStreamWatermarksResponseBody setWatermarkList(DescribeLiveStreamWatermarksResponseBodyWatermarkList watermarkList) {
        this.watermarkList = watermarkList;
        return this;
    }
    public DescribeLiveStreamWatermarksResponseBodyWatermarkList getWatermarkList() {
        return this.watermarkList;
    }

    public static class DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark extends TeaModel {
        /**
         * <p>The description of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>my watermark</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The height of the watermark. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The name of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>livewatermark****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The position of the watermark.</p>
         * <ul>
         * <li>TopLeft: the upper-left corner.</li>
         * <li>TopRight: the upper-right corner.</li>
         * <li>BottomLeft: the lower-left corner.</li>
         * <li>BottomRight: the lower-right corner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TopRight</p>
         */
        @NameInMap("OffsetCorner")
        public String offsetCorner;

        /**
         * <p>The URL of the watermark image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("PictureUrl")
        public String pictureUrl;

        /**
         * <p>The height of the background video. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("RefHeight")
        public Integer refHeight;

        /**
         * <p>The width of the background video. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("RefWidth")
        public Integer refWidth;

        /**
         * <p>The number of watermark rules configured for the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>The ID of the watermark template.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-4 61d-8f29-4bec2eb9 ****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The transparency of the watermark. A smaller value indicates a more transparent watermark. Valid values: 0 to 255.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Transparency")
        public Integer transparency;

        /**
         * <p>The watermark type.</p>
         * <ul>
         * <li>0: image. Only image watermarks are supported.</li>
         * <li>1: text.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The offset of the watermark along the x-axis. Unit: pixels.</p>
         * <blockquote>
         * <p> The value of the RefWidth parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the XOffset parameter indicates the x-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the x-axis is positive toward the right.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50.0</p>
         */
        @NameInMap("XOffset")
        public Float XOffset;

        /**
         * <p>The offset of the watermark along the y-axis. Unit: pixels.</p>
         * <blockquote>
         * <p> The value of the RefHeight parameter is used as the reference. If the OffsetCorner parameter is set to TopLeft, the value of the YOffset parameter indicates the y-axis offset of the upper-left corner of the watermark relative to that of the background video. The directions from the coordinate axes to the center of the background video are positive. In other words, the y-axis is positive downward.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("YOffset")
        public Float YOffset;

        public static DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark self = new DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setOffsetCorner(String offsetCorner) {
            this.offsetCorner = offsetCorner;
            return this;
        }
        public String getOffsetCorner() {
            return this.offsetCorner;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setPictureUrl(String pictureUrl) {
            this.pictureUrl = pictureUrl;
            return this;
        }
        public String getPictureUrl() {
            return this.pictureUrl;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setRefHeight(Integer refHeight) {
            this.refHeight = refHeight;
            return this;
        }
        public Integer getRefHeight() {
            return this.refHeight;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setRefWidth(Integer refWidth) {
            this.refWidth = refWidth;
            return this;
        }
        public Integer getRefWidth() {
            return this.refWidth;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setTransparency(Integer transparency) {
            this.transparency = transparency;
            return this;
        }
        public Integer getTransparency() {
            return this.transparency;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setXOffset(Float XOffset) {
            this.XOffset = XOffset;
            return this;
        }
        public Float getXOffset() {
            return this.XOffset;
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark setYOffset(Float YOffset) {
            this.YOffset = YOffset;
            return this;
        }
        public Float getYOffset() {
            return this.YOffset;
        }

    }

    public static class DescribeLiveStreamWatermarksResponseBodyWatermarkList extends TeaModel {
        @NameInMap("Watermark")
        public java.util.List<DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark> watermark;

        public static DescribeLiveStreamWatermarksResponseBodyWatermarkList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamWatermarksResponseBodyWatermarkList self = new DescribeLiveStreamWatermarksResponseBodyWatermarkList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamWatermarksResponseBodyWatermarkList setWatermark(java.util.List<DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark> watermark) {
            this.watermark = watermark;
            return this;
        }
        public java.util.List<DescribeLiveStreamWatermarksResponseBodyWatermarkListWatermark> getWatermark() {
            return this.watermark;
        }

    }

}
