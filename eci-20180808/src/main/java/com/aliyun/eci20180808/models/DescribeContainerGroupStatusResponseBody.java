// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupStatusResponseBody extends TeaModel {
    /**
     * <p>The collection of the statuses of the container groups.</p>
     */
    @NameInMap("Data")
    public java.util.List<Data> data;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1340C38D-6189-54D1-86F6-7D5ECF3E0088</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeContainerGroupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupStatusResponseBody self = new DescribeContainerGroupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupStatusResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
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

    public static class Conditions extends TeaModel {
        /**
         * <p>The message about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason for the transition into the current status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The time when the status last changed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-12T07:02:47Z</p>
         */
        @NameInMap("lastTransitionTime")
        public String lastTransitionTime;

        /**
         * <p>The status of the condition.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the condition. Valid values:</p>
         * <ul>
         * <li>PodReadyToStartContainers</li>
         * <li>Initialized</li>
         * <li>Ready</li>
         * <li>ContainersReady</li>
         * <li>PodScheduled</li>
         * <li>ContainerHasSufficientDisk</li>
         * <li>ContainerInstanceCreated</li>
         * <li>Unschedulable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("type")
        public String type;

        public static Conditions build(java.util.Map<String, ?> map) throws Exception {
            Conditions self = new Conditions();
            return TeaModel.build(map, self);
        }

        public Conditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Conditions setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public Conditions setLastTransitionTime(String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public String getLastTransitionTime() {
            return this.lastTransitionTime;
        }

        public Conditions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public Conditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class Running extends TeaModel {
        /**
         * <p>The time when the container started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T20:49:31Z</p>
         */
        @NameInMap("StartedAtstartedAt")
        public String startedAtstartedAt;

        public static Running build(java.util.Map<String, ?> map) throws Exception {
            Running self = new Running();
            return TeaModel.build(map, self);
        }

        public Running setStartedAtstartedAt(String startedAtstartedAt) {
            this.startedAtstartedAt = startedAtstartedAt;
            return this;
        }
        public String getStartedAtstartedAt() {
            return this.startedAtstartedAt;
        }

    }

    public static class Terminated extends TeaModel {
        /**
         * <p>The container ID.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd://3ff993933bea366c4719e43a1b067d89bc7f01f1f573981659a44ff17a******</p>
         */
        @NameInMap("ContainerID")
        public String containerID;

        /**
         * <p>The exit code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time when the container ends running.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T20:49:31Z</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The message about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason for the transition into the current status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The signal code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Signal")
        public Integer signal;

        /**
         * <p>The time when the container started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-12T07:02:52Z</p>
         */
        @NameInMap("StartedAt")
        public String startedAt;

        public static Terminated build(java.util.Map<String, ?> map) throws Exception {
            Terminated self = new Terminated();
            return TeaModel.build(map, self);
        }

        public Terminated setContainerID(String containerID) {
            this.containerID = containerID;
            return this;
        }
        public String getContainerID() {
            return this.containerID;
        }

        public Terminated setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public Terminated setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public Terminated setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Terminated setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public Terminated setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public Terminated setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

    }

    public static class Waiting extends TeaModel {
        /**
         * <p>The message about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Back-off</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason for the transition into the current status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static Waiting build(java.util.Map<String, ?> map) throws Exception {
            Waiting self = new Waiting();
            return TeaModel.build(map, self);
        }

        public Waiting setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Waiting setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class LastState extends TeaModel {
        /**
         * <p>The container is created and running.</p>
         */
        @NameInMap("Running")
        public Running running;

        /**
         * <p>The container is terminated and exits after a successful or failed running.</p>
         */
        @NameInMap("Terminated")
        public Terminated terminated;

        /**
         * <p>The container is waiting for being created.</p>
         */
        @NameInMap("Waiting")
        public Waiting waiting;

        public static LastState build(java.util.Map<String, ?> map) throws Exception {
            LastState self = new LastState();
            return TeaModel.build(map, self);
        }

        public LastState setRunning(Running running) {
            this.running = running;
            return this;
        }
        public Running getRunning() {
            return this.running;
        }

        public LastState setTerminated(Terminated terminated) {
            this.terminated = terminated;
            return this;
        }
        public Terminated getTerminated() {
            return this.terminated;
        }

        public LastState setWaiting(Waiting waiting) {
            this.waiting = waiting;
            return this;
        }
        public Waiting getWaiting() {
            return this.waiting;
        }

    }

    public static class StateRunning extends TeaModel {
        /**
         * <p>The time when the container started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T20:49:31Z</p>
         */
        @NameInMap("StartedAtstartedAt")
        public String startedAtstartedAt;

        public static StateRunning build(java.util.Map<String, ?> map) throws Exception {
            StateRunning self = new StateRunning();
            return TeaModel.build(map, self);
        }

        public StateRunning setStartedAtstartedAt(String startedAtstartedAt) {
            this.startedAtstartedAt = startedAtstartedAt;
            return this;
        }
        public String getStartedAtstartedAt() {
            return this.startedAtstartedAt;
        }

    }

    public static class StateTerminated extends TeaModel {
        /**
         * <p>The container ID.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd://3ff993933bea366c4719e43a1b067d89bc7f01f1f573981659a44ff17a******</p>
         */
        @NameInMap("ContainerID")
        public String containerID;

        /**
         * <p>The exit code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time when the container ends running.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T20:55:31Z</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The message about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason for the transition into the current status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The signal code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Signal")
        public Integer signal;

        /**
         * <p>The time when the container started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T20:49:31Z</p>
         */
        @NameInMap("StartedAt")
        public String startedAt;

        public static StateTerminated build(java.util.Map<String, ?> map) throws Exception {
            StateTerminated self = new StateTerminated();
            return TeaModel.build(map, self);
        }

        public StateTerminated setContainerID(String containerID) {
            this.containerID = containerID;
            return this;
        }
        public String getContainerID() {
            return this.containerID;
        }

        public StateTerminated setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public StateTerminated setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public StateTerminated setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StateTerminated setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public StateTerminated setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public StateTerminated setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

    }

    public static class StateWaiting extends TeaModel {
        /**
         * <p>The message about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Back-off</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason for the transition into the current status of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static StateWaiting build(java.util.Map<String, ?> map) throws Exception {
            StateWaiting self = new StateWaiting();
            return TeaModel.build(map, self);
        }

        public StateWaiting setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StateWaiting setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class State extends TeaModel {
        /**
         * <p>The container is created and running.</p>
         */
        @NameInMap("Running")
        public StateRunning running;

        /**
         * <p>The container is terminated and exits after a successful or failed running.</p>
         */
        @NameInMap("Terminated")
        public StateTerminated terminated;

        /**
         * <p>The container is waiting for being created.</p>
         */
        @NameInMap("Waiting")
        public StateWaiting waiting;

        public static State build(java.util.Map<String, ?> map) throws Exception {
            State self = new State();
            return TeaModel.build(map, self);
        }

        public State setRunning(StateRunning running) {
            this.running = running;
            return this;
        }
        public StateRunning getRunning() {
            return this.running;
        }

        public State setTerminated(StateTerminated terminated) {
            this.terminated = terminated;
            return this;
        }
        public StateTerminated getTerminated() {
            return this.terminated;
        }

        public State setWaiting(StateWaiting waiting) {
            this.waiting = waiting;
            return this;
        }
        public StateWaiting getWaiting() {
            return this.waiting;
        }

    }

    public static class ContainerStatuses extends TeaModel {
        /**
         * <p>The image of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-zhangjiakou.aliyuncs.com/eci_open/ubuntu:18.04</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-zhangjiakou.aliyuncs.com/eci_open/ubuntu@sha256:134c7fe821b9d359490cd009ce7ca322453f4f2d018623f849e580a89a685e5d</p>
         */
        @NameInMap("ImageID")
        public String imageID;

        /**
         * <p>The last status of the container.</p>
         */
        @NameInMap("LastState")
        public LastState lastState;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>ubuntu</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the container is ready.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Ready")
        public Boolean ready;

        /**
         * <p>The number of times that the container restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RestartCount")
        public Integer restartCount;

        /**
         * <p>Indicates whether the container is started.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Started")
        public Boolean started;

        /**
         * <p>The status of the container. Valid values:</p>
         * <ul>
         * <li>Waiting</li>
         * <li>Running</li>
         * <li>Terminated</li>
         * </ul>
         */
        @NameInMap("State")
        public State state;

        public static ContainerStatuses build(java.util.Map<String, ?> map) throws Exception {
            ContainerStatuses self = new ContainerStatuses();
            return TeaModel.build(map, self);
        }

        public ContainerStatuses setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ContainerStatuses setImageID(String imageID) {
            this.imageID = imageID;
            return this;
        }
        public String getImageID() {
            return this.imageID;
        }

        public ContainerStatuses setLastState(LastState lastState) {
            this.lastState = lastState;
            return this;
        }
        public LastState getLastState() {
            return this.lastState;
        }

        public ContainerStatuses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ContainerStatuses setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public ContainerStatuses setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public ContainerStatuses setStarted(Boolean started) {
            this.started = started;
            return this;
        }
        public Boolean getStarted() {
            return this.started;
        }

        public ContainerStatuses setState(State state) {
            this.state = state;
            return this;
        }
        public State getState() {
            return this.state;
        }

    }

    public static class PodIps extends TeaModel {
        /**
         * <p>The IP address of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static PodIps build(java.util.Map<String, ?> map) throws Exception {
            PodIps self = new PodIps();
            return TeaModel.build(map, self);
        }

        public PodIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class PodStatus extends TeaModel {
        /**
         * <p>The conditions of the container group.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<Conditions> conditions;

        /**
         * <p>The statuses about the containers.</p>
         */
        @NameInMap("ContainerStatuses")
        public java.util.List<ContainerStatuses> containerStatuses;

        /**
         * <p>The IP address of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>The lifecycle phase of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The IP address of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("PodIp")
        public String podIp;

        /**
         * <p>The IP addresses of the container groups.</p>
         */
        @NameInMap("PodIps")
        public java.util.List<PodIps> podIps;

        /**
         * <p>The quality of service (QoS) of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>Guaranteed</p>
         */
        @NameInMap("QosClass")
        public String qosClass;

        /**
         * <p>The time when the container started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-12T07:02:47Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static PodStatus build(java.util.Map<String, ?> map) throws Exception {
            PodStatus self = new PodStatus();
            return TeaModel.build(map, self);
        }

        public PodStatus setConditions(java.util.List<Conditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        public PodStatus setContainerStatuses(java.util.List<ContainerStatuses> containerStatuses) {
            this.containerStatuses = containerStatuses;
            return this;
        }
        public java.util.List<ContainerStatuses> getContainerStatuses() {
            return this.containerStatuses;
        }

        public PodStatus setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public PodStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public PodStatus setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public PodStatus setPodIps(java.util.List<PodIps> podIps) {
            this.podIps = podIps;
            return this;
        }
        public java.util.List<PodIps> getPodIps() {
            return this.podIps;
        }

        public PodStatus setQosClass(String qosClass) {
            this.qosClass = qosClass;
            return this;
        }
        public String getQosClass() {
            return this.qosClass;
        }

        public PodStatus setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class Data extends TeaModel {
        /**
         * <p>Annotations that are added to the container groups.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;tenancy.x-k8s.io/namespace\&quot;:\&quot;redis\&quot;}&quot;</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The ID of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-bp1jrgfqqy54kg5hc****</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The name of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace in which the container group resides.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The status of the container group.</p>
         */
        @NameInMap("PodStatus")
        public PodStatus podStatus;

        /**
         * <p>The status of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The universally unique identifier (UUID) of the container group, which is similar to the unique identifier (UID) of the Kubernetes pod in terms of the concept and usage.</p>
         * 
         * <strong>example:</strong>
         * <p>78ee0657-987g-b8b2-1f507dic4****</p>
         */
        @NameInMap("uuid")
        public String uuid;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public Data setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public Data setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Data setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public Data setPodStatus(PodStatus podStatus) {
            this.podStatus = podStatus;
            return this;
        }
        public PodStatus getPodStatus() {
            return this.podStatus;
        }

        public Data setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public Data setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
