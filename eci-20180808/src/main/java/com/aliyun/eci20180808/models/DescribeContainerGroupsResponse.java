// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("ContainerGroups")
    @Validation(required = true)
    public java.util.List<DescribeContainerGroupsResponseContainerGroups> containerGroups;

    public static DescribeContainerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupsResponse self = new DescribeContainerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeContainerGroupsResponseContainerGroupsTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeContainerGroupsResponseContainerGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsTags self = new DescribeContainerGroupsResponseContainerGroupsTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsEvents extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("FirstTimestamp")
        @Validation(required = true)
        public String firstTimestamp;

        @NameInMap("LastTimestamp")
        @Validation(required = true)
        public String lastTimestamp;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        public static DescribeContainerGroupsResponseContainerGroupsEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsEvents self = new DescribeContainerGroupsResponseContainerGroupsEvents();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersVolumeMounts extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("MountPath")
        @Validation(required = true)
        public String mountPath;

        @NameInMap("ReadOnly")
        @Validation(required = true)
        public Boolean readOnly;

        public static DescribeContainerGroupsResponseContainerGroupsContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersVolumeMounts self = new DescribeContainerGroupsResponseContainerGroupsContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersPorts extends TeaModel {
        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        public static DescribeContainerGroupsResponseContainerGroupsContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersPorts self = new DescribeContainerGroupsResponseContainerGroupsContainersPorts();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFromFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        @Validation(required = true)
        public String fieldPath;

        public static DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFromFieldRef self = new DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFromFieldRef();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFrom extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFromFieldRef fieldRef;

        public static DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFrom self = new DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFrom();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVars extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("ValueFrom")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVarsValueFrom valueFrom;

        public static DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVars self = new DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersPreviousState extends TeaModel {
        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("DetailStatus")
        @Validation(required = true)
        public String detailStatus;

        @NameInMap("ExitCode")
        @Validation(required = true)
        public Integer exitCode;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Signal")
        @Validation(required = true)
        public Integer signal;

        public static DescribeContainerGroupsResponseContainerGroupsContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersPreviousState self = new DescribeContainerGroupsResponseContainerGroupsContainersPreviousState();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersCurrentState extends TeaModel {
        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("DetailStatus")
        @Validation(required = true)
        public String detailStatus;

        @NameInMap("ExitCode")
        @Validation(required = true)
        public Integer exitCode;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Signal")
        @Validation(required = true)
        public Integer signal;

        public static DescribeContainerGroupsResponseContainerGroupsContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersCurrentState self = new DescribeContainerGroupsResponseContainerGroupsContainersCurrentState();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Scheme")
        @Validation(required = true)
        public String scheme;

        public static DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeHttpGet self = new DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        public static DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeTcpSocket self = new DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbe extends TeaModel {
        @NameInMap("InitialDelaySeconds")
        @Validation(required = true)
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        @Validation(required = true)
        public Integer periodSeconds;

        @NameInMap("TimeoutSeconds")
        @Validation(required = true)
        public Integer timeoutSeconds;

        @NameInMap("SuccessThreshold")
        @Validation(required = true)
        public Integer successThreshold;

        @NameInMap("FailureThreshold")
        @Validation(required = true)
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeHttpGet httpGet;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbeTcpSocket tcpSocket;

        @NameInMap("Execs")
        @Validation(required = true)
        public java.util.List<String> execs;

        public static DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbe self = new DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbe();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Scheme")
        @Validation(required = true)
        public String scheme;

        public static DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeHttpGet self = new DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        public static DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeTcpSocket self = new DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbe extends TeaModel {
        @NameInMap("InitialDelaySeconds")
        @Validation(required = true)
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        @Validation(required = true)
        public Integer periodSeconds;

        @NameInMap("TimeoutSeconds")
        @Validation(required = true)
        public Integer timeoutSeconds;

        @NameInMap("SuccessThreshold")
        @Validation(required = true)
        public Integer successThreshold;

        @NameInMap("FailureThreshold")
        @Validation(required = true)
        public Integer failureThreshold;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeHttpGet httpGet;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbeTcpSocket tcpSocket;

        @NameInMap("Execs")
        @Validation(required = true)
        public java.util.List<String> execs;

        public static DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbe self = new DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbe();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersSecurityContextCapability extends TeaModel {
        @NameInMap("Adds")
        @Validation(required = true)
        public java.util.List<String> adds;

        public static DescribeContainerGroupsResponseContainerGroupsContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersSecurityContextCapability self = new DescribeContainerGroupsResponseContainerGroupsContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainersSecurityContext extends TeaModel {
        @NameInMap("ReadOnlyRootFilesystem")
        @Validation(required = true)
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        @Validation(required = true)
        public Long runAsUser;

        @NameInMap("Capability")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersSecurityContextCapability capability;

        public static DescribeContainerGroupsResponseContainerGroupsContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainersSecurityContext self = new DescribeContainerGroupsResponseContainerGroupsContainersSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsContainers extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Image")
        @Validation(required = true)
        public String image;

        @NameInMap("Memory")
        @Validation(required = true)
        public Double memory;

        @NameInMap("Cpu")
        @Validation(required = true)
        public Double cpu;

        @NameInMap("RestartCount")
        @Validation(required = true)
        public Integer restartCount;

        @NameInMap("WorkingDir")
        @Validation(required = true)
        public String workingDir;

        @NameInMap("ImagePullPolicy")
        @Validation(required = true)
        public String imagePullPolicy;

        @NameInMap("Ready")
        @Validation(required = true)
        public Boolean ready;

        @NameInMap("Gpu")
        @Validation(required = true)
        public Integer gpu;

        @NameInMap("Stdin")
        @Validation(required = true)
        public Boolean stdin;

        @NameInMap("StdinOnce")
        @Validation(required = true)
        public Boolean stdinOnce;

        @NameInMap("Tty")
        @Validation(required = true)
        public Boolean tty;

        @NameInMap("VolumeMounts")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsContainersVolumeMounts> volumeMounts;

        @NameInMap("Ports")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsContainersPorts> ports;

        @NameInMap("EnvironmentVars")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsContainersEnvironmentVars> environmentVars;

        @NameInMap("PreviousState")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersPreviousState previousState;

        @NameInMap("CurrentState")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersCurrentState currentState;

        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersReadinessProbe readinessProbe;

        @NameInMap("LivenessProbe")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersLivenessProbe livenessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsContainersSecurityContext securityContext;

        @NameInMap("Commands")
        @Validation(required = true)
        public java.util.List<String> commands;

        @NameInMap("Args")
        @Validation(required = true)
        public java.util.List<String> args;

        public static DescribeContainerGroupsResponseContainerGroupsContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsContainers self = new DescribeContainerGroupsResponseContainerGroupsContainers();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsVolumesConfigFileVolumeConfigFileToPaths extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        public static DescribeContainerGroupsResponseContainerGroupsVolumesConfigFileVolumeConfigFileToPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsVolumesConfigFileVolumeConfigFileToPaths self = new DescribeContainerGroupsResponseContainerGroupsVolumesConfigFileVolumeConfigFileToPaths();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsVolumes extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("NFSVolumePath")
        @Validation(required = true)
        public String NFSVolumePath;

        @NameInMap("NFSVolumeServer")
        @Validation(required = true)
        public String NFSVolumeServer;

        @NameInMap("NFSVolumeReadOnly")
        @Validation(required = true)
        public Boolean NFSVolumeReadOnly;

        @NameInMap("DiskVolumeDiskId")
        @Validation(required = true)
        public String diskVolumeDiskId;

        @NameInMap("DiskVolumeFsType")
        @Validation(required = true)
        public String diskVolumeFsType;

        @NameInMap("FlexVolumeDriver")
        @Validation(required = true)
        public String flexVolumeDriver;

        @NameInMap("FlexVolumeFsType")
        @Validation(required = true)
        public String flexVolumeFsType;

        @NameInMap("FlexVolumeOptions")
        @Validation(required = true)
        public String flexVolumeOptions;

        @NameInMap("ConfigFileVolumeConfigFileToPaths")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsVolumesConfigFileVolumeConfigFileToPaths> configFileVolumeConfigFileToPaths;

        public static DescribeContainerGroupsResponseContainerGroupsVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsVolumes self = new DescribeContainerGroupsResponseContainerGroupsVolumes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersVolumeMounts extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("MountPath")
        @Validation(required = true)
        public String mountPath;

        @NameInMap("ReadOnly")
        @Validation(required = true)
        public Boolean readOnly;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersVolumeMounts self = new DescribeContainerGroupsResponseContainerGroupsInitContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersPorts extends TeaModel {
        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersPorts self = new DescribeContainerGroupsResponseContainerGroupsInitContainersPorts();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        @Validation(required = true)
        public String fieldPath;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef self = new DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFrom extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFromFieldRef fieldRef;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFrom self = new DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFrom();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVars extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("ValueFrom")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVarsValueFrom valueFrom;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVars self = new DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersPreviousState extends TeaModel {
        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("DetailStatus")
        @Validation(required = true)
        public String detailStatus;

        @NameInMap("ExitCode")
        @Validation(required = true)
        public Integer exitCode;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Signal")
        @Validation(required = true)
        public Integer signal;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersPreviousState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersPreviousState self = new DescribeContainerGroupsResponseContainerGroupsInitContainersPreviousState();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersCurrentState extends TeaModel {
        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("DetailStatus")
        @Validation(required = true)
        public String detailStatus;

        @NameInMap("ExitCode")
        @Validation(required = true)
        public Integer exitCode;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("Reason")
        @Validation(required = true)
        public String reason;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Signal")
        @Validation(required = true)
        public Integer signal;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersCurrentState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersCurrentState self = new DescribeContainerGroupsResponseContainerGroupsInitContainersCurrentState();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContextCapability extends TeaModel {
        @NameInMap("Adds")
        @Validation(required = true)
        public java.util.List<String> adds;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContextCapability self = new DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContextCapability();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContext extends TeaModel {
        @NameInMap("ReadOnlyRootFilesystem")
        @Validation(required = true)
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        @Validation(required = true)
        public Long runAsUser;

        @NameInMap("Capability")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContextCapability capability;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContext self = new DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsInitContainers extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Image")
        @Validation(required = true)
        public String image;

        @NameInMap("Cpu")
        @Validation(required = true)
        public Double cpu;

        @NameInMap("Memory")
        @Validation(required = true)
        public Double memory;

        @NameInMap("RestartCount")
        @Validation(required = true)
        public Integer restartCount;

        @NameInMap("WorkingDir")
        @Validation(required = true)
        public String workingDir;

        @NameInMap("ImagePullPolicy")
        @Validation(required = true)
        public String imagePullPolicy;

        @NameInMap("Ready")
        @Validation(required = true)
        public Boolean ready;

        @NameInMap("Gpu")
        @Validation(required = true)
        public Integer gpu;

        @NameInMap("VolumeMounts")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsInitContainersVolumeMounts> volumeMounts;

        @NameInMap("Ports")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsInitContainersPorts> ports;

        @NameInMap("EnvironmentVars")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsInitContainersEnvironmentVars> environmentVars;

        @NameInMap("PreviousState")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsInitContainersPreviousState previousState;

        @NameInMap("CurrentState")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsInitContainersCurrentState currentState;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsInitContainersSecurityContext securityContext;

        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        @NameInMap("Args")
        @Validation(required = true)
        public java.util.List<String> args;

        public static DescribeContainerGroupsResponseContainerGroupsInitContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsInitContainers self = new DescribeContainerGroupsResponseContainerGroupsInitContainers();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsHostAliases extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("Hostnames")
        @Validation(required = true)
        public java.util.List<String> hostnames;

        public static DescribeContainerGroupsResponseContainerGroupsHostAliases build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsHostAliases self = new DescribeContainerGroupsResponseContainerGroupsHostAliases();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsDnsConfigOptions extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeContainerGroupsResponseContainerGroupsDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsDnsConfigOptions self = new DescribeContainerGroupsResponseContainerGroupsDnsConfigOptions();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsDnsConfig extends TeaModel {
        @NameInMap("Options")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsDnsConfigOptions> options;

        @NameInMap("NameServers")
        @Validation(required = true)
        public java.util.List<String> nameServers;

        @NameInMap("Searches")
        @Validation(required = true)
        public java.util.List<String> searches;

        public static DescribeContainerGroupsResponseContainerGroupsDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsDnsConfig self = new DescribeContainerGroupsResponseContainerGroupsDnsConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsEciSecurityContextSysctls extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeContainerGroupsResponseContainerGroupsEciSecurityContextSysctls build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsEciSecurityContextSysctls self = new DescribeContainerGroupsResponseContainerGroupsEciSecurityContextSysctls();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroupsEciSecurityContext extends TeaModel {
        @NameInMap("Sysctls")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsEciSecurityContextSysctls> sysctls;

        public static DescribeContainerGroupsResponseContainerGroupsEciSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroupsEciSecurityContext self = new DescribeContainerGroupsResponseContainerGroupsEciSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContainerGroupsResponseContainerGroups extends TeaModel {
        @NameInMap("ContainerGroupId")
        @Validation(required = true)
        public String containerGroupId;

        @NameInMap("ContainerGroupName")
        @Validation(required = true)
        public String containerGroupName;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("Memory")
        @Validation(required = true)
        public Double memory;

        @NameInMap("Cpu")
        @Validation(required = true)
        public Double cpu;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("RestartPolicy")
        @Validation(required = true)
        public String restartPolicy;

        @NameInMap("IntranetIp")
        @Validation(required = true)
        public String intranetIp;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InternetIp")
        @Validation(required = true)
        public String internetIp;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("SucceededTime")
        @Validation(required = true)
        public String succeededTime;

        @NameInMap("EniInstanceId")
        @Validation(required = true)
        public String eniInstanceId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("FailedTime")
        @Validation(required = true)
        public String failedTime;

        @NameInMap("RamRoleName")
        @Validation(required = true)
        public String ramRoleName;

        @NameInMap("Ipv6Address")
        @Validation(required = true)
        public String ipv6Address;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Discount")
        @Validation(required = true)
        public Integer discount;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("TenantEniInstanceId")
        @Validation(required = true)
        public String tenantEniInstanceId;

        @NameInMap("TenantVSwitchId")
        @Validation(required = true)
        public String tenantVSwitchId;

        @NameInMap("TenantSecurityGroupId")
        @Validation(required = true)
        public String tenantSecurityGroupId;

        @NameInMap("SpotStrategy")
        @Validation(required = true)
        public String spotStrategy;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsTags> tags;

        @NameInMap("Events")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsEvents> events;

        @NameInMap("Containers")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsContainers> containers;

        @NameInMap("Volumes")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsVolumes> volumes;

        @NameInMap("InitContainers")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsInitContainers> initContainers;

        @NameInMap("HostAliases")
        @Validation(required = true)
        public java.util.List<DescribeContainerGroupsResponseContainerGroupsHostAliases> hostAliases;

        @NameInMap("DnsConfig")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsDnsConfig dnsConfig;

        @NameInMap("EciSecurityContext")
        @Validation(required = true)
        public DescribeContainerGroupsResponseContainerGroupsEciSecurityContext eciSecurityContext;

        public static DescribeContainerGroupsResponseContainerGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeContainerGroupsResponseContainerGroups self = new DescribeContainerGroupsResponseContainerGroups();
            return TeaModel.build(map, self);
        }

    }

}
