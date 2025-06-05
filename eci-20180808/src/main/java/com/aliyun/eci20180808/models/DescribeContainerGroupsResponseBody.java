// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsResponseBody extends TeaModel {
    /**
     * <p>Details about the queried elastic container instances.</p>
     */
    @NameInMap("ContainerGroups")
    public java.util.List<ContainerGroups> containerGroups;

    /**
     * <p>The token that determines the start point of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>d78f2dd8-5979-42fe-****-b16db43be5bc</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request. The value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>89945DD3-9072-47D0-A318-353284CFC7B3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of queried instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeContainerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsResponseBody self = new DescribeContainerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupsResponseBody setContainerGroups(java.util.List<ContainerGroups> containerGroups) {
        this.containerGroups = containerGroups;
        return this;
    }
    public java.util.List<ContainerGroups> getContainerGroups() {
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

    public static class CurrentState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         * 
         * <strong>example:</strong>
         * <p>working</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The message about the container status.</p>
         * 
         * <strong>example:</strong>
         * <p>Back-off 5m0s restarting failed container=test pod=test_eci-xxx(xxx)</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the container is in this status.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the container status.</p>
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
         * <p>2019-12-19T12:05:02Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The container status. Valid values:</p>
         * <ul>
         * <li>Waiting</li>
         * <li>Running</li>
         * <li>Terminated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Terminated</p>
         */
        @NameInMap("State")
        public String state;

        public static CurrentState build(java.util.Map<String, ?> map) throws Exception {
            CurrentState self = new CurrentState();
            return TeaModel.build(map, self);
        }

        public CurrentState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public CurrentState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public CurrentState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public CurrentState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CurrentState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CurrentState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public CurrentState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CurrentState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class FieldRef extends TeaModel {
        /**
         * <p>The path of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>status.podIP</p>
         */
        @NameInMap("FieldPath")
        public String fieldPath;

        public static FieldRef build(java.util.Map<String, ?> map) throws Exception {
            FieldRef self = new FieldRef();
            return TeaModel.build(map, self);
        }

        public FieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class ValueFrom extends TeaModel {
        /**
         * <p>The specified field.</p>
         */
        @NameInMap("FieldRef")
        public FieldRef fieldRef;

        public static ValueFrom build(java.util.Map<String, ?> map) throws Exception {
            ValueFrom self = new ValueFrom();
            return TeaModel.build(map, self);
        }

        public ValueFrom setFieldRef(FieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public FieldRef getFieldRef() {
            return this.fieldRef;
        }

    }

    public static class EnvironmentVars extends TeaModel {
        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The source of the environment variable value. This parameter has a value only when the Value parameter is left empty.</p>
         */
        @NameInMap("ValueFrom")
        public ValueFrom valueFrom;

        public static EnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            EnvironmentVars self = new EnvironmentVars();
            return TeaModel.build(map, self);
        }

        public EnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public EnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public EnvironmentVars setValueFrom(ValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public ValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class HttpGet extends TeaModel {
        /**
         * <p>The path to which the system sends an HTTP GET request for a health check.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/nginx/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which the system sends an HTTP GET request for a health check.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type supported by the method. Valid values: HTTP and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        public static HttpGet build(java.util.Map<String, ?> map) throws Exception {
            HttpGet self = new HttpGet();
            return TeaModel.build(map, self);
        }

        public HttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public HttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class TcpSocket extends TeaModel {
        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static TcpSocket build(java.util.Map<String, ?> map) throws Exception {
            TcpSocket self = new TcpSocket();
            return TeaModel.build(map, self);
        }

        public TcpSocket setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public TcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class LivenessProbe extends TeaModel {
        /**
         * <p>The commands that are used to check the containers.</p>
         */
        @NameInMap("Execs")
        public java.util.List<String> execs;

        /**
         * <p>The minimum number of consecutive failures that must occur for the check to be considered failed. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        /**
         * <p>The HTTP GET method that is used to check the container.</p>
         */
        @NameInMap("HttpGet")
        public HttpGet httpGet;

        /**
         * <p>The number of seconds between the time when the startup of the container ends and the time when the probe starts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        /**
         * <p>The interval at which the health check is performed. Default value: 10. Minimum value: 1. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. The value must be 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        /**
         * <p>The TCP socket method that is used to check the container.</p>
         */
        @NameInMap("TcpSocket")
        public TcpSocket tcpSocket;

        /**
         * <p>The timeout period of the check. Default value: 1. Minimum value: 1. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static LivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            LivenessProbe self = new LivenessProbe();
            return TeaModel.build(map, self);
        }

        public LivenessProbe setExecs(java.util.List<String> execs) {
            this.execs = execs;
            return this;
        }
        public java.util.List<String> getExecs() {
            return this.execs;
        }

        public LivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public LivenessProbe setHttpGet(HttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public HttpGet getHttpGet() {
            return this.httpGet;
        }

        public LivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public LivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public LivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public LivenessProbe setTcpSocket(TcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public TcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public LivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class Ports extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static Ports build(java.util.Map<String, ?> map) throws Exception {
            Ports self = new Ports();
            return TeaModel.build(map, self);
        }

        public Ports setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public Ports setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class PreviousState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         * 
         * <strong>example:</strong>
         * <p>working</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The message about the container status.</p>
         * 
         * <strong>example:</strong>
         * <p>Back-off 5m0s restarting failed container=test pod=test_eci-xxx(xxx)</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the container is in this status.</p>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the container status.</p>
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
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The container status. Valid values:</p>
         * <ul>
         * <li>Waiting: The container is being started.</li>
         * <li>Running: The container is running.</li>
         * <li>Terminated: The container stops running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Terminated</p>
         */
        @NameInMap("State")
        public String state;

        public static PreviousState build(java.util.Map<String, ?> map) throws Exception {
            PreviousState self = new PreviousState();
            return TeaModel.build(map, self);
        }

        public PreviousState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public PreviousState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public PreviousState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public PreviousState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public PreviousState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public PreviousState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public PreviousState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public PreviousState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ReadinessProbeHttpGet extends TeaModel {
        /**
         * <p>The path to which the system sends an HTTP GET request for a health check.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port to which the system sends an HTTP GET request for a health check.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type supported by the method. Valid values: HTTP and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Scheme")
        public String scheme;

        public static ReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            ReadinessProbeHttpGet self = new ReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public ReadinessProbeHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ReadinessProbeHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class ReadinessProbeTcpSocket extends TeaModel {
        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static ReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            ReadinessProbeTcpSocket self = new ReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

        public ReadinessProbeTcpSocket setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ReadinessProbeTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ReadinessProbe extends TeaModel {
        /**
         * <p>The commands that are run in the container when you use a CLI to perform health checks.</p>
         */
        @NameInMap("Execs")
        public java.util.List<String> execs;

        /**
         * <p>The minimum number of consecutive failures that must occur for the check to be considered failed. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        /**
         * <p>The HTTP GET method that is used to check the container.</p>
         */
        @NameInMap("HttpGet")
        public ReadinessProbeHttpGet httpGet;

        /**
         * <p>The number of seconds between the time when the startup of the container ends and the time when the probe starts.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        /**
         * <p>The interval at which the health check is performed. Default value: 10. Minimum value: 1. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        /**
         * <p>The minimum number of consecutive successes that must occur for the check to be considered successful. Default value: 1. The value must be 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        /**
         * <p>The TCP socket method that is used to check the container.</p>
         */
        @NameInMap("TcpSocket")
        public ReadinessProbeTcpSocket tcpSocket;

        /**
         * <p>The timeout period of the check. Default value: 1. Minimum value: 1. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static ReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            ReadinessProbe self = new ReadinessProbe();
            return TeaModel.build(map, self);
        }

        public ReadinessProbe setExecs(java.util.List<String> execs) {
            this.execs = execs;
            return this;
        }
        public java.util.List<String> getExecs() {
            return this.execs;
        }

        public ReadinessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public ReadinessProbe setHttpGet(ReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public ReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public ReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public ReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        public ReadinessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public ReadinessProbe setTcpSocket(ReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public ReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public ReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

    }

    public static class Capability extends TeaModel {
        /**
         * <p>The permissions specific to the process in the container.</p>
         */
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static Capability build(java.util.Map<String, ?> map) throws Exception {
            Capability self = new Capability();
            return TeaModel.build(map, self);
        }

        public Capability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class SecurityContext extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Capability")
        public Capability capability;

        /**
         * <p>Indicates whether permissions on the root file system are read-only. Valid value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        /**
         * <p>The user ID (UID) that is used to run the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static SecurityContext build(java.util.Map<String, ?> map) throws Exception {
            SecurityContext self = new SecurityContext();
            return TeaModel.build(map, self);
        }

        public SecurityContext setCapability(Capability capability) {
            this.capability = capability;
            return this;
        }
        public Capability getCapability() {
            return this.capability;
        }

        public SecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public SecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class VolumeMounts extends TeaModel {
        /**
         * <p>The directory of the volume that is mounted to the container. The data in this directory is overwritten by the data on the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are performed on this volume or on the subdirectories of this volume.</li>
         * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or on the subdirectories of this volume.</li>
         * <li>Bidirectional: This value is similar to HostToCotainer. The volume mount receives subsequent mounts that are performed on this volume or on the subdirectories of this volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The volume name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-empty</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the volume is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        /**
         * <p>The subdirectory of the volume. You can use this parameter to mount the same volume to different subdirectories of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sub</p>
         */
        @NameInMap("SubPath")
        public String subPath;

        public static VolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            VolumeMounts self = new VolumeMounts();
            return TeaModel.build(map, self);
        }

        public VolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public VolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public VolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public VolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

    }

    public static class Containers extends TeaModel {
        /**
         * <p>The arguments that are passed to the startup commands of the container.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup commands of the container.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs that are allocated to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The current container status.</p>
         */
        @NameInMap("CurrentState")
        public CurrentState currentState;

        /**
         * <p>The environment variables of the container.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<EnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image in the container.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <ul>
         * <li>Always: Each time the instance is updated, image pulling is performed.</li>
         * <li>IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The liveness probe of the container.</p>
         */
        @NameInMap("LivenessProbe")
        public LivenessProbe livenessProbe;

        /**
         * <p>The memory size of the container. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The exposed port and protocol of the container.</p>
         */
        @NameInMap("Ports")
        public java.util.List<Ports> ports;

        /**
         * <p>The previous state of the container.</p>
         */
        @NameInMap("PreviousState")
        public PreviousState previousState;

        /**
         * <p>The readiness probe that is used to check whether the container is ready to serve a request.</p>
         */
        @NameInMap("ReadinessProbe")
        public ReadinessProbe readinessProbe;

        /**
         * <p>Indicates whether the container passed the readiness probe.</p>
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
         * <p>0</p>
         */
        @NameInMap("RestartCount")
        public Integer restartCount;

        /**
         * <p>The security context of the elastic container instance.</p>
         */
        @NameInMap("SecurityContext")
        public SecurityContext securityContext;

        /**
         * <p>Indicates whether the container allocates buffer resources to standard input streams when the container is running. If you do not specify this parameter, an end-of-file (EOF) error may occur when standard input streams in the container are read. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Stdin")
        public Boolean stdin;

        /**
         * <p>Indicates whether standard input streams are disconnected after a client is disconnected. If Stdin is set to true, standard input streams remain connected among multiple sessions. If StdinOnce is set to true, standard input streams are connected after the container is started, and remain idle until a client is connected to receive data. After the client is disconnected, streams are also disconnected, and remain disconnected until the container restarts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        /**
         * <p>Indicates whether interaction is enabled. Default value: false. If the value of the Command parameter is <code>/bin/bash</code>, the value of this parameter is true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Tty")
        public Boolean tty;

        /**
         * <p>Information about the mounted volumes.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<VolumeMounts> volumeMounts;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/nginx</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static Containers build(java.util.Map<String, ?> map) throws Exception {
            Containers self = new Containers();
            return TeaModel.build(map, self);
        }

        public Containers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public Containers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public Containers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public Containers setCurrentState(CurrentState currentState) {
            this.currentState = currentState;
            return this;
        }
        public CurrentState getCurrentState() {
            return this.currentState;
        }

        public Containers setEnvironmentVars(java.util.List<EnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<EnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public Containers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public Containers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public Containers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public Containers setLivenessProbe(LivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public LivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public Containers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public Containers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Containers setPorts(java.util.List<Ports> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<Ports> getPorts() {
            return this.ports;
        }

        public Containers setPreviousState(PreviousState previousState) {
            this.previousState = previousState;
            return this;
        }
        public PreviousState getPreviousState() {
            return this.previousState;
        }

        public Containers setReadinessProbe(ReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public ReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

        public Containers setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public Containers setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public Containers setSecurityContext(SecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public SecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public Containers setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public Containers setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public Containers setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public Containers setVolumeMounts(java.util.List<VolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<VolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public Containers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class Options extends TeaModel {
        /**
         * <p>The variable name of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The variable value of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static Options build(java.util.Map<String, ?> map) throws Exception {
            Options self = new Options();
            return TeaModel.build(map, self);
        }

        public Options setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Options setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DnsConfig extends TeaModel {
        /**
         * <p>The IP addresses of DNS servers.</p>
         */
        @NameInMap("NameServers")
        public java.util.List<String> nameServers;

        /**
         * <p>The options. Each option is a name-value pair. The value in the name-value pair is optional.</p>
         */
        @NameInMap("Options")
        public java.util.List<Options> options;

        /**
         * <p>The search domains of DNS servers.</p>
         */
        @NameInMap("Searches")
        public java.util.List<String> searches;

        public static DnsConfig build(java.util.Map<String, ?> map) throws Exception {
            DnsConfig self = new DnsConfig();
            return TeaModel.build(map, self);
        }

        public DnsConfig setNameServers(java.util.List<String> nameServers) {
            this.nameServers = nameServers;
            return this;
        }
        public java.util.List<String> getNameServers() {
            return this.nameServers;
        }

        public DnsConfig setOptions(java.util.List<Options> options) {
            this.options = options;
            return this;
        }
        public java.util.List<Options> getOptions() {
            return this.options;
        }

        public DnsConfig setSearches(java.util.List<String> searches) {
            this.searches = searches;
            return this;
        }
        public java.util.List<String> getSearches() {
            return this.searches;
        }

    }

    public static class Sysctls extends TeaModel {
        /**
         * <p>The name of the Sysctl parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel.msgmax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the Sysctl parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>65536</p>
         */
        @NameInMap("Value")
        public String value;

        public static Sysctls build(java.util.Map<String, ?> map) throws Exception {
            Sysctls self = new Sysctls();
            return TeaModel.build(map, self);
        }

        public Sysctls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Sysctls setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class EciSecurityContext extends TeaModel {
        /**
         * <p>sysctl parameters.</p>
         */
        @NameInMap("Sysctls")
        public java.util.List<Sysctls> sysctls;

        public static EciSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            EciSecurityContext self = new EciSecurityContext();
            return TeaModel.build(map, self);
        }

        public EciSecurityContext setSysctls(java.util.List<Sysctls> sysctls) {
            this.sysctls = sysctls;
            return this;
        }
        public java.util.List<Sysctls> getSysctls() {
            return this.sysctls;
        }

    }

    public static class Events extends TeaModel {
        /**
         * <p>The number of the events.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The start time of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <p>The end time of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <p>The event message.</p>
         * 
         * <strong>example:</strong>
         * <p>Started container</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The category to which the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test-xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The event name.</p>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The type of the event. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Warning</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static Events build(java.util.Map<String, ?> map) throws Exception {
            Events self = new Events();
            return TeaModel.build(map, self);
        }

        public Events setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public Events setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public Events setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public Events setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Events setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Events setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public Events setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HostAliases extends TeaModel {
        /**
         * <p>The information about the hosts.</p>
         */
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static HostAliases build(java.util.Map<String, ?> map) throws Exception {
            HostAliases self = new HostAliases();
            return TeaModel.build(map, self);
        }

        public HostAliases setHostnames(java.util.List<String> hostnames) {
            this.hostnames = hostnames;
            return this;
        }
        public java.util.List<String> getHostnames() {
            return this.hostnames;
        }

        public HostAliases setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class InitContainersCurrentState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         * 
         * <strong>example:</strong>
         * <p>working</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The event message.</p>
         * 
         * <strong>example:</strong>
         * <p>Created container</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the container is in this status.</p>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the container status.</p>
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
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The container status. Valid values:</p>
         * <ul>
         * <li>Waiting</li>
         * <li>Running</li>
         * <li>Terminated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        public static InitContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            InitContainersCurrentState self = new InitContainersCurrentState();
            return TeaModel.build(map, self);
        }

        public InitContainersCurrentState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public InitContainersCurrentState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public InitContainersCurrentState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public InitContainersCurrentState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InitContainersCurrentState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public InitContainersCurrentState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public InitContainersCurrentState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public InitContainersCurrentState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ValueFromFieldRef extends TeaModel {
        /**
         * <p>The path of the field. Only <code>status.podIP</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>status.podIP</p>
         */
        @NameInMap("FieldPath")
        public String fieldPath;

        public static ValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            ValueFromFieldRef self = new ValueFromFieldRef();
            return TeaModel.build(map, self);
        }

        public ValueFromFieldRef setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public String getFieldPath() {
            return this.fieldPath;
        }

    }

    public static class EnvironmentVarsValueFrom extends TeaModel {
        /**
         * <p>The specified fields.</p>
         */
        @NameInMap("FieldRef")
        public ValueFromFieldRef fieldRef;

        public static EnvironmentVarsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            EnvironmentVarsValueFrom self = new EnvironmentVarsValueFrom();
            return TeaModel.build(map, self);
        }

        public EnvironmentVarsValueFrom setFieldRef(ValueFromFieldRef fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }
        public ValueFromFieldRef getFieldRef() {
            return this.fieldRef;
        }

    }

    public static class InitContainersEnvironmentVars extends TeaModel {
        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The source of the environment variable value. This parameter has a value only when the Value parameter is left empty.</p>
         */
        @NameInMap("ValueFrom")
        public EnvironmentVarsValueFrom valueFrom;

        public static InitContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            InitContainersEnvironmentVars self = new InitContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public InitContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public InitContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public InitContainersEnvironmentVars setValueFrom(EnvironmentVarsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public EnvironmentVarsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class InitContainersPorts extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static InitContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            InitContainersPorts self = new InitContainersPorts();
            return TeaModel.build(map, self);
        }

        public InitContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public InitContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class InitContainersPreviousState extends TeaModel {
        /**
         * <p>The details of the container status.</p>
         * 
         * <strong>example:</strong>
         * <p>working</p>
         */
        @NameInMap("DetailStatus")
        public String detailStatus;

        /**
         * <p>The exit code of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time when the container stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-24T05:35:44Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The message about the container status.</p>
         * 
         * <strong>example:</strong>
         * <p>Started container</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The reason why the container is in this status.</p>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the container status.</p>
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
         * <p>2019-12-24T05:35:44Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The container status. Valid values: Waiting, Running, and Terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminated</p>
         */
        @NameInMap("State")
        public String state;

        public static InitContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            InitContainersPreviousState self = new InitContainersPreviousState();
            return TeaModel.build(map, self);
        }

        public InitContainersPreviousState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public InitContainersPreviousState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public InitContainersPreviousState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public InitContainersPreviousState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InitContainersPreviousState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public InitContainersPreviousState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public InitContainersPreviousState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public InitContainersPreviousState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class SecurityContextCapability extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Adds")
        public java.util.List<String> adds;

        public static SecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            SecurityContextCapability self = new SecurityContextCapability();
            return TeaModel.build(map, self);
        }

        public SecurityContextCapability setAdds(java.util.List<String> adds) {
            this.adds = adds;
            return this;
        }
        public java.util.List<String> getAdds() {
            return this.adds;
        }

    }

    public static class InitContainersSecurityContext extends TeaModel {
        /**
         * <p>The permissions specific to the processes in the container.</p>
         */
        @NameInMap("Capability")
        public SecurityContextCapability capability;

        /**
         * <p>Indicates whether permissions on the root file system are read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        /**
         * <p>The UID that is used to run the entry point of the container process.</p>
         * 
         * <strong>example:</strong>
         * <p>1557</p>
         */
        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static InitContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            InitContainersSecurityContext self = new InitContainersSecurityContext();
            return TeaModel.build(map, self);
        }

        public InitContainersSecurityContext setCapability(SecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public SecurityContextCapability getCapability() {
            return this.capability;
        }

        public InitContainersSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Boolean getReadOnlyRootFilesystem() {
            return this.readOnlyRootFilesystem;
        }

        public InitContainersSecurityContext setRunAsUser(Long runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }
        public Long getRunAsUser() {
            return this.runAsUser;
        }

    }

    public static class InitContainersVolumeMounts extends TeaModel {
        /**
         * <p>The directory of the volume that is mounted to the container. The data in this directory is overwritten by the data on the volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/share/</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The mount propagation setting of the volume. Mount propagation allows volumes that are mounted on one container to be shared with other containers in the same pod, or even with other pods on the same node. Valid values:</p>
         * <ul>
         * <li>None: The volume mount does not receive subsequent mounts that are performed on this volume or on the subdirectories of this volume.</li>
         * <li>HostToCotainer: The volume mount receives subsequent mounts that are performed on this volume or on the subdirectories of this volume.</li>
         * <li>Bidirectional: This value is similar to HostToCotainer. The volume mount receives subsequent mounts that are performed on this volume or on the subdirectories of this volume. In addition, all volume mounts that are performed on the container are propagated back to the host and all containers of all pods that use the same volume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("MountPropagation")
        public String mountPropagation;

        /**
         * <p>The name of the volume. The value of this parameter is the same as the name of the volume that you selected when you purchased the container.</p>
         * 
         * <strong>example:</strong>
         * <p>test-empty</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the volume is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static InitContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            InitContainersVolumeMounts self = new InitContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

        public InitContainersVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public InitContainersVolumeMounts setMountPropagation(String mountPropagation) {
            this.mountPropagation = mountPropagation;
            return this;
        }
        public String getMountPropagation() {
            return this.mountPropagation;
        }

        public InitContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InitContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class InitContainers extends TeaModel {
        /**
         * <p>The arguments that are passed to the startup commands of the container.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup commands of the containers.</p>
         */
        @NameInMap("Command")
        public java.util.List<String> command;

        /**
         * <p>The number of vCPUs that are allocated to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The current container status.</p>
         */
        @NameInMap("CurrentState")
        public InitContainersCurrentState currentState;

        /**
         * <p>The environment variables of the init container.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<InitContainersEnvironmentVars> environmentVars;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpu")
        public Integer gpu;

        /**
         * <p>The image of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The image pulling policy. Valid values:</p>
         * <ul>
         * <li>Always: Each time the instance is updated, image pulling is performed.</li>
         * <li>IfNotPresent: On-premises images are preferentially used. If no on-premises images are available, image pulling is performed.</li>
         * <li>Never: On-premises images are always used. Image pulling is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        /**
         * <p>The memory size of the init container. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>Init-xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The exposed port and protocol of the container.</p>
         */
        @NameInMap("Ports")
        public java.util.List<InitContainersPorts> ports;

        /**
         * <p>The previous state of the container.</p>
         */
        @NameInMap("PreviousState")
        public InitContainersPreviousState previousState;

        /**
         * <p>Indicates whether the container passed the readiness probe.</p>
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
         * <p>5</p>
         */
        @NameInMap("RestartCount")
        public Integer restartCount;

        /**
         * <p>The security context of the container.</p>
         */
        @NameInMap("SecurityContext")
        public InitContainersSecurityContext securityContext;

        /**
         * <p>The information about the volumes that are mounted to the init container.</p>
         */
        @NameInMap("VolumeMounts")
        public java.util.List<InitContainersVolumeMounts> volumeMounts;

        /**
         * <p>The working directory of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/test</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static InitContainers build(java.util.Map<String, ?> map) throws Exception {
            InitContainers self = new InitContainers();
            return TeaModel.build(map, self);
        }

        public InitContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public InitContainers setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public InitContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public InitContainers setCurrentState(InitContainersCurrentState currentState) {
            this.currentState = currentState;
            return this;
        }
        public InitContainersCurrentState getCurrentState() {
            return this.currentState;
        }

        public InitContainers setEnvironmentVars(java.util.List<InitContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<InitContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public InitContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public InitContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public InitContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public InitContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public InitContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InitContainers setPorts(java.util.List<InitContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<InitContainersPorts> getPorts() {
            return this.ports;
        }

        public InitContainers setPreviousState(InitContainersPreviousState previousState) {
            this.previousState = previousState;
            return this;
        }
        public InitContainersPreviousState getPreviousState() {
            return this.previousState;
        }

        public InitContainers setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public InitContainers setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public InitContainers setSecurityContext(InitContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public InitContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public InitContainers setVolumeMounts(java.util.List<InitContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<InitContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public InitContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class Tags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test-xh</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ConfigFileVolumeConfigFileToPaths extends TeaModel {
        /**
         * <p>The content of the ConfigFile volume. Maximum size: 32 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>hello world</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The relative path of the ConfigFile volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/</p>
         */
        @NameInMap("Path")
        public String path;

        public static ConfigFileVolumeConfigFileToPaths build(java.util.Map<String, ?> map) throws Exception {
            ConfigFileVolumeConfigFileToPaths self = new ConfigFileVolumeConfigFileToPaths();
            return TeaModel.build(map, self);
        }

        public ConfigFileVolumeConfigFileToPaths setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ConfigFileVolumeConfigFileToPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class Volumes extends TeaModel {
        /**
         * <p>The path of the ConfigFile volume.</p>
         */
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        /**
         * <p>The ID of the disk when you set Type to DiskVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>d-xxxx</p>
         */
        @NameInMap("DiskVolumeDiskId")
        public String diskVolumeDiskId;

        /**
         * <p>The file system type of the disk volume.</p>
         * 
         * <strong>example:</strong>
         * <p>xfs</p>
         */
        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        /**
         * <p>The storage media for the emptyDir volume. This parameter is empty by default, indicating that the node file system is used as the storage media. Valid values:</p>
         * <ul>
         * <li>Memory: Memory is used as the storage media.</li>
         * <li>LocalRaid0: Local disks are formed into RAID 0. This value is valid only if an elastic container instance that has local disks mounted is created. For more information, see <a href="https://help.aliyun.com/document_detail/114664.html">Create an elastic container instance that has local disks mounted</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Memory</p>
         */
        @NameInMap("EmptyDirVolumeMedium")
        public String emptyDirVolumeMedium;

        /**
         * <p>The storage size of the emptyDir volume.</p>
         * 
         * <strong>example:</strong>
         * <p>256Mi</p>
         */
        @NameInMap("EmptyDirVolumeSizeLimit")
        public String emptyDirVolumeSizeLimit;

        /**
         * <p>The name of the driver when you set the Type parameter to FlexVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>flexvolume</p>
         */
        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        /**
         * <p>The file system type when you set the Type parameter to FlexVolume. The default value varies based on the script of the FlexVolume plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>ntfs</p>
         */
        @NameInMap("FlexVolumeFsType")
        public String flexVolumeFsType;

        /**
         * <p>The options when you set the Type parameter to FlexVolume.</p>
         * 
         * <strong>example:</strong>
         * <p>[nolock,tcp,noresvport]</p>
         */
        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        /**
         * <p>The path of the NFS volume.</p>
         * 
         * <strong>example:</strong>
         * <p>/eci</p>
         */
        @NameInMap("NFSVolumePath")
        public String NFSVolumePath;

        /**
         * <p>Indicates whether the NFS volume is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NFSVolumeReadOnly")
        public Boolean NFSVolumeReadOnly;

        /**
         * <p>The address of the NFS server.</p>
         * 
         * <strong>example:</strong>
         * <p>0eafxxxxx-xxxxx.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("NFSVolumeServer")
        public String NFSVolumeServer;

        /**
         * <p>The volume name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-empty</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the volume. Valid values:</p>
         * <ul>
         * <li>EmptyDirVolume</li>
         * <li>NFSVolume</li>
         * <li>ConfigFileVolume</li>
         * <li>FlexVolume</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EmptyDirVolume</p>
         */
        @NameInMap("Type")
        public String type;

        public static Volumes build(java.util.Map<String, ?> map) throws Exception {
            Volumes self = new Volumes();
            return TeaModel.build(map, self);
        }

        public Volumes setConfigFileVolumeConfigFileToPaths(java.util.List<ConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
            this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            return this;
        }
        public java.util.List<ConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        public Volumes setDiskVolumeDiskId(String diskVolumeDiskId) {
            this.diskVolumeDiskId = diskVolumeDiskId;
            return this;
        }
        public String getDiskVolumeDiskId() {
            return this.diskVolumeDiskId;
        }

        public Volumes setDiskVolumeFsType(String diskVolumeFsType) {
            this.diskVolumeFsType = diskVolumeFsType;
            return this;
        }
        public String getDiskVolumeFsType() {
            return this.diskVolumeFsType;
        }

        public Volumes setEmptyDirVolumeMedium(String emptyDirVolumeMedium) {
            this.emptyDirVolumeMedium = emptyDirVolumeMedium;
            return this;
        }
        public String getEmptyDirVolumeMedium() {
            return this.emptyDirVolumeMedium;
        }

        public Volumes setEmptyDirVolumeSizeLimit(String emptyDirVolumeSizeLimit) {
            this.emptyDirVolumeSizeLimit = emptyDirVolumeSizeLimit;
            return this;
        }
        public String getEmptyDirVolumeSizeLimit() {
            return this.emptyDirVolumeSizeLimit;
        }

        public Volumes setFlexVolumeDriver(String flexVolumeDriver) {
            this.flexVolumeDriver = flexVolumeDriver;
            return this;
        }
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        public Volumes setFlexVolumeFsType(String flexVolumeFsType) {
            this.flexVolumeFsType = flexVolumeFsType;
            return this;
        }
        public String getFlexVolumeFsType() {
            return this.flexVolumeFsType;
        }

        public Volumes setFlexVolumeOptions(String flexVolumeOptions) {
            this.flexVolumeOptions = flexVolumeOptions;
            return this;
        }
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        public Volumes setNFSVolumePath(String NFSVolumePath) {
            this.NFSVolumePath = NFSVolumePath;
            return this;
        }
        public String getNFSVolumePath() {
            return this.NFSVolumePath;
        }

        public Volumes setNFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
            this.NFSVolumeReadOnly = NFSVolumeReadOnly;
            return this;
        }
        public Boolean getNFSVolumeReadOnly() {
            return this.NFSVolumeReadOnly;
        }

        public Volumes setNFSVolumeServer(String NFSVolumeServer) {
            this.NFSVolumeServer = NFSVolumeServer;
            return this;
        }
        public String getNFSVolumeServer() {
            return this.NFSVolumeServer;
        }

        public Volumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public Volumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ContainerGroups extends TeaModel {
        /**
         * <p>The computing power type of the elastic container instance. Valid values:</p>
         * <ul>
         * <li>economy: economic computing power.</li>
         * <li>general: general-purpose computing power.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>economy</p>
         */
        @NameInMap("ComputeCategory")
        public String computeCategory;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eci-bp1jrgfqqy54kg5hc****</p>
         */
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContainerGroupName")
        public String containerGroupName;

        /**
         * <p>The information about containers in the elastic container instance.</p>
         */
        @NameInMap("Containers")
        public java.util.List<Containers> containers;

        /**
         * <p>The number of vCPUs that are allocated to the elastic container instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The time when the instance was created. The time follows the RFC 3339 standard. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Discount")
        public Integer discount;

        /**
         * <p>The Domain Name System (DNS) settings.</p>
         */
        @NameInMap("DnsConfig")
        public DnsConfig dnsConfig;

        /**
         * <p>The Domain Name System (DNS) policy. Valid values:</p>
         * <ul>
         * <li>None: uses the DNS that is specified by DnsConfig.</li>
         * <li>Default: uses the DNS that is specified for the runtime environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("DnsPolicy")
        public String dnsPolicy;

        /**
         * <p>The security context of the elastic container instance.</p>
         */
        @NameInMap("EciSecurityContext")
        public EciSecurityContext eciSecurityContext;

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp14rzqi6fd8satm****</p>
         */
        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        /**
         * <p>The size of the temporary storage space. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("EphemeralStorage")
        public Integer ephemeralStorage;

        /**
         * <p>The events of the elastic container instance. A maximum of 50 events can be returned.</p>
         */
        @NameInMap("Events")
        public java.util.List<Events> events;

        /**
         * <p>The time when the elastic container instance failed to run due to overdue payments. The time follows the RFC 3339 standard. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The time when the instance failed to run. The time follows the RFC 3339 standard. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-02T15:00:00Z</p>
         */
        @NameInMap("FailedTime")
        public String failedTime;

        /**
         * <p>The hostnames and IP addresses for a container that are added to the hosts file of the elastic container instance.</p>
         */
        @NameInMap("HostAliases")
        public java.util.List<HostAliases> hostAliases;

        /**
         * <p>The information about the init containers.</p>
         */
        @NameInMap("InitContainers")
        public java.util.List<InitContainers> initContainers;

        /**
         * <p>The instance type of the specified Elastic Compute Service (ECS) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IPv6 address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:4:4:4:4:4:4</p>
         */
        @NameInMap("Ipv6Address")
        public String ipv6Address;

        /**
         * <p>The memory size of the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the instance RAM role. The elastic container instance and the ECS instance share a RAM role. For more information, see <a href="https://help.aliyun.com/document_detail/61178.html">Use an instance RAM role by calling API operations</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ram:PassRole</p>
         */
        @NameInMap("RamRoleName")
        public String ramRoleName;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-8db03793gfrz****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The restart policy of the elastic container instance. Valid values:</p>
         * <ul>
         * <li>Never: Never restarts the instance if a container in the instance exits upon termination.</li>
         * <li>Always: Always restarts the instance if a container in the instance exits upon termination.</li>
         * <li>OnFailure: Restarts the instance only if a container in the instance exists upon failure with a status code of non-zero.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Never</p>
         */
        @NameInMap("RestartPolicy")
        public String restartPolicy;

        /**
         * <p>The ID of the security group to which the instances belong.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp12ujq5zpxuyjfo3o8r</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The maximum hourly price for the preemptible elastic container instance.</p>
         * <p>This parameter is returned only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>0.025</p>
         */
        @NameInMap("SpotPriceLimit")
        public Double spotPriceLimit;

        /**
         * <p>The bid policy for the instance. Default value: NoSpot. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is a preemptible instance that has a user-defined maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>Pending: The instance is being started.</li>
         * <li>Running: The instance is running.</li>
         * <li>Succeeded: The instance successfully runs.</li>
         * <li>Failed: The instance fails to run.</li>
         * <li>Scheduling: The instance is being created.</li>
         * <li>ScheduleFailed: The instance fails to be created.</li>
         * <li>Restarting: The instance is being restarted.</li>
         * <li>Updating: The instance is being updated.</li>
         * <li>Terminating: The instance is being terminated.</li>
         * <li>Expired: The instance is expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when all containers exited on success. The time follows the RFC 3339 standard. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-11T04:33:42Z</p>
         */
        @NameInMap("SucceededTime")
        public String succeededTime;

        /**
         * <p>The tags that are added to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<Tags> tags;

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxx</p>
         */
        @NameInMap("TenantEniInstanceId")
        public String tenantEniInstanceId;

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.XX.XX</p>
         */
        @NameInMap("TenantEniIp")
        public String tenantEniIp;

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxx</p>
         */
        @NameInMap("TenantSecurityGroupId")
        public String tenantSecurityGroupId;

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("TenantVSwitchId")
        public String tenantVSwitchId;

        /**
         * <p>The ID of the vSwitch to which the instance is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1vzjjflab6wvjox****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The information about the volumes.</p>
         */
        @NameInMap("Volumes")
        public java.util.List<Volumes> volumes;

        /**
         * <p>The ID of the VPC to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-1vzjjflab6wvjox****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ContainerGroups build(java.util.Map<String, ?> map) throws Exception {
            ContainerGroups self = new ContainerGroups();
            return TeaModel.build(map, self);
        }

        public ContainerGroups setComputeCategory(String computeCategory) {
            this.computeCategory = computeCategory;
            return this;
        }
        public String getComputeCategory() {
            return this.computeCategory;
        }

        public ContainerGroups setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public ContainerGroups setContainerGroupName(String containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }
        public String getContainerGroupName() {
            return this.containerGroupName;
        }

        public ContainerGroups setContainers(java.util.List<Containers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<Containers> getContainers() {
            return this.containers;
        }

        public ContainerGroups setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public ContainerGroups setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ContainerGroups setDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }
        public Integer getDiscount() {
            return this.discount;
        }

        public ContainerGroups setDnsConfig(DnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }
        public DnsConfig getDnsConfig() {
            return this.dnsConfig;
        }

        public ContainerGroups setDnsPolicy(String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }
        public String getDnsPolicy() {
            return this.dnsPolicy;
        }

        public ContainerGroups setEciSecurityContext(EciSecurityContext eciSecurityContext) {
            this.eciSecurityContext = eciSecurityContext;
            return this;
        }
        public EciSecurityContext getEciSecurityContext() {
            return this.eciSecurityContext;
        }

        public ContainerGroups setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public ContainerGroups setEphemeralStorage(Integer ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Integer getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        public ContainerGroups setEvents(java.util.List<Events> events) {
            this.events = events;
            return this;
        }
        public java.util.List<Events> getEvents() {
            return this.events;
        }

        public ContainerGroups setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ContainerGroups setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

        public ContainerGroups setHostAliases(java.util.List<HostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public java.util.List<HostAliases> getHostAliases() {
            return this.hostAliases;
        }

        public ContainerGroups setInitContainers(java.util.List<InitContainers> initContainers) {
            this.initContainers = initContainers;
            return this;
        }
        public java.util.List<InitContainers> getInitContainers() {
            return this.initContainers;
        }

        public ContainerGroups setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ContainerGroups setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ContainerGroups setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ContainerGroups setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public ContainerGroups setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ContainerGroups setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public ContainerGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ContainerGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ContainerGroups setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public ContainerGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ContainerGroups setSpotPriceLimit(Double spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Double getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public ContainerGroups setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public ContainerGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ContainerGroups setSucceededTime(String succeededTime) {
            this.succeededTime = succeededTime;
            return this;
        }
        public String getSucceededTime() {
            return this.succeededTime;
        }

        public ContainerGroups setTags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public ContainerGroups setTenantEniInstanceId(String tenantEniInstanceId) {
            this.tenantEniInstanceId = tenantEniInstanceId;
            return this;
        }
        public String getTenantEniInstanceId() {
            return this.tenantEniInstanceId;
        }

        public ContainerGroups setTenantEniIp(String tenantEniIp) {
            this.tenantEniIp = tenantEniIp;
            return this;
        }
        public String getTenantEniIp() {
            return this.tenantEniIp;
        }

        public ContainerGroups setTenantSecurityGroupId(String tenantSecurityGroupId) {
            this.tenantSecurityGroupId = tenantSecurityGroupId;
            return this;
        }
        public String getTenantSecurityGroupId() {
            return this.tenantSecurityGroupId;
        }

        public ContainerGroups setTenantVSwitchId(String tenantVSwitchId) {
            this.tenantVSwitchId = tenantVSwitchId;
            return this;
        }
        public String getTenantVSwitchId() {
            return this.tenantVSwitchId;
        }

        public ContainerGroups setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ContainerGroups setVolumes(java.util.List<Volumes> volumes) {
            this.volumes = volumes;
            return this;
        }
        public java.util.List<Volumes> getVolumes() {
            return this.volumes;
        }

        public ContainerGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ContainerGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
