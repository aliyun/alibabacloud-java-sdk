// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetNerCustomizedChEcomResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetNerCustomizedChEcomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNerCustomizedChEcomResponseBody self = new GetNerCustomizedChEcomResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNerCustomizedChEcomResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetNerCustomizedChEcomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
