// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class GetMonthAmountResponseBody extends TeaModel {
    @NameInMap("BackgroundAmount")
    public Integer backgroundAmount;

    @NameInMap("PostpayAmount")
    public Integer postpayAmount;

    @NameInMap("PrepayAmount")
    public Integer prepayAmount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalAmount")
    public Integer totalAmount;

    public static GetMonthAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonthAmountResponseBody self = new GetMonthAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonthAmountResponseBody setBackgroundAmount(Integer backgroundAmount) {
        this.backgroundAmount = backgroundAmount;
        return this;
    }
    public Integer getBackgroundAmount() {
        return this.backgroundAmount;
    }

    public GetMonthAmountResponseBody setPostpayAmount(Integer postpayAmount) {
        this.postpayAmount = postpayAmount;
        return this;
    }
    public Integer getPostpayAmount() {
        return this.postpayAmount;
    }

    public GetMonthAmountResponseBody setPrepayAmount(Integer prepayAmount) {
        this.prepayAmount = prepayAmount;
        return this;
    }
    public Integer getPrepayAmount() {
        return this.prepayAmount;
    }

    public GetMonthAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonthAmountResponseBody setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Integer getTotalAmount() {
        return this.totalAmount;
    }

}
