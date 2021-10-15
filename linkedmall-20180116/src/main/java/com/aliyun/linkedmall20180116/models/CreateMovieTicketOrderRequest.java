// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateMovieTicketOrderRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("BizUid")
    @Validation(required = true)
    public String bizUid;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("LockSeatAppKey")
    @Validation(required = true)
    public String lockSeatAppKey;

    @NameInMap("OutTradeId")
    public String outTradeId;

    public static CreateMovieTicketOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMovieTicketOrderRequest self = new CreateMovieTicketOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateMovieTicketOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateMovieTicketOrderRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateMovieTicketOrderRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public CreateMovieTicketOrderRequest setLockSeatAppKey(String lockSeatAppKey) {
        this.lockSeatAppKey = lockSeatAppKey;
        return this;
    }
    public String getLockSeatAppKey() {
        return this.lockSeatAppKey;
    }

    public CreateMovieTicketOrderRequest setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
        return this;
    }
    public String getOutTradeId() {
        return this.outTradeId;
    }

}
