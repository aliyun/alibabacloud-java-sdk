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
        @NameInMap("Description")
        public String description;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Name")
        public String name;

        @NameInMap("OffsetCorner")
        public String offsetCorner;

        @NameInMap("PictureUrl")
        public String pictureUrl;

        @NameInMap("RefHeight")
        public Integer refHeight;

        @NameInMap("RefWidth")
        public Integer refWidth;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Transparency")
        public Integer transparency;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("XOffset")
        public Float XOffset;

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
