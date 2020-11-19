// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SwitchGlobalBroadcastTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    public static SwitchGlobalBroadcastTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchGlobalBroadcastTypeResponse self = new SwitchGlobalBroadcastTypeResponse();
        return TeaModel.build(map, self);
    }

    public SwitchGlobalBroadcastTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchGlobalBroadcastTypeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SwitchGlobalBroadcastTypeResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
