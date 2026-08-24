// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateReportDefinitionResponseBody extends TeaModel {
    /**
     * <p>The start billing cycle for push. After successful subscription, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly bill PDF subscriptions and does not re-push historical data. Data within the last year can be pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    /**
     * <p>The response struct metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The name of the OSS bucket for file storage.</p>
     * 
     * <strong>example:</strong>
     * <p>sh-bill</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The UID of the OSS owner that stores the files. If this is a Bid/Reseller subscription and you need to push to a sub-account\&quot;s OSS, specify this parameter. The account must be a sub-account of the calling account, and the AliyunConsumeDump2OSSRole permission must be granted to this account. Regular users do not need to specify this parameter. The default value is the calling account.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567812345678</p>
     */
    @NameInMap("OssBucketOwnerAccountId")
    public Long ossBucketOwnerAccountId;

    /**
     * <p>The OSS bucket storage path.</p>
     * 
     * <strong>example:</strong>
     * <p>bill/</p>
     */
    @NameInMap("OssBucketPath")
    public String ossBucketPath;

    /**
     * <p>The subscription source name.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("ReportSourceName")
    public String reportSourceName;

    /**
     * <p>The subscription source. Valid values: OSS or MC.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("ReportSourceType")
    public String reportSourceType;

    /**
     * <p>The bill subscription task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("ReportTaskId")
    public Long reportTaskId;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>consumeDetailBillV2: consumption details (supported only for OSS/MC subscriptions).</li>
     * <li>splitDetailBillV2: split details (supported only for OSS/MC subscriptions).</li>
     * <li>costDetailBillV2: cost details (supported only for OSS/MC subscriptions).</li>
     * <li>monthBillOverview: monthly bill summary (supported only for OSS/MSC_EMAIL subscriptions).</li>
     * <li>focus: FOCUS bill (supported only for OSS/MC subscriptions).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>consumeDetailBillV2</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>340CAB45-0637-5875-9BE4-EFD5750F6BA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The subscription creation time.</p>
     * 
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
