// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class ExtractPhoneResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ExtractPhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExtractPhoneResponseBody self = new ExtractPhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ExtractPhoneResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExtractPhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
