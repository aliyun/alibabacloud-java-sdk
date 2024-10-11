// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
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
     * <p>The request ID.</p>
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
    public CreateInstanceResponseBodyResult result;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public CreateInstanceResponseBody setResult(CreateInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-xxxxx</p>
         */
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
