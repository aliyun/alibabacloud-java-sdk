// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateWaterMarkTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E558894E-40D9-57C6-B5CC-0F5CDF23614E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the watermark template.</p>
     */
    @NameInMap("WaterMarkTemplate")
    public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate waterMarkTemplate;

    public static UpdateWaterMarkTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaterMarkTemplateResponseBody self = new UpdateWaterMarkTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWaterMarkTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWaterMarkTemplateResponseBody setWaterMarkTemplate(UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate waterMarkTemplate) {
        this.waterMarkTemplate = waterMarkTemplate;
        return this;
    }
    public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate getWaterMarkTemplate() {
        return this.waterMarkTemplate;
    }

    public static class UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer extends TeaModel {
        /**
         * <p>The horizontal offset of the watermark relative to the output video image. Default value: <strong>0</strong>. The default value indicates no offset. The value can be an integer or a decimal.</p>
         * <ul>
         * <li><strong>Integer</strong>: the vertical offset. This indicates the absolute position. Unit: pixel.</li>
         * <li><strong>Decimal</strong>: the ratio of the horizontal offset to the width of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.51</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The vertical offset of the watermark relative to the output video image. Default value: <strong>0</strong>. The default value indicates no offset. The value can be an integer or a decimal.</p>
         * <ul>
         * <li><strong>Integer</strong>: the vertical offset. This indicates the absolute position. Unit: pixel.</li>
         * <li><strong>Decimal</strong>: the ratio of the vertical offset to the height of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.28</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The height of the watermark image in the output video. The value can be an integer or a decimal.</p>
         * <ul>
         * <li><strong>Integer</strong>: the height of the watermark image. This indicates the absolute position. Unit: pixel.</li>
         * <li><strong>Decimal</strong>: the ratio of the height of the watermark image to the height of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.33</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The width of the watermark image in the output video. The value can be an integer or a decimal.</p>
         * <ul>
         * <li><strong>Integer</strong>: the width of the watermark image. This indicates the absolute position. Unit: pixel.</li>
         * <li><strong>Decimal</strong>: the ratio of the width of the watermark image to the width of the output video. The ratio varies based on the size of the video. Four decimal places are supported, such as 0.9999. More decimal places are discarded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.36</p>
         */
        @NameInMap("Width")
        public String width;

        public static UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer build(java.util.Map<String, ?> map) throws Exception {
            UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer self = new UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer();
            return TeaModel.build(map, self);
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline extends TeaModel {
        /**
         * <p>The display duration of the watermark. Default value: <strong>ToEND</strong>. The default value indicates that the watermark is displayed until the video ends.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The beginning of the time range during which the watermark is displayed.</p>
         * <ul>
         * <li>Unit: seconds.</li>
         * <li>Default value: <strong>0</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Start")
        public String start;

        public static UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline self = new UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline();
            return TeaModel.build(map, self);
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate extends TeaModel {
        /**
         * <p>The horizontal offset. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The vertical offset. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The height of the watermark image. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the watermark template. We recommend that you keep this ID for subsequent operation calls.</p>
         * 
         * <strong>example:</strong>
         * <p>3780bd69b2b74540bc7b1096f564****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the watermark template.</p>
         * 
         * <strong>example:</strong>
         * <p>example-watermark-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The values of the Height, Width, Dx, and Dy parameters relative to the reference edges. If the values of the Height, Width, Dx, and Dy parameters are decimals between 0 and 1, the values are calculated by referring to the following edges in sequence:</p>
         * <ul>
         * <li><strong>Width</strong>: the width edge.</li>
         * <li><strong>Height</strong>: the height edge.</li>
         * <li><strong>Long</strong>: the long edge.</li>
         * <li><strong>Short</strong>: the short edge.</li>
         * </ul>
         */
        @NameInMap("RatioRefer")
        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer ratioRefer;

        /**
         * <p>The position of the watermark. Valid values:</p>
         * <ul>
         * <li><strong>TopRight</strong>: the upper-right corner.</li>
         * <li><strong>TopLeft</strong>: the upper-left corner.</li>
         * <li><strong>BottomRight</strong>: the lower-right corner.</li>
         * <li><strong>BottomLeft</strong>: the lower-left corner.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TopRight</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The status of the watermark template. Default value: <strong>Normal</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The timeline of the watermark.</p>
         */
        @NameInMap("Timeline")
        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline timeline;

        /**
         * <p>The type of the watermark. Valid values:</p>
         * <ul>
         * <li>Image: an image watermark.</li>
         * <li>Text: a text watermark.</li>
         * </ul>
         * <blockquote>
         * <p>Only watermarks of the Image type are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The width of the watermark image. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Width")
        public String width;

        public static UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate self = new UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setRatioRefer(UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer ratioRefer) {
            this.ratioRefer = ratioRefer;
            return this;
        }
        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer getRatioRefer() {
            return this.ratioRefer;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setTimeline(UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline getTimeline() {
            return this.timeline;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

}
