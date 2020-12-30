// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class BatchSendMailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EnvId")
    public String envId;

    public static BatchSendMailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMailResponseBody self = new BatchSendMailResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSendMailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchSendMailResponseBody setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

}
