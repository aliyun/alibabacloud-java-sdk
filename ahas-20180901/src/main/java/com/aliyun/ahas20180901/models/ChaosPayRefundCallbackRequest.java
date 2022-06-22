// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayRefundCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static ChaosPayRefundCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayRefundCallbackRequest self = new ChaosPayRefundCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ChaosPayRefundCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
