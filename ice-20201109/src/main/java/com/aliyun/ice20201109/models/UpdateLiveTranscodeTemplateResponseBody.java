// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeTemplateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveTranscodeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTranscodeTemplateResponseBody self = new UpdateLiveTranscodeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTranscodeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
