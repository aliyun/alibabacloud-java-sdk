// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveTranscodeTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveTranscodeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveTranscodeTemplateResponseBody self = new DeleteLiveTranscodeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveTranscodeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
