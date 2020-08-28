// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateContainerGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ContainerGroupId")
    @Validation(required = true)
    public String containerGroupId;

    @NameInMap("RestartPolicy")
    public String restartPolicy;

    @NameInMap("Tag")
    public java.util.List<UpdateContainerGroupRequestTag> tag;

    @NameInMap("Volume")
    public java.util.List<UpdateContainerGroupRequestVolume> volume;

    @NameInMap("DnsConfig")
    @Validation(required = true)
    public UpdateContainerGroupRequestDnsConfig dnsConfig;

    @NameInMap("Container")
    public java.util.List<UpdateContainerGroupRequestContainer> container;

    @NameInMap("InitContainer")
    public java.util.List<UpdateContainerGroupRequestInitContainer> initContainer;

    @NameInMap("ImageRegistryCredential")
    public java.util.List<UpdateContainerGroupRequestImageRegistryCredential> imageRegistryCredential;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Cpu")
    public Double cpu;

    @NameInMap("Memory")
    public Double memory;

    public static UpdateContainerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerGroupRequest self = new UpdateContainerGroupRequest();
        return TeaModel.build(map, self);
    }

    public static class UpdateContainerGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestTag self = new UpdateContainerGroupRequestTag();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestVolumeNFSVolume extends TeaModel {
        @NameInMap("Server")
        public String server;

        @NameInMap("Path")
        public String path;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static UpdateContainerGroupRequestVolumeNFSVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeNFSVolume self = new UpdateContainerGroupRequestVolumeNFSVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Path")
        public String path;

        public static UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath self = new UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestVolumeConfigFileVolume extends TeaModel {
        @NameInMap("ConfigFileToPath")
        @Validation(required = true)
        public java.util.List<UpdateContainerGroupRequestVolumeConfigFileVolumeConfigFileToPath> configFileToPath;

        public static UpdateContainerGroupRequestVolumeConfigFileVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeConfigFileVolume self = new UpdateContainerGroupRequestVolumeConfigFileVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestVolumeEmptyDirVolume extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        public static UpdateContainerGroupRequestVolumeEmptyDirVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolumeEmptyDirVolume self = new UpdateContainerGroupRequestVolumeEmptyDirVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestVolume extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("NFSVolume")
        @Validation(required = true)
        public UpdateContainerGroupRequestVolumeNFSVolume NFSVolume;

        @NameInMap("ConfigFileVolume")
        @Validation(required = true)
        public UpdateContainerGroupRequestVolumeConfigFileVolume configFileVolume;

        @NameInMap("EmptyDirVolume")
        @Validation(required = true)
        public UpdateContainerGroupRequestVolumeEmptyDirVolume emptyDirVolume;

        public static UpdateContainerGroupRequestVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestVolume self = new UpdateContainerGroupRequestVolume();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestDnsConfigOption extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestDnsConfigOption build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestDnsConfigOption self = new UpdateContainerGroupRequestDnsConfigOption();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestDnsConfig extends TeaModel {
        @NameInMap("NameServer")
        public java.util.List<String> nameServer;

        @NameInMap("Search")
        public java.util.List<String> search;

        @NameInMap("Option")
        public java.util.List<UpdateContainerGroupRequestDnsConfigOption> option;

        public static UpdateContainerGroupRequestDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestDnsConfig self = new UpdateContainerGroupRequestDnsConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerEnvironmentVar extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerEnvironmentVar self = new UpdateContainerGroupRequestContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerPort extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Port")
        public Integer port;

        public static UpdateContainerGroupRequestContainerPort build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerPort self = new UpdateContainerGroupRequestContainerPort();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerVolumeMount extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("SubPath")
        public String subPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static UpdateContainerGroupRequestContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerVolumeMount self = new UpdateContainerGroupRequestContainerVolumeMount();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static UpdateContainerGroupRequestContainerReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbeTcpSocket self = new UpdateContainerGroupRequestContainerReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerReadinessProbeExec extends TeaModel {
        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        public static UpdateContainerGroupRequestContainerReadinessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbeExec self = new UpdateContainerGroupRequestContainerReadinessProbeExec();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static UpdateContainerGroupRequestContainerReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbeHttpGet self = new UpdateContainerGroupRequestContainerReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerReadinessProbe extends TeaModel {
        @NameInMap("TcpSocket")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerReadinessProbeTcpSocket tcpSocket;

        @NameInMap("Exec")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerReadinessProbeExec exec;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerReadinessProbeHttpGet httpGet;

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

        public static UpdateContainerGroupRequestContainerReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerReadinessProbe self = new UpdateContainerGroupRequestContainerReadinessProbe();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        public static UpdateContainerGroupRequestContainerLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbeTcpSocket self = new UpdateContainerGroupRequestContainerLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerLivenessProbeExec extends TeaModel {
        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        public static UpdateContainerGroupRequestContainerLivenessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbeExec self = new UpdateContainerGroupRequestContainerLivenessProbeExec();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Scheme")
        public String scheme;

        public static UpdateContainerGroupRequestContainerLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbeHttpGet self = new UpdateContainerGroupRequestContainerLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerLivenessProbe extends TeaModel {
        @NameInMap("TcpSocket")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerLivenessProbeTcpSocket tcpSocket;

        @NameInMap("Exec")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerLivenessProbeExec exec;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerLivenessProbeHttpGet httpGet;

        @NameInMap("InitialDelaySeconds")
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        public Integer successThreshold;

        @NameInMap("FailureThreshold")
        @Validation(required = true)
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        public static UpdateContainerGroupRequestContainerLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerLivenessProbe self = new UpdateContainerGroupRequestContainerLivenessProbe();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        @Validation(required = true)
        public java.util.List<String> add;

        public static UpdateContainerGroupRequestContainerSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerSecurityContextCapability self = new UpdateContainerGroupRequestContainerSecurityContextCapability();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainerSecurityContext extends TeaModel {
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        @NameInMap("Capability")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerSecurityContextCapability capability;

        public static UpdateContainerGroupRequestContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainerSecurityContext self = new UpdateContainerGroupRequestContainerSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestContainer extends TeaModel {
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

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        @NameInMap("Arg")
        @Validation(required = true)
        public java.util.List<String> arg;

        @NameInMap("EnvironmentVar")
        @Validation(required = true)
        public java.util.List<UpdateContainerGroupRequestContainerEnvironmentVar> environmentVar;

        @NameInMap("Port")
        @Validation(required = true)
        public java.util.List<UpdateContainerGroupRequestContainerPort> port;

        @NameInMap("VolumeMount")
        @Validation(required = true)
        public java.util.List<UpdateContainerGroupRequestContainerVolumeMount> volumeMount;

        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerReadinessProbe readinessProbe;

        @NameInMap("LivenessProbe")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerLivenessProbe livenessProbe;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public UpdateContainerGroupRequestContainerSecurityContext securityContext;

        @NameInMap("Gpu")
        public Integer gpu;

        public static UpdateContainerGroupRequestContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestContainer self = new UpdateContainerGroupRequestContainer();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestInitContainerEnvironmentVar extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateContainerGroupRequestInitContainerEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerEnvironmentVar self = new UpdateContainerGroupRequestInitContainerEnvironmentVar();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestInitContainerPort extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        public static UpdateContainerGroupRequestInitContainerPort build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerPort self = new UpdateContainerGroupRequestInitContainerPort();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestInitContainerVolumeMount extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("SubPath")
        public String subPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        public static UpdateContainerGroupRequestInitContainerVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerVolumeMount self = new UpdateContainerGroupRequestInitContainerVolumeMount();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestInitContainerSecurityContextCapability extends TeaModel {
        @NameInMap("Add")
        @Validation(required = true)
        public java.util.List<String> add;

        public static UpdateContainerGroupRequestInitContainerSecurityContextCapability build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerSecurityContextCapability self = new UpdateContainerGroupRequestInitContainerSecurityContextCapability();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestInitContainerSecurityContext extends TeaModel {
        @NameInMap("ReadOnlyRootFilesystem")
        public Boolean readOnlyRootFilesystem;

        @NameInMap("RunAsUser")
        public Long runAsUser;

        @NameInMap("Capability")
        @Validation(required = true)
        public UpdateContainerGroupRequestInitContainerSecurityContextCapability capability;

        public static UpdateContainerGroupRequestInitContainerSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainerSecurityContext self = new UpdateContainerGroupRequestInitContainerSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestInitContainer extends TeaModel {
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

        @NameInMap("Stdin")
        public Boolean stdin;

        @NameInMap("StdinOnce")
        public Boolean stdinOnce;

        @NameInMap("Tty")
        public Boolean tty;

        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        @NameInMap("Arg")
        @Validation(required = true)
        public java.util.List<String> arg;

        @NameInMap("EnvironmentVar")
        @Validation(required = true)
        public java.util.List<UpdateContainerGroupRequestInitContainerEnvironmentVar> environmentVar;

        @NameInMap("Port")
        @Validation(required = true)
        public java.util.List<UpdateContainerGroupRequestInitContainerPort> port;

        @NameInMap("VolumeMount")
        @Validation(required = true)
        public java.util.List<UpdateContainerGroupRequestInitContainerVolumeMount> volumeMount;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public UpdateContainerGroupRequestInitContainerSecurityContext securityContext;

        @NameInMap("Gpu")
        public Integer gpu;

        public static UpdateContainerGroupRequestInitContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestInitContainer self = new UpdateContainerGroupRequestInitContainer();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateContainerGroupRequestImageRegistryCredential extends TeaModel {
        @NameInMap("Server")
        public String server;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("Password")
        public String password;

        public static UpdateContainerGroupRequestImageRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            UpdateContainerGroupRequestImageRegistryCredential self = new UpdateContainerGroupRequestImageRegistryCredential();
            return TeaModel.build(map, self);
        }

    }

}
