// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelPackageRefundRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static SentinelPackageRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelPackageRefundRequest self = new SentinelPackageRefundRequest();
        return TeaModel.build(map, self);
    }

    public SentinelPackageRefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
