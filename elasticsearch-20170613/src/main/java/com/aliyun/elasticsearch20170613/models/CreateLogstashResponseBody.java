// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateLogstashResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Logstash result;

    public static CreateLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLogstashResponseBody self = new CreateLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLogstashResponseBody setResult(Logstash result) {
        this.result = result;
        return this;
    }
    public Logstash getResult() {
        return this.result;
    }

}
