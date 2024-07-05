// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectTextAnomalyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>91AC8C98-0F36-49D2-8290-742E24DF*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("Suggestion")
    public String suggestion;

    public static DetectTextAnomalyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectTextAnomalyResponseBody self = new DetectTextAnomalyResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectTextAnomalyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectTextAnomalyResponseBody setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

}
