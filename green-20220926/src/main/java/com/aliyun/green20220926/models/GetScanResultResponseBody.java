// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetScanResultResponseBody extends TeaModel {
    /**
     * <p>The error code, which is consistent with the HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetScanResultResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID assigned by the backend that uniquely identifies a request. You can use this ID for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The success flag.</p>
     * 
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
         * <p>The confidence score, ranging from 0 to 100, rounded to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>50.0</p>
         */
        @NameInMap("Confidence")
        public String confidence;

        /**
         * <p>The description of the Label field.</p>
         * 
         * <strong>example:</strong>
         * <p>疑似色情内容</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The labels.</p>
         * 
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
         * <p>The AccountId input parameter from the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>accountIdtest123</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The machine-assisted moderation labels.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("ApiLabels")
        public String apiLabels;

        /**
         * <p>The machine-assisted moderation time. The value is a Unix/POSIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1755501226</p>
         */
        @NameInMap("ApiRequestTime")
        public String apiRequestTime;

        /**
         * <p>The machine-assisted moderation risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("ApiRiskLevel")
        public String apiRiskLevel;

        /**
         * <p>The machine-assisted moderation service.</p>
         * 
         * <strong>example:</strong>
         * <p>basecheckLine</p>
         */
        @NameInMap("ApiService")
        public String apiService;

        /**
         * <p>The machine-assisted moderation task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ApiTaskId")
        public String apiTaskId;

        /**
         * <p>appId</p>
         * 
         * <strong>example:</strong>
         * <p>agent_01</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The attack level, returned based on the configured risk score thresholds. Valid values:</p>
         * <ul>
         * <li><p>high: high risk.</p>
         * </li>
         * <li><p>medium: medium risk.</p>
         * </li>
         * <li><p>low: low risk.</p>
         * </li>
         * <li><p>none: no risk detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("AttackLevel")
        public String attackLevel;

        /**
         * <p>The Bailian request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>93a2f484-ac61-9b2e-9765-88600c83c1ea</p>
         */
        @NameInMap("BailianRequestId")
        public String bailianRequestId;

        /**
         * <p>The content.</p>
         * 
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
         * <p>The segment end time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>multiImage</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The feedback information.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ExtFeedback")
        public String extFeedback;

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Extra")
        public java.util.Map<String, ?> extra;

        /**
         * <p>The frame count.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FrameCount")
        public Long frameCount;

        /**
         * <p>The creation time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-11 09:00:19</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The multimodal file URLs.</p>
         */
        @NameInMap("GuardFileUrls")
        public java.util.List<String> guardFileUrls;

        /**
         * <p>The multimodal image URLs.</p>
         */
        @NameInMap("GuardImageUrls")
        public java.util.List<String> guardImageUrls;

        /**
         * <p>The image labels.</p>
         */
        @NameInMap("ImageLabels")
        public java.util.List<java.util.Map<String, ?>> imageLabels;

        /**
         * <p>The image service.</p>
         * 
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
         * <p>imageUrls</p>
         */
        @NameInMap("ImageUrls")
        public java.util.List<String> imageUrls;

        /**
         * <p>The labels.</p>
         * 
         * <strong>example:</strong>
         * <p>nonLabel</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The LiveId input parameter from the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>liveIdtest123</p>
         */
        @NameInMap("LiveId")
        public String liveId;

        /**
         * <p>The risk level of the malicious file.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("MaliciousFileLevel")
        public String maliciousFileLevel;

        /**
         * <p>The risk level of the malicious URL.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("MaliciousUrlLevel")
        public String maliciousUrlLevel;

        /**
         * <p>Indicates whether only manual review is used.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ManualOnly")
        public Boolean manualOnly;

        /**
         * <p>No labels.</p>
         */
        @NameInMap("NoLabels")
        public java.util.List<String> noLabels;

        /**
         * <p>The frame capture offset value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Offset")
        public Long offset;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The request source.</p>
         * 
         * <strong>example:</strong>
         * <p>online_test</p>
         */
        @NameInMap("RequestFrom")
        public String requestFrom;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The request time. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-11 09:00:19</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The result set.</p>
         */
        @NameInMap("Result")
        public java.util.List<GetScanResultResponseBodyDataItemsResult> result;

        /**
         * <p>The review labels.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("ReviewLabels")
        public String reviewLabels;

        /**
         * <p>The review status.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("ReviewRiskLevel")
        public String reviewRiskLevel;

        /**
         * <p>The review time. The value is a Unix/POSIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1755501226</p>
         */
        @NameInMap("ReviewTime")
        public String reviewTime;

        /**
         * <p>The reviewer.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ReviewUid")
        public String reviewUid;

        /**
         * <p>Indicates whether the content has been reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Reviewed")
        public Boolean reviewed;

        /**
         * <p>The risk level, returned based on the configured risk score thresholds. Valid values:</p>
         * <ul>
         * <li><p>high: high risk.</p>
         * </li>
         * <li><p>medium: medium risk.</p>
         * </li>
         * <li><p>low: low risk.</p>
         * </li>
         * <li><p>none: no risk detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The details of the matched risk.</p>
         * 
         * <strong>example:</strong>
         * <p>色情服务</p>
         */
        @NameInMap("RiskTips")
        public String riskTips;

        /**
         * <p>The matched risk keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>色情_低俗词</p>
         */
        @NameInMap("RiskWords")
        public String riskWords;

        /**
         * <p>The result details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ScanResult")
        public String scanResult;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The sensitivity level, returned based on the configured risk score thresholds. Valid values:</p>
         * <ul>
         * <li><strong>S1</strong>: Low sensitivity.</li>
         * <li><strong>S2</strong>: Medium sensitivity.</li>
         * <li><strong>S3</strong>: Moderately high sensitivity.</li>
         * <li><strong>S4</strong>: High sensitivity.</li>
         * <li><strong>S0</strong>: Not sensitive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S0</p>
         */
        @NameInMap("SensitiveLevel")
        public String sensitiveLevel;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The segment start time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p>review</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vi_s_EbrXb716LyBpkfwxyX5xyh-1A6RY9</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The text labels.</p>
         */
        @NameInMap("TextLabels")
        public java.util.List<java.util.Map<String, ?>> textLabels;

        /**
         * <p>The thumbnail URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyuncs.com/xxx.png">https://www.aliyuncs.com/xxx.png</a></p>
         */
        @NameInMap("Thumbnail")
        public String thumbnail;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:40-00:00:42</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The task URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyuncs.com/xxx.png">https://www.aliyuncs.com/xxx.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The audio labels.</p>
         */
        @NameInMap("VoiceLabels")
        public java.util.List<java.util.Map<String, ?>> voiceLabels;

        /**
         * <p>Indicates whether audio detection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("VoiceScanOpened")
        public Boolean voiceScanOpened;

        /**
         * <p>The audio service.</p>
         * 
         * <strong>example:</strong>
         * <p>live_stream_detection</p>
         */
        @NameInMap("VoiceService")
        public String voiceService;

        public static GetScanResultResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetScanResultResponseBodyDataItems self = new GetScanResultResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetScanResultResponseBodyDataItems setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetScanResultResponseBodyDataItems setApiLabels(String apiLabels) {
            this.apiLabels = apiLabels;
            return this;
        }
        public String getApiLabels() {
            return this.apiLabels;
        }

        public GetScanResultResponseBodyDataItems setApiRequestTime(String apiRequestTime) {
            this.apiRequestTime = apiRequestTime;
            return this;
        }
        public String getApiRequestTime() {
            return this.apiRequestTime;
        }

        public GetScanResultResponseBodyDataItems setApiRiskLevel(String apiRiskLevel) {
            this.apiRiskLevel = apiRiskLevel;
            return this;
        }
        public String getApiRiskLevel() {
            return this.apiRiskLevel;
        }

        public GetScanResultResponseBodyDataItems setApiService(String apiService) {
            this.apiService = apiService;
            return this;
        }
        public String getApiService() {
            return this.apiService;
        }

        public GetScanResultResponseBodyDataItems setApiTaskId(String apiTaskId) {
            this.apiTaskId = apiTaskId;
            return this;
        }
        public String getApiTaskId() {
            return this.apiTaskId;
        }

        public GetScanResultResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetScanResultResponseBodyDataItems setAttackLevel(String attackLevel) {
            this.attackLevel = attackLevel;
            return this;
        }
        public String getAttackLevel() {
            return this.attackLevel;
        }

        public GetScanResultResponseBodyDataItems setBailianRequestId(String bailianRequestId) {
            this.bailianRequestId = bailianRequestId;
            return this;
        }
        public String getBailianRequestId() {
            return this.bailianRequestId;
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

        public GetScanResultResponseBodyDataItems setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
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

        public GetScanResultResponseBodyDataItems setGuardFileUrls(java.util.List<String> guardFileUrls) {
            this.guardFileUrls = guardFileUrls;
            return this;
        }
        public java.util.List<String> getGuardFileUrls() {
            return this.guardFileUrls;
        }

        public GetScanResultResponseBodyDataItems setGuardImageUrls(java.util.List<String> guardImageUrls) {
            this.guardImageUrls = guardImageUrls;
            return this;
        }
        public java.util.List<String> getGuardImageUrls() {
            return this.guardImageUrls;
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

        public GetScanResultResponseBodyDataItems setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        public GetScanResultResponseBodyDataItems setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetScanResultResponseBodyDataItems setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public GetScanResultResponseBodyDataItems setMaliciousFileLevel(String maliciousFileLevel) {
            this.maliciousFileLevel = maliciousFileLevel;
            return this;
        }
        public String getMaliciousFileLevel() {
            return this.maliciousFileLevel;
        }

        public GetScanResultResponseBodyDataItems setMaliciousUrlLevel(String maliciousUrlLevel) {
            this.maliciousUrlLevel = maliciousUrlLevel;
            return this;
        }
        public String getMaliciousUrlLevel() {
            return this.maliciousUrlLevel;
        }

        public GetScanResultResponseBodyDataItems setManualOnly(Boolean manualOnly) {
            this.manualOnly = manualOnly;
            return this;
        }
        public Boolean getManualOnly() {
            return this.manualOnly;
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

        public GetScanResultResponseBodyDataItems setRequestFrom(String requestFrom) {
            this.requestFrom = requestFrom;
            return this;
        }
        public String getRequestFrom() {
            return this.requestFrom;
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

        public GetScanResultResponseBodyDataItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetScanResultResponseBodyDataItems setResult(java.util.List<GetScanResultResponseBodyDataItemsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetScanResultResponseBodyDataItemsResult> getResult() {
            return this.result;
        }

        public GetScanResultResponseBodyDataItems setReviewLabels(String reviewLabels) {
            this.reviewLabels = reviewLabels;
            return this;
        }
        public String getReviewLabels() {
            return this.reviewLabels;
        }

        public GetScanResultResponseBodyDataItems setReviewRiskLevel(String reviewRiskLevel) {
            this.reviewRiskLevel = reviewRiskLevel;
            return this;
        }
        public String getReviewRiskLevel() {
            return this.reviewRiskLevel;
        }

        public GetScanResultResponseBodyDataItems setReviewTime(String reviewTime) {
            this.reviewTime = reviewTime;
            return this;
        }
        public String getReviewTime() {
            return this.reviewTime;
        }

        public GetScanResultResponseBodyDataItems setReviewUid(String reviewUid) {
            this.reviewUid = reviewUid;
            return this;
        }
        public String getReviewUid() {
            return this.reviewUid;
        }

        public GetScanResultResponseBodyDataItems setReviewed(Boolean reviewed) {
            this.reviewed = reviewed;
            return this;
        }
        public Boolean getReviewed() {
            return this.reviewed;
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

        public GetScanResultResponseBodyDataItems setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The data on the current page.</p>
         */
        @NameInMap("Items")
        public java.util.List<GetScanResultResponseBodyDataItems> items;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
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
