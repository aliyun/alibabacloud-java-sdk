// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayOrderCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static ChaosPayOrderCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayOrderCallbackRequest self = new ChaosPayOrderCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ChaosPayOrderCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
