// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryWaterMarkTemplateListResponseBody extends TeaModel {
    /**
     * <p>The watermark template IDs that do not exist. This parameter is not returned if all specified watermark templates are found.</p>
     */
    @NameInMap("NonExistWids")
    public QueryWaterMarkTemplateListResponseBodyNonExistWids nonExistWids;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the watermark templates.</p>
     */
    @NameInMap("WaterMarkTemplateList")
    public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList waterMarkTemplateList;

    public static QueryWaterMarkTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWaterMarkTemplateListResponseBody self = new QueryWaterMarkTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWaterMarkTemplateListResponseBody setNonExistWids(QueryWaterMarkTemplateListResponseBodyNonExistWids nonExistWids) {
        this.nonExistWids = nonExistWids;
        return this;
    }
    public QueryWaterMarkTemplateListResponseBodyNonExistWids getNonExistWids() {
        return this.nonExistWids;
    }

    public QueryWaterMarkTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWaterMarkTemplateListResponseBody setWaterMarkTemplateList(QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList waterMarkTemplateList) {
        this.waterMarkTemplateList = waterMarkTemplateList;
        return this;
    }
    public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList getWaterMarkTemplateList() {
        return this.waterMarkTemplateList;
    }

    public static class QueryWaterMarkTemplateListResponseBodyNonExistWids extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryWaterMarkTemplateListResponseBodyNonExistWids build(java.util.Map<String, ?> map) throws Exception {
            QueryWaterMarkTemplateListResponseBodyNonExistWids self = new QueryWaterMarkTemplateListResponseBodyNonExistWids();
            return TeaModel.build(map, self);
        }

        public QueryWaterMarkTemplateListResponseBodyNonExistWids setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer extends TeaModel {
        /**
         * <p>The horizontal offset of the watermark relative to the output video image. Default value: **0**. The default value indicates no offset. The value can be an integer or a decimal.</p>
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

        public static QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer build(java.util.Map<String, ?> map) throws Exception {
            QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer self = new QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer();
            return TeaModel.build(map, self);
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline extends TeaModel {
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

        public static QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline self = new QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline();
            return TeaModel.build(map, self);
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate extends TeaModel {
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
        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer ratioRefer;

        /**
         * <p>The position of the watermark. Valid values:</p>
         * <br>
         * <p>*   **TopRight**: the upper-right corner.</p>
         * <p>*   **TopLeft**: the upper-left corner.</p>
         * <p>*   **BottomRight**: the lower-right corner.</p>
         * <p>*   **BottomLeft**: the lower-left corner.</p>
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
        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline timeline;

        /**
         * <p>The type of the watermark. Valid values:</p>
         * <br>
         * <p>*   Image, and</p>
         * <p>*   Text.</p>
         * <br>
         * <p>>  Only watermarks of the **Image** type are supported.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The width of the watermark image. Unit: pixel.</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate self = new QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate();
            return TeaModel.build(map, self);
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setRatioRefer(QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer ratioRefer) {
            this.ratioRefer = ratioRefer;
            return this;
        }
        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer getRatioRefer() {
            return this.ratioRefer;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setTimeline(QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline getTimeline() {
            return this.timeline;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList extends TeaModel {
        @NameInMap("WaterMarkTemplate")
        public java.util.List<QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate> waterMarkTemplate;

        public static QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList build(java.util.Map<String, ?> map) throws Exception {
            QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList self = new QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList();
            return TeaModel.build(map, self);
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList setWaterMarkTemplate(java.util.List<QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate> waterMarkTemplate) {
            this.waterMarkTemplate = waterMarkTemplate;
            return this;
        }
        public java.util.List<QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate> getWaterMarkTemplate() {
            return this.waterMarkTemplate;
        }

    }

}
