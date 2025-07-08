// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ApplyExportSmsSendRecordNewRequest extends TeaModel {
    @NameInMap("BizType")
    public Long bizType;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNum")
    public String phoneNum;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RealTimeDataFlag")
    public Integer realTimeDataFlag;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SendDate")
    public String sendDate;

    @NameInMap("SendStatus")
    public Long sendStatus;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static ApplyExportSmsSendRecordNewRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyExportSmsSendRecordNewRequest self = new ApplyExportSmsSendRecordNewRequest();
        return TeaModel.build(map, self);
    }

    public ApplyExportSmsSendRecordNewRequest setBizType(Long bizType) {
        this.bizType = bizType;
        return this;
    }
    public Long getBizType() {
        return this.bizType;
    }

    public ApplyExportSmsSendRecordNewRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ApplyExportSmsSendRecordNewRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ApplyExportSmsSendRecordNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ApplyExportSmsSendRecordNewRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public ApplyExportSmsSendRecordNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ApplyExportSmsSendRecordNewRequest setRealTimeDataFlag(Integer realTimeDataFlag) {
        this.realTimeDataFlag = realTimeDataFlag;
        return this;
    }
    public Integer getRealTimeDataFlag() {
        return this.realTimeDataFlag;
    }

    public ApplyExportSmsSendRecordNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ApplyExportSmsSendRecordNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ApplyExportSmsSendRecordNewRequest setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

    public ApplyExportSmsSendRecordNewRequest setSendStatus(Long sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public Long getSendStatus() {
        return this.sendStatus;
    }

    public ApplyExportSmsSendRecordNewRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public ApplyExportSmsSendRecordNewRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ApplyExportSmsSendRecordNewRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
