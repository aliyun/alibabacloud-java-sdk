// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CallBackThirdRightSendPlanRequest extends TeaModel {
    @NameInMap("BizGroup")
    public String bizGroup;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CardType")
    public Integer cardType;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ExtendInfo")
    public java.util.Map<String, ?> extendInfo;

    @NameInMap("GenieOpenId")
    public String genieOpenId;

    @NameInMap("ReceiveStatus")
    public Integer receiveStatus;

    @NameInMap("Sn")
    public String sn;

    @NameInMap("SupplierId")
    public Long supplierId;

    public static CallBackThirdRightSendPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CallBackThirdRightSendPlanRequest self = new CallBackThirdRightSendPlanRequest();
        return TeaModel.build(map, self);
    }

    public CallBackThirdRightSendPlanRequest setBizGroup(String bizGroup) {
        this.bizGroup = bizGroup;
        return this;
    }
    public String getBizGroup() {
        return this.bizGroup;
    }

    public CallBackThirdRightSendPlanRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CallBackThirdRightSendPlanRequest setCardType(Integer cardType) {
        this.cardType = cardType;
        return this;
    }
    public Integer getCardType() {
        return this.cardType;
    }

    public CallBackThirdRightSendPlanRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CallBackThirdRightSendPlanRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtendInfo() {
        return this.extendInfo;
    }

    public CallBackThirdRightSendPlanRequest setGenieOpenId(String genieOpenId) {
        this.genieOpenId = genieOpenId;
        return this;
    }
    public String getGenieOpenId() {
        return this.genieOpenId;
    }

    public CallBackThirdRightSendPlanRequest setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
        return this;
    }
    public Integer getReceiveStatus() {
        return this.receiveStatus;
    }

    public CallBackThirdRightSendPlanRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CallBackThirdRightSendPlanRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

}
