// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetOpenNLUResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOpenNLUResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpenNLUResponseBody self = new GetOpenNLUResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpenNLUResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetOpenNLUResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
