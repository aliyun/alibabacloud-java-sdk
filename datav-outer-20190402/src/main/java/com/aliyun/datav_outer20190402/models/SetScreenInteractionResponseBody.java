// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class SetScreenInteractionResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static SetScreenInteractionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetScreenInteractionResponseBody self = new SetScreenInteractionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetScreenInteractionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetScreenInteractionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
