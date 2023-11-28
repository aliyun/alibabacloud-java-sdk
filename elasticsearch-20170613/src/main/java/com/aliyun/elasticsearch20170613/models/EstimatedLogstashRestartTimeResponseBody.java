// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedLogstashRestartTimeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public EstimatedLogstashRestartTimeResponseBodyResult result;

    public static EstimatedLogstashRestartTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EstimatedLogstashRestartTimeResponseBody self = new EstimatedLogstashRestartTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public EstimatedLogstashRestartTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EstimatedLogstashRestartTimeResponseBody setResult(EstimatedLogstashRestartTimeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EstimatedLogstashRestartTimeResponseBodyResult getResult() {
        return this.result;
    }

    public static class EstimatedLogstashRestartTimeResponseBodyResult extends TeaModel {
        /**
         * <p>The unit.</p>
         */
        @NameInMap("unit")
        public String unit;

        /**
         * <p>The estimated restart time.</p>
         */
        @NameInMap("value")
        public Long value;

        public static EstimatedLogstashRestartTimeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EstimatedLogstashRestartTimeResponseBodyResult self = new EstimatedLogstashRestartTimeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EstimatedLogstashRestartTimeResponseBodyResult setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public EstimatedLogstashRestartTimeResponseBodyResult setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
