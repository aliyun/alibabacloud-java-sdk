// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateInformationKeyActionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 返回信息
    @NameInMap("ActionMessage")
    public String actionMessage;

    public static UpdateInformationKeyActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInformationKeyActionResponseBody self = new UpdateInformationKeyActionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInformationKeyActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInformationKeyActionResponseBody setActionMessage(String actionMessage) {
        this.actionMessage = actionMessage;
        return this;
    }
    public String getActionMessage() {
        return this.actionMessage;
    }

}
