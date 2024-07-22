// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListConnectedClustersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
    @NameInMap("Result")
    public ListConnectedClustersResponseBodyResult result;

    public static ListConnectedClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectedClustersResponseBody self = new ListConnectedClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectedClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectedClustersResponseBody setResult(ListConnectedClustersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListConnectedClustersResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListConnectedClustersResponseBodyResultResult extends TeaModel {
        /**
         * <p>The ID of the remote instance that is connected to the network of the current instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-09k1rocex0006****</p>
         */
        @NameInMap("instances")
        public String instances;

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("networkType")
        public String networkType;

        public static ListConnectedClustersResponseBodyResultResult build(java.util.Map<String, ?> map) throws Exception {
            ListConnectedClustersResponseBodyResultResult self = new ListConnectedClustersResponseBodyResultResult();
            return TeaModel.build(map, self);
        }

        public ListConnectedClustersResponseBodyResultResult setInstances(String instances) {
            this.instances = instances;
            return this;
        }
        public String getInstances() {
            return this.instances;
        }

        public ListConnectedClustersResponseBodyResultResult setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

    }

    public static class ListConnectedClustersResponseBodyResult extends TeaModel {
        @NameInMap("Result")
        public java.util.List<ListConnectedClustersResponseBodyResultResult> result;

        public static ListConnectedClustersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListConnectedClustersResponseBodyResult self = new ListConnectedClustersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListConnectedClustersResponseBodyResult setResult(java.util.List<ListConnectedClustersResponseBodyResultResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListConnectedClustersResponseBodyResultResult> getResult() {
            return this.result;
        }

    }

}
