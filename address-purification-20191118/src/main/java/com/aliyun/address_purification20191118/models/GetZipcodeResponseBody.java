// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class GetZipcodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetZipcodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetZipcodeResponseBody self = new GetZipcodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetZipcodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetZipcodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
