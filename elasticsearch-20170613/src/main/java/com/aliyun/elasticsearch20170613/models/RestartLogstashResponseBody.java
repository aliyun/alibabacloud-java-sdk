// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartLogstashResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the current instance.</p>
     */
    @NameInMap("Result")
    public Logstash result;

    public static RestartLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartLogstashResponseBody self = new RestartLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartLogstashResponseBody setResult(Logstash result) {
        this.result = result;
        return this;
    }
    public Logstash getResult() {
        return this.result;
    }

}
