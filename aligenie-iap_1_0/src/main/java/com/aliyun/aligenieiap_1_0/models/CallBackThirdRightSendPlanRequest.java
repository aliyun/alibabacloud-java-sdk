// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CallBackThirdRightSendPlanRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cc</p>
     */
    @NameInMap("BizGroup")
    public String bizGroup;

    /**
     * <strong>example:</strong>
     * <p>ailabs</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("CardType")
    public Integer cardType;

    /**
     * <strong>example:</strong>
     * <p>领取异常</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtendInfo")
    public java.util.Map<String, ?> extendInfo;

    /**
     * <strong>example:</strong>
     * <p>1dsds2FzCXFGVA1ADS</p>
     */
    @NameInMap("GenieOpenId")
    public String genieOpenId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReceiveStatus")
    public Integer receiveStatus;

    /**
     * <strong>example:</strong>
     * <p>01000019100307010000600</p>
     */
    @NameInMap("Sn")
    public String sn;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
