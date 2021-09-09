// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateLogstashResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateLogstashResponseBodyResult result;

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

    public CreateLogstashResponseBody setResult(CreateLogstashResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLogstashResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLogstashResponseBodyResult extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        public static CreateLogstashResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLogstashResponseBodyResult self = new CreateLogstashResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLogstashResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
