// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmIssueOrderRequest extends TeaModel {
    @NameInMap("ExtOrderId")
    public String extOrderId;

    @NameInMap("ExtUserId")
    public String extUserId;

    @NameInMap("LockSeatApplyKey")
    public String lockSeatApplyKey;

    @NameInMap("ParamsJson")
    public String paramsJson;

    @NameInMap("TotalPrice")
    public Long totalPrice;

    public static TaobaoFilmIssueOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmIssueOrderRequest self = new TaobaoFilmIssueOrderRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmIssueOrderRequest setExtOrderId(String extOrderId) {
        this.extOrderId = extOrderId;
        return this;
    }
    public String getExtOrderId() {
        return this.extOrderId;
    }

    public TaobaoFilmIssueOrderRequest setExtUserId(String extUserId) {
        this.extUserId = extUserId;
        return this;
    }
    public String getExtUserId() {
        return this.extUserId;
    }

    public TaobaoFilmIssueOrderRequest setLockSeatApplyKey(String lockSeatApplyKey) {
        this.lockSeatApplyKey = lockSeatApplyKey;
        return this;
    }
    public String getLockSeatApplyKey() {
        return this.lockSeatApplyKey;
    }

    public TaobaoFilmIssueOrderRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

    public TaobaoFilmIssueOrderRequest setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public Long getTotalPrice() {
        return this.totalPrice;
    }

}
