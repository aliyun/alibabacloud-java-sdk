// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GetTranscodeTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskStatusResponseBody self = new GetTranscodeTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
