// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchWaterMarkTemplateResponseBody extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The details of the watermark templates.</p>
     */
    @NameInMap("WaterMarkTemplateList")
    public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList waterMarkTemplateList;

    public static SearchWaterMarkTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchWaterMarkTemplateResponseBody self = new SearchWaterMarkTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchWaterMarkTemplateResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchWaterMarkTemplateResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchWaterMarkTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchWaterMarkTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public SearchWaterMarkTemplateResponseBody setWaterMarkTemplateList(SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList waterMarkTemplateList) {
        this.waterMarkTemplateList = waterMarkTemplateList;
        return this;
    }
    public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList getWaterMarkTemplateList() {
        return this.waterMarkTemplateList;
    }

    public static class SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer extends TeaModel {
        /**
         * <p>The horizontal offset of the watermark relative to the output video image. Default value: **0**. The default value indicates no offset.</p>
         * <br>
         * <p>The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   **Integer**: the vertical offset. This indicates the absolute position. Unit: pixel.</p>
         * <p>*   **Decimal**: the ratio of the horizontal offset to the width of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The vertical offset of the watermark relative to the output video image. Default value: **0**. The default value indicates no offset. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   **Integer**: the vertical offset. This indicates the absolute position. Unit: pixel.</p>
         * <p>*   **Decimal**: the ratio of the vertical offset to the height of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The height of the watermark image in the output video. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   **Integer**: the height of the watermark image. This indicates the absolute position. Unit: pixel.</p>
         * <p>*   **Decimal**: the ratio of the height of the watermark image to the height of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The width of the watermark image in the output video. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   **Integer**: the width of the watermark image. This indicates the absolute position. Unit: pixel.</p>
         * <p>*   **Decimal**: the ratio of the width of the watermark image to the width of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</p>
         */
        @NameInMap("Width")
        public String width;

        public static SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer build(java.util.Map<String, ?> map) throws Exception {
            SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer self = new SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer();
            return TeaModel.build(map, self);
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline extends TeaModel {
        /**
         * <p>The display duration of the watermark. Default value: **ToEND**. The default value indicates that the watermark is displayed until the video ends.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The beginning of the time range during which the watermark is displayed.</p>
         * <br>
         * <p>*   Unit: seconds.</p>
         * <p>*   Default value: **0**.</p>
         */
        @NameInMap("Start")
        public String start;

        public static SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline build(java.util.Map<String, ?> map) throws Exception {
            SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline self = new SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline();
            return TeaModel.build(map, self);
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate extends TeaModel {
        /**
         * <p>The horizontal offset. Unit: pixel.</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The vertical offset. Unit: pixel.</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The height of the watermark image. Unit: pixel.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the watermark template.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the watermark template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the Height, Width, Dx, and Dy parameters relative to the reference edges. If the values of the Height, Width, Dx, and Dy parameters are decimals between 0 and 1, the values are calculated by referring to the following edges in sequence:</p>
         * <br>
         * <p>*   **Width**: the width edge.</p>
         * <p>*   **Height**: the height edge.</p>
         * <p>*   **Long**: the long edge.</p>
         * <p>*   **Short**: the short edge.</p>
         */
        @NameInMap("RatioRefer")
        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer ratioRefer;

        /**
         * <p>The position of the watermark. Valid values:</p>
         * <br>
         * <p>*   TopRight: the upper-right corner.</p>
         * <p>*   TopLeft: the upper-left corner.</p>
         * <p>*   BottomRight: the lower-right corner.</p>
         * <p>*   BottomLeft: the lower-left corner.</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The status of the watermark template. Valid values: Valid values:</p>
         * <br>
         * <p>*   **Normal**: The watermark template is normal.</p>
         * <p>*   **Deleted**: The watermark template is deleted.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The timeline of the watermark.</p>
         */
        @NameInMap("Timeline")
        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline timeline;

        /**
         * <p>The type of the watermark. Valid values:</p>
         * <br>
         * <p>*   Image: an image watermark.</p>
         * <p>*   Text: a text watermark.</p>
         * <br>
         * <p>>  Only watermarks of the **Image** types are supported.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The width of the watermark image. Unit: pixel.</p>
         */
        @NameInMap("Width")
        public String width;

        public static SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate build(java.util.Map<String, ?> map) throws Exception {
            SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate self = new SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate();
            return TeaModel.build(map, self);
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setRatioRefer(SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer ratioRefer) {
            this.ratioRefer = ratioRefer;
            return this;
        }
        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer getRatioRefer() {
            return this.ratioRefer;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setTimeline(SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline getTimeline() {
            return this.timeline;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList extends TeaModel {
        @NameInMap("WaterMarkTemplate")
        public java.util.List<SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate> waterMarkTemplate;

        public static SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList build(java.util.Map<String, ?> map) throws Exception {
            SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList self = new SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList();
            return TeaModel.build(map, self);
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList setWaterMarkTemplate(java.util.List<SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate> waterMarkTemplate) {
            this.waterMarkTemplate = waterMarkTemplate;
            return this;
        }
        public java.util.List<SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate> getWaterMarkTemplate() {
            return this.waterMarkTemplate;
        }

    }

}
