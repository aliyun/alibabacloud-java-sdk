// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetWsCustomizedChO2OResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetWsCustomizedChO2OResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWsCustomizedChO2OResponseBody self = new GetWsCustomizedChO2OResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWsCustomizedChO2OResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetWsCustomizedChO2OResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
