// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CallBackThirdRightSendPlanShrinkRequest extends TeaModel {
    @NameInMap("BizGroup")
    public String bizGroup;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CardType")
    public Integer cardType;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ExtendInfo")
    public String extendInfoShrink;

    @NameInMap("GenieOpenId")
    public String genieOpenId;

    @NameInMap("ReceiveStatus")
    public Integer receiveStatus;

    @NameInMap("Sn")
    public String sn;

    @NameInMap("SupplierId")
    public Long supplierId;

    public static CallBackThirdRightSendPlanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CallBackThirdRightSendPlanShrinkRequest self = new CallBackThirdRightSendPlanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CallBackThirdRightSendPlanShrinkRequest setBizGroup(String bizGroup) {
        this.bizGroup = bizGroup;
        return this;
    }
    public String getBizGroup() {
        return this.bizGroup;
    }

    public CallBackThirdRightSendPlanShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CallBackThirdRightSendPlanShrinkRequest setCardType(Integer cardType) {
        this.cardType = cardType;
        return this;
    }
    public Integer getCardType() {
        return this.cardType;
    }

    public CallBackThirdRightSendPlanShrinkRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CallBackThirdRightSendPlanShrinkRequest setExtendInfoShrink(String extendInfoShrink) {
        this.extendInfoShrink = extendInfoShrink;
        return this;
    }
    public String getExtendInfoShrink() {
        return this.extendInfoShrink;
    }

    public CallBackThirdRightSendPlanShrinkRequest setGenieOpenId(String genieOpenId) {
        this.genieOpenId = genieOpenId;
        return this;
    }
    public String getGenieOpenId() {
        return this.genieOpenId;
    }

    public CallBackThirdRightSendPlanShrinkRequest setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
        return this;
    }
    public Integer getReceiveStatus() {
        return this.receiveStatus;
    }

    public CallBackThirdRightSendPlanShrinkRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CallBackThirdRightSendPlanShrinkRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

}
