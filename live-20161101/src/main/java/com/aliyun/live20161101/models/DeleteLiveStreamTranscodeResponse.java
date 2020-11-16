// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamTranscodeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveStreamTranscodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamTranscodeResponse self = new DeleteLiveStreamTranscodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamTranscodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
