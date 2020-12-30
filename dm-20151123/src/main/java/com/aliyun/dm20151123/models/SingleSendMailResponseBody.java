// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnvId")
    public String envId;

    public static SingleSendMailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailResponseBody self = new SingleSendMailResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleSendMailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SingleSendMailResponseBody setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
