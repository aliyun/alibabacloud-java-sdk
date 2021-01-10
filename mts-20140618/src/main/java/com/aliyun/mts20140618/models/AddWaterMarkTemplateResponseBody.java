// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddWaterMarkTemplateResponseBody extends TeaModel {
    @NameInMap("WaterMarkTemplate")
    public AddWaterMarkTemplateResponseBodyWaterMarkTemplate waterMarkTemplate;

    @NameInMap("RequestId")
    public String requestId;

    public static AddWaterMarkTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWaterMarkTemplateResponseBody self = new AddWaterMarkTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWaterMarkTemplateResponseBody setWaterMarkTemplate(AddWaterMarkTemplateResponseBodyWaterMarkTemplate waterMarkTemplate) {
        this.waterMarkTemplate = waterMarkTemplate;
        return this;
    }
    public AddWaterMarkTemplateResponseBodyWaterMarkTemplate getWaterMarkTemplate() {
        return this.waterMarkTemplate;
    }

    public AddWaterMarkTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer extends TeaModel {
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Dy")
        public String dy;

        public static AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer build(java.util.Map<String, ?> map) throws Exception {
            AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer self = new AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer();
            return TeaModel.build(map, self);
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

    }

    public static class AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline build(java.util.Map<String, ?> map) throws Exception {
            AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline self = new AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline();
            return TeaModel.build(map, self);
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class AddWaterMarkTemplateResponseBodyWaterMarkTemplate extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RatioRefer")
        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer ratioRefer;

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
        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline timeline;

        @NameInMap("Name")
        public String name;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("Id")
        public String id;

        public static AddWaterMarkTemplateResponseBodyWaterMarkTemplate build(java.util.Map<String, ?> map) throws Exception {
            AddWaterMarkTemplateResponseBodyWaterMarkTemplate self = new AddWaterMarkTemplateResponseBodyWaterMarkTemplate();
            return TeaModel.build(map, self);
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setRatioRefer(AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer ratioRefer) {
            this.ratioRefer = ratioRefer;
            return this;
        }
        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateRatioRefer getRatioRefer() {
            return this.ratioRefer;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setTimeline(AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public AddWaterMarkTemplateResponseBodyWaterMarkTemplateTimeline getTimeline() {
            return this.timeline;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public AddWaterMarkTemplateResponseBodyWaterMarkTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
