// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetScanResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetScanResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetScanResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScanResultResponseBody self = new GetScanResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScanResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetScanResultResponseBody setData(GetScanResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScanResultResponseBodyData getData() {
        return this.data;
    }

    public GetScanResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetScanResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetScanResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScanResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScanResultResponseBodyDataItemsResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50.0</p>
         */
        @NameInMap("Confidence")
        public String confidence;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>politics</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetScanResultResponseBodyDataItemsResult build(java.util.Map<String, ?> map) throws Exception {
            GetScanResultResponseBodyDataItemsResult self = new GetScanResultResponseBodyDataItemsResult();
            return TeaModel.build(map, self);
        }

        public GetScanResultResponseBodyDataItemsResult setConfidence(String confidence) {
            this.confidence = confidence;
            return this;
        }
        public String getConfidence() {
            return this.confidence;
        }

        public GetScanResultResponseBodyDataItemsResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScanResultResponseBodyDataItemsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetScanResultResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>dataId</p>
         * 
         * <strong>example:</strong>
         * <p>4f27b8cc7c4544cb90b41882a5b36326</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ExtFeedback")
        public String extFeedback;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Extra")
        public java.util.Map<String, ?> extra;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FrameCount")
        public Long frameCount;

        /**
         * <strong>example:</strong>
         * <p>2023-08-11 09:00:19</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("ImageLabels")
        public java.util.List<java.util.Map<String, ?>> imageLabels;

        /**
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        @NameInMap("ImageService")
        public String imageService;

        /**
         * <p>url</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyuncs.com/xxx.png">https://www.aliyuncs.com/xxx.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>nonLabel</p>
         */
        @NameInMap("Labels")
        public String labels;

        @NameInMap("NoLabels")
        public java.util.List<String> noLabels;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Offset")
        public Long offset;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>2023-08-11 09:00:19</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        @NameInMap("Result")
        public java.util.List<GetScanResultResponseBodyDataItemsResult> result;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("RiskTips")
        public String riskTips;

        @NameInMap("RiskWords")
        public String riskWords;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScanResult")
        public String scanResult;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>review</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <strong>example:</strong>
         * <p>vi_s_EbrXb716LyBpkfwxyX5xyh-1A6RY9</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TextLabels")
        public java.util.List<java.util.Map<String, ?>> textLabels;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.aliyuncs.com/xxx.png">https://www.aliyuncs.com/xxx.png</a></p>
         */
        @NameInMap("Thumbnail")
        public String thumbnail;

        /**
         * <strong>example:</strong>
         * <p>00:00:40-00:00:42</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.aliyuncs.com/xxx.png">https://www.aliyuncs.com/xxx.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        @NameInMap("VoiceLabels")
        public java.util.List<java.util.Map<String, ?>> voiceLabels;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("VoiceScanOpened")
        public Boolean voiceScanOpened;

        /**
         * <strong>example:</strong>
         * <p>live_stream_detection</p>
         */
        @NameInMap("VoiceService")
        public String voiceService;

        public static GetScanResultResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetScanResultResponseBodyDataItems self = new GetScanResultResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetScanResultResponseBodyDataItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetScanResultResponseBodyDataItems setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetScanResultResponseBodyDataItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetScanResultResponseBodyDataItems setExtFeedback(String extFeedback) {
            this.extFeedback = extFeedback;
            return this;
        }
        public String getExtFeedback() {
            return this.extFeedback;
        }

        public GetScanResultResponseBodyDataItems setExtra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, ?> getExtra() {
            return this.extra;
        }

        public GetScanResultResponseBodyDataItems setFrameCount(Long frameCount) {
            this.frameCount = frameCount;
            return this;
        }
        public Long getFrameCount() {
            return this.frameCount;
        }

        public GetScanResultResponseBodyDataItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetScanResultResponseBodyDataItems setImageLabels(java.util.List<java.util.Map<String, ?>> imageLabels) {
            this.imageLabels = imageLabels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getImageLabels() {
            return this.imageLabels;
        }

        public GetScanResultResponseBodyDataItems setImageService(String imageService) {
            this.imageService = imageService;
            return this;
        }
        public String getImageService() {
            return this.imageService;
        }

        public GetScanResultResponseBodyDataItems setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetScanResultResponseBodyDataItems setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetScanResultResponseBodyDataItems setNoLabels(java.util.List<String> noLabels) {
            this.noLabels = noLabels;
            return this;
        }
        public java.util.List<String> getNoLabels() {
            return this.noLabels;
        }

        public GetScanResultResponseBodyDataItems setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public GetScanResultResponseBodyDataItems setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public GetScanResultResponseBodyDataItems setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetScanResultResponseBodyDataItems setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public GetScanResultResponseBodyDataItems setResult(java.util.List<GetScanResultResponseBodyDataItemsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetScanResultResponseBodyDataItemsResult> getResult() {
            return this.result;
        }

        public GetScanResultResponseBodyDataItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetScanResultResponseBodyDataItems setRiskTips(String riskTips) {
            this.riskTips = riskTips;
            return this;
        }
        public String getRiskTips() {
            return this.riskTips;
        }

        public GetScanResultResponseBodyDataItems setRiskWords(String riskWords) {
            this.riskWords = riskWords;
            return this;
        }
        public String getRiskWords() {
            return this.riskWords;
        }

        public GetScanResultResponseBodyDataItems setScanResult(String scanResult) {
            this.scanResult = scanResult;
            return this;
        }
        public String getScanResult() {
            return this.scanResult;
        }

        public GetScanResultResponseBodyDataItems setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public GetScanResultResponseBodyDataItems setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetScanResultResponseBodyDataItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetScanResultResponseBodyDataItems setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetScanResultResponseBodyDataItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetScanResultResponseBodyDataItems setTextLabels(java.util.List<java.util.Map<String, ?>> textLabels) {
            this.textLabels = textLabels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTextLabels() {
            return this.textLabels;
        }

        public GetScanResultResponseBodyDataItems setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public GetScanResultResponseBodyDataItems setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public GetScanResultResponseBodyDataItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetScanResultResponseBodyDataItems setVoiceLabels(java.util.List<java.util.Map<String, ?>> voiceLabels) {
            this.voiceLabels = voiceLabels;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getVoiceLabels() {
            return this.voiceLabels;
        }

        public GetScanResultResponseBodyDataItems setVoiceScanOpened(Boolean voiceScanOpened) {
            this.voiceScanOpened = voiceScanOpened;
            return this;
        }
        public Boolean getVoiceScanOpened() {
            return this.voiceScanOpened;
        }

        public GetScanResultResponseBodyDataItems setVoiceService(String voiceService) {
            this.voiceService = voiceService;
            return this;
        }
        public String getVoiceService() {
            return this.voiceService;
        }

    }

    public static class GetScanResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Items")
        public java.util.List<GetScanResultResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetScanResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScanResultResponseBodyData self = new GetScanResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScanResultResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetScanResultResponseBodyData setItems(java.util.List<GetScanResultResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetScanResultResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetScanResultResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetScanResultResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
