// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateReportDefinitionShrinkRequest extends TeaModel {
    /**
     * <p>The start billing cycle for push. After successful subscription, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly bill PDF subscriptions and does not re-push historical data. Data within the last year can be pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    /**
     * <p>Email subscription configuration. Specifies whether to include enterprise multi-account members in the bill.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeMembers")
    public String includeMembers;

    /**
     * <p>The MaxCompute project name.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("McProject")
    public String mcProject;

    /**
     * <p>The MaxCompute subscription table name.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
    @NameInMap("McTableName")
    public String mcTableName;

    /**
     * <p>The primary sales site ID. If left empty, the system uses the site ID of the current user by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>Email subscription configuration. Specifies whether to skip sending emails when no bills are available.</p>
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
     * <p>The subscription source. Valid values: OSS, MC, or MSC_EMAIL.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("ReportSourceType")
    public String reportSourceType;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>consumeDetailBillV2: consumption details (supported only for OSS/MC subscriptions).</li>
     * <li>splitDetailBillV2: split details (supported only for OSS/MC subscriptions).</li>
     * <li>costDetailBillV2: cost details (supported only for OSS/MC subscriptions).</li>
     * <li>monthBillOverview: monthly bill summary (supported only for OSS/MSC_EMAIL subscriptions).</li>
     * <li>focus: FOCUS bill (supported only for OSS/MC subscriptions).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consumeDetailBillV2</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The user-specified subscription fields.</p>
     */
    @NameInMap("SelectedFields")
    public String selectedFieldsShrink;

    /**
     * <p>Email subscription configuration. Specifies whether to include bill attachments in emails.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SendWithAttach")
    public String sendWithAttach;

    /**
     * <p>Email subscription configuration. Specifies whether to split attachments by user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SplitFileOnUserId")
    public String splitFileOnUserId;

    public static CreateReportDefinitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportDefinitionShrinkRequest self = new CreateReportDefinitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportDefinitionShrinkRequest setBeginBillingCycle(String beginBillingCycle) {
        this.beginBillingCycle = beginBillingCycle;
        return this;
    }
    public String getBeginBillingCycle() {
        return this.beginBillingCycle;
    }

    public CreateReportDefinitionShrinkRequest setIncludeMembers(String includeMembers) {
        this.includeMembers = includeMembers;
        return this;
    }
    public String getIncludeMembers() {
        return this.includeMembers;
    }

    public CreateReportDefinitionShrinkRequest setMcProject(String mcProject) {
        this.mcProject = mcProject;
        return this;
    }
    public String getMcProject() {
        return this.mcProject;
    }

    public CreateReportDefinitionShrinkRequest setMcTableName(String mcTableName) {
        this.mcTableName = mcTableName;
        return this;
    }
    public String getMcTableName() {
        return this.mcTableName;
    }

    public CreateReportDefinitionShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public CreateReportDefinitionShrinkRequest setNotSendOnNoData(String notSendOnNoData) {
        this.notSendOnNoData = notSendOnNoData;
        return this;
    }
    public String getNotSendOnNoData() {
        return this.notSendOnNoData;
    }

    public CreateReportDefinitionShrinkRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public CreateReportDefinitionShrinkRequest setOssBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
        this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
        return this;
    }
    public Long getOssBucketOwnerAccountId() {
        return this.ossBucketOwnerAccountId;
    }

    public CreateReportDefinitionShrinkRequest setOssBucketPath(String ossBucketPath) {
        this.ossBucketPath = ossBucketPath;
        return this;
    }
    public String getOssBucketPath() {
        return this.ossBucketPath;
    }

    public CreateReportDefinitionShrinkRequest setReportSourceType(String reportSourceType) {
        this.reportSourceType = reportSourceType;
        return this;
    }
    public String getReportSourceType() {
        return this.reportSourceType;
    }

    public CreateReportDefinitionShrinkRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public CreateReportDefinitionShrinkRequest setSelectedFieldsShrink(String selectedFieldsShrink) {
        this.selectedFieldsShrink = selectedFieldsShrink;
        return this;
    }
    public String getSelectedFieldsShrink() {
        return this.selectedFieldsShrink;
    }

    public CreateReportDefinitionShrinkRequest setSendWithAttach(String sendWithAttach) {
        this.sendWithAttach = sendWithAttach;
        return this;
    }
    public String getSendWithAttach() {
        return this.sendWithAttach;
    }

    public CreateReportDefinitionShrinkRequest setSplitFileOnUserId(String splitFileOnUserId) {
        this.splitFileOnUserId = splitFileOnUserId;
        return this;
    }
    public String getSplitFileOnUserId() {
        return this.splitFileOnUserId;
    }

}
