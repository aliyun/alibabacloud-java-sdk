// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID of this OpenAPI query call, which is used to troubleshoot call issues. This is different from the request_id of each consumption record in the exported file.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody self = new GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody setData(GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult extends TeaModel {
        /**
         * <p>The temporary signed download URL of the exported file. It is returned only when status=Success and the file is not expired. It is dynamically generated for each query and is valid for 10 minutes from the generation time. If the link expires but fileExpiredAt is not reached, you can call this operation again to obtain the link. You do not need to pass the internal storage path as a request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.oss-cn-hangzhou.aliyuncs.com/export.csv.gz">https://example.oss-cn-hangzhou.aliyuncs.com/export.csv.gz</a></p>
         */
        @NameInMap("downloadUrl")
        public String downloadUrl;

        /**
         * <p>The expiration time of the downloadUrl returned in this response. It is a UNIX timestamp in seconds. It is provided only when a download link is returned and is approximately 10 minutes after the link generation time. It can be updated by querying again and cannot be used to replace fileExpiredAt.</p>
         * 
         * <strong>example:</strong>
         * <p>1783938800</p>
         */
        @NameInMap("downloadUrlExpiredAt")
        public Long downloadUrlExpiredAt;

        /**
         * <p>The start time of the actual export time range. It is a UNIX timestamp in seconds. The actual start time is also limited by the rule creation time, rule reset, or the effective start time of clearing history records. No details are available if the start time is not earlier than the end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1783931600</p>
         */
        @NameInMap("effectiveWindowStart")
        public Long effectiveWindowStart;

        /**
         * <p>Indicates whether the exported file has exceeded the server-side period for providing download links. A value of true indicates that the file has expired, downloadUrl and downloadUrlExpiredAt are not returned, and you need to create a new export task. This field may be omitted when the value is false. To determine whether the file is downloadable, check both status and downloadUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fileExpired")
        public Boolean fileExpired;

        /**
         * <p>The time when the file stops providing new download links. It is a UNIX timestamp in seconds and is usually 24 hours after the file is successfully uploaded. After this time, this operation returns fileExpired=true and no longer generates downloadUrl. The task remains in the Success state. This time is different from the downloadUrlExpiredAt of a single signed link.</p>
         * 
         * <strong>example:</strong>
         * <p>1784021600</p>
         */
        @NameInMap("fileExpiredAt")
        public Long fileExpiredAt;

        /**
         * <p>The size of the successfully generated and uploaded GZIP compressed file, in bytes. This field may be omitted when the task is not successful.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>Specifies whether to filter out requests with failed or zero usage, which is specified when the task is created. A value of true filters out records with 0 usage and retains only records with usage. This field may be omitted when the value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("filterFailedRequests")
        public Boolean filterFailedRequests;

        /**
         * <p>The format of the exported file. The value is currently fixed as CSV_GZIP. The downloaded file is a .csv.gz file, which becomes a CSV file after decompression.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV_GZIP</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>The end time of the request time range determined when the task was created. It is a UNIX timestamp in seconds and does not include this moment. If no time range is specified, this value is the task creation time and is not updated when the task is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1783935200</p>
         */
        @NameInMap("queryWindowEnd")
        public Long queryWindowEnd;

        /**
         * <p>The start time of the request time range determined when the task was created. It is a UNIX timestamp in seconds and includes this moment. If only one time parameter is passed, this value may be derived from the rule period. For the actual export start time, see effectiveWindowStart.</p>
         * 
         * <strong>example:</strong>
         * <p>1783931600</p>
         */
        @NameInMap("queryWindowStart")
        public Long queryWindowStart;

        /**
         * <p>The quota metering dimension determined when the task was created. token indicates token usage, and credit indicates credit usage. The CSV file outputs the corresponding columns based on this dimension. Credit usage retains decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("quotaDimension")
        public String quotaDimension;

        /**
         * <p>The number of successfully exported consumption detail rows, excluding the CSV header. This field may be omitted when the task is not successful or the export result contains 0 rows. If the task is successful but no matching details exist, the file contains only the header.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("rowCount")
        public Long rowCount;

        public static GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult self = new GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setDownloadUrlExpiredAt(Long downloadUrlExpiredAt) {
            this.downloadUrlExpiredAt = downloadUrlExpiredAt;
            return this;
        }
        public Long getDownloadUrlExpiredAt() {
            return this.downloadUrlExpiredAt;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setEffectiveWindowStart(Long effectiveWindowStart) {
            this.effectiveWindowStart = effectiveWindowStart;
            return this;
        }
        public Long getEffectiveWindowStart() {
            return this.effectiveWindowStart;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setFileExpired(Boolean fileExpired) {
            this.fileExpired = fileExpired;
            return this;
        }
        public Boolean getFileExpired() {
            return this.fileExpired;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setFileExpiredAt(Long fileExpiredAt) {
            this.fileExpiredAt = fileExpiredAt;
            return this;
        }
        public Long getFileExpiredAt() {
            return this.fileExpiredAt;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setFilterFailedRequests(Boolean filterFailedRequests) {
            this.filterFailedRequests = filterFailedRequests;
            return this;
        }
        public Boolean getFilterFailedRequests() {
            return this.filterFailedRequests;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setQueryWindowEnd(Long queryWindowEnd) {
            this.queryWindowEnd = queryWindowEnd;
            return this;
        }
        public Long getQueryWindowEnd() {
            return this.queryWindowEnd;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setQueryWindowStart(Long queryWindowStart) {
            this.queryWindowStart = queryWindowStart;
            return this;
        }
        public Long getQueryWindowStart() {
            return this.queryWindowStart;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setQuotaDimension(String quotaDimension) {
            this.quotaDimension = quotaDimension;
            return this;
        }
        public String getQuotaDimension() {
            return this.quotaDimension;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

    }

    public static class GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData extends TeaModel {
        /**
         * <p>The error summary when the task fails, which is used to troubleshoot issues such as disabled logs, query failures, exceeded detail limits, processing timeouts, or file generation failures. This field may be omitted when no errors occur.</p>
         * 
         * <strong>example:</strong>
         * <p>log delivery is not enabled</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The gateway ID recorded when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The number of detail rows written to the exported file, excluding the header. This value is used to check the processing progress. Even if this value equals totalCount, you should determine whether the file is downloadable based on status=Success.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("processedCount")
        public Integer processedCount;

        /**
         * <p>The export conditions and file results determined when the task was created. The time range, format, and metering dimension may be returned even in non-Success states. File and download information is available only after success. Fields with values of 0, false, or empty strings are omitted.</p>
         */
        @NameInMap("result")
        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult result;

        /**
         * <p>The quota rule ID recorded when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>qr-123456</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The current status of the task. Valid values:</p>
         * <ul>
         * <li>Pending: The task is submitted and waiting to be processed.</li>
         * <li>Running: The task is querying details, generating files, or uploading files.</li>
         * <li>Success: The file is generated and uploaded. You still need to check whether the file is expired.</li>
         * <li>Failed: The task failed. For the cause, see errorMessage.</li>
         * </ul>
         * <p>Tasks that are not completed within 10 minutes after creation are processed as Failed. After a file expires, the task remains in the Success state.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The consumer or consumer group ID recorded when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-123456</p>
         */
        @NameInMap("subjectId")
        public String subjectId;

        /**
         * <p>The subject name recorded when the task was created, which is used to match consumption logs. Subsequent changes to the subject name do not modify the name recorded for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-name</p>
         */
        @NameInMap("subjectName")
        public String subjectName;

        /**
         * <p>The export task ID, which is the same as the taskId request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>finops-export-abcdef1234567890</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The task type. The value is fixed as FinOpsUsageDetailExport, which indicates the export of quota rule subject consumption details.</p>
         * 
         * <strong>example:</strong>
         * <p>FinOpsUsageDetailExport</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <p>The total number of detail rows to be exported as counted by backend queries, excluding the CSV header. This value may be 0 before the counting is completed. You cannot determine whether the result is empty or the task is completed based solely on this value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData self = new GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setProcessedCount(Integer processedCount) {
            this.processedCount = processedCount;
            return this;
        }
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setResult(GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyDataResult getResult() {
            return this.result;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }
        public String getSubjectId() {
            return this.subjectId;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }
        public String getSubjectName() {
            return this.subjectName;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
