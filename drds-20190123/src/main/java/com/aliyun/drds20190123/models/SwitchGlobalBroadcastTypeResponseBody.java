// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SwitchGlobalBroadcastTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Success")
    public Boolean success;

    public static SwitchGlobalBroadcastTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchGlobalBroadcastTypeResponseBody self = new SwitchGlobalBroadcastTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchGlobalBroadcastTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchGlobalBroadcastTypeResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SwitchGlobalBroadcastTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
