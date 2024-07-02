// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductPrice extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("fundAmountMoney")
    public String fundAmountMoney;

    public static ProductPrice build(java.util.Map<String, ?> map) throws Exception {
        ProductPrice self = new ProductPrice();
        return TeaModel.build(map, self);
    }

    public ProductPrice setFundAmountMoney(String fundAmountMoney) {
        this.fundAmountMoney = fundAmountMoney;
        return this;
    }
    public String getFundAmountMoney() {
        return this.fundAmountMoney;
    }

}
