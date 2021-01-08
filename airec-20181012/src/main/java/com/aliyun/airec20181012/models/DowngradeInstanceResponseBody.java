// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DowngradeInstanceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DowngradeInstanceResponseBodyResult result;

    public static DowngradeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DowngradeInstanceResponseBody self = new DowngradeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DowngradeInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DowngradeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DowngradeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DowngradeInstanceResponseBody setResult(DowngradeInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DowngradeInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class DowngradeInstanceResponseBodyResult extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static DowngradeInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DowngradeInstanceResponseBodyResult self = new DowngradeInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DowngradeInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
