// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class RealtimeSpeechTranslationResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RealtimeSpeechTranslationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RealtimeSpeechTranslationResponseBody self = new RealtimeSpeechTranslationResponseBody();
        return TeaModel.build(map, self);
    }

    public RealtimeSpeechTranslationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
