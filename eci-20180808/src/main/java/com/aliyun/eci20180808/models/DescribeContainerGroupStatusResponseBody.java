// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupStatusResponseBody extends TeaModel {
    /**
     * <p>The collection of status of the elastic container instances.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeContainerGroupStatusResponseBodyData> data;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeContainerGroupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupStatusResponseBody self = new DescribeContainerGroupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupStatusResponseBody setData(java.util.List<DescribeContainerGroupStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeContainerGroupStatusResponseBodyData> getData() {
        return this.data;
    }

    public DescribeContainerGroupStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeContainerGroupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerGroupStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusConditions extends TeaModel {
        /**
         * <p>The message about the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The cause of the event.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The time when the status last changed.</p>
         */
        @NameInMap("lastTransitionTime")
        public String lastTransitionTime;

        /**
         * <p>The state of the pod condition.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the pod condition. Valid values:</p>
         * <br>
         * <p>*   PodScheduled</p>
         * <p>*   Ready</p>
         * <p>*   Initialized</p>
         * <p>*   Unschedulable</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusConditions self = new DescribeContainerGroupStatusResponseBodyDataPodStatusConditions();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusConditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusConditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusConditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateRunning extends TeaModel {
        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartedAtstartedAt")
        public String startedAtstartedAt;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateRunning build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateRunning self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateRunning();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateRunning setStartedAtstartedAt(String startedAtstartedAt) {
            this.startedAtstartedAt = startedAtstartedAt;
            return this;
        }
        public String getStartedAtstartedAt() {
            return this.startedAtstartedAt;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated extends TeaModel {
        /**
         * <p>The container ID.</p>
         */
        @NameInMap("ContainerID")
        public String containerID;

        /**
         * <p>The exit code.</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The end time.</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The message about the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The cause of the event.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The signal code.</p>
         */
        @NameInMap("Signal")
        public Integer signal;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartedAt")
        public String startedAt;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated setContainerID(String containerID) {
            this.containerID = containerID;
            return this;
        }
        public String getContainerID() {
            return this.containerID;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting extends TeaModel {
        /**
         * <p>The message about the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The cause of the event.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState extends TeaModel {
        /**
         * <p>The container is created and running.</p>
         */
        @NameInMap("Running")
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateRunning running;

        /**
         * <p>The container is terminated and exits after a successful or failed run.</p>
         */
        @NameInMap("Terminated")
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated terminated;

        /**
         * <p>The container is waiting for being created.</p>
         */
        @NameInMap("Waiting")
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting waiting;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState setRunning(DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateRunning running) {
            this.running = running;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateRunning getRunning() {
            return this.running;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState setTerminated(DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated terminated) {
            this.terminated = terminated;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateTerminated getTerminated() {
            return this.terminated;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState setWaiting(DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting waiting) {
            this.waiting = waiting;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastStateWaiting getWaiting() {
            return this.waiting;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateRunning extends TeaModel {
        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartedAtstartedAt")
        public String startedAtstartedAt;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateRunning build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateRunning self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateRunning();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateRunning setStartedAtstartedAt(String startedAtstartedAt) {
            this.startedAtstartedAt = startedAtstartedAt;
            return this;
        }
        public String getStartedAtstartedAt() {
            return this.startedAtstartedAt;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated extends TeaModel {
        /**
         * <p>The container ID.</p>
         */
        @NameInMap("ContainerID")
        public String containerID;

        /**
         * <p>The exit code.</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The end time.</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The message about the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The cause of the event.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The signal code.</p>
         */
        @NameInMap("Signal")
        public Integer signal;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartedAt")
        public String startedAt;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated setContainerID(String containerID) {
            this.containerID = containerID;
            return this;
        }
        public String getContainerID() {
            return this.containerID;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting extends TeaModel {
        /**
         * <p>The message about the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The cause of the event.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState extends TeaModel {
        /**
         * <p>The container is created and running.</p>
         */
        @NameInMap("Running")
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateRunning running;

        /**
         * <p>The container is terminated and exits after a successful or failed run.</p>
         */
        @NameInMap("Terminated")
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated terminated;

        /**
         * <p>The container is waiting for being created.</p>
         */
        @NameInMap("Waiting")
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting waiting;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState setRunning(DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateRunning running) {
            this.running = running;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateRunning getRunning() {
            return this.running;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState setTerminated(DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated terminated) {
            this.terminated = terminated;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateTerminated getTerminated() {
            return this.terminated;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState setWaiting(DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting waiting) {
            this.waiting = waiting;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesStateWaiting getWaiting() {
            return this.waiting;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses extends TeaModel {
        /**
         * <p>The image of the container.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image ID.</p>
         */
        @NameInMap("ImageID")
        public String imageID;

        /**
         * <p>The most recent state of the container.</p>
         */
        @NameInMap("LastState")
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState lastState;

        /**
         * <p>The container name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the container is ready for use.</p>
         */
        @NameInMap("Ready")
        public Boolean ready;

        /**
         * <p>The number of restarts.</p>
         */
        @NameInMap("RestartCount")
        public Integer restartCount;

        /**
         * <p>Indicates whether the container is started.</p>
         */
        @NameInMap("Started")
        public Boolean started;

        /**
         * <p>The state of the container. Valid values:</p>
         * <br>
         * <p>*   Waiting</p>
         * <p>*   Running</p>
         * <p>*   Terminated</p>
         */
        @NameInMap("State")
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState state;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses self = new DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses setImageID(String imageID) {
            this.imageID = imageID;
            return this;
        }
        public String getImageID() {
            return this.imageID;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses setLastState(DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState lastState) {
            this.lastState = lastState;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState getLastState() {
            return this.lastState;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses setStarted(Boolean started) {
            this.started = started;
            return this;
        }
        public Boolean getStarted() {
            return this.started;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses setState(DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState state) {
            this.state = state;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesState getState() {
            return this.state;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps extends TeaModel {
        /**
         * <p>The IP address of the pod.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps self = new DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyDataPodStatus extends TeaModel {
        /**
         * <p>The information about the pod conditions.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusConditions> conditions;

        /**
         * <p>The state information about the container.</p>
         */
        @NameInMap("ContainerStatuses")
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses> containerStatuses;

        /**
         * <p>The IP address of the host.</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>The lifecycle phase of the pod.</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The IP address of the pod.</p>
         */
        @NameInMap("PodIp")
        public String podIp;

        /**
         * <p>The collection of pod IP addresses.</p>
         */
        @NameInMap("PodIps")
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps> podIps;

        /**
         * <p>The quality of service (QoS) of the pod.</p>
         */
        @NameInMap("QosClass")
        public String qosClass;

        /**
         * <p>The time when the container started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeContainerGroupStatusResponseBodyDataPodStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyDataPodStatus self = new DescribeContainerGroupStatusResponseBodyDataPodStatus();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatus setConditions(java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusConditions> getConditions() {
            return this.conditions;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatus setContainerStatuses(java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses> containerStatuses) {
            this.containerStatuses = containerStatuses;
            return this;
        }
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses> getContainerStatuses() {
            return this.containerStatuses;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatus setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatus setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatus setPodIps(java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps> podIps) {
            this.podIps = podIps;
            return this;
        }
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps> getPodIps() {
            return this.podIps;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatus setQosClass(String qosClass) {
            this.qosClass = qosClass;
            return this;
        }
        public String getQosClass() {
            return this.qosClass;
        }

        public DescribeContainerGroupStatusResponseBodyDataPodStatus setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeContainerGroupStatusResponseBodyData extends TeaModel {
        /**
         * <p>The annotations of the elastic container instance.</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The ID of the elastic container instance.</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The name of the elastic container instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace where the elastic container instance resides.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The state information about the elastic container instance.</p>
         */
        @NameInMap("PodStatus")
        public DescribeContainerGroupStatusResponseBodyDataPodStatus podStatus;

        /**
         * <p>The state of the elastic container instance.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UUID of the elastic container instance. The UUID of an elastic container instance is similar to the UID of a Kubernetes pod in concept and usage.</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static DescribeContainerGroupStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupStatusResponseBodyData self = new DescribeContainerGroupStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupStatusResponseBodyData setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public DescribeContainerGroupStatusResponseBodyData setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeContainerGroupStatusResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupStatusResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeContainerGroupStatusResponseBodyData setPodStatus(DescribeContainerGroupStatusResponseBodyDataPodStatus podStatus) {
            this.podStatus = podStatus;
            return this;
        }
        public DescribeContainerGroupStatusResponseBodyDataPodStatus getPodStatus() {
            return this.podStatus;
        }

        public DescribeContainerGroupStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeContainerGroupStatusResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
