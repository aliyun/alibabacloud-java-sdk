// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupStatusResponseBody extends TeaModel {
    /**
     * <p>The collection of the statuses of the container groups.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeContainerGroupStatusResponseBodyData> data;

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
         * <p>The time when the container started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T20:49:31Z</p>
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
         * <p>The container is terminated and exits after a successful or failed running.</p>
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
         * <p>The time when the container started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-23T20:49:31Z</p>
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
         * <p>The container is terminated and exits after a successful or failed running.</p>
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
        public DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatusesLastState lastState;

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
         * <p>The IP address of the container group.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
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
         * <p>The conditions of the container group.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusConditions> conditions;

        /**
         * <p>The statuses about the containers.</p>
         */
        @NameInMap("ContainerStatuses")
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusContainerStatuses> containerStatuses;

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
        public java.util.List<DescribeContainerGroupStatusResponseBodyDataPodStatusPodIps> podIps;

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
        public DescribeContainerGroupStatusResponseBodyDataPodStatus podStatus;

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
