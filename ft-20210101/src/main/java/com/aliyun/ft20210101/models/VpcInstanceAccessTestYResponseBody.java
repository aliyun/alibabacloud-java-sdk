// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class VpcInstanceAccessTestYResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static VpcInstanceAccessTestYResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcInstanceAccessTestYResponseBody self = new VpcInstanceAccessTestYResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcInstanceAccessTestYResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
