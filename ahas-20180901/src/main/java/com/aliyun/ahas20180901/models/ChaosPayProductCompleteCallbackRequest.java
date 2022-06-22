// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ChaosPayProductCompleteCallbackRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static ChaosPayProductCompleteCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ChaosPayProductCompleteCallbackRequest self = new ChaosPayProductCompleteCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ChaosPayProductCompleteCallbackRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
