// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextFeedbackRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static TextFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        TextFeedbackRequest self = new TextFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public TextFeedbackRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
