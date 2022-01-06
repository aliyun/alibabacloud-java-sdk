// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class SubmitResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitResponseBody self = new SubmitResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
