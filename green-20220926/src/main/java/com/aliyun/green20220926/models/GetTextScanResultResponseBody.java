// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetTextScanResultResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
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
    public GetTextScanResultResponseBodyData data;

    /**
     * <p>The description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTextScanResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTextScanResultResponseBody self = new GetTextScanResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTextScanResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTextScanResultResponseBody setData(GetTextScanResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTextScanResultResponseBodyData getData() {
        return this.data;
    }

    public GetTextScanResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetTextScanResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTextScanResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTextScanResultResponseBodyDataItemsResult extends TeaModel {
        /**
         * <p>The confidence score, ranging from 0 to 100 and rounded to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The description.</p>
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
         * <p>political_n</p>
         */
        @NameInMap("Label")
        public String label;

        public static GetTextScanResultResponseBodyDataItemsResult build(java.util.Map<String, ?> map) throws Exception {
            GetTextScanResultResponseBodyDataItemsResult self = new GetTextScanResultResponseBodyDataItemsResult();
            return TeaModel.build(map, self);
        }

        public GetTextScanResultResponseBodyDataItemsResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public GetTextScanResultResponseBodyDataItemsResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTextScanResultResponseBodyDataItemsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class GetTextScanResultResponseBodyDataItems extends TeaModel {
        /**
         * <p>The AccountId passed in by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>accountIdtest123</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The Bailian request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("BailianRequestId")
        public String bailianRequestId;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>测试内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The DataId passed in by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The feedback information.</p>
         * 
         * <strong>example:</strong>
         * <p>miss</p>
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-11 14:21:36</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The labels.</p>
         * 
         * <strong>example:</strong>
         * <p>nonLabel</p>
         */
        @NameInMap("Labels")
        public String labels;

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
         * <p>2023-07-11 14:21:36</p>
         */
        @NameInMap("RequestTime")
        public String requestTime;

        /**
         * <p>The detection results.</p>
         */
        @NameInMap("Result")
        public java.util.List<GetTextScanResultResponseBodyDataItemsResult> result;

        /**
         * <p>The risk level, which is returned based on the configured high and low risk score thresholds. Valid values:</p>
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
         * <p>20</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>nickname_detection</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <p>The suggested action.</p>
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
         * <p>txtwkgb******AsYNXoJswy-1Aa1Qk</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GetTextScanResultResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetTextScanResultResponseBodyDataItems self = new GetTextScanResultResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetTextScanResultResponseBodyDataItems setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetTextScanResultResponseBodyDataItems setBailianRequestId(String bailianRequestId) {
            this.bailianRequestId = bailianRequestId;
            return this;
        }
        public String getBailianRequestId() {
            return this.bailianRequestId;
        }

        public GetTextScanResultResponseBodyDataItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTextScanResultResponseBodyDataItems setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetTextScanResultResponseBodyDataItems setExtFeedback(String extFeedback) {
            this.extFeedback = extFeedback;
            return this;
        }
        public String getExtFeedback() {
            return this.extFeedback;
        }

        public GetTextScanResultResponseBodyDataItems setExtra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }
        public java.util.Map<String, ?> getExtra() {
            return this.extra;
        }

        public GetTextScanResultResponseBodyDataItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTextScanResultResponseBodyDataItems setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetTextScanResultResponseBodyDataItems setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetTextScanResultResponseBodyDataItems setRequestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public String getRequestTime() {
            return this.requestTime;
        }

        public GetTextScanResultResponseBodyDataItems setResult(java.util.List<GetTextScanResultResponseBodyDataItemsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetTextScanResultResponseBodyDataItemsResult> getResult() {
            return this.result;
        }

        public GetTextScanResultResponseBodyDataItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetTextScanResultResponseBodyDataItems setScanResult(String scanResult) {
            this.scanResult = scanResult;
            return this;
        }
        public String getScanResult() {
            return this.scanResult;
        }

        public GetTextScanResultResponseBodyDataItems setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public GetTextScanResultResponseBodyDataItems setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetTextScanResultResponseBodyDataItems setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public GetTextScanResultResponseBodyDataItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetTextScanResultResponseBodyData extends TeaModel {
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
        public java.util.List<GetTextScanResultResponseBodyDataItems> items;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetTextScanResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTextScanResultResponseBodyData self = new GetTextScanResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTextScanResultResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetTextScanResultResponseBodyData setItems(java.util.List<GetTextScanResultResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetTextScanResultResponseBodyDataItems> getItems() {
            return this.items;
        }

        public GetTextScanResultResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetTextScanResultResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
