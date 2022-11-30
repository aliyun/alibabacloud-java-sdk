// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SubmitGroupCallRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CallerIdNumber")
    public String callerIdNumber;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("GroupCallType")
    public Long groupCallType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SendType")
    public Long sendType;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TimingStart")
    public String timingStart;

    public static SubmitGroupCallRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitGroupCallRequest self = new SubmitGroupCallRequest();
        return TeaModel.build(map, self);
    }

    public SubmitGroupCallRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SubmitGroupCallRequest setCallerIdNumber(String callerIdNumber) {
        this.callerIdNumber = callerIdNumber;
        return this;
    }
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    public SubmitGroupCallRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public SubmitGroupCallRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SubmitGroupCallRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitGroupCallRequest setGroupCallType(Long groupCallType) {
        this.groupCallType = groupCallType;
        return this;
    }
    public Long getGroupCallType() {
        return this.groupCallType;
    }

    public SubmitGroupCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitGroupCallRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public SubmitGroupCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitGroupCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitGroupCallRequest setSendType(Long sendType) {
        this.sendType = sendType;
        return this;
    }
    public Long getSendType() {
        return this.sendType;
    }

    public SubmitGroupCallRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public SubmitGroupCallRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitGroupCallRequest setTimingStart(String timingStart) {
        this.timingStart = timingStart;
        return this;
    }
    public String getTimingStart() {
        return this.timingStart;
    }

}
