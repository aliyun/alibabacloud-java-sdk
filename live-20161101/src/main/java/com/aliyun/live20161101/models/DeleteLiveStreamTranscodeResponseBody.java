// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamTranscodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveStreamTranscodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamTranscodeResponseBody self = new DeleteLiveStreamTranscodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamTranscodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
