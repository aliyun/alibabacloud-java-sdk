// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectTextAnomalyResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

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
