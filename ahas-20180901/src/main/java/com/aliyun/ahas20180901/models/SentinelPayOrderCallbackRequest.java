// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelPayOrderCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static SentinelPayOrderCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelPayOrderCallbackRequest self = new SentinelPayOrderCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SentinelPayOrderCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
