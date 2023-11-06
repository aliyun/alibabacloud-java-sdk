// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SwitchGlobalBroadcastTypeResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the mode of broadcast tables was switched from the multi-write mode to the asynchronous link mode.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SwitchGlobalBroadcastTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchGlobalBroadcastTypeResponseBody self = new SwitchGlobalBroadcastTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchGlobalBroadcastTypeResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SwitchGlobalBroadcastTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwitchGlobalBroadcastTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
