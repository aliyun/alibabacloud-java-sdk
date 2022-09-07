// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCommissionCanRefundRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static BillingCommissionCanRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        BillingCommissionCanRefundRequest self = new BillingCommissionCanRefundRequest();
        return TeaModel.build(map, self);
    }

    public BillingCommissionCanRefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
