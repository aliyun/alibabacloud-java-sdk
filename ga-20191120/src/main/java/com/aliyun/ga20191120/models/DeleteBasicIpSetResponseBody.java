// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteBasicIpSetResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBasicIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBasicIpSetResponseBody self = new DeleteBasicIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBasicIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
