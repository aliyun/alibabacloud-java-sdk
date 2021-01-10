// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteUpstreamAppServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUpstreamAppServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUpstreamAppServerResponseBody self = new DeleteUpstreamAppServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUpstreamAppServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
