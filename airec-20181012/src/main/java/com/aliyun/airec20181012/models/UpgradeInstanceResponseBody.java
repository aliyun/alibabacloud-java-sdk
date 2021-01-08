// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class UpgradeInstanceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public UpgradeInstanceResponseBodyResult result;

    public static UpgradeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceResponseBody self = new UpgradeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeInstanceResponseBody setResult(UpgradeInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpgradeInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpgradeInstanceResponseBodyResult extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static UpgradeInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeInstanceResponseBodyResult self = new UpgradeInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpgradeInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
