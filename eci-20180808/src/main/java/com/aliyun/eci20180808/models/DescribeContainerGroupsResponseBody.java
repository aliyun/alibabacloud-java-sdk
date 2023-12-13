// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsResponseBody extends TeaModel {
    /**
     * <p>Details about the elastic container instances.</p>
     */
    @NameInMap("ContainerGroups")
    public java.util.List<DescribeContainerGroupsResponseBodyContainerGroups> containerGroups;

    /**
     * <p>The token that determines the start point of the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request. The value is unique.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of queried instances.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeContainerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsResponseBody self = new DescribeContainerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupsResponseBody setContainerGroups(java.util.List<DescribeContainerGroupsResponseBodyContainerGroups> containerGroups) {
        this.containerGroups = containerGroups;
        return this;
    }
    public java.util.List<DescribeContainerGroupsResponseBodyContainerGroups> getContainerGroups() {
        return this.containerGroups;
    }

    public DescribeContainerGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeContainerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContainerGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

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
        public Integer signal;

        /**
         * <p>The time when the container started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The container status. Valid values:</p>
         * <br>
         * <p>*   Waiting</p>
         * <p>*   Running</p>
         * <p>*   Terminated</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef extends TeaModel {
        /**
         * <p>The path of the field.</p>
         */
        @NameInMap("FieldPath")
        public String fieldPath;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFrom extends TeaModel {
        /**
         * <p>The specified field.</p>
         */
        @NameInMap("FieldRef")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef fieldRef;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFrom self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFrom();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFrom setFieldRef(DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars extends TeaModel {
        /**
         * <p>The environment variable.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The source of the variable value. This parameter has a value only when the Value parameter is not empty.</p>
         */
        @NameInMap("ValueFrom")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFrom valueFrom;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars setValueFrom(DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet extends TeaModel {
        /**
         * <p>The path to which HTTP GET requests were sent.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which HTTP GET requests were sent.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type of the HTTP GET requests.</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket extends TeaModel {
        /**
         * <p>The hostname.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port number.</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe extends TeaModel {
        /**
         * <p>The commands that are used to check the containers.</p>
         */
        @NameInMap("Execs")
        public java.util.List<String> execs;

        /**
         * <p>The minimum number of consecutive failures that must occur for the check to be considered failed. Default value: 3.</p>
         */
        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        /**
         * <p>The HTTP GET method that is used to check the container.</p>
         */
        @NameInMap("HttpGet")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet httpGet;

        /**
         * <p>The number of seconds between the time when the startup of the container ends and the time when the check starts.</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        /**
         * <p>The interval at which the container is checked. Unit: seconds. Default value: 10. Minimum value: 1.</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. Set the value to 1.</p>
         */
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        /**
         * <p>The TCP socket method that is used to check the container.</p>
         */
        @NameInMap("TcpSocket")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket tcpSocket;

        /**
         * <p>The timeout period of the health check. Unit: seconds. Default value: 1. Minimum value: 1.</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setExecs(java.util.List<String> execs) {
            this.execs = execs;
            return this;
        }
        public java.util.List<String> getExecs() {
            return this.execs;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setHttpGet(DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setTcpSocket(DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

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
        public Integer signal;

        /**
         * <p>The time when the container started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The container status. Valid values:</p>
         * <br>
         * <p>*   Waiting: The container is being started.</p>
         * <p>*   Running: The container is running.</p>
         * <p>*   Terminated: The container stops running.</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet extends TeaModel {
        /**
         * <p>The path to which the system sends an HTTP GET request for a probe.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which the system sends an HTTP GET request for a health check.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type of the HTTP GET requests.</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket extends TeaModel {
        /**
         * <p>The IP address of the host.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port number.</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe extends TeaModel {
        /**
         * <p>The commands to be executed in containers when you use a command-line interface (CLI) to perform health checks.</p>
         */
        @NameInMap("Execs")
        public java.util.List<String> execs;

        /**
         * <p>The minimum number of consecutive failures that must occur for the check to be considered failed. Default value: 3.</p>
         */
        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        /**
         * <p>The HTTP GET method that is used to check the container.</p>
         */
        @NameInMap("HttpGet")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet httpGet;

        /**
         * <p>The number of seconds between the time when the startup of the container ends and the time when the check starts.</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        /**
         * <p>The interval at which the container is checked. Unit: seconds. Default value: 10. Minimum value: 1.</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. Set the value to 1.</p>
         */
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        /**
         * <p>The TCP socket method that is used to check the container.</p>
         */
        @NameInMap("TcpSocket")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket tcpSocket;

        /**
         * <p>The timeout period of the health check. Unit: seconds. Default value: 1. Minimum value: 1.</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setExecs(java.util.List<String> execs) {
            this.execs = execs;
            return this;
        }
        public java.util.List<String> getExecs() {
            return this.execs;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setHttpGet(DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setTcpSocket(DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability extends TeaModel {
        /**
         * <p>The permissions specific to the process in the container.</p>
         */
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Capability")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability capability;

        /**
         * <p>Indicates whether the root file system is set to the read-only mode. The only valid value is true.</p>
         */
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        /**
         * <p>The ID of the user that runs the container.</p>
         */
        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext setCapability(DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts extends TeaModel {
        /**
         * <p>The directory to which the volume is mounted. Data under this directory is overwritten by the data on the volume.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of volumes. Mount propagation allows the sharing of volumes that are mounted on a container to other containers in the same pod, or even to other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to the volume or the subdirectories of the volume.</p>
         * <p>*   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to the volume or to the subdirectories of the volume.</p>
         * <p>*   Bidirectional: The volume mount behaves the same as the HostToCotainer mount. The volume mount receives all subsequent mounts that are mounted to the volume or to the subdirectories of the volume. In addition, all volume mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The volume name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the volume is read-only.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume. This parameter specifies different subdirectories of the same volume that the instance can mount to different subdirectories of containers.</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainers extends TeaModel {
        /**
         * <p>The arguments that are passed to the startup command of the container.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The container startup commands.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs that you want to allocate to the container.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The current container status.</p>
         */
        @NameInMap("CurrentState")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState currentState;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars> environmentVars;

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
         * <p>*   Always: Image pulling is always performed.</p>
         * <p>*   IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</p>
         * <p>*   Never: On-premises images are always used. Image pulling is not performed.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The liveness probe of the container.</p>
         */
        @NameInMap("LivenessProbe")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe livenessProbe;

        /**
         * <p>The memory size of the container. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The container name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The exposed port and protocol of the container.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts> ports;

        /**
         * <p>The previous state of the container.</p>
         */
        @NameInMap("PreviousState")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState previousState;

        /**
         * <p>The readiness probe that is used to check whether the container is ready to serve a request.</p>
         */
        @NameInMap("ReadinessProbe")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe readinessProbe;

        /**
         * <p>Indicates whether the container passed the readiness probe.</p>
         */
        @NameInMap("Ready")
        public Boolean ready;

        /**
         * <p>The number of times that the container restarted.</p>
         */
        @NameInMap("RestartCount")
        public Integer restartCount;

        /**
         * <p>The security context of the elastic container instance.</p>
         */
        @NameInMap("SecurityContext")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext securityContext;

        /**
         * <p>Indicates whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Indicates whether the container runtime closes the stdin channel after the stdin channel has been opened by a sing attach. If stdin is true, the stdin stream remains open across multiple attach sessions. If StdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and receive data until the client disconnects. When the client disconnects, stdin is closed and remains closed until the container is restarted.</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Indicates whether interaction is enabled. Default value: false If the Command parameter is a `/bin/bash` command, the value is true.</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>Information about the mounted volumes.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory of the container.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainers self = new DescribeContainerGroupsResponseBodyContainerGroupsContainers();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setCurrentState(DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState currentState) {
            this.currentState = currentState;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState getCurrentState() {
            return this.currentState;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setEnvironmentVars(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setLivenessProbe(DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setPorts(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts> getPorts() {
            return this.ports;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setPreviousState(DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState previousState) {
            this.previousState = previousState;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState getPreviousState() {
            return this.previousState;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setReadinessProbe(DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setSecurityContext(DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setVolumeMounts(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions extends TeaModel {
        /**
         * <p>The variable name of the option.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the object.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions self = new DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig extends TeaModel {
        /**
         * <p>The IP addresses of DNS servers.</p>
         */
        @NameInMap("NameServers")
        public java.util.List<String> nameServers;

        /**
         * <p>The objects. Each object is a name-value pair. The value is optional.</p>
         */
        @NameInMap("Options")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions> options;

        /**
         * <p>The lookup domains of DNS server N.</p>
         */
        @NameInMap("Searches")
        public java.util.List<String> searches;

        public static DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig self = new DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig setNameServers(java.util.List<String> nameServers) {
            this.nameServers = nameServers;
            return this;
        }
        public java.util.List<String> getNameServers() {
            return this.nameServers;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig setOptions(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions> getOptions() {
            return this.options;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig setSearches(java.util.List<String> searches) {
            this.searches = searches;
            return this;
        }
        public java.util.List<String> getSearches() {
            return this.searches;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls extends TeaModel {
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

        public static DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls self = new DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext extends TeaModel {
        /**
         * <p>The Sysctl parameters.</p>
         */
        @NameInMap("Sysctls")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls> sysctls;

        public static DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext self = new DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext setSysctls(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls> sysctls) {
            this.sysctls = sysctls;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls> getSysctls() {
            return this.sysctls;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsEvents extends TeaModel {
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
         * <p>The category to which the event belongs.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The event name.</p>
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

        public static DescribeContainerGroupsResponseBodyContainerGroupsEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsEvents self = new DescribeContainerGroupsResponseBodyContainerGroupsEvents();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsHostAliases extends TeaModel {
        /**
         * <p>The information about the host.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static DescribeContainerGroupsResponseBodyContainerGroupsHostAliases build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsHostAliases self = new DescribeContainerGroupsResponseBodyContainerGroupsHostAliases();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsHostAliases setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsHostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The message about the event.</p>
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
        public Integer signal;

        /**
         * <p>The time when the container started to run.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The container status. Valid values:</p>
         * <br>
         * <p>*   Waiting</p>
         * <p>*   Running</p>
         * <p>*   Terminated</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef extends TeaModel {
        /**
         * <p>The path from which the fields come in the specified version. Only `status.podIP` is supported.</p>
         */
        @NameInMap("FieldPath")
        public String fieldPath;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFrom extends TeaModel {
        /**
         * <p>The specified field.</p>
         */
        @NameInMap("FieldRef")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef fieldRef;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFrom self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFrom();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFrom setFieldRef(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars extends TeaModel {
        /**
         * <p>The environment variable.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The source of the variable value. This parameter has a value only when the Value parameter is not empty.</p>
         */
        @NameInMap("ValueFrom")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFrom valueFrom;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars setValueFrom(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

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
        public Integer signal;

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

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability extends TeaModel {
        /**
         * <p>The permissions specific to the process in the container.</p>
         */
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Capability")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability capability;

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

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext setCapability(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts extends TeaModel {
        /**
         * <p>The directory to which the volume is mounted. Data under this directory is overwritten by the data on the volume.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation settings of volumes. Mount propagation allows the sharing of volumes that are mounted on a container to other containers in the same pod, or even to other pods on the same node. Valid values:</p>
         * <br>
         * <p>*   None: The volume mount does not receive subsequent mounts that are mounted to the volume or the subdirectories of the volume.</p>
         * <p>*   HostToCotainer: The volume mount receives all subsequent mounts that are mounted to the volume or to the subdirectories of the volume.</p>
         * <p>*   Bidirectional: The volume mount behaves the same as the HostToCotainer mount. The volume mount receives all subsequent mounts that are mounted to the volume or to the subdirectories of the volume. In addition, all volume mounts created by the container are propagated back to the host and to all containers of all pods that use the same volume.</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume. The name is the same as the volume you selected when you purchased the container.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Default value: false.</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainers extends TeaModel {
        /**
         * <p>The arguments that are passed to the startup command.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup commands of the containers.</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The current container status.</p>
         */
        @NameInMap("CurrentState")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState currentState;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image.</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The policy for image pulling. Valid values:</p>
         * <br>
         * <p>*   Always: Image pulling is always performed.</p>
         * <p>*   IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</p>
         * <p>*   Never: On-premises images are always used. Image pulling is not performed.</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The size of memory that is allocated to the init container. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the init container.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The exposed port and protocol of the container.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts> ports;

        /**
         * <p>The previous state of the container.</p>
         */
        @NameInMap("PreviousState")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState previousState;

        /**
         * <p>Indicates whether the container passed the readiness probe.</p>
         */
        @NameInMap("Ready")
        public Boolean ready;

        /**
         * <p>The number of times the container restarted.</p>
         */
        @NameInMap("RestartCount")
        public Integer restartCount;

        /**
         * <p>The security context of the container.</p>
         */
        @NameInMap("SecurityContext")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext securityContext;

        /**
         * <p>The information about the volumes that are mounted to the init container.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory of the container.</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainers self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainers();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setCurrentState(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState currentState) {
            this.currentState = currentState;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState getCurrentState() {
            return this.currentState;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setEnvironmentVars(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setPorts(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts> getPorts() {
            return this.ports;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setPreviousState(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState previousState) {
            this.previousState = previousState;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState getPreviousState() {
            return this.previousState;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setSecurityContext(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setVolumeMounts(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeContainerGroupsResponseBodyContainerGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsTags self = new DescribeContainerGroupsResponseBodyContainerGroupsTags();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths extends TeaModel {
        /**
         * <p>The content of the configuration file. Maximum size: 32 KB.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The relative path of the configuration file.</p>
         */
        @NameInMap("Path")
        public String path;

        public static DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths self = new DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsVolumes extends TeaModel {
        /**
         * <p>The paths to configuration files.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        /**
         * <p>The ID of the disk when you set the Type parameter to DiskVolume.</p>
         */
        @NameInMap("DiskVolumeDiskId")
        public String diskVolumeDiskId;

        /**
         * <p>The file system type of the disk volume.</p>
         */
        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        /**
         * <p>The storage media of emptyDir volume N. This parameter is empty by default, indicating that the node file system is used as the storage media. Valid values:</p>
         * <br>
         * <p>*   Memory: uses memory as the storage media.</p>
         * <p>*   LocalRaid0: forms local disks into RAID 0. This value is applicable only to scenarios in which an elastic container instance that has local disks mounted is created. For more information, see [Create an elastic container instance that has local disks mounted](~~114664~~).</p>
         */
        @NameInMap("EmptyDirVolumeMedium")
        public String emptyDirVolumeMedium;

        /**
         * <p>The storage capacity of emptyDir volume N.</p>
         */
        @NameInMap("EmptyDirVolumeSizeLimit")
        public String emptyDirVolumeSizeLimit;

        /**
         * <p>The name of the FlexVolume driver.</p>
         */
        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        /**
         * <p>The file system type when you set the Type parameter to FlexVolume. The default value is determined by the script of the FlexVolume plug-in.</p>
         */
        @NameInMap("FlexVolumeFsType")
        public String flexVolumeFsType;

        /**
         * <p>The options when you set the Volume.N.Type parameter to FlexVolume.</p>
         */
        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        /**
         * <p>The path of the NFS volume.</p>
         */
        @NameInMap("NFSVolumePath")
        public String NFSVolumePath;

        /**
         * <p>Indicates whether the volume is read-only.</p>
         */
        @NameInMap("NFSVolumeReadOnly")
        public Boolean NFSVolumeReadOnly;

        /**
         * <p>The endpoint of the server when you set the Type parameter to NFSVolume.</p>
         */
        @NameInMap("NFSVolumeServer")
        public String NFSVolumeServer;

        /**
         * <p>The volume name.</p>
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

        public static DescribeContainerGroupsResponseBodyContainerGroupsVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsVolumes self = new DescribeContainerGroupsResponseBodyContainerGroupsVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setConfigFileVolumeConfigFileToPaths(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
            this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setDiskVolumeDiskId(String diskVolumeDiskId) {
            this.diskVolumeDiskId = diskVolumeDiskId;
            return this;
        }
        public String getDiskVolumeDiskId() {
            return this.diskVolumeDiskId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setDiskVolumeFsType(String diskVolumeFsType) {
            this.diskVolumeFsType = diskVolumeFsType;
            return this;
        }
        public String getDiskVolumeFsType() {
            return this.diskVolumeFsType;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
            this.emptyDirVolumeMedium = emptyDirVolumeMedium;
            return this;
        }
        public String getEmptyDirVolumeMedium() {
            return this.emptyDirVolumeMedium;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
            this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
            return this;
        }
        public String getEmptyDirVolumeSizeLimit() {
            return this.emptyDirVolumeSizeLimit;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setFlexVolumeDriver(String flexVolumeDriver) {
            this.flexVolumeDriver = flexVolumeDriver;
            return this;
        }
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setFlexVolumeFsType(String flexVolumeFsType) {
            this.flexVolumeFsType = flexVolumeFsType;
            return this;
        }
        public String getFlexVolumeFsType() {
            return this.flexVolumeFsType;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setFlexVolumeOptions(String flexVolumeOptions) {
            this.flexVolumeOptions = flexVolumeOptions;
            return this;
        }
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setNFSVolumePath(String NFSVolumePath) {
            this.NFSVolumePath = NFSVolumePath;
            return this;
        }
        public String getNFSVolumePath() {
            return this.NFSVolumePath;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setNFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
            this.NFSVolumeReadOnly = NFSVolumeReadOnly;
            return this;
        }
        public Boolean getNFSVolumeReadOnly() {
            return this.NFSVolumeReadOnly;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setNFSVolumeServer(String NFSVolumeServer) {
            this.NFSVolumeServer = NFSVolumeServer;
            return this;
        }
        public String getNFSVolumeServer() {
            return this.NFSVolumeServer;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroups extends TeaModel {
        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("ContainerGroupName")
        public String containerGroupName;

        /**
         * <p>The containers in the elastic container instance.</p>
         */
        @NameInMap("Containers")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainers> containers;

        /**
         * <p>The number of vCPUs that are allocated to the elastic container instance.</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The time when the system created the elastic container instance after the system received the request. The time follows the RFC 3339 standard and must be in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The discount.</p>
         */
        @NameInMap("Discount")
        public Integer discount;

        /**
         * <p>The Domain Name System (DNS) settings.</p>
         */
        @NameInMap("DnsConfig")
        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig dnsConfig;

        /**
         * <p>The security context of the elastic container instance.</p>
         */
        @NameInMap("EciSecurityContext")
        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext eciSecurityContext;

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The size of the temporary storage space. Unit: GiB.</p>
         */
        @NameInMap("EphemeralStorage")
        public Integer ephemeralStorage;

        /**
         * <p>The events about the elastic container instance. A maximum of 50 events can be returned.</p>
         */
        @NameInMap("Events")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEvents> events;

        /**
         * <p>The time when the elastic container instance failed to run due to overdue payments. The time follows the RFC 3339 standard and must be in UTC.</p>
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
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsHostAliases> hostAliases;

        /**
         * <p>The information about the init containers.</p>
         */
        @NameInMap("InitContainers")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainers> initContainers;

        /**
         * <p>The instance type of the Elastic Compute Service (ECS) instance that is used to create the elastic container instance.</p>
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
         * <p>The memory size of the elastic container instance. Unit: GiB.</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the instance RAM role. You can use an instance RAM role to access both elastic container instances and ECS instances. For more information, see [Use the instance RAM role by calling APIs](~~61178~~).</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The restart policy of the elastic container instance. Valid values:</p>
         * <br>
         * <p>*   Never: never restarts the elastic container instance.</p>
         * <p>*   Always: always restarts the elastic container instance.</p>
         * <p>*   OnFailure: restarts the instance if it fails to run.</p>
         */
        @NameInMap("RestartPolicy")
        public String restartPolicy;

        /**
         * <p>The ID of the security group to which the instance belongs.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The maximum hourly price for the preemptible elastic container instance.</p>
         * <br>
         * <p>This parameter is returned only if you set the SpotStrategy parameter to SpotWithPriceLimit.</p>
         */
        @NameInMap("SpotPriceLimit")
        public Double spotPriceLimit;

        /**
         * <p>The bidding policy for the instance. Valid values:</p>
         * <br>
         * <p>*   NoSpot (default): The instance is created as a regular pay-as-you-go instance.</p>
         * <p>*   SpotWithPriceLimit: The instance is a preemptible instance that has a maximum price.</p>
         * <p>*   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <br>
         * <p>*   Pending: The elastic container instance is being started.</p>
         * <p>*   Running: The elastic container instance is running.</p>
         * <p>*   Succeeded: The elastic container instance runs successfully.</p>
         * <p>*   Failed: The elastic container instance fails to run.</p>
         * <p>*   Scheduling: The elastic container instance is being created.</p>
         * <p>*   ScheduleFailed: The elastic container instance fails to be created.</p>
         * <p>*   Restarting: The elastic container instance is being restarted.</p>
         * <p>*   Updating: The elastic container instance is being updated.</p>
         * <p>*   Terminating: The elastic container instance is being terminated.</p>
         * <p>*   Expired: The instance expired.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when all containers in the elastic container instance exit. The time follows the RFC 3339 standard and must be in UTC.</p>
         */
        @NameInMap("SucceededTime")
        public String succeededTime;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsTags> tags;

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
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The information about the volumes.</p>
         */
        @NameInMap("Volumes")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumes> volumes;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the elastic container instances belong.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone to which the instance belongs.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeContainerGroupsResponseBodyContainerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroups self = new DescribeContainerGroupsResponseBodyContainerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setContainerGroupName(String containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }
        public String getContainerGroupName() {
            return this.containerGroupName;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setContainers(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainers> getContainers() {
            return this.containers;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }
        public Integer getDiscount() {
            return this.discount;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setDnsConfig(DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig getDnsConfig() {
            return this.dnsConfig;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setEciSecurityContext(DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext eciSecurityContext) {
            this.eciSecurityContext = eciSecurityContext;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext getEciSecurityContext() {
            return this.eciSecurityContext;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setEphemeralStorage(Integer ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Integer getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setEvents(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEvents> getEvents() {
            return this.events;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setHostAliases(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsHostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsHostAliases> getHostAliases() {
            return this.hostAliases;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setInitContainers(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainers> initContainers) {
            this.initContainers = initContainers;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainers> getInitContainers() {
            return this.initContainers;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setSpotPriceLimit(Double spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Double getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setSucceededTime(String succeededTime) {
            this.succeededTime = succeededTime;
            return this;
        }
        public String getSucceededTime() {
            return this.succeededTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTags(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsTags> getTags() {
            return this.tags;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTenantEniInstanceId(String tenantEniInstanceId) {
            this.tenantEniInstanceId = tenantEniInstanceId;
            return this;
        }
        public String getTenantEniInstanceId() {
            return this.tenantEniInstanceId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTenantEniIp(String tenantEniIp) {
            this.tenantEniIp = tenantEniIp;
            return this;
        }
        public String getTenantEniIp() {
            return this.tenantEniIp;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTenantSecurityGroupId(String tenantSecurityGroupId) {
            this.tenantSecurityGroupId = tenantSecurityGroupId;
            return this;
        }
        public String getTenantSecurityGroupId() {
            return this.tenantSecurityGroupId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTenantVSwitchId(String tenantVSwitchId) {
            this.tenantVSwitchId = tenantVSwitchId;
            return this;
        }
        public String getTenantVSwitchId() {
            return this.tenantVSwitchId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setVolumes(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumes> volumes) {
            this.volumes = volumes;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumes> getVolumes() {
            return this.volumes;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
