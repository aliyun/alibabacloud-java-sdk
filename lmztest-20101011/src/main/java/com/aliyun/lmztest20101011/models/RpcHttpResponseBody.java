// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class RpcHttpResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RpcHttpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RpcHttpResponseBody self = new RpcHttpResponseBody();
        return TeaModel.build(map, self);
    }

    public RpcHttpResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RpcHttpResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RpcHttpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
