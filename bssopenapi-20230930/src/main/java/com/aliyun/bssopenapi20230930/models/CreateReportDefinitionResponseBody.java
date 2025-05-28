// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateReportDefinitionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-05</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>sh-bill</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <strong>example:</strong>
     * <p>1234567812345678</p>
     */
    @NameInMap("OssBucketOwnerAccountId")
    public Long ossBucketOwnerAccountId;

    /**
     * <strong>example:</strong>
     * <p>bill/</p>
     */
    @NameInMap("OssBucketPath")
    public String ossBucketPath;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("ReportSourceName")
    public String reportSourceName;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("ReportSourceType")
    public String reportSourceType;

    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("ReportTaskId")
    public Long reportTaskId;

    /**
     * <strong>example:</strong>
     * <p>BillingItemDetailForBillingPeriod</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <strong>example:</strong>
     * <p>340CAB45-0637-5875-9BE4-EFD5750F6BA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2025-05-21 10:36:31</p>
     */
    @NameInMap("SubscribeCreateTime")
    public String subscribeCreateTime;

    public static CreateReportDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateReportDefinitionResponseBody self = new CreateReportDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateReportDefinitionResponseBody setBeginBillingCycle(String beginBillingCycle) {
        this.beginBillingCycle = beginBillingCycle;
        return this;
    }
    public String getBeginBillingCycle() {
        return this.beginBillingCycle;
    }

    public CreateReportDefinitionResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public CreateReportDefinitionResponseBody setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateReportDefinitionResponseBody setOssBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
        this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
        return this;
    }
    public Long getOssBucketOwnerAccountId() {
        return this.ossBucketOwnerAccountId;
    }

    public CreateReportDefinitionResponseBody setOssBucketPath(String ossBucketPath) {
        this.ossBucketPath = ossBucketPath;
        return this;
    }
    public String getOssBucketPath() {
        return this.ossBucketPath;
    }

    public CreateReportDefinitionResponseBody setReportSourceName(String reportSourceName) {
        this.reportSourceName = reportSourceName;
        return this;
    }
    public String getReportSourceName() {
        return this.reportSourceName;
    }

    public CreateReportDefinitionResponseBody setReportSourceType(String reportSourceType) {
        this.reportSourceType = reportSourceType;
        return this;
    }
    public String getReportSourceType() {
        return this.reportSourceType;
    }

    public CreateReportDefinitionResponseBody setReportTaskId(Long reportTaskId) {
        this.reportTaskId = reportTaskId;
        return this;
    }
    public Long getReportTaskId() {
        return this.reportTaskId;
    }

    public CreateReportDefinitionResponseBody setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public CreateReportDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateReportDefinitionResponseBody setSubscribeCreateTime(String subscribeCreateTime) {
        this.subscribeCreateTime = subscribeCreateTime;
        return this;
    }
    public String getSubscribeCreateTime() {
        return this.subscribeCreateTime;
    }

}
