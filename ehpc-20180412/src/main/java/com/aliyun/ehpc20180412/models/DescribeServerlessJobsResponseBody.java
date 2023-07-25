// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeServerlessJobsResponseBody extends TeaModel {
    @NameInMap("JobInfos")
    public java.util.List<DescribeServerlessJobsResponseBodyJobInfos> jobInfos;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("IndexEnd")
        public Long indexEnd;

        @NameInMap("IndexStart")
        public Long indexStart;

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
        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Signal")
        public Long signal;

        @NameInMap("StartTime")
        public String startTime;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

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
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Long port;

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
        @NameInMap("Host")
        public String host;

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
        @NameInMap("Execs")
        public java.util.List<String> execs;

        @NameInMap("FailureThreshold")
        public Long failureThreshold;

        /**
         * <p>HttpGet。</p>
         */
        @NameInMap("HttpGet")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Long initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Long periodSeconds;

        @NameInMap("SuccessThreshold")
        public Long successThreshold;

        /**
         * <p>TcpSocket。</p>
         */
        @NameInMap("TcpSocket")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbeTcpSocket tcpSocket;

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
        @NameInMap("Port")
        public Long port;

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
        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Signal")
        public Long signal;

        @NameInMap("StartTime")
        public String startTime;

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
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Long port;

        /**
         * <p>HTTP／HTTPS。</p>
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
         * <p>Host。</p>
         */
        @NameInMap("Host")
        public String host;

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
        @NameInMap("Execs")
        public java.util.List<String> execs;

        @NameInMap("FailureThreshold")
        public Long failureThreshold;

        @NameInMap("HttpGet")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Long initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Long periodSeconds;

        @NameInMap("SuccessThreshold")
        public Long successThreshold;

        @NameInMap("TcpSocket")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbeTcpSocket tcpSocket;

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
        @NameInMap("Capability")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

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
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("MountPropagation")
        public String mountPropagation;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

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
        @NameInMap("Args")
        public java.util.List<String> args;

        @NameInMap("Commands")
        public java.util.List<String> commands;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("CurrentState")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersCurrentState currentState;

        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersEnvironmentVars> environmentVars;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("LivenessProbe")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersLivenessProbe livenessProbe;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Ports")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPorts> ports;

        @NameInMap("PreviousState")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersPreviousState previousState;

        @NameInMap("ReadinessProbe")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersReadinessProbe readinessProbe;

        @NameInMap("Ready")
        public Boolean ready;

        @NameInMap("RestartCount")
        public Integer restartCount;

        @NameInMap("SecurityContext")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersSecurityContext securityContext;

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("VolumeMounts")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainersVolumeMounts> volumeMounts;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("NameServers")
        public java.util.List<String> nameServers;

        @NameInMap("Options")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfigOptions> options;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

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
        @NameInMap("Hostnames")
        public java.util.List<String> hostnames;

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
        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Signal")
        public Long signal;

        @NameInMap("StartTime")
        public String startTime;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

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
        @NameInMap("Port")
        public Long port;

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
        @NameInMap("DetailStatus")
        public String detailStatus;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Signal")
        public Long signal;

        @NameInMap("StartTime")
        public String startTime;

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
        @NameInMap("Capability")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

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
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("MountPropagation")
        public String mountPropagation;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Args")
        public java.util.List<String> args;

        @NameInMap("Command")
        public java.util.List<String> command;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("CurrentState")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersCurrentState currentState;

        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersEnvironmentVars> environmentVars;

        @NameInMap("Gpu")
        public Long gpu;

        @NameInMap("Image")
        public String image;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Ports")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPorts> ports;

        @NameInMap("PreviousState")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersPreviousState previousState;

        @NameInMap("Ready")
        public Boolean ready;

        @NameInMap("RestartCount")
        public Long restartCount;

        @NameInMap("SecurityContext")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersSecurityContext securityContext;

        @NameInMap("VolumeMounts")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainersVolumeMounts> volumeMounts;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Content")
        public String content;

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
        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        @NameInMap("DiskVolumeDiskId")
        public String diskVolumeDiskId;

        @NameInMap("DiskVolumeFsType")
        public String diskVolumeFsType;

        @NameInMap("EmptyDirVolumeMedium")
        public String emptyDirVolumeMedium;

        @NameInMap("EmptyDirVolumeSizeLimit")
        public String emptyDirVolumeSizeLimit;

        @NameInMap("FlexVolumeDriver")
        public String flexVolumeDriver;

        @NameInMap("FlexVolumeFsType")
        public String flexVolumeFsType;

        @NameInMap("FlexVolumeOptions")
        public String flexVolumeOptions;

        @NameInMap("NFSVolumePath")
        public String NFSVolumePath;

        @NameInMap("NFSVolumeReadOnly")
        public Boolean NFSVolumeReadOnly;

        @NameInMap("NFSVolumeServer")
        public String NFSVolumeServer;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("ContainerGroupId")
        public String containerGroupId;

        @NameInMap("ContainerGroupName")
        public String containerGroupName;

        @NameInMap("Containers")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsContainers> containers;

        @NameInMap("Cpu")
        public Float cpu;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Discount")
        public Long discount;

        @NameInMap("DnsConfig")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsDnsConfig dnsConfig;

        @NameInMap("EciSecurityContext")
        public DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEciSecurityContext eciSecurityContext;

        @NameInMap("EniInstanceId")
        public String eniInstanceId;

        @NameInMap("EphemeralStorage")
        public Long ephemeralStorage;

        @NameInMap("Events")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsEvents> events;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("FailedTime")
        public String failedTime;

        @NameInMap("HostAliases")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsHostAliases> hostAliases;

        @NameInMap("InitContainers")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsInitContainers> initContainers;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ipv6Address")
        public String ipv6Address;

        @NameInMap("Memory")
        public Float memory;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RestartPolicy")
        public String restartPolicy;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("Status")
        public String status;

        @NameInMap("SucceededTime")
        public String succeededTime;

        @NameInMap("Tags")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsTags> tags;

        @NameInMap("TenantEniInstanceId")
        public String tenantEniInstanceId;

        @NameInMap("TenantEniIp")
        public String tenantEniIp;

        @NameInMap("TenantSecurityGroupId")
        public String tenantSecurityGroupId;

        @NameInMap("TenantVSwitchId")
        public String tenantVSwitchId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Volumes")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroupsVolumes> volumes;

        @NameInMap("VpcId")
        public String vpcId;

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
        @NameInMap("ArrayProperties")
        public DescribeServerlessJobsResponseBodyJobInfosArrayProperties arrayProperties;

        @NameInMap("ContainerGroups")
        public java.util.List<DescribeServerlessJobsResponseBodyJobInfosContainerGroups> containerGroups;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("IsArrayJob")
        public Boolean isArrayJob;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("SubmitTime")
        public Long submitTime;

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
