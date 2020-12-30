// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupBroadcastTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Success")
    public Boolean success;

    public static SetupBroadcastTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetupBroadcastTablesResponseBody self = new SetupBroadcastTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetupBroadcastTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetupBroadcastTablesResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetupBroadcastTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
