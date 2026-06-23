// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerStagingDeployStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the container status is ready. Valid values:</p>
     * <ul>
     * <li><p><strong>ok</strong>: Ready.</p>
     * </li>
     * <li><p><strong>unready</strong>: Not ready.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("ContainersReady")
    public String containersReady;

    /**
     * <p>The creation time (UNIX timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-24T06:46:35Z</p>
     */
    @NameInMap("CreationTimestamp")
    public String creationTimestamp;

    /**
     * <p>The container initialization status. Valid values:</p>
     * <ul>
     * <li><p><strong>ok</strong>: Succeeded.</p>
     * </li>
     * <li><p><strong>unready</strong>: Not completed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Initialized")
    public String initialized;

    /**
     * <p>The status of the container in the staging environment. Valid values:</p>
     * <ul>
     * <li>NoContainer: no container.</li>
     * <li>Pending: pending deployment.</li>
     * <li>ContainerCreating: the container is being created.</li>
     * <li>Running: running.</li>
     * <li>Succeeded: completed.</li>
     * <li>ImagePullBackOff: image pull failed.</li>
     * <li>CrashLoopBackOff: abnormal container startup.</li>
     * <li>Failed: failed.</li>
     * <li>Unknown: unknown.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The container restart status.</p>
     */
    @NameInMap("PodRestartState")
    public GetEdgeContainerStagingDeployStatusResponseBodyPodRestartState podRestartState;

    /**
     * <p>Indicates whether the container is ready to receive traffic. Valid values:</p>
     * <ul>
     * <li><p><strong>ok</strong>: Ready.</p>
     * </li>
     * <li><p><strong>unready</strong>: Not ready.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Ready")
    public String ready;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F2C992B-3FE2-5EBB-A61F-F9DD4EB257DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The container scheduling status. Valid values:</p>
     * <ul>
     * <li><p><strong>ok</strong>: Succeeded.</p>
     * </li>
     * <li><p><strong>unready</strong>: Not completed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Scheduled")
    public String scheduled;

    /**
     * <p>The list of VIPs.</p>
     */
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
        /**
         * <p>The reason for the last restart.</p>
         * 
         * <strong>example:</strong>
         * <p>OOMKilled</p>
         */
        @NameInMap("LastTerminatedReason")
        public String lastTerminatedReason;

        /**
         * <p>The number of restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
