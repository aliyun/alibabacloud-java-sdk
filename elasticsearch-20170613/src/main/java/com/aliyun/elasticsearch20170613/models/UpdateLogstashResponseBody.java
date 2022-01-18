// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public Logstash requestId;

    @NameInMap("Result")
    public Boolean result;

    public static UpdateLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashResponseBody self = new UpdateLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashResponseBody setRequestId(Logstash requestId) {
        this.requestId = requestId;
        return this;
    }
    public Logstash getRequestId() {
        return this.requestId;
    }

    public UpdateLogstashResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
