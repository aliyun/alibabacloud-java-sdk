// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCustomLiveStreamTranscodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddCustomLiveStreamTranscodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLiveStreamTranscodeResponseBody self = new AddCustomLiveStreamTranscodeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCustomLiveStreamTranscodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
