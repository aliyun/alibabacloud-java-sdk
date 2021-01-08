// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public CreateInstanceResponseBodyResult result;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateInstanceResponseBody setResult(CreateInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateInstanceResponseBodyResult extends TeaModel {
        @NameInMap("InstanceId")
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
