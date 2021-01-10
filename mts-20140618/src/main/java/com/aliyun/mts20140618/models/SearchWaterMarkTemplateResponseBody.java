// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchWaterMarkTemplateResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("WaterMarkTemplateList")
    public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList waterMarkTemplateList;

    public static SearchWaterMarkTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchWaterMarkTemplateResponseBody self = new SearchWaterMarkTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchWaterMarkTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public SearchWaterMarkTemplateResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchWaterMarkTemplateResponseBody setWaterMarkTemplateList(SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList waterMarkTemplateList) {
        this.waterMarkTemplateList = waterMarkTemplateList;
        return this;
    }
    public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateList getWaterMarkTemplateList() {
        return this.waterMarkTemplateList;
    }

    public static class SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer extends TeaModel {
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Dy")
        public String dy;

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

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

    }

    public static class SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline build(java.util.Map<String, ?> map) throws Exception {
            SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline self = new SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline();
            return TeaModel.build(map, self);
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("RatioRefer")
        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateRatioRefer ratioRefer;

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
        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline timeline;

        @NameInMap("Name")
        public String name;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("Id")
        public String id;

        public static SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate build(java.util.Map<String, ?> map) throws Exception {
            SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate self = new SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate();
            return TeaModel.build(map, self);
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setTimeline(SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplateTimeline getTimeline() {
            return this.timeline;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public SearchWaterMarkTemplateResponseBodyWaterMarkTemplateListWaterMarkTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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
