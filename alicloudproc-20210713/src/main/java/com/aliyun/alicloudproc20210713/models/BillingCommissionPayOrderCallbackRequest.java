// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCommissionPayOrderCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static BillingCommissionPayOrderCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        BillingCommissionPayOrderCallbackRequest self = new BillingCommissionPayOrderCallbackRequest();
        return TeaModel.build(map, self);
    }

    public BillingCommissionPayOrderCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
