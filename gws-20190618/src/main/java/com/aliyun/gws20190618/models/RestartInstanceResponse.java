// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class RestartInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RestartInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartInstanceResponse self = new RestartInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
