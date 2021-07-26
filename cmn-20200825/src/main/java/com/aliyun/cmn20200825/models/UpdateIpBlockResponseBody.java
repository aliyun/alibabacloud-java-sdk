// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpBlockResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpBlockResponseBody self = new UpdateIpBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
