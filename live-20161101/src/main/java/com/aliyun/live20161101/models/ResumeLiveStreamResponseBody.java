// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ResumeLiveStreamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeLiveStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeLiveStreamResponseBody self = new ResumeLiveStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeLiveStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
