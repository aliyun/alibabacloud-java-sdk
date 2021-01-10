// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateWaterMarkTemplateResponseBody extends TeaModel {
    @NameInMap("WaterMarkTemplate")
    public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate waterMarkTemplate;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWaterMarkTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaterMarkTemplateResponseBody self = new UpdateWaterMarkTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWaterMarkTemplateResponseBody setWaterMarkTemplate(UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate waterMarkTemplate) {
        this.waterMarkTemplate = waterMarkTemplate;
        return this;
    }
    public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate getWaterMarkTemplate() {
        return this.waterMarkTemplate;
    }

    public UpdateWaterMarkTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer extends TeaModel {
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Dy")
        public String dy;

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

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

    }

    public static class UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline build(java.util.Map<String, ?> map) throws Exception {
            UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline self = new UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline();
            return TeaModel.build(map, self);
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RatioRefer")
        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer ratioRefer;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("State")
        public String state;

        @NameInMap("Dx")
        public String dx;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Timeline")
        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline timeline;

        @NameInMap("Name")
        public String name;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("Id")
        public String id;

        public static UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate self = new UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setTimeline(UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline getTimeline() {
            return this.timeline;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public UpdateWaterMarkTemplateResponseBodyWaterMarkTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
