// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContainerGroups")
    public java.util.List<DescribeContainerGroupsResponseBodyContainerGroups> containerGroups;

    public static DescribeContainerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsResponseBody self = new DescribeContainerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContainerGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeContainerGroupsResponseBody setContainerGroups(java.util.List<DescribeContainerGroupsResponseBodyContainerGroups> containerGroups) {
        this.containerGroups = containerGroups;
        return this;
    }
    public java.util.List<DescribeContainerGroupsResponseBodyContainerGroups> getContainerGroups() {
        return this.containerGroups;
    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsHostAliases extends TeaModel {
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

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

    public static class DescribeContainerGroupsResponseBodyContainerGroupsTags extends TeaModel {
        @NameInMap("Key")
        public String key;

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

    public static class DescribeContainerGroupsResponseBodyContainerGroupsEvents extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        public static DescribeContainerGroupsResponseBodyContainerGroupsEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsEvents self = new DescribeContainerGroupsResponseBodyContainerGroupsEvents();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Host")
        public String host;

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

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
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

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe extends TeaModel {
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        @NameInMap("TcpSocket")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket tcpSocket;

        @NameInMap("Execs")
        public java.util.List<String> execs;

        @NameInMap("HttpGet")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet httpGet;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setTcpSocket(DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setExecs(java.util.List<String> execs) {
            this.execs = execs;
            return this;
        }
        public java.util.List<String> getExecs() {
            return this.execs;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setHttpGet(DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Name")
        public String name;

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

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("Signal")
        public Integer signal;

        @NameInMap("ExitCode")
        public Integer exitCode;

        @NameInMap("Reason")
        public String reason;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("Signal")
        public Integer signal;

        @NameInMap("ExitCode")
        public Integer exitCode;

        @NameInMap("Reason")
        public String reason;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability extends TeaModel {
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
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        @NameInMap("Capability")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability capability;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext();
            return TeaModel.build(map, self);
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

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext setCapability(DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVarsValueFromFieldRef extends TeaModel {
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
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

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

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Host")
        public String host;

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

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
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

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe extends TeaModel {
        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        @NameInMap("TcpSocket")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket tcpSocket;

        @NameInMap("Execs")
        public java.util.List<String> execs;

        @NameInMap("HttpGet")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet httpGet;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe self = new DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Integer getSuccessThreshold() {
            return this.successThreshold;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Integer getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Integer getFailureThreshold() {
            return this.failureThreshold;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setTcpSocket(DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setExecs(java.util.List<String> execs) {
            this.execs = execs;
            return this;
        }
        public java.util.List<String> getExecs() {
            return this.execs;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setHttpGet(DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbeHttpGet getHttpGet() {
            return this.httpGet;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsContainers extends TeaModel {
        @NameInMap("LivenessProbe")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe livenessProbe;

        @NameInMap("Commands")
        public java.util.List<String> commands;

        @NameInMap("VolumeMounts")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts> volumeMounts;

        @NameInMap("Args")
        public java.util.List<String> args;

        @NameInMap("Image")
        public String image;

        @NameInMap("Ports")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts> ports;

        @NameInMap("RestartCount")
        public Integer restartCount;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("PreviousState")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState previousState;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("CurrentState")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState currentState;

        @NameInMap("Ready")
        public Boolean ready;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("SecurityContext")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext securityContext;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("Name")
        public String name;

        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars> environmentVars;

        @NameInMap("ReadinessProbe")
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe readinessProbe;

        public static DescribeContainerGroupsResponseBodyContainerGroupsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsContainers self = new DescribeContainerGroupsResponseBodyContainerGroupsContainers();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setLivenessProbe(DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setVolumeMounts(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setPorts(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersPorts> getPorts() {
            return this.ports;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setStdinOnce(Boolean stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }
        public Boolean getStdinOnce() {
            return this.stdinOnce;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setPreviousState(DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState previousState) {
            this.previousState = previousState;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersPreviousState getPreviousState() {
            return this.previousState;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setTty(Boolean tty) {
            this.tty = tty;
            return this;
        }
        public Boolean getTty() {
            return this.tty;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setCurrentState(DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState currentState) {
            this.currentState = currentState;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersCurrentState getCurrentState() {
            return this.currentState;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setSecurityContext(DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setStdin(Boolean stdin) {
            this.stdin = stdin;
            return this;
        }
        public Boolean getStdin() {
            return this.stdin;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setEnvironmentVars(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsContainers setReadinessProbe(DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsContainersReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Name")
        public String name;

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

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("Signal")
        public Integer signal;

        @NameInMap("ExitCode")
        public Integer exitCode;

        @NameInMap("Reason")
        public String reason;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("Signal")
        public Integer signal;

        @NameInMap("ExitCode")
        public Integer exitCode;

        @NameInMap("Reason")
        public String reason;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setDetailStatus(String detailStatus) {
            this.detailStatus = detailStatus;
            return this;
        }
        public String getDetailStatus() {
            return this.detailStatus;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setSignal(Integer signal) {
            this.signal = signal;
            return this;
        }
        public Integer getSignal() {
            return this.signal;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability extends TeaModel {
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
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        @NameInMap("Capability")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability capability;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext();
            return TeaModel.build(map, self);
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

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext setCapability(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability capability) {
            this.capability = capability;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContextCapability getCapability() {
            return this.capability;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef extends TeaModel {
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
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

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

    public static class DescribeContainerGroupsResponseBodyContainerGroupsInitContainers extends TeaModel {
        @NameInMap("VolumeMounts")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts> volumeMounts;

        @NameInMap("Args")
        public java.util.List<String> args;

        @NameInMap("Image")
        public String image;

        @NameInMap("Ports")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts> ports;

        @NameInMap("RestartCount")
        public Integer restartCount;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("PreviousState")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState previousState;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("CurrentState")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersCurrentState currentState;

        @NameInMap("Command")
        public java.util.List<String> command;

        @NameInMap("Ready")
        public Boolean ready;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("SecurityContext")
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext securityContext;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars> environmentVars;

        public static DescribeContainerGroupsResponseBodyContainerGroupsInitContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsInitContainers self = new DescribeContainerGroupsResponseBodyContainerGroupsInitContainers();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setVolumeMounts(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setPorts(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPorts> getPorts() {
            return this.ports;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setRestartCount(Integer restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Integer getRestartCount() {
            return this.restartCount;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setImagePullPolicy(String imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }
        public String getImagePullPolicy() {
            return this.imagePullPolicy;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setPreviousState(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState previousState) {
            this.previousState = previousState;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersPreviousState getPreviousState() {
            return this.previousState;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
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

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setSecurityContext(DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainersSecurityContext getSecurityContext() {
            return this.securityContext;
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

        public DescribeContainerGroupsResponseBodyContainerGroupsInitContainers setEnvironmentVars(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions self = new DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig extends TeaModel {
        @NameInMap("Searches")
        public java.util.List<String> searches;

        @NameInMap("Options")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions> options;

        @NameInMap("NameServers")
        public java.util.List<String> nameServers;

        public static DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig self = new DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig setSearches(java.util.List<String> searches) {
            this.searches = searches;
            return this;
        }
        public java.util.List<String> getSearches() {
            return this.searches;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig setOptions(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsDnsConfigOptions> getOptions() {
            return this.options;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig setNameServers(java.util.List<String> nameServers) {
            this.nameServers = nameServers;
            return this;
        }
        public java.util.List<String> getNameServers() {
            return this.nameServers;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Content")
        public String content;

        public static DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths self = new DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsVolumes extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DiskVolumeDiskId")
        public String diskVolumeDiskId;

        @NameInMap("NFSVolumeReadOnly")
        public Boolean NFSVolumeReadOnly;

        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        @NameInMap("FlexVolumeFsType")
        public String flexVolumeFsType;

        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        @NameInMap("NFSVolumeServer")
        public String NFSVolumeServer;

        @NameInMap("NFSVolumePath")
        public String NFSVolumePath;

        @NameInMap("Name")
        public String name;

        public static DescribeContainerGroupsResponseBodyContainerGroupsVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsVolumes self = new DescribeContainerGroupsResponseBodyContainerGroupsVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setDiskVolumeDiskId(String diskVolumeDiskId) {
            this.diskVolumeDiskId = diskVolumeDiskId;
            return this;
        }
        public String getDiskVolumeDiskId() {
            return this.diskVolumeDiskId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setNFSVolumeReadOnly(Boolean NFSVolumeReadOnly) {
            this.NFSVolumeReadOnly = NFSVolumeReadOnly;
            return this;
        }
        public Boolean getNFSVolumeReadOnly() {
            return this.NFSVolumeReadOnly;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setConfigFileVolumeConfigFileToPaths(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths) {
            this.configFileVolumeConfigFileToPaths = configFileVolumeConfigFileToPaths;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> getConfigFileVolumeConfigFileToPaths() {
            return this.configFileVolumeConfigFileToPaths;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setFlexVolumeFsType(String flexVolumeFsType) {
            this.flexVolumeFsType = flexVolumeFsType;
            return this;
        }
        public String getFlexVolumeFsType() {
            return this.flexVolumeFsType;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setFlexVolumeDriver(String flexVolumeDriver) {
            this.flexVolumeDriver = flexVolumeDriver;
            return this;
        }
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setDiskVolumeFsType(String diskVolumeFsType) {
            this.diskVolumeFsType = diskVolumeFsType;
            return this;
        }
        public String getDiskVolumeFsType() {
            return this.diskVolumeFsType;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setFlexVolumeOptions(String flexVolumeOptions) {
            this.flexVolumeOptions = flexVolumeOptions;
            return this;
        }
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setNFSVolumeServer(String NFSVolumeServer) {
            this.NFSVolumeServer = NFSVolumeServer;
            return this;
        }
        public String getNFSVolumeServer() {
            return this.NFSVolumeServer;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setNFSVolumePath(String NFSVolumePath) {
            this.NFSVolumePath = NFSVolumePath;
            return this;
        }
        public String getNFSVolumePath() {
            return this.NFSVolumePath;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls self = new DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContextSysctls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext extends TeaModel {
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

    public static class DescribeContainerGroupsResponseBodyContainerGroups extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("TenantSecurityGroupId")
        public String tenantSecurityGroupId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("HostAliases")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsHostAliases> hostAliases;

        @NameInMap("Tags")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsTags> tags;

        @NameInMap("Events")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEvents> events;

        @NameInMap("SucceededTime")
        public String succeededTime;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("EphemeralStorage")
        public Integer ephemeralStorage;

        @NameInMap("TenantEniInstanceId")
        public String tenantEniInstanceId;

        @NameInMap("Discount")
        public Integer discount;

        @NameInMap("RestartPolicy")
        public String restartPolicy;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("TenantVSwitchId")
        public String tenantVSwitchId;

        @NameInMap("Containers")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainers> containers;

        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        @NameInMap("InitContainers")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainers> initContainers;

        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ipv6Address")
        public String ipv6Address;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DnsConfig")
        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig dnsConfig;

        @NameInMap("Volumes")
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumes> volumes;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ContainerGroupName")
        public String containerGroupName;

        @NameInMap("EciSecurityContext")
        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext eciSecurityContext;

        @NameInMap("FailedTime")
        public String failedTime;

        public static DescribeContainerGroupsResponseBodyContainerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseBodyContainerGroups self = new DescribeContainerGroupsResponseBodyContainerGroups();
            return TeaModel.build(map, self);
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTenantSecurityGroupId(String tenantSecurityGroupId) {
            this.tenantSecurityGroupId = tenantSecurityGroupId;
            return this;
        }
        public String getTenantSecurityGroupId() {
            return this.tenantSecurityGroupId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setHostAliases(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsHostAliases> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsHostAliases> getHostAliases() {
            return this.hostAliases;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTags(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsTags> getTags() {
            return this.tags;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setEvents(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsEvents> getEvents() {
            return this.events;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setSucceededTime(String succeededTime) {
            this.succeededTime = succeededTime;
            return this;
        }
        public String getSucceededTime() {
            return this.succeededTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setEphemeralStorage(Integer ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Integer getEphemeralStorage() {
            return this.ephemeralStorage;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTenantEniInstanceId(String tenantEniInstanceId) {
            this.tenantEniInstanceId = tenantEniInstanceId;
            return this;
        }
        public String getTenantEniInstanceId() {
            return this.tenantEniInstanceId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }
        public Integer getDiscount() {
            return this.discount;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setTenantVSwitchId(String tenantVSwitchId) {
            this.tenantVSwitchId = tenantVSwitchId;
            return this;
        }
        public String getTenantVSwitchId() {
            return this.tenantVSwitchId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setContainers(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsContainers> getContainers() {
            return this.containers;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setEniInstanceId(String eniInstanceId) {
            this.eniInstanceId = eniInstanceId;
            return this;
        }
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setInitContainers(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainers> initContainers) {
            this.initContainers = initContainers;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsInitContainers> getInitContainers() {
            return this.initContainers;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
            return this;
        }
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setIpv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setDnsConfig(DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsDnsConfig getDnsConfig() {
            return this.dnsConfig;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setVolumes(java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumes> volumes) {
            this.volumes = volumes;
            return this;
        }
        public java.util.List<DescribeContainerGroupsResponseBodyContainerGroupsVolumes> getVolumes() {
            return this.volumes;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setContainerGroupName(String containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }
        public String getContainerGroupName() {
            return this.containerGroupName;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setEciSecurityContext(DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext eciSecurityContext) {
            this.eciSecurityContext = eciSecurityContext;
            return this;
        }
        public DescribeContainerGroupsResponseBodyContainerGroupsEciSecurityContext getEciSecurityContext() {
            return this.eciSecurityContext;
        }

        public DescribeContainerGroupsResponseBodyContainerGroups setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

}
