// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedRestartTimeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public EstimatedRestartTimeResponseBodyResult result;

    public static EstimatedRestartTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EstimatedRestartTimeResponseBody self = new EstimatedRestartTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public EstimatedRestartTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EstimatedRestartTimeResponseBody setResult(EstimatedRestartTimeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EstimatedRestartTimeResponseBodyResult getResult() {
        return this.result;
    }

    public static class EstimatedRestartTimeResponseBodyResult extends TeaModel {
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

        public static EstimatedRestartTimeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EstimatedRestartTimeResponseBodyResult self = new EstimatedRestartTimeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EstimatedRestartTimeResponseBodyResult setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public EstimatedRestartTimeResponseBodyResult setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
