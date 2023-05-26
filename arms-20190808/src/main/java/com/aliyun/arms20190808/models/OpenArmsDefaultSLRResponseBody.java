// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenArmsDefaultSLRResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenArmsDefaultSLRResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsDefaultSLRResponseBody self = new OpenArmsDefaultSLRResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenArmsDefaultSLRResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public OpenArmsDefaultSLRResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
