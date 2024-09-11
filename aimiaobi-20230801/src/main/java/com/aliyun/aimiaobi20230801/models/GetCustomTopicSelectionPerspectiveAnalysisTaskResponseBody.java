// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData data;

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

    public static GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody self = new GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody setData(GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData getData() {
        return this.data;
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines extends TeaModel {
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

        public static GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines self = new GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines();
            return TeaModel.build(map, self);
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints extends TeaModel {
        @NameInMap("Outlines")
        public java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines> outlines;

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

        public static GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints self = new GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints();
            return TeaModel.build(map, self);
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints setOutlines(java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPointsOutlines> getOutlines() {
            return this.outlines;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes extends TeaModel {
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
        public java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints> viewPoints;

        public static GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes self = new GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes();
            return TeaModel.build(map, self);
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes setAttitude(String attitude) {
            this.attitude = attitude;
            return this;
        }
        public String getAttitude() {
            return this.attitude;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes setAttitudeType(String attitudeType) {
            this.attitudeType = attitudeType;
            return this;
        }
        public String getAttitudeType() {
            return this.attitudeType;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes setViewPoints(java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints> viewPoints) {
            this.viewPoints = viewPoints;
            return this;
        }
        public java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudesViewPoints> getViewPoints() {
            return this.viewPoints;
        }

    }

    public static class GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult extends TeaModel {
        @NameInMap("Attitudes")
        public java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes> attitudes;

        /**
         * <strong>example:</strong>
         * <p>热点主题事件</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult self = new GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult();
            return TeaModel.build(map, self);
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult setAttitudes(java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes> attitudes) {
            this.attitudes = attitudes;
            return this;
        }
        public java.util.List<GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResultAttitudes> getAttitudes() {
            return this.attitudes;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData extends TeaModel {
        @NameInMap("CustomViewPointsResult")
        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult customViewPointsResult;

        /**
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData self = new GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData setCustomViewPointsResult(GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult customViewPointsResult) {
            this.customViewPointsResult = customViewPointsResult;
            return this;
        }
        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyDataCustomViewPointsResult getCustomViewPointsResult() {
            return this.customViewPointsResult;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetCustomTopicSelectionPerspectiveAnalysisTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
