// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DowngradeInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Decreases the quotas of a specified instance.</p>
     */
    @NameInMap("result")
    public DowngradeInstanceResponseBodyResult result;

    public static DowngradeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DowngradeInstanceResponseBody self = new DowngradeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DowngradeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public DowngradeInstanceResponseBody setResult(DowngradeInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DowngradeInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class DowngradeInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The new quota must be less than the selected quota.</p>
         * <p>The limits on the number of users: 1,000,000 to 10,000,000. The limits on the number of items: 1,000,000 to 10,000,000. The limits on the queries per second (QPS) of recommendation requests: 10 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-o400whm78004</p>
         */
        @NameInMap("instanceId")
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
