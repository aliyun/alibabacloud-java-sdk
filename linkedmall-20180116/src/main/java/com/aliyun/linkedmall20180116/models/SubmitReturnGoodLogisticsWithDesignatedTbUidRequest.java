// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogisticsWithDesignatedTbUidRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20***003</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YTO</p>
     */
    @NameInMap("CpCode")
    public String cpCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19145***4240</p>
     */
    @NameInMap("DisputeId")
    public Long disputeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>YT685***0586</p>
     */
    @NameInMap("LogisticsNo")
    public String logisticsNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>702***47</p>
     */
    @NameInMap("SubLmOrderId")
    public String subLmOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ANONY</p>
     */
    @NameInMap("TbAccountType")
    public String tbAccountType;

    /**
     * <strong>example:</strong>
     * <p>321**123</p>
     */
    @NameInMap("TbUserId")
    public Long tbUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user0***01</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static SubmitReturnGoodLogisticsWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogisticsWithDesignatedTbUidRequest self = new SubmitReturnGoodLogisticsWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest setCpCode(String cpCode) {
        this.cpCode = cpCode;
        return this;
    }
    public String getCpCode() {
        return this.cpCode;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest setDisputeId(Long disputeId) {
        this.disputeId = disputeId;
        return this;
    }
    public Long getDisputeId() {
        return this.disputeId;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
        return this;
    }
    public String getLogisticsNo() {
        return this.logisticsNo;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest setSubLmOrderId(String subLmOrderId) {
        this.subLmOrderId = subLmOrderId;
        return this;
    }
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
