// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayQuotaRuleSubjectUsageExportTaskRequest extends TeaModel {
    /**
     * <p>The optional token used for request idempotency. It can be up to 128 bytes in length after leading and trailing whitespaces are removed. We recommend that you use ASCII characters.</p>
     * <p>When the same user retries with the same token and identical request parameters in the current region, the existing task is reused and its current status is returned. If the same token corresponds to different parameters, a parameter error is returned. The compared parameters include gatewayId, ruleId, subjectId, filterFailedRequests, format, and whether startTime and endTime are passed and their values. Omitting the time is not equivalent to explicitly passing 0.</p>
     * <p>Reusing a task does not recalculate the time range or regenerate the file. When you need to re-export data (including when the original task fails or the file expires), use a new token.</p>
     * 
     * <strong>example:</strong>
     * <p>usage-export-20260729-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The end time of the export time range. Use a non-negative Unix timestamp in seconds. This time is exclusive.</p>
     * <p>If only endTime is specified, one rule period is deduced forward from this time as the startTime. If neither is specified, the end time is the task creation time. If both are specified, endTime must be greater than or equal to startTime, and the span cannot exceed one rule period.</p>
     * 
     * <strong>example:</strong>
     * <p>1783935200</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Specifies whether to export only consumption details with valid usage. Default value: false.</p>
     * <ul>
     * <li>false: Does not filter records by usage.</li>
     * <li>true: Filters out records with zero usage based on the token or credit metering dimension of the rule, and retains only records with usage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("filterFailedRequests")
    public Boolean filterFailedRequests;

    /**
     * <p>The format of the exported file. Currently, only CSV_GZIP is supported. If omitted or an empty string is passed, this format is used by default. The file is a GZIP-compressed CSV file named <code>{taskId}.csv.gz</code> and must be decompressed before reading.</p>
     * 
     * <strong>example:</strong>
     * <p>CSV_GZIP</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>The start time of the export time range. Use a non-negative Unix timestamp in seconds. This time is inclusive.</p>
     * <ul>
     * <li>If neither startTime nor endTime is specified: The start point of the current rule epoch to the node creation time is used.</li>
     * <li>If only startTime is specified: One rule epoch is deduced backward from this time as the endTime.</li>
     * <li>If both are specified: endTime must be greater than or equal to startTime, and the span cannot exceed one rule epoch.</li>
     * </ul>
     * <p>The actual export start point is also limited by the rule creation time, rule reset, or the effective start point of purge history records. You can confirm this by querying the effectiveWindowStart returned by the node.</p>
     * 
     * <strong>example:</strong>
     * <p>1783931600</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static CreateGatewayQuotaRuleSubjectUsageExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayQuotaRuleSubjectUsageExportTaskRequest self = new CreateGatewayQuotaRuleSubjectUsageExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskRequest setFilterFailedRequests(Boolean filterFailedRequests) {
        this.filterFailedRequests = filterFailedRequests;
        return this;
    }
    public Boolean getFilterFailedRequests() {
        return this.filterFailedRequests;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
