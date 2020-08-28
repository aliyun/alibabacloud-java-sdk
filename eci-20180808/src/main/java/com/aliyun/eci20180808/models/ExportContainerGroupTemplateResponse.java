// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ExportContainerGroupTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Template")
    @Validation(required = true)
    public ExportContainerGroupTemplateResponseTemplate template;

    public static ExportContainerGroupTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportContainerGroupTemplateResponse self = new ExportContainerGroupTemplateResponse();
        return TeaModel.build(map, self);
    }

    public static class ExportContainerGroupTemplateResponseTemplateTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ExportContainerGroupTemplateResponseTemplateTags build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateTags self = new ExportContainerGroupTemplateResponseTemplateTags();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateResources extends TeaModel {
        @NameInMap("Cpu")
        @Validation(required = true)
        public Double cpu;

        @NameInMap("Memory")
        @Validation(required = true)
        public Double memory;

        public static ExportContainerGroupTemplateResponseTemplateResources build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateResources self = new ExportContainerGroupTemplateResponseTemplateResources();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFileItems extends TeaModel {
        @NameInMap("Mode")
        @Validation(required = true)
        public Integer mode;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFileItems build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFileItems self = new ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFileItems();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFile extends TeaModel {
        @NameInMap("DefaultMode")
        @Validation(required = true)
        public Integer defaultMode;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFileItems> items;

        public static ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFile build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFile self = new ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFile();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecVolumesEmptyDir extends TeaModel {
        @NameInMap("SizeLimit")
        @Validation(required = true)
        public String sizeLimit;

        public static ExportContainerGroupTemplateResponseTemplateSpecVolumesEmptyDir build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecVolumesEmptyDir self = new ExportContainerGroupTemplateResponseTemplateSpecVolumesEmptyDir();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecVolumesNfs extends TeaModel {
        @NameInMap("Server")
        @Validation(required = true)
        public String server;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("ReadOnly")
        @Validation(required = true)
        public Boolean readOnly;

        public static ExportContainerGroupTemplateResponseTemplateSpecVolumesNfs build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecVolumesNfs self = new ExportContainerGroupTemplateResponseTemplateSpecVolumesNfs();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecVolumes extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ConfigFile")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecVolumesConfigFile configFile;

        @NameInMap("EmptyDir")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecVolumesEmptyDir emptyDir;

        @NameInMap("Nfs")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecVolumesNfs nfs;

        public static ExportContainerGroupTemplateResponseTemplateSpecVolumes build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecVolumes self = new ExportContainerGroupTemplateResponseTemplateSpecVolumes();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFromFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        @Validation(required = true)
        public String fieldPath;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFromFieldRef self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFromFieldRef();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFrom extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFrom build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFrom self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFrom();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnv extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("ValueFrom")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnvValueFrom valueFrom;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnv build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnv self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnv();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainersPorts extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("ContainerPort")
        @Validation(required = true)
        public Integer containerPort;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainersPorts self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainersPorts();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainersVolumeMounts extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("SubPath")
        @Validation(required = true)
        public String subPath;

        @NameInMap("MountPath")
        @Validation(required = true)
        public String mountPath;

        @NameInMap("ReadOnly")
        @Validation(required = true)
        public Boolean readOnly;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainersVolumeMounts self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContextSysctls extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContextSysctls build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContextSysctls self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContextSysctls();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContext extends TeaModel {
        @NameInMap("Sysctls")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContextSysctls> sysctls;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContext self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainersResources extends TeaModel {
        @NameInMap("Cpu")
        @Validation(required = true)
        public Double cpu;

        @NameInMap("Memory")
        @Validation(required = true)
        public Double memory;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainersResources build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainersResources self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainersResources();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecInitContainers extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Image")
        @Validation(required = true)
        public String image;

        @NameInMap("ImagePullPolicy")
        @Validation(required = true)
        public String imagePullPolicy;

        @NameInMap("Stdin")
        @Validation(required = true)
        public Boolean stdin;

        @NameInMap("StdinOnce")
        @Validation(required = true)
        public Boolean stdinOnce;

        @NameInMap("Tty")
        @Validation(required = true)
        public Boolean tty;

        @NameInMap("WorkingDir")
        @Validation(required = true)
        public String workingDir;

        @NameInMap("Env")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecInitContainersEnv> env;

        @NameInMap("Ports")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecInitContainersPorts> ports;

        @NameInMap("VolumeMounts")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecInitContainersVolumeMounts> volumeMounts;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecInitContainersSecurityContext securityContext;

        @NameInMap("Resources")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecInitContainersResources resources;

        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        @NameInMap("Args")
        @Validation(required = true)
        public java.util.List<String> args;

        public static ExportContainerGroupTemplateResponseTemplateSpecInitContainers build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecInitContainers self = new ExportContainerGroupTemplateResponseTemplateSpecInitContainers();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFromFieldRef extends TeaModel {
        @NameInMap("FieldPath")
        @Validation(required = true)
        public String fieldPath;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFromFieldRef build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFromFieldRef self = new ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFromFieldRef();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFrom extends TeaModel {
        @NameInMap("FieldRef")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFromFieldRef fieldRef;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFrom build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFrom self = new ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFrom();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersEnv extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("ValueFrom")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersEnvValueFrom valueFrom;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersEnv build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersEnv self = new ExportContainerGroupTemplateResponseTemplateSpecContainersEnv();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersPorts extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("ContainerPort")
        @Validation(required = true)
        public Integer containerPort;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersPorts build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersPorts self = new ExportContainerGroupTemplateResponseTemplateSpecContainersPorts();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersVolumeMounts extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("SubPath")
        @Validation(required = true)
        public String subPath;

        @NameInMap("MountPath")
        @Validation(required = true)
        public String mountPath;

        @NameInMap("ReadOnly")
        @Validation(required = true)
        public Boolean readOnly;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersVolumeMounts self = new ExportContainerGroupTemplateResponseTemplateSpecContainersVolumeMounts();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContextSysctls extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContextSysctls build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContextSysctls self = new ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContextSysctls();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContext extends TeaModel {
        @NameInMap("Sysctls")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContextSysctls> sysctls;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContext self = new ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersResources extends TeaModel {
        @NameInMap("Cpu")
        @Validation(required = true)
        public Double cpu;

        @NameInMap("Memory")
        @Validation(required = true)
        public Double memory;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersResources build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersResources self = new ExportContainerGroupTemplateResponseTemplateSpecContainersResources();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeExec extends TeaModel {
        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeExec self = new ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeExec();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeTcpSocket self = new ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeHttpGet extends TeaModel {
        @NameInMap("Scheme")
        @Validation(required = true)
        public String scheme;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeHttpGet self = new ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeHttpGet();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbe extends TeaModel {
        @NameInMap("InitialDelaySeconds")
        @Validation(required = true)
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        @Validation(required = true)
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        @Validation(required = true)
        public Integer successThreshold;

        @NameInMap("FailureThreshold")
        @Validation(required = true)
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        @Validation(required = true)
        public Integer timeoutSeconds;

        @NameInMap("Exec")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeExec exec;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeTcpSocket tcpSocket;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbeHttpGet httpGet;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbe self = new ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbe();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeExec extends TeaModel {
        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeExec build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeExec self = new ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeExec();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeTcpSocket extends TeaModel {
        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeTcpSocket self = new ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeTcpSocket();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeHttpGet extends TeaModel {
        @NameInMap("Scheme")
        @Validation(required = true)
        public String scheme;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeHttpGet build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeHttpGet self = new ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeHttpGet();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbe extends TeaModel {
        @NameInMap("InitialDelaySeconds")
        @Validation(required = true)
        public Integer initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        @Validation(required = true)
        public Integer periodSeconds;

        @NameInMap("SuccessThreshold")
        @Validation(required = true)
        public Integer successThreshold;

        @NameInMap("FailureThreshold")
        @Validation(required = true)
        public Integer failureThreshold;

        @NameInMap("TimeoutSeconds")
        @Validation(required = true)
        public Integer timeoutSeconds;

        @NameInMap("Exec")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeExec exec;

        @NameInMap("TcpSocket")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeTcpSocket tcpSocket;

        @NameInMap("HttpGet")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbeHttpGet httpGet;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbe self = new ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbe();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecContainers extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Image")
        @Validation(required = true)
        public String image;

        @NameInMap("ImagePullPolicy")
        @Validation(required = true)
        public String imagePullPolicy;

        @NameInMap("Stdin")
        @Validation(required = true)
        public Boolean stdin;

        @NameInMap("StdinOnce")
        @Validation(required = true)
        public Boolean stdinOnce;

        @NameInMap("Tty")
        @Validation(required = true)
        public Boolean tty;

        @NameInMap("WorkingDir")
        @Validation(required = true)
        public String workingDir;

        @NameInMap("Env")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecContainersEnv> env;

        @NameInMap("Ports")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecContainersPorts> ports;

        @NameInMap("VolumeMounts")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecContainersVolumeMounts> volumeMounts;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersSecurityContext securityContext;

        @NameInMap("Resources")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersResources resources;

        @NameInMap("ReadinessProbe")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersReadinessProbe readinessProbe;

        @NameInMap("LivenessProbe")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecContainersLivenessProbe livenessProbe;

        @NameInMap("Command")
        @Validation(required = true)
        public java.util.List<String> command;

        @NameInMap("Args")
        @Validation(required = true)
        public java.util.List<String> args;

        public static ExportContainerGroupTemplateResponseTemplateSpecContainers build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecContainers self = new ExportContainerGroupTemplateResponseTemplateSpecContainers();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecDnsConfigOptions extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ExportContainerGroupTemplateResponseTemplateSpecDnsConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecDnsConfigOptions self = new ExportContainerGroupTemplateResponseTemplateSpecDnsConfigOptions();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecDnsConfig extends TeaModel {
        @NameInMap("Options")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecDnsConfigOptions> options;

        @NameInMap("NameServers")
        @Validation(required = true)
        public java.util.List<String> nameServers;

        @NameInMap("Searches")
        @Validation(required = true)
        public java.util.List<String> searches;

        public static ExportContainerGroupTemplateResponseTemplateSpecDnsConfig build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecDnsConfig self = new ExportContainerGroupTemplateResponseTemplateSpecDnsConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecSecurityContextSysctls extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ExportContainerGroupTemplateResponseTemplateSpecSecurityContextSysctls build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecSecurityContextSysctls self = new ExportContainerGroupTemplateResponseTemplateSpecSecurityContextSysctls();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpecSecurityContext extends TeaModel {
        @NameInMap("Sysctls")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecSecurityContextSysctls> sysctls;

        public static ExportContainerGroupTemplateResponseTemplateSpecSecurityContext build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpecSecurityContext self = new ExportContainerGroupTemplateResponseTemplateSpecSecurityContext();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplateSpec extends TeaModel {
        @NameInMap("RestartPolicy")
        @Validation(required = true)
        public String restartPolicy;

        @NameInMap("DnsPolicy")
        @Validation(required = true)
        public String dnsPolicy;

        @NameInMap("Volumes")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecVolumes> volumes;

        @NameInMap("InitContainers")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecInitContainers> initContainers;

        @NameInMap("Containers")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateSpecContainers> containers;

        @NameInMap("DnsConfig")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecDnsConfig dnsConfig;

        @NameInMap("SecurityContext")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpecSecurityContext securityContext;

        public static ExportContainerGroupTemplateResponseTemplateSpec build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplateSpec self = new ExportContainerGroupTemplateResponseTemplateSpec();
            return TeaModel.build(map, self);
        }

    }

    public static class ExportContainerGroupTemplateResponseTemplate extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public String securityGroupId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("EipInstanceId")
        @Validation(required = true)
        public String eipInstanceId;

        @NameInMap("ContainerGroupName")
        @Validation(required = true)
        public String containerGroupName;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<ExportContainerGroupTemplateResponseTemplateTags> tags;

        @NameInMap("Resources")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateResources resources;

        @NameInMap("Spec")
        @Validation(required = true)
        public ExportContainerGroupTemplateResponseTemplateSpec spec;

        public static ExportContainerGroupTemplateResponseTemplate build(java.util.Map<String, ?> map) throws Exception {
            ExportContainerGroupTemplateResponseTemplate self = new ExportContainerGroupTemplateResponseTemplate();
            return TeaModel.build(map, self);
        }

    }

}
