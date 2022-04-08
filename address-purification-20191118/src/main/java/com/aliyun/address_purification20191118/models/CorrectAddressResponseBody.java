// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class CorrectAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CorrectAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CorrectAddressResponseBody self = new CorrectAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CorrectAddressResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CorrectAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
