// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateContainerGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("ContainerGroupName")
    @Validation(required = true)
    public String containerGroupName;

    @NameInMap("RestartPolicy")
    public String restartPolicy;

    @NameInMap("Tag")
    public java.util.List<CreateContainerGroupRequestTag> tag;

    @NameInMap("ImageRegistryCredential")
    public java.util.List<CreateContainerGroupRequestImageRegistryCredential> imageRegistryCredential;

    @NameInMap("Container")
    @Validation(required = true)
    public java.util.List<CreateContainerGroupRequestContainer> container;

    @NameInMap("Volume")
    public java.util.List<CreateContainerGroupRequestVolume> volume;

    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    @NameInMap("InitContainer")
    public java.util.List<CreateContainerGroupRequestInitContainer> initContainer;

    @NameInMap("DnsConfig")
    @Validation(required = true)
    public CreateContainerGroupRequestDnsConfig dnsConfig;

    @NameInMap("Cpu")
    public Double cpu;

    @NameInMap("Memory")
    public Double memory;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("DnsPolicy")
    public String dnsPolicy;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("HostAliase")
    public java.util.List<CreateContainerGroupRequestHostAliase> hostAliase;

    @NameInMap("Arn")
    public java.util.List<CreateContainerGroupRequestArn> arn;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SecurityContext")
    @Validation(required = true)
    public CreateContainerGroupRequestSecurityContext securityContext;

    @NameInMap("SlsEnable")
    public Boolean slsEnable;

    @NameInMap("ImageSnapshotId")
    public String imageSnapshotId;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("NtpServer")
    public java.util.List<String> ntpServer;

    @NameInMap("TerminationGracePeriodSeconds")
    public Long terminationGracePeriodSeconds;

    @NameInMap("AutoMatchImageCache")
    public Boolean autoMatchImageCache;

    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    @NameInMap("ActiveDeadlineSeconds")
    public Long activeDeadlineSeconds;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SpotPriceLimit")
    public Double spotPriceLimit;

    @NameInMap("ScheduleStrategy")
    public String scheduleStrategy;

    @NameInMap("TenantVSwitchId")
    public String tenantVSwitchId;

    @NameInMap("TenantSecurityGroupId")
    public String tenantSecurityGroupId;

    @NameInMap("CorePattern")
    public String corePattern;

    public static CreateContainerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerGroupRequest self = new CreateContainerGroupRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateContainerGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateContainerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestTag self = new CreateContainerGroupRequestTag();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestImageRegistryCredential extends TeaModel {
        @NameInMap("Server")
        @Validation(required = true)
        public String server;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        public static CreateContainerGroupRequestImageRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestImageRegistryCredential self = new CreateContainerGroupRequestImageRegistryCredential();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerVolumeMount extends TeaModel {
        @NameInMap("MountPath")
        @Validation(required = true)
        public String mountPath;

        @NameInMap("ReadOnly")
        @Validation(required = true)
        public Boolean readOnly;

        @NameInMap("Name")
        public String name;

        @NameInMap("SubPath")
        public String subPath;

        public static CreateContainerGroupRequestContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerVolumeMount self = new CreateContainerGroupRequestContainerVolumeMount();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerPort extends TeaModel {
        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        public static CreateContainerGroupRequestContainerPort build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerPort self = new CreateContainerGroupRequestContainerPort();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerEnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static CreateContainerGroupRequestContainerEnvironmentVarFieldRef build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerEnvironmentVarFieldRef self = new CreateContainerGroupRequestContainerEnvironmentVarFieldRef();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerEnvironmentVar extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("FieldRef")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerEnvironmentVarFieldRef fieldRef;

        public static CreateContainerGroupRequestContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerEnvironmentVar self = new CreateContainerGroupRequestContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static CreateContainerGroupRequestContainerReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbeHttpGet self = new CreateContainerGroupRequestContainerReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerReadinessProbeExec extends TeaModel {
        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        public static CreateContainerGroupRequestContainerReadinessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbeExec self = new CreateContainerGroupRequestContainerReadinessProbeExec();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static CreateContainerGroupRequestContainerReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbeTcpSocket self = new CreateContainerGroupRequestContainerReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerReadinessProbe extends TeaModel {
        @NameInMap("HttpGet")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerReadinessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        @NameInMap("Exec")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerReadinessProbeExec exec;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerReadinessProbeTcpSocket tcpSocket;

        public static CreateContainerGroupRequestContainerReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerReadinessProbe self = new CreateContainerGroupRequestContainerReadinessProbe();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static CreateContainerGroupRequestContainerLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbeHttpGet self = new CreateContainerGroupRequestContainerLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbeExec extends TeaModel {
        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        public static CreateContainerGroupRequestContainerLivenessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbeExec self = new CreateContainerGroupRequestContainerLivenessProbeExec();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static CreateContainerGroupRequestContainerLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbeTcpSocket self = new CreateContainerGroupRequestContainerLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerLivenessProbe extends TeaModel {
        @NameInMap("HttpGet")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerLivenessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("FailureThreshold")
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        @NameInMap("Exec")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerLivenessProbeExec exec;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket;

        public static CreateContainerGroupRequestContainerLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLivenessProbe self = new CreateContainerGroupRequestContainerLivenessProbe();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        @Validation(required = true)
        public java.util.List<String> add;

        public static CreateContainerGroupRequestContainerSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerSecurityContextCapability self = new CreateContainerGroupRequestContainerSecurityContextCapability();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static CreateContainerGroupRequestContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerSecurityContext self = new CreateContainerGroupRequestContainerSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader self = new CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader self = new CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestContainer extends TeaModel {
        @NameInMap("Image")
        @Validation(required = true)
        public String image;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Cpu")
        public Double cpu;

        @NameInMap("Memory")
        public Double memory;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("Command")
        public java.util.List<String> command;

        @NameInMap("Arg")
        public java.util.List<String> arg;

        @NameInMap("VolumeMount")
        public java.util.List<CreateContainerGroupRequestContainerVolumeMount> volumeMount;

        @NameInMap("Port")
        public java.util.List<CreateContainerGroupRequestContainerPort> port;

        @NameInMap("EnvironmentVar")
        public java.util.List<CreateContainerGroupRequestContainerEnvironmentVar> environmentVar;

        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerReadinessProbe readinessProbe;

        @NameInMap("LivenessProbe")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerLivenessProbe livenessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public CreateContainerGroupRequestContainerSecurityContext securityContext;

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("LifecyclePostStartHandlerHttpGetHost")
        public String lifecyclePostStartHandlerHttpGetHost;

        @NameInMap("LifecyclePostStartHandlerHttpGetPort")
        public Integer lifecyclePostStartHandlerHttpGetPort;

        @NameInMap("LifecyclePostStartHandlerHttpGetPath")
        public String lifecyclePostStartHandlerHttpGetPath;

        @NameInMap("LifecyclePostStartHandlerHttpGetScheme")
        public String lifecyclePostStartHandlerHttpGetScheme;

        @NameInMap("LifecyclePostStartHandlerHttpGetHttpHeader")
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePostStartHandlerHttpGetHttpHeader> lifecyclePostStartHandlerHttpGetHttpHeader;

        @NameInMap("LifecyclePostStartHandlerExec")
        public java.util.List<String> lifecyclePostStartHandlerExec;

        @NameInMap("LifecyclePostStartHandlerTcpSocketHost")
        public String lifecyclePostStartHandlerTcpSocketHost;

        @NameInMap("LifecyclePostStartHandlerTcpSocketPort")
        public Integer lifecyclePostStartHandlerTcpSocketPort;

        @NameInMap("LifecyclePreStopHandlerHttpGetHost")
        public String lifecyclePreStopHandlerHttpGetHost;

        @NameInMap("LifecyclePreStopHandlerHttpGetPort")
        public Integer lifecyclePreStopHandlerHttpGetPort;

        @NameInMap("LifecyclePreStopHandlerHttpGetPath")
        public String lifecyclePreStopHandlerHttpGetPath;

        @NameInMap("LifecyclePreStopHandlerHttpGetScheme")
        public String lifecyclePreStopHandlerHttpGetScheme;

        @NameInMap("LifecyclePreStopHandlerHttpGetHttpHeader")
        public java.util.List<CreateContainerGroupRequestContainerLifecyclePreStopHandlerHttpGetHttpHeader> lifecyclePreStopHandlerHttpGetHttpHeader;

        @NameInMap("LifecyclePreStopHandlerExec")
        public java.util.List<String> lifecyclePreStopHandlerExec;

        @NameInMap("LifecyclePreStopHandlerTcpSocketHost")
        public String lifecyclePreStopHandlerTcpSocketHost;

        @NameInMap("LifecyclePreStopHandlerTcpSocketPort")
        public Integer lifecyclePreStopHandlerTcpSocketPort;

        @NameInMap("TerminationMessagePath")
        public String terminationMessagePath;

        @NameInMap("TerminationMessagePolicy")
        public String terminationMessagePolicy;

        public static CreateContainerGroupRequestContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestContainer self = new CreateContainerGroupRequestContainer();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestVolumeNFSVolume extends TeaModel {
        @NameInMap("Server")
        public String server;

        @NameInMap("Path")
        public String path;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static CreateContainerGroupRequestVolumeNFSVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeNFSVolume self = new CreateContainerGroupRequestVolumeNFSVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Path")
        public String path;

        @NameInMap("Mode")
        public Integer mode;

        public static CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath self = new CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestVolumeConfigFileVolume extends TeaModel {
        @NameInMap("ConfigFileToPath")
        @Validation(required = true)
        public java.util.List<CreateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> configFileToPath;

        @NameInMap("DefaultMode")
        public Integer defaultMode;

        public static CreateContainerGroupRequestVolumeConfigFileVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeConfigFileVolume self = new CreateContainerGroupRequestVolumeConfigFileVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestVolumeEmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        public static CreateContainerGroupRequestVolumeEmptyDirVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeEmptyDirVolume self = new CreateContainerGroupRequestVolumeEmptyDirVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestVolumeDiskVolume extends TeaModel {
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("DiskSize")
        public Integer diskSize;

        public static CreateContainerGroupRequestVolumeDiskVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeDiskVolume self = new CreateContainerGroupRequestVolumeDiskVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestVolumeFlexVolume extends TeaModel {
        @NameInMap("Driver")
        public String driver;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("Options")
        public String options;

        public static CreateContainerGroupRequestVolumeFlexVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeFlexVolume self = new CreateContainerGroupRequestVolumeFlexVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestVolumeHostPathVolume extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Path")
        public String path;

        public static CreateContainerGroupRequestVolumeHostPathVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolumeHostPathVolume self = new CreateContainerGroupRequestVolumeHostPathVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestVolume extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NFSVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeNFSVolume NFSVolume;

        @NameInMap("ConfigFileVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeConfigFileVolume configFileVolume;

        @NameInMap("Type")
        public String type;

        @NameInMap("EmptyDirVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume;

        @NameInMap("DiskVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeDiskVolume diskVolume;

        @NameInMap("FlexVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeFlexVolume flexVolume;

        @NameInMap("HostPathVolume")
        @Validation(required = true)
        public CreateContainerGroupRequestVolumeHostPathVolume hostPathVolume;

        public static CreateContainerGroupRequestVolume build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestVolume self = new CreateContainerGroupRequestVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestInitContainerVolumeMount extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("Name")
        public String name;

        @NameInMap("SubPath")
        public String subPath;

        public static CreateContainerGroupRequestInitContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerVolumeMount self = new CreateContainerGroupRequestInitContainerVolumeMount();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestInitContainerPort extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static CreateContainerGroupRequestInitContainerPort build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerPort self = new CreateContainerGroupRequestInitContainerPort();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        public String fieldPath;

        public static CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef self = new CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestInitContainerEnvironmentVar extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("FieldRef")
        @Validation(required = true)
        public CreateContainerGroupRequestInitContainerEnvironmentVarFieldRef fieldRef;

        public static CreateContainerGroupRequestInitContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerEnvironmentVar self = new CreateContainerGroupRequestInitContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestInitContainerSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        @Validation(required = true)
        public java.util.List<String> add;

        public static CreateContainerGroupRequestInitContainerSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerSecurityContextCapability self = new CreateContainerGroupRequestInitContainerSecurityContextCapability();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestInitContainerSecurityContext extends TeaModel {
        @NameInMap("Capability")
        @Validation(required = true)
        public CreateContainerGroupRequestInitContainerSecurityContextCapability capability;

        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        public static CreateContainerGroupRequestInitContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainerSecurityContext self = new CreateContainerGroupRequestInitContainerSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestInitContainer extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Image")
        public String image;

        @NameInMap("Cpu")
        public Double cpu;

        @NameInMap("Memory")
        public Double memory;

        @NameInMap("WorkingDir")
        public String workingDir;

        @NameInMap("ImagePullPolicy")
        public String imagePullPolicy;

        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        @NameInMap("Arg")
        @Validation(required = true)
        public java.util.List<String> arg;

        @NameInMap("VolumeMount")
        @Validation(required = true)
        public java.util.List<CreateContainerGroupRequestInitContainerVolumeMount> volumeMount;

        @NameInMap("Port")
        @Validation(required = true)
        public java.util.List<CreateContainerGroupRequestInitContainerPort> port;

        @NameInMap("EnvironmentVar")
        @Validation(required = true)
        public java.util.List<CreateContainerGroupRequestInitContainerEnvironmentVar> environmentVar;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public CreateContainerGroupRequestInitContainerSecurityContext securityContext;

        @NameInMap("Gpu")
        public Integer gpu;

        @NameInMap("TerminationMessagePath")
        public String terminationMessagePath;

        @NameInMap("TerminationMessagePolicy")
        public String terminationMessagePolicy;

        public static CreateContainerGroupRequestInitContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestInitContainer self = new CreateContainerGroupRequestInitContainer();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestDnsConfigOption extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestDnsConfigOption build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestDnsConfigOption self = new CreateContainerGroupRequestDnsConfigOption();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestDnsConfig extends TeaModel {
        @NameInMap("NameServer")
        public java.util.List<String> nameServer;

        @NameInMap("Search")
        public java.util.List<String> search;

        @NameInMap("Option")
        public java.util.List<CreateContainerGroupRequestDnsConfigOption> option;

        public static CreateContainerGroupRequestDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestDnsConfig self = new CreateContainerGroupRequestDnsConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestHostAliase extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Hostname")
        @Validation(required = true)
        public java.util.List<String> hostname;

        public static CreateContainerGroupRequestHostAliase build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestHostAliase self = new CreateContainerGroupRequestHostAliase();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestArn extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("RoleType")
        public String roleType;

        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        public static CreateContainerGroupRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestArn self = new CreateContainerGroupRequestArn();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestSecurityContextSysctl extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreateContainerGroupRequestSecurityContextSysctl build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestSecurityContextSysctl self = new CreateContainerGroupRequestSecurityContextSysctl();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateContainerGroupRequestSecurityContext extends TeaModel {
        @NameInMap("Sysctl")
        public java.util.List<CreateContainerGroupRequestSecurityContextSysctl> sysctl;

        public static CreateContainerGroupRequestSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            CreateContainerGroupRequestSecurityContext self = new CreateContainerGroupRequestSecurityContext();
            return TeaModel.build(map, self);
        }

    }

}
