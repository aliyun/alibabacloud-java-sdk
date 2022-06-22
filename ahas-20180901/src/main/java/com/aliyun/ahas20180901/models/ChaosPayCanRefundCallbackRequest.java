// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayCanRefundCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static ChaosPayCanRefundCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayCanRefundCallbackRequest self = new ChaosPayCanRefundCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ChaosPayCanRefundCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
