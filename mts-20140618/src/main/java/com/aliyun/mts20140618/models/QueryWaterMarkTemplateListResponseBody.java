// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryWaterMarkTemplateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistWids")
    public QueryWaterMarkTemplateListResponseBodyNonExistWids nonExistWids;

    @NameInMap("WaterMarkTemplateList")
    public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateList waterMarkTemplateList;

    public static QueryWaterMarkTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryWaterMarkTemplateListResponseBody self = new QueryWaterMarkTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryWaterMarkTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryWaterMarkTemplateListResponseBody setNonExistWids(QueryWaterMarkTemplateListResponseBodyNonExistWids nonExistWids) {
        this.nonExistWids = nonExistWids;
        return this;
    }
    public QueryWaterMarkTemplateListResponseBodyNonExistWids getNonExistWids() {
        return this.nonExistWids;
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
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Dy")
        public String dy;

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

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

    }

    public static class QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline self = new QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline();
            return TeaModel.build(map, self);
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RatioRefer")
        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer ratioRefer;

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
        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline timeline;

        @NameInMap("Name")
        public String name;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("Id")
        public String id;

        public static QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate self = new QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate();
            return TeaModel.build(map, self);
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setTimeline(QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline getTimeline() {
            return this.timeline;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public QueryWaterMarkTemplateListResponseBodyWaterMarkTemplateListWaterMarkTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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
