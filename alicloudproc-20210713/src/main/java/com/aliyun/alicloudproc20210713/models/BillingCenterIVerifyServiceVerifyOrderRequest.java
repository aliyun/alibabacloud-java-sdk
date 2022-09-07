// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCenterIVerifyServiceVerifyOrderRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static BillingCenterIVerifyServiceVerifyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        BillingCenterIVerifyServiceVerifyOrderRequest self = new BillingCenterIVerifyServiceVerifyOrderRequest();
        return TeaModel.build(map, self);
    }

    public BillingCenterIVerifyServiceVerifyOrderRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
