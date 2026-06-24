// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeAckOperatorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6615EE8D-FD9D-4FD3-997E-6FEA5B8D82ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public DescribeAckOperatorResponseBodyResult result;

    public static DescribeAckOperatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAckOperatorResponseBody self = new DescribeAckOperatorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAckOperatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAckOperatorResponseBody setResult(DescribeAckOperatorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAckOperatorResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAckOperatorResponseBodyResult extends TeaModel {
        /**
         * <p>The Operator installation status. Valid values:</p>
         * <ul>
         * <li>deployed: installed</li>
         * <li>not-deploy: not installed</li>
         * <li>failed: installation failed</li>
         * <li>unknown: unknown status.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>deployed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The Operator version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public String version;

        public static DescribeAckOperatorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAckOperatorResponseBodyResult self = new DescribeAckOperatorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAckOperatorResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAckOperatorResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
