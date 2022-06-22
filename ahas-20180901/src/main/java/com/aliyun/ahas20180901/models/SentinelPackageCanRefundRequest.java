// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelPackageCanRefundRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static SentinelPackageCanRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelPackageCanRefundRequest self = new SentinelPackageCanRefundRequest();
        return TeaModel.build(map, self);
    }

    public SentinelPackageCanRefundRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
