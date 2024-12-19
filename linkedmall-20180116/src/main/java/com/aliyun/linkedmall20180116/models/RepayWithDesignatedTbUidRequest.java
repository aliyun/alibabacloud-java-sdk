// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayWithDesignatedTbUidRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtJson")
    public String extJson;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LmOrderId")
    public Long lmOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static RepayWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayWithDesignatedTbUidRequest self = new RepayWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public RepayWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RepayWithDesignatedTbUidRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public RepayWithDesignatedTbUidRequest setLmOrderId(Long lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public Long getLmOrderId() {
        return this.lmOrderId;
    }

    public RepayWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public RepayWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public RepayWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
