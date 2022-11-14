// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChEntertainmentResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetWsCustomizedChEntertainmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChEntertainmentResponseBody self = new GetWsCustomizedChEntertainmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChEntertainmentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetWsCustomizedChEntertainmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
