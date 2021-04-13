// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class NotifyMessageRepeaterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Success")
    public Boolean success;

    public static NotifyMessageRepeaterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyMessageRepeaterResponseBody self = new NotifyMessageRepeaterResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyMessageRepeaterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyMessageRepeaterResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public NotifyMessageRepeaterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
