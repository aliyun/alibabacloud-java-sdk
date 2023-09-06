// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeServerlessJobsResponseBody extends TeaModel {
    /**
     * <p>The list of detailed information about the serverless job.</p>
     */
    @NameInMap("JobInfos")
    public java.util.List<DescribeServerlessJobsResponseBodyJobInfos> jobInfos;

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

    public static DescribeServerlessJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessJobsResponseBody self = new DescribeServerlessJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessJobsResponseBody setJobInfos(java.util.List<DescribeServerlessJobsResponseBodyJobInfos> jobInfos) {
        this.jobInfos = jobInfos;
        return this;
    }
    public java.util.List<DescribeServerlessJobsResponseBodyJobInfos> getJobInfos() {
        return this.jobInfos;
    }

    public DescribeServerlessJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerlessJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeServerlessJobsResponseBodyJobInfosArrayProperties extends TeaModel {
        /**
         * <p>The end value of the array job index.</p>
         */
        @NameInMap("IndexEnd")
        public Long indexEnd;

        /**
         * <p>The starting value of the array job index.</p>
         */
        @NameInMap("IndexStart")
        public Long indexStart;

        /**
         * <p>The interval of the array job index.</p>
         */
        @NameInMap("IndexStep")
        public Long indexStep;

        public static DescribeServerlessJobsResponseBodyJobInfosArrayProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosArrayProperties self = new DescribeServerlessJobsResponseBodyJobInfosArrayProperties();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosArrayProperties setIndexEnd(Long indexEnd) {
            this.indexEnd = indexEnd;
            return this;
        }
        public Long getIndexEnd() {
            return this.indexEnd;
        }

        public DescribeServerlessJobsResponseBodyJobInfosArrayProperties setIndexStart(Long indexStart) {
            this.indexStart = indexStart;
            return this;
        }
        public Long getIndexStart() {
            return this.indexStart;
        }

        public DescribeServerlessJobsResponseBodyJobInfosArrayProperties setIndexStep(Long indexStep) {
            this.indexStep = indexStep;
            return this;
        }
        public Long getIndexStep() {
            return this.indexStep;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The information about the container status.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the container is in this state.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the container status.</p>
         */
        @NameInMap("Signal")
        public Long signal;

        /**
         * <p>The time when the container started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   Waiting</p>
         * <p>*   Running</p>
         * <p>*   Terminated</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState setSignal(Long signal) {
            this.signal = signal;
            return this;
        }
        public Long getSignal() {
            return this.signal;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFromFieldRef extends TeaModel {
        /**
         * <p>The path of the field.</p>
         */
        @NameInMap("FieldPath")
        public String fieldPath;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFromFieldRef self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFromFieldRef();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFromFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFrom extends TeaModel {
        /**
         * <p>The specified field.</p>
         */
        @NameInMap("FieldRef")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFromFieldRef fieldRef;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFrom self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFrom();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFrom setFieldRef(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars extends TeaModel {
        /**
         * <p>The key of the environment variable.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The source of the environment variable value. This parameter can be used only when the variable value is not specified.</p>
         */
        @NameInMap("ValueFrom")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFrom valueFrom;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars setValueFrom(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVarsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet extends TeaModel {
        /**
         * <p>The path to which HTTP GET requests are sent.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which HTTP GET requests are sent.</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The protocol type of the HTTP GET requests.</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket extends TeaModel {
        /**
         * <p>The name of the host.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port number.</p>
         */
        @NameInMap("Port")
        public Long port;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe extends TeaModel {
        /**
         * <p>The commands that are run.</p>
         */
        @NameInMap("Execs")
        public java.util.List<String> execs;

        /**
         * <p>The minimum number of consecutive failures that must occur for the probe to be considered failed. Default value: 3.</p>
         */
        @NameInMap("FailureThreshold")
        public Long failureThreshold;

        /**
         * <p>The HTTP GET method that is used to check the container.</p>
         */
        @NameInMap("HttpGet")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet httpGet;

        /**
         * <p>The number of seconds between the time when the startup of the container ends and the time when the check starts.</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Long initialDelaySeconds;

        /**
         * <p>The interval at which the probe is run. Unit: seconds. Default value: 10. Minimum value: 1.</p>
         */
        @NameInMap("PeriodSeconds")
        public Long periodSeconds;

        /**
         * <p>The minimum number of consecutive successes for the probe to be considered successful after having failed. Default value: 1. Set the value to 1.</p>
         */
        @NameInMap("SuccessThreshold")
        public Long successThreshold;

        /**
         * <p>The TCP socket method that is used to check the container.</p>
         */
        @NameInMap("TcpSocket")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket tcpSocket;

        /**
         * <p>The timeout period of a readiness probe. Default value: 1. Minimum value: 1. Unit: seconds.</p>
         */
        @NameInMap("TimeoutSeconds")
        public Long timeoutSeconds;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe setExecs(java.util.List<String> execs) {
            this.execs = execs;
            return this;
        }
        public java.util.List<String> getExecs() {
            return this.execs;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe setHttpGet(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe setTcpSocket(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe setTimeoutSeconds(Long timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Long getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The message about the container status.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the container is in this state.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the container status.</p>
         */
        @NameInMap("Signal")
        public Long signal;

        /**
         * <p>The time when the container started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the container. Valid values:</p>
         * <br>
         * <p>*   Waiting: The container is being started.</p>
         * <p>*   Running: The container is running.</p>
         * <p>*   Terminated: The container terminates running.</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState setSignal(Long signal) {
            this.signal = signal;
            return this;
        }
        public Long getSignal() {
            return this.signal;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet extends TeaModel {
        /**
         * <p>The path to which HTTP GET requests are sent.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which the system sends an HTTP GET request for a health check.</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The protocol type of the HTTP GET requests.</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket extends TeaModel {
        /**
         * <p>The IP address of the host.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port number.</p>
         */
        @NameInMap("Port")
        public Long port;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe extends TeaModel {
        /**
         * <p>The commands that are run in the container when you use the command line interface (CLI) to perform health checks.</p>
         */
        @NameInMap("Execs")
        public java.util.List<String> execs;

        /**
         * <p>The minimum number of consecutive failures that must occur for the check to be considered failure. Default value: 3.</p>
         */
        @NameInMap("FailureThreshold")
        public Long failureThreshold;

        /**
         * <p>The HTTP GET method that is used to check the container.</p>
         */
        @NameInMap("HttpGet")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet httpGet;

        /**
         * <p>The number of seconds between the time when the startup of the container ends and the time when the check starts.</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Long initialDelaySeconds;

        /**
         * <p>The interval at which the check is performed. Unit: seconds. Default value: 10. Minimum value: 1.</p>
         */
        @NameInMap("PeriodSeconds")
        public Long periodSeconds;

        /**
         * <p>The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. Set the value to 1.</p>
         */
        @NameInMap("SuccessThreshold")
        public Long successThreshold;

        /**
         * <p>The TCP socket method that is used to check the container.</p>
         */
        @NameInMap("TcpSocket")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket tcpSocket;

        /**
         * <p>The timeout period of the check. Default value: 1. Minimum value: 1.</p>
         */
        @NameInMap("TimeoutSeconds")
        public Long timeoutSeconds;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe setExecs(java.util.List<String> execs) {
            this.execs = execs;
            return this;
        }
        public java.util.List<String> getExecs() {
            return this.execs;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe setHttpGet(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe setTcpSocket(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe setTimeoutSeconds(Long timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Long getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Capability")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability capability;

        /**
         * <p>Indicates whether the root file system is set to the read-only mode. The only valid value is true.</p>
         */
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        /**
         * <p>The UID that is used to run the entry point of the container process.</p>
         */
        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext setCapability(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts extends TeaModel {
        /**
         * <p>The directory to which the volume is mounted. Data under this directory is overwritten by the data on the volume.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows you to share volumes that are mounted on a container with other containers in the same pod or other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to the volume or the subdirectories of the volume.</p>
         * <p>*   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to the volume or the subdirectories of the volume.</p>
         * <p>*   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to the volume or the subdirectories of the volume. All volume mounts that are mounted by the container are propagated back to the instance and all containers of all pods that use the same volume.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the volumes are read-only.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume. This parameter specifies different subdirectories of the same volume that the instance can mount to different subdirectories of containers.</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers extends TeaModel {
        /**
         * <p>The startup parameter of the container.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup command of the container.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs of the container.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The current status of the container.</p>
         */
        @NameInMap("CurrentState")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState currentState;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the container.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The policy for image pulling. Valid values:</p>
         * <br>
         * <p>*   Always: Each time instances are created, image pulling is performed.</p>
         * <p>*   IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</p>
         * <p>*   Never: On-premises images are always used. Image pulling is not performed.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The liveness probe of the container.</p>
         */
        @NameInMap("LivenessProbe")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe livenessProbe;

        /**
         * <p>The memory size of the instance. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The container name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The exposed ports and protocols of the container.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts> ports;

        /**
         * <p>The previous status of the container.</p>
         */
        @NameInMap("PreviousState")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState previousState;

        /**
         * <p>The readiness probe that is used to check whether the container is ready to serve a request.</p>
         */
        @NameInMap("ReadinessProbe")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe readinessProbe;

        /**
         * <p>Indicates whether the container passed the readiness probe.</p>
         */
        @NameInMap("Ready")
        public Boolean ready;

        /**
         * <p>The number of times that the instance worker restarted.</p>
         */
        @NameInMap("RestartCount")
        public Integer restartCount;

        /**
         * <p>The security context of the container.</p>
         */
        @NameInMap("SecurityContext")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext securityContext;

        /**
         * <p>Indicates whether the container allocates buffer resources to standard input streams when the container runs. If you do not specify this parameter, an EOF error may occur when standard input streams in the init container are read. Default value: false.</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Indicates whether the container runtime closes the stdin channel after the stdin channel has been opened by a single attach session. If stdin is true, the stdin stream remains open across multiple attach sessions. If StdinOnce is set to true, stdin is opened on container start, remains empty until the first client attaches to stdin, and then is open and receives data until the client disconnects. When the client disconnects, stdin is closed and remains closed until the container is restarted.</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Indicates whether interaction is enabled. Default value: false. If the value of the Command parameter is /bin/bash, the value of this parameter must be set to true.</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>Information about the mounted volumes.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setCurrentState(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState currentState) {
            this.currentState = currentState;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState getCurrentState() {
            return this.currentState;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setEnvironmentVars(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setLivenessProbe(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setPorts(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts> getPorts() {
            return this.ports;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setPreviousState(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState previousState) {
            this.previousState = previousState;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState getPreviousState() {
            return this.previousState;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setReadinessProbe(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setSecurityContext(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setVolumeMounts(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions extends TeaModel {
        /**
         * <p>The variable name of the option.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the option.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig extends TeaModel {
        /**
         * <p>The IP addresses of DNS servers.</p>
         */
        @NameInMap("NameServers")
        public java.util.List<String> nameServers;

        /**
         * <p>The options. Each option is a name-value pair. The value in the name-value pair is optional.</p>
         */
        @NameInMap("Options")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions> options;

        /**
         * <p>The search domains of the DNS server.</p>
         */
        @NameInMap("Searches")
        public java.util.List<String> searches;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig setNameServers(java.util.List<String> nameServers) {
            this.nameServers = nameServers;
            return this;
        }
        public java.util.List<String> getNameServers() {
            return this.nameServers;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig setOptions(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions> getOptions() {
            return this.options;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig setSearches(java.util.List<String> searches) {
            this.searches = searches;
            return this;
        }
        public java.util.List<String> getSearches() {
            return this.searches;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls extends TeaModel {
        /**
         * <p>The name of the Sysctl parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the Sysctl parameter.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext extends TeaModel {
        /**
         * <p>The Sysctl parameters.</p>
         */
        @NameInMap("Sysctls")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls> sysctls;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext setSysctls(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls> sysctls) {
            this.sysctls = sysctls;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContextSysctls> getSysctls() {
            return this.sysctls;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents extends TeaModel {
        /**
         * <p>The number of the events.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The time when the event started.</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The time when the event ended.</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The message about the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the object to which the event belongs.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The type of the event. Valid values:</p>
         * <br>
         * <p>*   Normal</p>
         * <p>*   Warning</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases extends TeaModel {
        /**
         * <p>The information about the host.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The IP address of the host.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The message of the event.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the container is in this state.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the container status.</p>
         */
        @NameInMap("Signal")
        public Long signal;

        /**
         * <p>The time when the container started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the container. Valid values:</p>
         * <br>
         * <p>*   Waiting</p>
         * <p>*   Running</p>
         * <p>*   Terminated</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState setSignal(Long signal) {
            this.signal = signal;
            return this;
        }
        public Long getSignal() {
            return this.signal;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef extends TeaModel {
        /**
         * <p>The path of the field in the specified version. Set the value to `status.podIP`.</p>
         */
        @NameInMap("FieldPath")
        public String fieldPath;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFrom extends TeaModel {
        /**
         * <p>The specified field.</p>
         */
        @NameInMap("FieldRef")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef fieldRef;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFrom self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFrom();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFrom setFieldRef(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars extends TeaModel {
        /**
         * <p>The key of the environment variable.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The source of the environment variable value. This parameter can be used only when the variable value is not specified.</p>
         */
        @NameInMap("ValueFrom")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFrom valueFrom;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars setValueFrom(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVarsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The message about the container status.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the container is in this state.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the container status.</p>
         */
        @NameInMap("Signal")
        public Long signal;

        /**
         * <p>The time when the container started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the container. Valid values: Waiting, Running, and Terminated.</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState setSignal(Long signal) {
            this.signal = signal;
            return this;
        }
        public Long getSignal() {
            return this.signal;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Capability")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability capability;

        /**
         * <p>Indicates whether the root file system is set to the read-only mode. The only valid value is true.</p>
         */
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        /**
         * <p>The UID that is used to run the entry point of the container process.</p>
         */
        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext setCapability(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts extends TeaModel {
        /**
         * <p>The directory to which the volume is mounted. Data under this directory is overwritten by the data on the volume.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of the volume. Mount propagation allows you to share volumes that are mounted on a container with other containers in the same pod or other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to the volume or the subdirectories of the volume.</p>
         * <p>*   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to the volume or the subdirectories of the volume.</p>
         * <p>*   Bidirectional: This value is similar to HostToCotainer. The volume mount receives all subsequent mounts that are mounted to the volume or the subdirectories of the volume. All volume mounts that are mounted by the container are propagated back to the instance and all containers of all pods that use the same volume.</p>
         * <br>
         * <p>Default value: None.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume. The name is the same as the volume you selected when you purchased the container.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Default value: False.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers extends TeaModel {
        /**
         * <p>The startup parameters.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup command.</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>The current status of the container.</p>
         */
        @NameInMap("CurrentState")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState currentState;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("Gpu")
        public Long gpu;

        /**
         * <p>The image of the container.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The policy for image pulling.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The size of memory that is allocated to the init container. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The container name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The exposed ports and protocols of the container.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts> ports;

        /**
         * <p>The previous status of the container.</p>
         */
        @NameInMap("PreviousState")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState previousState;

        /**
         * <p>Indicates whether the container passed the readiness probe.</p>
         */
        @NameInMap("Ready")
        public Boolean ready;

        /**
         * <p>The number of times that the instance worker restarted.</p>
         */
        @NameInMap("RestartCount")
        public Long restartCount;

        /**
         * <p>The security context of the container.</p>
         */
        @NameInMap("SecurityContext")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext securityContext;

        /**
         * <p>The information about the volumes that are mounted to the init container.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setCurrentState(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState currentState) {
            this.currentState = currentState;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState getCurrentState() {
            return this.currentState;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setEnvironmentVars(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setGpu(Long gpu) {
            this.gpu = gpu;
            return this;
        }
        public Long getGpu() {
            return this.gpu;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setPorts(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts> getPorts() {
            return this.ports;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setPreviousState(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState previousState) {
            this.previousState = previousState;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState getPreviousState() {
            return this.previousState;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setRestartCount(Long restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Long getRestartCount() {
            return this.restartCount;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setSecurityContext(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setVolumeMounts(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths extends TeaModel {
        /**
         * <p>The content of the configuration file. Maximum size: 32 KB.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The relative path to the configuration file.</p>
         */
        @NameInMap("Path")
        public String path;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes extends TeaModel {
        /**
         * <p>The paths to configuration files.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        /**
         * <p>The ID of the disk volume if you set Type to DiskVolume.</p>
         */
        @NameInMap("DiskVolumeDiskId")
        public String diskVolumeDiskId;

        /**
         * <p>The file system type of the disk volume.</p>
         */
        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        /**
         * <p>The storage media of emptyDir volume N. This parameter is empty by default, which indicates that the node file system is used as the storage media. Valid values:</p>
         * <br>
         * <p>*   Memory: uses memory as the storage media.</p>
         * <p>*   LocalRaid0: forms local disks into RAID 0. This value is applicable only to scenarios in which an elastic container instance that has local disks mounted is created. For more information, see [Create an elastic container instance that has local disks mounted](~~114664~~).</p>
         */
        @NameInMap("EmptyDirVolumeMedium")
        public String emptyDirVolumeMedium;

        /**
         * <p>The storage size of the emptyDir volume. If you specify this parameter, include the unit in the value. We recommend that you use Gi or Mi.</p>
         */
        @NameInMap("EmptyDirVolumeSizeLimit")
        public String emptyDirVolumeSizeLimit;

        /**
         * <p>The name of the driver when you set the Type parameter to FlexVolume.</p>
         */
        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        /**
         * <p>The file system type when you set the Type parameter to FlexVolume. The default value is determined by the script of the FlexVolume plug-in.</p>
         */
        @NameInMap("FlexVolumeFsType")
        public String flexVolumeFsType;

        /**
         * <p>The FlexVolume options.</p>
         */
        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        /**
         * <p>The path to the NFS volume.</p>
         */
        @NameInMap("NFSVolumePath")
        public String NFSVolumePath;

        /**
         * <p>Indicates whether the NFS volume is read-only.</p>
         */
        @NameInMap("NFSVolumeReadOnly")
        public Boolean NFSVolumeReadOnly;

        /**
         * <p>The endpoint of the server when you set the Type parameter to NFSVolume.</p>
         */
        @NameInMap("NFSVolumeServer")
        public String NFSVolumeServer;

        /**
         * <p>The name of the volume.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the volume. Valid values:</p>
         * <br>
         * <p>*   EmptyDirVolume</p>
         * <p>*   NFSVolume</p>
         * <p>*   ConfigFileVolume</p>
         * <p>*   FlexVolume</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setConfigFileVolumeConfigFileToPaths(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
            this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setDiskVolumeDiskId(String diskVolumeDiskId) {
            this.diskVolumeDiskId = diskVolumeDiskId;
            return this;
        }
        public String getDiskVolumeDiskId() {
            return this.diskVolumeDiskId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setDiskVolumeFsType(String diskVolumeFsType) {
            this.diskVolumeFsType = diskVolumeFsType;
            return this;
        }
        public String getDiskVolumeFsType() {
            return this.diskVolumeFsType;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
            this.emptyDirVolumeMedium = emptyDirVolumeMedium;
            return this;
        }
        public String getEmptyDirVolumeMedium() {
            return this.emptyDirVolumeMedium;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
            this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
            return this;
        }
        public String getEmptyDirVolumeSizeLimit() {
            return this.emptyDirVolumeSizeLimit;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setFlexVolumeDriver(String flexVolumeDriver) {
            this.flexVolumeDriver = flexVolumeDriver;
            return this;
        }
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setFlexVolumeFsType(String flexVolumeFsType) {
            this.flexVolumeFsType = flexVolumeFsType;
            return this;
        }
        public String getFlexVolumeFsType() {
            return this.flexVolumeFsType;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setFlexVolumeOptions(String flexVolumeOptions) {
            this.flexVolumeOptions = flexVolumeOptions;
            return this;
        }
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setNFSVolumePath(String NFSVolumePath) {
            this.NFSVolumePath = NFSVolumePath;
            return this;
        }
        public String getNFSVolumePath() {
            return this.NFSVolumePath;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setNFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
            this.NFSVolumeReadOnly = NFSVolumeReadOnly;
            return this;
        }
        public Boolean getNFSVolumeReadOnly() {
            return this.NFSVolumeReadOnly;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setNFSVolumeServer(String NFSVolumeServer) {
            this.NFSVolumeServer = NFSVolumeServer;
            return this;
        }
        public String getNFSVolumeServer() {
            return this.NFSVolumeServer;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfosContainerGroups extends TeaModel {
        /**
         * <p>The ID of the container group.</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The name of the container group.</p>
         */
        @NameInMap("ContainerGroupName")
        public String containerGroupName;

        /**
         * <p>The list of containers in the container group.</p>
         */
        @NameInMap("Containers")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers> containers;

        /**
         * <p>The number of vCPUs that are allocated to the container.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The time when the instance is created. The time follows the RFC 3339 standard and must be in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The discount.</p>
         */
        @NameInMap("Discount")
        public Long discount;

        /**
         * <p>The Domain Name System (DNS) settings.</p>
         */
        @NameInMap("DnsConfig")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig dnsConfig;

        /**
         * <p>The security context of the container group.</p>
         */
        @NameInMap("EciSecurityContext")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext eciSecurityContext;

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The size of the temporary storage space. Unit: GiB.</p>
         */
        @NameInMap("EphemeralStorage")
        public Long ephemeralStorage;

        /**
         * <p>The event information. Up to 50 events can be returned.</p>
         */
        @NameInMap("Events")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents> events;

        /**
         * <p>The time when the instance failed to run due to overdue payments. The beginning of the time range to query. Specify the time in the RFC 3339 standard. The time must be in UTC.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The time when the instance failed to run. The time follows the RFC 3339 standard and must be in UTC.</p>
         */
        @NameInMap("FailedTime")
        public String failedTime;

        /**
         * <p>The hostname mapping of a container in the elastic container instance.</p>
         */
        @NameInMap("HostAliases")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases> hostAliases;

        /**
         * <p>The init containers.</p>
         */
        @NameInMap("InitContainers")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers> initContainers;

        /**
         * <p>The instance type of the Elastic Compute Service (ECS) instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IPv6 address.</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The memory size of the instance. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the instance RAM role. You can use an instance RAM role to access both elastic container instances and ECS instances. For more information, see [Use the instance RAM role by calling APIs](~~61178~~).</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs. If you do not specify a resource group when you create an elastic container instance, the system automatically adds the instance to the default resource group in your account.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The instance restart policy. Valid values:</p>
         * <br>
         * <p>*   Always: Always restarts the instance if a container in the instance exits upon termination.</p>
         * <p>*   Never: Never restarts the instance if a container in the instance exits upon termination.</p>
         * <p>*   OnFailure: Restarts the instance only if a container in the instance exists upon failure with a status code of non-zero.</p>
         */
        @NameInMap("RestartPolicy")
        public String restartPolicy;

        /**
         * <p>The ID of the security group to which the instances belong.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The maximum hourly price for the preemptible instance.</p>
         * <br>
         * <p>This parameter is returned only if you set SpotStrategy to SpotWithPriceLimit.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>The bidding policy for the instance. Valid values:</p>
         * <br>
         * <p>*   NoSpot: The node is a regular pay-as-you-go instance.</p>
         * <p>*   SpotWithPriceLimit: The node is a preemptible instance that has a user-defined maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The node is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The status of the instance. Valid value:</p>
         * <br>
         * <p>*   Pending: The instance is being started.</p>
         * <p>*   Running: The instance is running.</p>
         * <p>*   Succeeded: The instance runs successfully.</p>
         * <p>*   Failed: The instance fails to run.</p>
         * <p>*   Scheduling: The instance is being created.</p>
         * <p>*   ScheduleFailed: The instance fails to be created.</p>
         * <p>*   Restarting: The instance is being restarted.</p>
         * <p>*   Updating: The instance is being updated.</p>
         * <p>*   Terminating: The instance is being terminated.</p>
         * <p>*   Expired: The instance expires.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when all containers exited on success. The beginning of the time range to query. Specify the time in the RFC 3339 standard. The time must be in UTC.</p>
         */
        @NameInMap("SucceededTime")
        public String succeededTime;

        /**
         * <p>The tags of the instances.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags> tags;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("TenantEniInstanceId")
        public String tenantEniInstanceId;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("TenantEniIp")
        public String tenantEniIp;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("TenantSecurityGroupId")
        public String tenantSecurityGroupId;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("TenantVSwitchId")
        public String tenantVSwitchId;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The information about volumes.</p>
         */
        @NameInMap("Volumes")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes> volumes;

        /**
         * <p>The ID of the VPC to which the elastic container instances belong.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone in which the elastic container instance is deployed.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeServerlessJobsResponseBodyJobInfosContainerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfosContainerGroups self = new DescribeServerlessJobsResponseBodyJobInfosContainerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setContainerGroupName(String containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }
        public String getContainerGroupName() {
            return this.containerGroupName;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setContainers(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers> getContainers() {
            return this.containers;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setDiscount(Long discount) {
            this.discount = discount;
            return this;
        }
        public Long getDiscount() {
            return this.discount;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setDnsConfig(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig getDnsConfig() {
            return this.dnsConfig;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setEciSecurityContext(DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext eciSecurityContext) {
            this.eciSecurityContext = eciSecurityContext;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext getEciSecurityContext() {
            return this.eciSecurityContext;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setEphemeralStorage(Long ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Long getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setEvents(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents> getEvents() {
            return this.events;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setHostAliases(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases> getHostAliases() {
            return this.hostAliases;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setInitContainers(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers> initContainers) {
            this.initContainers = initContainers;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers> getInitContainers() {
            return this.initContainers;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setSucceededTime(String succeededTime) {
            this.succeededTime = succeededTime;
            return this;
        }
        public String getSucceededTime() {
            return this.succeededTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setTags(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags> getTags() {
            return this.tags;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setTenantEniInstanceId(String tenantEniInstanceId) {
            this.tenantEniInstanceId = tenantEniInstanceId;
            return this;
        }
        public String getTenantEniInstanceId() {
            return this.tenantEniInstanceId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setTenantEniIp(String tenantEniIp) {
            this.tenantEniIp = tenantEniIp;
            return this;
        }
        public String getTenantEniIp() {
            return this.tenantEniIp;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setTenantSecurityGroupId(String tenantSecurityGroupId) {
            this.tenantSecurityGroupId = tenantSecurityGroupId;
            return this;
        }
        public String getTenantSecurityGroupId() {
            return this.tenantSecurityGroupId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setTenantVSwitchId(String tenantVSwitchId) {
            this.tenantVSwitchId = tenantVSwitchId;
            return this;
        }
        public String getTenantVSwitchId() {
            return this.tenantVSwitchId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setVolumes(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes> volumes) {
            this.volumes = volumes;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes> getVolumes() {
            return this.volumes;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeServerlessJobsResponseBodyJobInfosContainerGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeServerlessJobsResponseBodyJobInfos extends TeaModel {
        /**
         * <p>The properties of the array job.</p>
         */
        @NameInMap("ArrayProperties")
        public DescribeServerlessJobsResponseBodyJobInfosArrayProperties arrayProperties;

        /**
         * <p>The information of the container groups that are used to run the serverless job.</p>
         */
        @NameInMap("ContainerGroups")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroups> containerGroups;

        /**
         * <p>The time when the serverless job ended.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Indicates whether the job is an array job.</p>
         */
        @NameInMap("IsArrayJob")
        public Boolean isArrayJob;

        /**
         * <p>The ID of the serverless job or the subtask (array job).</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the serverless job.</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The time when the serverless job is last modified.</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>The scheduling priority of the serverless job.</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The name of the queue in which the serverless job is run.</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>The time when the serverless job started.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the serverless job. Valid values:</p>
         * <br>
         * <p>*   Pending</p>
         * <p>*   Initing</p>
         * <p>*   Running</p>
         * <p>*   Succeeded</p>
         * <p>*   Canceled</p>
         * <p>*   Failed</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the serverless job is submitted.</p>
         */
        @NameInMap("SubmitTime")
        public Long submitTime;

        /**
         * <p>The username that is used to run the serverless job.</p>
         */
        @NameInMap("User")
        public String user;

        public static DescribeServerlessJobsResponseBodyJobInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeServerlessJobsResponseBodyJobInfos self = new DescribeServerlessJobsResponseBodyJobInfos();
            return TeaModel.build(map, self);
        }

        public DescribeServerlessJobsResponseBodyJobInfos setArrayProperties(DescribeServerlessJobsResponseBodyJobInfosArrayProperties arrayProperties) {
            this.arrayProperties = arrayProperties;
            return this;
        }
        public DescribeServerlessJobsResponseBodyJobInfosArrayProperties getArrayProperties() {
            return this.arrayProperties;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setContainerGroups(java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroups> containerGroups) {
            this.containerGroups = containerGroups;
            return this;
        }
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroups> getContainerGroups() {
            return this.containerGroups;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setIsArrayJob(Boolean isArrayJob) {
            this.isArrayJob = isArrayJob;
            return this;
        }
        public Boolean getIsArrayJob() {
            return this.isArrayJob;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setSubmitTime(Long submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public Long getSubmitTime() {
            return this.submitTime;
        }

        public DescribeServerlessJobsResponseBodyJobInfos setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
