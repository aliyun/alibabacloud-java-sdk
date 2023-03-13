// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class LiveTranscodingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("URI")
    public String URI;

    public static LiveTranscodingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LiveTranscodingResponseBody self = new LiveTranscodingResponseBody();
        return TeaModel.build(map, self);
    }

    public LiveTranscodingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LiveTranscodingResponseBody setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
