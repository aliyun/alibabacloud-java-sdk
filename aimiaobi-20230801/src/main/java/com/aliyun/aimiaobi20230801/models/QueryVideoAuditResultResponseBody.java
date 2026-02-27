// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryVideoAuditResultResponseBody extends TeaModel {
    /**
     * <p>业务处理结果状态码</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>视频审校的详细结果</p>
     */
    @NameInMap("Data")
    public QueryVideoAuditResultResponseBodyData data;

    /**
     * <p>HTTP响应状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>业务处理结果描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>查询成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>本次API请求的唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>请求是否处理成功</p>
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
         * <p>图片ID，与AliyunImageAuditResult中的dataId对应</p>
         * 
         * <strong>example:</strong>
         * <p>img001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Timestamp")
        public Double timestamp;

        /**
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
         * <p>0到100分，保留到小数点后2位，部分标签无置信分</p>
         * 
         * <strong>example:</strong>
         * <p>99.5</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>Label字段的解释说明</p>
         * 
         * <strong>example:</strong>
         * <p>未检测出风险</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>图片内容检测运算后返回的标签，如：nonLabel（未检测出风险）</p>
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
         * <p>对应图片的ID，与ImageUrl中的id字段对应</p>
         * 
         * <strong>example:</strong>
         * <p>d411ed15e8fc154fd0ef5addabfee04b</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>审核请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>B5D1CF9E-0404-51E3-A28E-A5C7D95B6C71</p>
         */
        @NameInMap("ReqId")
        public String reqId;

        /**
         * <p>图片检测的风险标签、置信分等参数结果</p>
         */
        @NameInMap("Result")
        public java.util.List<QueryVideoAuditResultResponseBodyDataResultsResult> result;

        /**
         * <p>风险等级：high(高风险)、medium(中风险)、low(低风险)、none(未检测到风险)</p>
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
         * <p>视频总时长（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>120.5</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>任务执行失败时的错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>视频帧率（FPS）</p>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("Fps")
        public Double fps;

        /**
         * <p>已经完成审核的帧数</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("FrameAudited")
        public Integer frameAudited;

        /**
         * <p>视频高度（像素）</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>抽取的图片URL列表</p>
         */
        @NameInMap("ImageUrls")
        public java.util.List<QueryVideoAuditResultResponseBodyDataImageUrls> imageUrls;

        /**
         * <p>图片审核结果详情</p>
         */
        @NameInMap("Results")
        public java.util.List<QueryVideoAuditResultResponseBodyDataResults> results;

        /**
         * <p>任务状态：PENDING(待执行)、RUNNING(执行中)、SUCCESSED(成功)、FAILED(失败)、CANCELED(取消)</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>视频审校的文本结果</p>
         * 
         * <strong>example:</strong>
         * <p>视频审核完成</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>需要审核的视频帧总数</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalFrameAudit")
        public Integer totalFrameAudit;

        /**
         * <p>视频总帧数</p>
         * 
         * <strong>example:</strong>
         * <p>3615</p>
         */
        @NameInMap("TotalFrames")
        public Integer totalFrames;

        /**
         * <p>检测到的视频分镜总数</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TotalShots")
        public Integer totalShots;

        /**
         * <p>被审核的视频文件Key</p>
         * 
         * <strong>example:</strong>
         * <p>video/test.mp4</p>
         */
        @NameInMap("VideoFileKey")
        public String videoFileKey;

        /**
         * <p>被审核的视频URL地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/video.mp4">https://example.com/video.mp4</a></p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        /**
         * <p>视频宽度（像素）</p>
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
