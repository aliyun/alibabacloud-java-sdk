// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CommandPublicModelEngineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReturnValue")
    public String returnValue;

    public static CommandPublicModelEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommandPublicModelEngineResponseBody self = new CommandPublicModelEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public CommandPublicModelEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommandPublicModelEngineResponseBody setReturnValue(String returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public String getReturnValue() {
        return this.returnValue;
    }

}
