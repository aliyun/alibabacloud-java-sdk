// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterStateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("result")
    public GetClusterStateResponseBodyResult result;

    public static GetClusterStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterStateResponseBody self = new GetClusterStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterStateResponseBody setResult(GetClusterStateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetClusterStateResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetClusterStateResponseBodyResult extends TeaModel {
        @NameInMap("agentState")
        public Boolean agentState;

        @NameInMap("clusterState")
        public String clusterState;

        @NameInMap("isFlink")
        public Boolean isFlink;

        public static GetClusterStateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetClusterStateResponseBodyResult self = new GetClusterStateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetClusterStateResponseBodyResult setAgentState(Boolean agentState) {
            this.agentState = agentState;
            return this;
        }
        public Boolean getAgentState() {
            return this.agentState;
        }

        public GetClusterStateResponseBodyResult setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public GetClusterStateResponseBodyResult setIsFlink(Boolean isFlink) {
            this.isFlink = isFlink;
            return this;
        }
        public Boolean getIsFlink() {
            return this.isFlink;
        }

    }

}
