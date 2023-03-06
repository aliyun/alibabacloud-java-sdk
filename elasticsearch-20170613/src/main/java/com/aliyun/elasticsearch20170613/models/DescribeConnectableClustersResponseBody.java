// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeConnectableClustersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeConnectableClustersResponseBodyResult> result;

    public static DescribeConnectableClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectableClustersResponseBody self = new DescribeConnectableClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConnectableClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConnectableClustersResponseBody setResult(java.util.List<DescribeConnectableClustersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeConnectableClustersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeConnectableClustersResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the instance that can communicate with each other.</p>
         */
        @NameInMap("instances")
        public String instances;

        /**
         * <p>The network type of the instance.</p>
         */
        @NameInMap("networkType")
        public String networkType;

        public static DescribeConnectableClustersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConnectableClustersResponseBodyResult self = new DescribeConnectableClustersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConnectableClustersResponseBodyResult setInstances(String instances) {
            this.instances = instances;
            return this;
        }
        public String getInstances() {
            return this.instances;
        }

        public DescribeConnectableClustersResponseBodyResult setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

}
