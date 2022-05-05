// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetClusterInfoResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInfoResponseBody self = new GetClusterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterInfoResponseBody setData(GetClusterInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClusterInfoResponseBodyData getData() {
        return this.data;
    }

    public GetClusterInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterInfoResponseBodyData extends TeaModel {
        @NameInMap("AckNotRunning")
        public Boolean ackNotRunning;

        @NameInMap("AgentHelmNotExist")
        public Boolean agentHelmNotExist;

        @NameInMap("AgentServiceNotExist")
        public Boolean agentServiceNotExist;

        @NameInMap("ArmsDBNotExist")
        public Boolean armsDBNotExist;

        @NameInMap("CheckType")
        public String checkType;

        @NameInMap("GetClusterInfo")
        public String getClusterInfo;

        @NameInMap("HaveAgentNodeIsNotReady")
        public Boolean haveAgentNodeIsNotReady;

        @NameInMap("IsFlink")
        public Boolean isFlink;

        @NameInMap("NeedIntervention")
        public Boolean needIntervention;

        @NameInMap("NeedRetry")
        public Boolean needRetry;

        @NameInMap("NodeSizeIsZero")
        public Boolean nodeSizeIsZero;

        @NameInMap("PodIsNotRestart")
        public Boolean podIsNotRestart;

        public static GetClusterInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClusterInfoResponseBodyData self = new GetClusterInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClusterInfoResponseBodyData setAckNotRunning(Boolean ackNotRunning) {
            this.ackNotRunning = ackNotRunning;
            return this;
        }
        public Boolean getAckNotRunning() {
            return this.ackNotRunning;
        }

        public GetClusterInfoResponseBodyData setAgentHelmNotExist(Boolean agentHelmNotExist) {
            this.agentHelmNotExist = agentHelmNotExist;
            return this;
        }
        public Boolean getAgentHelmNotExist() {
            return this.agentHelmNotExist;
        }

        public GetClusterInfoResponseBodyData setAgentServiceNotExist(Boolean agentServiceNotExist) {
            this.agentServiceNotExist = agentServiceNotExist;
            return this;
        }
        public Boolean getAgentServiceNotExist() {
            return this.agentServiceNotExist;
        }

        public GetClusterInfoResponseBodyData setArmsDBNotExist(Boolean armsDBNotExist) {
            this.armsDBNotExist = armsDBNotExist;
            return this;
        }
        public Boolean getArmsDBNotExist() {
            return this.armsDBNotExist;
        }

        public GetClusterInfoResponseBodyData setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public GetClusterInfoResponseBodyData setGetClusterInfo(String getClusterInfo) {
            this.getClusterInfo = getClusterInfo;
            return this;
        }
        public String getGetClusterInfo() {
            return this.getClusterInfo;
        }

        public GetClusterInfoResponseBodyData setHaveAgentNodeIsNotReady(Boolean haveAgentNodeIsNotReady) {
            this.haveAgentNodeIsNotReady = haveAgentNodeIsNotReady;
            return this;
        }
        public Boolean getHaveAgentNodeIsNotReady() {
            return this.haveAgentNodeIsNotReady;
        }

        public GetClusterInfoResponseBodyData setIsFlink(Boolean isFlink) {
            this.isFlink = isFlink;
            return this;
        }
        public Boolean getIsFlink() {
            return this.isFlink;
        }

        public GetClusterInfoResponseBodyData setNeedIntervention(Boolean needIntervention) {
            this.needIntervention = needIntervention;
            return this;
        }
        public Boolean getNeedIntervention() {
            return this.needIntervention;
        }

        public GetClusterInfoResponseBodyData setNeedRetry(Boolean needRetry) {
            this.needRetry = needRetry;
            return this;
        }
        public Boolean getNeedRetry() {
            return this.needRetry;
        }

        public GetClusterInfoResponseBodyData setNodeSizeIsZero(Boolean nodeSizeIsZero) {
            this.nodeSizeIsZero = nodeSizeIsZero;
            return this;
        }
        public Boolean getNodeSizeIsZero() {
            return this.nodeSizeIsZero;
        }

        public GetClusterInfoResponseBodyData setPodIsNotRestart(Boolean podIsNotRestart) {
            this.podIsNotRestart = podIsNotRestart;
            return this;
        }
        public Boolean getPodIsNotRestart() {
            return this.podIsNotRestart;
        }

    }

}
