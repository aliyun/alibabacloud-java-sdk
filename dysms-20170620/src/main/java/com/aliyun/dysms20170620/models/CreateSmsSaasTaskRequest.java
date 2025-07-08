// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSaasTaskRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ClientIp")
    public String clientIp;

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

    public static CreateSmsSaasTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSaasTaskRequest self = new CreateSmsSaasTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSaasTaskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateSmsSaasTaskRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public CreateSmsSaasTaskRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateSmsSaasTaskRequest setOrderTime(String orderTime) {
        this.orderTime = orderTime;
        return this;
    }
    public String getOrderTime() {
        return this.orderTime;
    }

    public CreateSmsSaasTaskRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public CreateSmsSaasTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsSaasTaskRequest setPhoneList(String phoneList) {
        this.phoneList = phoneList;
        return this;
    }
    public String getPhoneList() {
        return this.phoneList;
    }

    public CreateSmsSaasTaskRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateSmsSaasTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsSaasTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsSaasTaskRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateSmsSaasTaskRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateSmsSaasTaskRequest setSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }
    public String getSmsContent() {
        return this.smsContent;
    }

    public CreateSmsSaasTaskRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public CreateSmsSaasTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateSmsSaasTaskRequest setValidCount(String validCount) {
        this.validCount = validCount;
        return this;
    }
    public String getValidCount() {
        return this.validCount;
    }

}
