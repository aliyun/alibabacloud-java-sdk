// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateReportDefinitionRequest extends TeaModel {
    /**
     * <p>The start billing cycle for data push. After the subscription is created, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly billing PDF subscriptions, and historical data is not pushed again. Data within the most recent year can be pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    /**
     * <p>Specifies whether to include enterprise multi-account members in bills for email subscriptions.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeMembers")
    public String includeMembers;

    /**
     * <p>The name of the MC project.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("McProject")
    public String mcProject;

    /**
     * <p>The name of the MC subscription table.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
    @NameInMap("McTableName")
    public String mcTableName;

    /**
     * <p>The ID of the level-1 site. If this parameter is left empty, the ID of the site to which the current user belongs is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>Specifies whether to skip sending emails when no bills are generated for email subscriptions.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NotSendOnNoData")
    public String notSendOnNoData;

    /**
     * <p>The name of the OSS bucket that stores the files.</p>
     * 
     * <strong>example:</strong>
     * <p>sh-bill</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The UID of the OSS owner that stores the files. Specify this parameter if the subscription is made by a bidder or reseller and the files need to be pushed to the OSS bucket of a RAM user. The RAM user must be a subordinate account of the calling account and must be granted the AliyunConsumeDump2OSSRole permission. Regular users do not need to specify this parameter. The default value is the calling account.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567812345678</p>
     */
    @NameInMap("OssBucketOwnerAccountId")
    public Long ossBucketOwnerAccountId;

    /**
     * <p>The storage path in the OSS bucket.</p>
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
     * <li>consumeDetailBillV2: consumption details. Supported only for OSS and MC subscriptions.</li>
     * <li>splitDetailBillV2: split details. Supported only for OSS and MC subscriptions.</li>
     * <li>costDetailBillV2: cost details. Supported only for OSS and MC subscriptions.</li>
     * <li>monthBillOverview: monthly bill overview. Supported only for OSS and MSC_EMAIL subscriptions.</li>
     * <li>focus: focus bills. Supported only for OSS and MC subscriptions.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consumeDetailBillV2</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The fields to which the user subscribes.</p>
     */
    @NameInMap("SelectedFields")
    public java.util.List<String> selectedFields;

    /**
     * <p>Specifies whether to include bill attachments in emails for email subscriptions.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SendWithAttach")
    public String sendWithAttach;

    /**
     * <p>Specifies whether to split attachments by user ID for email subscriptions.</p>
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

    public CreateReportDefinitionRequest setSelectedFields(java.util.List<String> selectedFields) {
        this.selectedFields = selectedFields;
        return this;
    }
    public java.util.List<String> getSelectedFields() {
        return this.selectedFields;
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
