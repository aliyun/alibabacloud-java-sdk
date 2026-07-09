// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateReportDefinitionRequest extends TeaModel {
    /**
     * <p>The start billing cycle for push. After the subscription succeeds, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly bill PDF subscriptions, and historical data will not be re-pushed. You can push data within the last year.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    /**
     * <p>The email subscription configuration that specifies whether to include multi-account members of the organization in bills.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeMembers")
    public String includeMembers;

    /**
     * <p>The name of the MaxCompute project.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("McProject")
    public String mcProject;

    /**
     * <p>The name of the MaxCompute subscription table.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
    @NameInMap("McTableName")
    public String mcTableName;

    /**
     * <p>The first-level site ID. If this parameter is left empty, the site ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The email subscription configuration that specifies whether to skip sending emails when no bills are available.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NotSendOnNoData")
    public String notSendOnNoData;

    /**
     * <p>The name of the OSS bucket for file storage.</p>
     * 
     * <strong>example:</strong>
     * <p>sh-bill</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The UID of the OSS bucket owner that stores the files. If this is a Bid/Reseller subscription and you need to push data to a sub-account\&quot;s OSS, specify this parameter. The account must be a sub-account of the calling account, and the AliyunConsumeDump2OSSRole permission must be granted to this account. Regular users do not need to specify this parameter. The default value is the calling account.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567812345678</p>
     */
    @NameInMap("OssBucketOwnerAccountId")
    public Long ossBucketOwnerAccountId;

    /**
     * <p>The storage path of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>bill/</p>
     */
    @NameInMap("OssBucketPath")
    public String ossBucketPath;

    /**
     * <p>The subscription source. Valid values: OSS, MC, and MSC_EMAIL.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("ReportSourceType")
    public String reportSourceType;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>consumeDetailBillV2: consumption details. This value is supported only by OSS/MC subscriptions.</li>
     * <li>splitDetailBillV2: split details. This value is supported only by OSS/MC subscriptions.</li>
     * <li>costDetailBillV2: cost details. This value is supported only by OSS/MC subscriptions.</li>
     * <li>monthBillOverview: monthly bill overview. This value is supported only by OSS/MSC_EMAIL subscriptions.</li>
     * <li>focus: FOCUS bill. This value is supported only by OSS/MC subscriptions.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consumeDetailBillV2</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The email subscription configuration that specifies whether to send emails with bill attachments.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SendWithAttach")
    public String sendWithAttach;

    /**
     * <p>The email subscription configuration that specifies whether to split attachments by user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SplitFileOnUserId")
    public String splitFileOnUserId;

    public static CreateReportDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportDefinitionRequest self = new CreateReportDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportDefinitionRequest setBeginBillingCycle(String beginBillingCycle) {
        this.beginBillingCycle = beginBillingCycle;
        return this;
    }
    public String getBeginBillingCycle() {
        return this.beginBillingCycle;
    }

    public CreateReportDefinitionRequest setIncludeMembers(String includeMembers) {
        this.includeMembers = includeMembers;
        return this;
    }
    public String getIncludeMembers() {
        return this.includeMembers;
    }

    public CreateReportDefinitionRequest setMcProject(String mcProject) {
        this.mcProject = mcProject;
        return this;
    }
    public String getMcProject() {
        return this.mcProject;
    }

    public CreateReportDefinitionRequest setMcTableName(String mcTableName) {
        this.mcTableName = mcTableName;
        return this;
    }
    public String getMcTableName() {
        return this.mcTableName;
    }

    public CreateReportDefinitionRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public CreateReportDefinitionRequest setNotSendOnNoData(String notSendOnNoData) {
        this.notSendOnNoData = notSendOnNoData;
        return this;
    }
    public String getNotSendOnNoData() {
        return this.notSendOnNoData;
    }

    public CreateReportDefinitionRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateReportDefinitionRequest setOssBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
        this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
        return this;
    }
    public Long getOssBucketOwnerAccountId() {
        return this.ossBucketOwnerAccountId;
    }

    public CreateReportDefinitionRequest setOssBucketPath(String ossBucketPath) {
        this.ossBucketPath = ossBucketPath;
        return this;
    }
    public String getOssBucketPath() {
        return this.ossBucketPath;
    }

    public CreateReportDefinitionRequest setReportSourceType(String reportSourceType) {
        this.reportSourceType = reportSourceType;
        return this;
    }
    public String getReportSourceType() {
        return this.reportSourceType;
    }

    public CreateReportDefinitionRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public CreateReportDefinitionRequest setSendWithAttach(String sendWithAttach) {
        this.sendWithAttach = sendWithAttach;
        return this;
    }
    public String getSendWithAttach() {
        return this.sendWithAttach;
    }

    public CreateReportDefinitionRequest setSplitFileOnUserId(String splitFileOnUserId) {
        this.splitFileOnUserId = splitFileOnUserId;
        return this;
    }
    public String getSplitFileOnUserId() {
        return this.splitFileOnUserId;
    }

}
