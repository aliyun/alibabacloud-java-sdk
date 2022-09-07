// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCommissionRefundRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static BillingCommissionRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        BillingCommissionRefundRequest self = new BillingCommissionRefundRequest();
        return TeaModel.build(map, self);
    }

    public BillingCommissionRefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
