// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupBroadcastTablesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the broadcast table is configured.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetupBroadcastTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetupBroadcastTablesResponseBody self = new SetupBroadcastTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetupBroadcastTablesResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetupBroadcastTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetupBroadcastTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
