// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RestartTranscodeTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RestartTranscodeTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartTranscodeTaskResponseBody self = new RestartTranscodeTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartTranscodeTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
