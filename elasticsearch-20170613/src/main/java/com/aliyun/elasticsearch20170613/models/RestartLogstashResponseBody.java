// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartLogstashResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
