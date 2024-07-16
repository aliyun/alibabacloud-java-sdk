// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class BatchSendMailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("EnvId")
    public String envId;

    /**
     * <strong>example:</strong>
     * <p>12D086F6-8F31-4658-84C1-006DED011A85</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSendMailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMailResponseBody self = new BatchSendMailResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSendMailResponseBody setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public BatchSendMailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
