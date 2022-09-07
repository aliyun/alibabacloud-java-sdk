// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class BillingCenterICommandServiceProcessMessageRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static BillingCenterICommandServiceProcessMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        BillingCenterICommandServiceProcessMessageRequest self = new BillingCenterICommandServiceProcessMessageRequest();
        return TeaModel.build(map, self);
    }

    public BillingCenterICommandServiceProcessMessageRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
