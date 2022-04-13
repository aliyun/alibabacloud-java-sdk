// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendMailResponseBody extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("RequestId")
    public String requestId;

    public static SingleSendMailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleSendMailResponseBody self = new SingleSendMailResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleSendMailResponseBody setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public SingleSendMailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
