// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListConnectedClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("networkType")
        public String networkType;

        @NameInMap("instances")
        public String instances;

        public static ListConnectedClustersResponseBodyResultResult build(java.util.Map<String, ?> map) throws Exception {
            ListConnectedClustersResponseBodyResultResult self = new ListConnectedClustersResponseBodyResultResult();
            return TeaModel.build(map, self);
        }

        public ListConnectedClustersResponseBodyResultResult setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListConnectedClustersResponseBodyResultResult setInstances(String instances) {
            this.instances = instances;
            return this;
        }
        public String getInstances() {
            return this.instances;
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
