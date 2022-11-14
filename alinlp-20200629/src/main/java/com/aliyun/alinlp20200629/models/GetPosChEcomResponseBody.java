// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetPosChEcomResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPosChEcomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPosChEcomResponseBody self = new GetPosChEcomResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPosChEcomResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetPosChEcomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
