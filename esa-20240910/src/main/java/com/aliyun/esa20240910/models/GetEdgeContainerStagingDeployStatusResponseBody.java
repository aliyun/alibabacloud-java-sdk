// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerStagingDeployStatusResponseBody extends TeaModel {
    @NameInMap("ContainersReady")
    public String containersReady;

    @NameInMap("CreationTimestamp")
    public String creationTimestamp;

    @NameInMap("Initialized")
    public String initialized;

    @NameInMap("Phase")
    public String phase;

    @NameInMap("PodRestartState")
    public GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState podRestartState;

    @NameInMap("Ready")
    public String ready;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scheduled")
    public String scheduled;

    @NameInMap("VIPs")
    public java.util.List<String> VIPs;

    public static GetEdgeContainerStagingDeployStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerStagingDeployStatusResponseBody self = new GetEdgeContainerStagingDeployStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setContainersReady(String containersReady) {
        this.containersReady = containersReady;
        return this;
    }
    public String getContainersReady() {
        return this.containersReady;
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setInitialized(String initialized) {
        this.initialized = initialized;
        return this;
    }
    public String getInitialized() {
        return this.initialized;
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setPodRestartState(GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState podRestartState) {
        this.podRestartState = podRestartState;
        return this;
    }
    public GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState getPodRestartState() {
        return this.podRestartState;
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setReady(String ready) {
        this.ready = ready;
        return this;
    }
    public String getReady() {
        return this.ready;
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setScheduled(String scheduled) {
        this.scheduled = scheduled;
        return this;
    }
    public String getScheduled() {
        return this.scheduled;
    }

    public GetEdgeContainerStagingDeployStatusResponseBody setVIPs(java.util.List<String> VIPs) {
        this.VIPs = VIPs;
        return this;
    }
    public java.util.List<String> getVIPs() {
        return this.VIPs;
    }

    public static class GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState extends TeaModel {
        @NameInMap("LastTerminatedReason")
        public String lastTerminatedReason;

        @NameInMap("RestartCount")
        public Integer restartCount;

        public static GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState self = new GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState setLastTerminatedReason(String lastTerminatedReason) {
            this.lastTerminatedReason = lastTerminatedReason;
            return this;
        }
        public String getLastTerminatedReason() {
            return this.lastTerminatedReason;
        }

        public GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

    }

}
