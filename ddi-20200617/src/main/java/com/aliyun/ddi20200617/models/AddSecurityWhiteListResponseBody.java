// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class AddSecurityWhiteListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AddSecurityWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSecurityWhiteListResponseBody self = new AddSecurityWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSecurityWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
