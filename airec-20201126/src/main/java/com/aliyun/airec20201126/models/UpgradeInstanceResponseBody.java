// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class UpgradeInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public UpgradeInstanceResponseBodyResult result;

    public static UpgradeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceResponseBody self = new UpgradeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public UpgradeInstanceResponseBody setResult(UpgradeInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpgradeInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpgradeInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        @NameInMap("instanceId")
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
