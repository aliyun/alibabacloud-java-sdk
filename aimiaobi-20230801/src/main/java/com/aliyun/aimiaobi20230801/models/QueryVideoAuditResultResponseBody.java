// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryVideoAuditResultResponseBody extends TeaModel {
    /**
     * <p>Business status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Video audit result data</p>
     */
    @NameInMap("Data")
    public QueryVideoAuditResultResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Return message</p>
     * 
     * <strong>example:</strong>
     * <p>查询成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Is successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryVideoAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoAuditResultResponseBody self = new QueryVideoAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoAuditResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVideoAuditResultResponseBody setData(QueryVideoAuditResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryVideoAuditResultResponseBodyData getData() {
        return this.data;
    }

    public QueryVideoAuditResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryVideoAuditResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryVideoAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryVideoAuditResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryVideoAuditResultResponseBodyDataImageUrls extends TeaModel {
        /**
         * <p>Image ID (Associate with Results[].DataId to get audit result information)</p>
         * 
         * <strong>example:</strong>
         * <p>img001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Timestamp (milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Timestamp")
        public Double timestamp;

        /**
         * <p>Image URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/image1.jpg">https://example.com/image1.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static QueryVideoAuditResultResponseBodyDataImageUrls build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoAuditResultResponseBodyDataImageUrls self = new QueryVideoAuditResultResponseBodyDataImageUrls();
            return TeaModel.build(map, self);
        }

        public QueryVideoAuditResultResponseBodyDataImageUrls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryVideoAuditResultResponseBodyDataImageUrls setTimestamp(Double timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Double getTimestamp() {
            return this.timestamp;
        }

        public QueryVideoAuditResultResponseBodyDataImageUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryVideoAuditResultResponseBodyDataResultsResult extends TeaModel {
        /**
         * <p>From 0 to 100, retained to 2 decimal places. Some labels do not have a confidence score.</p>
         * 
         * <strong>example:</strong>
         * <p>99.5</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>Explanation of the Label field</p>
         * 
         * <strong>example:</strong>
         * <p>未检测出风险</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Risk label</p>
         * <p>The label of the image content review result. For example: nonLabel (no risk detected).</p>
         * <p>The label can also be a risk level that is determined by the high-risk and low-risk thresholds that you set. Valid return values are:
         * ● high: high risk
         * ● medium: medium risk
         * ● low: low risk
         * ● none: no risk detected</p>
         * 
         * <strong>example:</strong>
         * <p>nonLabel</p>
         */
        @NameInMap("Label")
        public String label;

        public static QueryVideoAuditResultResponseBodyDataResultsResult build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoAuditResultResponseBodyDataResultsResult self = new QueryVideoAuditResultResponseBodyDataResultsResult();
            return TeaModel.build(map, self);
        }

        public QueryVideoAuditResultResponseBodyDataResultsResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public QueryVideoAuditResultResponseBodyDataResultsResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryVideoAuditResultResponseBodyDataResultsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryVideoAuditResultResponseBodyDataResults extends TeaModel {
        /**
         * <p>Image ID (Associate with ImageUrls[].Id to get image information)</p>
         * 
         * <strong>example:</strong>
         * <p>d411ed15e8fc154fd0ef5addabfee04b</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>B5D1CF9E-0404-51E3-A28E-A5C7D95B6C71</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        /**
         * <p>Detection results</p>
         */
        @NameInMap("Result")
        public java.util.List<QueryVideoAuditResultResponseBodyDataResultsResult> result;

        /**
         * <p>Risk level</p>
         * <ul>
         * <li><p>high: High risk</p>
         * </li>
         * <li><p>medium: Medium risk</p>
         * </li>
         * <li><p>low: Low risk</p>
         * </li>
         * <li><p>none: No risk</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        public static QueryVideoAuditResultResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoAuditResultResponseBodyDataResults self = new QueryVideoAuditResultResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public QueryVideoAuditResultResponseBodyDataResults setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryVideoAuditResultResponseBodyDataResults setReqId(String reqId) {
            this.reqId = reqId;
            return this;
        }
        public String getReqId() {
            return this.reqId;
        }

        public QueryVideoAuditResultResponseBodyDataResults setResult(java.util.List<QueryVideoAuditResultResponseBodyDataResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryVideoAuditResultResponseBodyDataResultsResult> getResult() {
            return this.result;
        }

        public QueryVideoAuditResultResponseBodyDataResults setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class QueryVideoAuditResultResponseBodyData extends TeaModel {
        /**
         * <p>Video duration</p>
         * 
         * <strong>example:</strong>
         * <p>120.5</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Video frame rate</p>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("Fps")
        public Double fps;

        /**
         * <p>Frames audited</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("FrameAudited")
        public Integer frameAudited;

        /**
         * <p>Video height</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>Image URL list</p>
         */
        @NameInMap("ImageUrls")
        public java.util.List<QueryVideoAuditResultResponseBodyDataImageUrls> imageUrls;

        /**
         * <p>Audit results list</p>
         */
        @NameInMap("Results")
        public java.util.List<QueryVideoAuditResultResponseBodyDataResults> results;

        /**
         * <p>Task status (PENDING: Queued, RUNNING: In progress, SUCCESSED: Successful, FAILED: Failed, CANCELED: Task canceled)</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Reviewed text</p>
         * 
         * <strong>example:</strong>
         * <p>视频审核完成</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Frames to audit</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalFrameAudit")
        public Integer totalFrameAudit;

        /**
         * <p>Total frames</p>
         * 
         * <strong>example:</strong>
         * <p>3615</p>
         */
        @NameInMap("TotalFrames")
        public Integer totalFrames;

        /**
         * <p>Total shots</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TotalShots")
        public Integer totalShots;

        /**
         * <p>Video FileKey</p>
         * 
         * <strong>example:</strong>
         * <p>video/test.mp4</p>
         */
        @NameInMap("VideoFileKey")
        public String videoFileKey;

        /**
         * <p>Video URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/video.mp4">https://example.com/video.mp4</a></p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        /**
         * <p>Video width</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static QueryVideoAuditResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoAuditResultResponseBodyData self = new QueryVideoAuditResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryVideoAuditResultResponseBodyData setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public QueryVideoAuditResultResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryVideoAuditResultResponseBodyData setFps(Double fps) {
            this.fps = fps;
            return this;
        }
        public Double getFps() {
            return this.fps;
        }

        public QueryVideoAuditResultResponseBodyData setFrameAudited(Integer frameAudited) {
            this.frameAudited = frameAudited;
            return this;
        }
        public Integer getFrameAudited() {
            return this.frameAudited;
        }

        public QueryVideoAuditResultResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryVideoAuditResultResponseBodyData setImageUrls(java.util.List<QueryVideoAuditResultResponseBodyDataImageUrls> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<QueryVideoAuditResultResponseBodyDataImageUrls> getImageUrls() {
            return this.imageUrls;
        }

        public QueryVideoAuditResultResponseBodyData setResults(java.util.List<QueryVideoAuditResultResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<QueryVideoAuditResultResponseBodyDataResults> getResults() {
            return this.results;
        }

        public QueryVideoAuditResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryVideoAuditResultResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryVideoAuditResultResponseBodyData setTotalFrameAudit(Integer totalFrameAudit) {
            this.totalFrameAudit = totalFrameAudit;
            return this;
        }
        public Integer getTotalFrameAudit() {
            return this.totalFrameAudit;
        }

        public QueryVideoAuditResultResponseBodyData setTotalFrames(Integer totalFrames) {
            this.totalFrames = totalFrames;
            return this;
        }
        public Integer getTotalFrames() {
            return this.totalFrames;
        }

        public QueryVideoAuditResultResponseBodyData setTotalShots(Integer totalShots) {
            this.totalShots = totalShots;
            return this;
        }
        public Integer getTotalShots() {
            return this.totalShots;
        }

        public QueryVideoAuditResultResponseBodyData setVideoFileKey(String videoFileKey) {
            this.videoFileKey = videoFileKey;
            return this;
        }
        public String getVideoFileKey() {
            return this.videoFileKey;
        }

        public QueryVideoAuditResultResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public QueryVideoAuditResultResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
