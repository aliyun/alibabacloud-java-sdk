// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamTranscodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveStreamTranscodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamTranscodeResponseBody self = new AddLiveStreamTranscodeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamTranscodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
