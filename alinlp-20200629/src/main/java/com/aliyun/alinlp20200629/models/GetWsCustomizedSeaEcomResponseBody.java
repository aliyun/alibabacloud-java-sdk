// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedSeaEcomResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetWsCustomizedSeaEcomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedSeaEcomResponseBody self = new GetWsCustomizedSeaEcomResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedSeaEcomResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetWsCustomizedSeaEcomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
