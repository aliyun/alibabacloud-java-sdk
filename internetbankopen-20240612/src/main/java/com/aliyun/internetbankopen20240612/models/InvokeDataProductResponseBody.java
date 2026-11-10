// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class InvokeDataProductResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static InvokeDataProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataProductResponseBody self = new InvokeDataProductResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeDataProductResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InvokeDataProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
