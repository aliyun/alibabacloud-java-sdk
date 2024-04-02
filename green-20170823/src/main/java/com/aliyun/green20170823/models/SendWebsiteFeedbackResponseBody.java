// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class SendWebsiteFeedbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendWebsiteFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendWebsiteFeedbackResponseBody self = new SendWebsiteFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public SendWebsiteFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
