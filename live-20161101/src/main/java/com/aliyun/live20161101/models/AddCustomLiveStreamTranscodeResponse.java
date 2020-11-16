// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCustomLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddCustomLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLiveStreamTranscodeResponse self = new AddCustomLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomLiveStreamTranscodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
