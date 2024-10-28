// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetTopicSelectionPerspectiveAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTopicSelectionPerspectiveAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicSelectionPerspectiveAnalysisTaskResponseBody self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponseBody setData(GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicSelectionPerspectiveAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <strong>example:</strong>
         * <p>大纲摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines> outlines;

        /**
         * <strong>example:</strong>
         * <p>视角</p>
         */
        @NameInMap("Point")
        public String point;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints setOutlines(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>当前观点</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <strong>example:</strong>
         * <p>观点类型</p>
         */
        @NameInMap("AttitudeType")
        public String attitudeType;

        /**
         * <strong>example:</strong>
         * <p>当前观点占比</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        @NameInMap("ViewPoints")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints> viewPoints;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes setAttitudeType(String attitudeType) {
            this.attitudeType = attitudeType;
            return this;
        }
        public String getAttitudeType() {
            return this.attitudeType;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes setViewPoints(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudesViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResult extends TeaModel {
        @NameInMap("Attitudes")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes> attitudes;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResult build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResult self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResult();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResult setAttitudes(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes> attitudes) {
            this.attitudes = attitudes;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResultAttitudes> getAttitudes() {
            return this.attitudes;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>9957175DEDCF49C5ACF7A956B4FD67B2</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.png">https://www.example.com/aaa.png</a></p>
         */
        @NameInMap("ImageUrls")
        public java.util.List<String> imageUrls;

        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>[&quot;标签1&quot;,&quot;标签2&quot;]</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>文章主题</p>
         */
        @NameInMap("Topic")
        public String topic;

        @NameInMap("Url")
        public String url;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <strong>example:</strong>
         * <p>大纲摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines> outlines;

        /**
         * <strong>example:</strong>
         * <p>视角</p>
         */
        @NameInMap("Point")
        public String point;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints setOutlines(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>当前观点</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <strong>example:</strong>
         * <p>观点类型</p>
         */
        @NameInMap("AttitudeType")
        public String attitudeType;

        @NameInMap("News")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews> news;

        /**
         * <strong>example:</strong>
         * <p>当前观点占比</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        @NameInMap("ViewPoints")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints> viewPoints;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes setAttitudeType(String attitudeType) {
            this.attitudeType = attitudeType;
            return this;
        }
        public String getAttitudeType() {
            return this.attitudeType;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes setNews(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews> news) {
            this.news = news;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesNews> getNews() {
            return this.news;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes setViewPoints(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudesViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResult extends TeaModel {
        @NameInMap("Attitudes")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes> attitudes;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResult build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResult self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResult();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResult setAttitudes(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes> attitudes) {
            this.attitudes = attitudes;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResultAttitudes> getAttitudes() {
            return this.attitudes;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <strong>example:</strong>
         * <p>大纲摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines> outlines;

        /**
         * <strong>example:</strong>
         * <p>视角</p>
         */
        @NameInMap("Point")
        public String point;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints setOutlines(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>当前观点</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <strong>example:</strong>
         * <p>观点类型</p>
         */
        @NameInMap("AttitudeType")
        public String attitudeType;

        /**
         * <strong>example:</strong>
         * <p>2024-01-22 10:29</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>当前观点占比</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        /**
         * <strong>example:</strong>
         * <p>新浪</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/news/1.html">http://www.example.com/news/1.html</a></p>
         */
        @NameInMap("Url")
        public String url;

        @NameInMap("ViewPoints")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints> viewPoints;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes setAttitudeType(String attitudeType) {
            this.attitudeType = attitudeType;
            return this;
        }
        public String getAttitudeType() {
            return this.attitudeType;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes setViewPoints(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudesViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResult extends TeaModel {
        @NameInMap("Attitudes")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes> attitudes;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResult build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResult self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResult();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResult setAttitudes(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes> attitudes) {
            this.attitudes = attitudes;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResultAttitudes> getAttitudes() {
            return this.attitudes;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList extends TeaModel {
        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries extends TeaModel {
        @NameInMap("DocList")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList> docList;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries setDocList(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList> docList) {
            this.docList = docList;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummariesDocList> getDocList() {
            return this.docList;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResult extends TeaModel {
        @NameInMap("Summaries")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries> summaries;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResult build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResult self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResult();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResult setSummaries(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries> summaries) {
            this.summaries = summaries;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResultSummaries> getSummaries() {
            return this.summaries;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>来源</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>评论内容</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>当前评论所属的URL</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>评论用户名</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        /**
         * <strong>example:</strong>
         * <p>大纲摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines> outlines;

        /**
         * <strong>example:</strong>
         * <p>视角</p>
         */
        @NameInMap("Point")
        public String point;

        /**
         * <strong>example:</strong>
         * <p>摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints setOutlines(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>当前观点</p>
         */
        @NameInMap("Attitude")
        public String attitude;

        /**
         * <strong>example:</strong>
         * <p>观点类型</p>
         */
        @NameInMap("AttitudeType")
        public String attitudeType;

        @NameInMap("Comments")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments> comments;

        /**
         * <strong>example:</strong>
         * <p>当前观点占比</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        @NameInMap("ViewPoints")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints> viewPoints;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes setAttitudeType(String attitudeType) {
            this.attitudeType = attitudeType;
            return this;
        }
        public String getAttitudeType() {
            return this.attitudeType;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes setComments(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments> comments) {
            this.comments = comments;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesComments> getComments() {
            return this.comments;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes setViewPoints(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudesViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResult extends TeaModel {
        @NameInMap("Attitudes")
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes> attitudes;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResult build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResult self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResult();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResult setAttitudes(java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes> attitudes) {
            this.attitudes = attitudes;
            return this;
        }
        public java.util.List<GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResultAttitudes> getAttitudes() {
            return this.attitudes;
        }

    }

    public static class GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FreshViewPointsResult")
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResult freshViewPointsResult;

        @NameInMap("HotViewPointsResult")
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResult hotViewPointsResult;

        /**
         * <strong>example:</strong>
         * <p>SUSPENDED</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TimedViewPointsResult")
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResult timedViewPointsResult;

        /**
         * <strong>example:</strong>
         * <p>热点主题事件</p>
         */
        @NameInMap("Topic")
        public String topic;

        @NameInMap("TopicSummaryResult")
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResult topicSummaryResult;

        @NameInMap("WebReviewPointsResult")
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResult webReviewPointsResult;

        public static GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData self = new GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData setFreshViewPointsResult(GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResult freshViewPointsResult) {
            this.freshViewPointsResult = freshViewPointsResult;
            return this;
        }
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataFreshViewPointsResult getFreshViewPointsResult() {
            return this.freshViewPointsResult;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData setHotViewPointsResult(GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResult hotViewPointsResult) {
            this.hotViewPointsResult = hotViewPointsResult;
            return this;
        }
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataHotViewPointsResult getHotViewPointsResult() {
            return this.hotViewPointsResult;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData setTimedViewPointsResult(GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResult timedViewPointsResult) {
            this.timedViewPointsResult = timedViewPointsResult;
            return this;
        }
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTimedViewPointsResult getTimedViewPointsResult() {
            return this.timedViewPointsResult;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData setTopicSummaryResult(GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResult topicSummaryResult) {
            this.topicSummaryResult = topicSummaryResult;
            return this;
        }
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataTopicSummaryResult getTopicSummaryResult() {
            return this.topicSummaryResult;
        }

        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyData setWebReviewPointsResult(GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResult webReviewPointsResult) {
            this.webReviewPointsResult = webReviewPointsResult;
            return this;
        }
        public GetTopicSelectionPerspectiveAnalysisTaskResponseBodyDataWebReviewPointsResult getWebReviewPointsResult() {
            return this.webReviewPointsResult;
        }

    }

}
