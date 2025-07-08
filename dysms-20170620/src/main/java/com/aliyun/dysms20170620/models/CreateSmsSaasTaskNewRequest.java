// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSaasTaskNewRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("DataAbilityTaskId")
    public String dataAbilityTaskId;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("OrderTime")
    public String orderTime;

    @NameInMap("OssFileName")
    public String ossFileName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneList")
    public String phoneList;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SmsContent")
    public String smsContent;

    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("ValidCount")
    public String validCount;

    public static CreateSmsSaasTaskNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSaasTaskNewRequest self = new CreateSmsSaasTaskNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSaasTaskNewRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateSmsSaasTaskNewRequest setDataAbilityTaskId(String dataAbilityTaskId) {
        this.dataAbilityTaskId = dataAbilityTaskId;
        return this;
    }
    public String getDataAbilityTaskId() {
        return this.dataAbilityTaskId;
    }

    public CreateSmsSaasTaskNewRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateSmsSaasTaskNewRequest setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public CreateSmsSaasTaskNewRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public CreateSmsSaasTaskNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSaasTaskNewRequest setPhoneList(String phoneList) {
        this.phoneList = phoneList;
        return this;
    }
    public String getPhoneList() {
        return this.phoneList;
    }

    public CreateSmsSaasTaskNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsSaasTaskNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSaasTaskNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsSaasTaskNewRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateSmsSaasTaskNewRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateSmsSaasTaskNewRequest setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public CreateSmsSaasTaskNewRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public CreateSmsSaasTaskNewRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateSmsSaasTaskNewRequest setValidCount(String validCount) {
        this.validCount = validCount;
        return this;
    }
    public String getValidCount() {
        return this.validCount;
    }

}
