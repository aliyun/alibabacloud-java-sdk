// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreatetVerifySmsExportTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-01-08</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>186***9399</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("SchemeName")
    public String schemeName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SendStatus")
    public Long sendStatus;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <strong>example:</strong>
     * <p>2025-01-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>SMS_483325498</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static CreatetVerifySmsExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatetVerifySmsExportTaskRequest self = new CreatetVerifySmsExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreatetVerifySmsExportTaskRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreatetVerifySmsExportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatetVerifySmsExportTaskRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreatetVerifySmsExportTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatetVerifySmsExportTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatetVerifySmsExportTaskRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public CreatetVerifySmsExportTaskRequest setSendStatus(Long sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public Long getSendStatus() {
        return this.sendStatus;
    }

    public CreatetVerifySmsExportTaskRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreatetVerifySmsExportTaskRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreatetVerifySmsExportTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreatetVerifySmsExportTaskRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
