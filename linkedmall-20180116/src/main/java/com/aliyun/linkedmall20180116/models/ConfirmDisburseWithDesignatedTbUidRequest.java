// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ConfirmDisburseWithDesignatedTbUidRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL2022...03</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7068...44</p>
     */
    @NameInMap("LmOrderId")
    public Long lmOrderId;

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
     * <p>2131**111</p>
     */
    @NameInMap("TbUserId")
    public Long tbUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user***002</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static ConfirmDisburseWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmDisburseWithDesignatedTbUidRequest self = new ConfirmDisburseWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmDisburseWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ConfirmDisburseWithDesignatedTbUidRequest setLmOrderId(Long lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public Long getLmOrderId() {
        return this.lmOrderId;
    }

    public ConfirmDisburseWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public ConfirmDisburseWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public ConfirmDisburseWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
