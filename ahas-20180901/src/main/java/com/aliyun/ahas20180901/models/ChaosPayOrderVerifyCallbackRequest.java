// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayOrderVerifyCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static ChaosPayOrderVerifyCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayOrderVerifyCallbackRequest self = new ChaosPayOrderVerifyCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ChaosPayOrderVerifyCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
