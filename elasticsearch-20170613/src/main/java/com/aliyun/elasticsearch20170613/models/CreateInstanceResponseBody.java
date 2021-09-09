// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateInstanceResponseBodyResult result;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponseBody setResult(CreateInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateInstanceResponseBodyResult extends TeaModel {
        @NameInMap("instanceId")
        public String instanceId;

        public static CreateInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyResult self = new CreateInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
