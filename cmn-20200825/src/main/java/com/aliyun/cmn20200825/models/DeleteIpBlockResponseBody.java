// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteIpBlockResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpBlockResponseBody self = new DeleteIpBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
