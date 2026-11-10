// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayQuotaRuleSubjectUsageExportTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>usage-export-20260729-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1783935200</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("filterFailedRequests")
    public Boolean filterFailedRequests;

    /**
     * <strong>example:</strong>
     * <p>CSV_GZIP</p>
     */
    @NameInMap("format")
    public String format;

    /**
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
