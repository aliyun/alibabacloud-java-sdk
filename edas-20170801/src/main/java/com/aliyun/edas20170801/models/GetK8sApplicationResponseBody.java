// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sApplicationResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("Applcation")
    public GetK8sApplicationResponseBodyApplcation applcation;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1053-08e4-47a5-b2ab-5c0323de7b5a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetK8sApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetK8sApplicationResponseBody self = new GetK8sApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetK8sApplicationResponseBody setApplcation(GetK8sApplicationResponseBodyApplcation applcation) {
        this.applcation = applcation;
        return this;
    }
    public GetK8sApplicationResponseBodyApplcation getApplcation() {
        return this.applcation;
    }

    public GetK8sApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetK8sApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetK8sApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetK8sApplicationResponseBodyApplcationAppCmdArgs extends TeaModel {
        @NameInMap("CmdArg")
        public java.util.List<String> cmdArg;

        public static GetK8sApplicationResponseBodyApplcationAppCmdArgs build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationAppCmdArgs self = new GetK8sApplicationResponseBodyApplcationAppCmdArgs();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationAppCmdArgs setCmdArg(java.util.List<String> cmdArg) {
            this.cmdArg = cmdArg;
            return this;
        }
        public java.util.List<String> getCmdArg() {
            return this.cmdArg;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationAppEnvListEnv extends TeaModel {
        /**
         * <p>The name of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>CATALINA_OPTS</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>-Xmx 1024m -Dhsf.default.tid=false $(EDAS_CATALINA_OPTS)</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetK8sApplicationResponseBodyApplcationAppEnvListEnv build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationAppEnvListEnv self = new GetK8sApplicationResponseBodyApplcationAppEnvListEnv();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationAppEnvListEnv setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetK8sApplicationResponseBodyApplcationAppEnvListEnv setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationAppEnvList extends TeaModel {
        @NameInMap("Env")
        public java.util.List<GetK8sApplicationResponseBodyApplcationAppEnvListEnv> env;

        public static GetK8sApplicationResponseBodyApplcationAppEnvList build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationAppEnvList self = new GetK8sApplicationResponseBodyApplcationAppEnvList();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationAppEnvList setEnv(java.util.List<GetK8sApplicationResponseBodyApplcationAppEnvListEnv> env) {
            this.env = env;
            return this;
        }
        public java.util.List<GetK8sApplicationResponseBodyApplcationAppEnvListEnv> getEnv() {
            return this.env;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationApp extends TeaModel {
        /**
         * <p>The annotation of an application pod.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test-annokey&quot;:&quot;test-annovalue&quot;}</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>00ee517d-dd7d-4d4e-<strong><strong>-</strong></strong></p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The type of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>War</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        @NameInMap("BuildpackId")
        public Integer buildpackId;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c37aec2a-bcca-4ec1-<strong><strong>-</strong></strong></p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>ls</p>
         */
        @NameInMap("Cmd")
        public String cmd;

        /**
         * <p>The list of commands.</p>
         */
        @NameInMap("CmdArgs")
        public GetK8sApplicationResponseBodyApplcationAppCmdArgs cmdArgs;

        /**
         * <p>The ID of the cluster to which the container belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>c383bc813c1974e<strong><strong>451b50c0c8</strong></strong></p>
         */
        @NameInMap("CsClusterId")
        public String csClusterId;

        /**
         * <p>The deployment type of the application. Example: Image.</p>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li>General: native Java application</li>
         * <li>Pandora: Pandora application</li>
         * <li>Multilingual: multilingual application</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        @NameInMap("DevelopType")
        public String developType;

        /**
         * <p>The version of EDAS Container.</p>
         * 
         * <strong>example:</strong>
         * <p>3.60.0</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        /**
         * <p>Indicates whether the Empty List Protection feature is enabled for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableEmptyPushReject")
        public Boolean enableEmptyPushReject;

        /**
         * <p>Indicates whether the Graceful Release feature is enabled for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableLosslessRule")
        public Boolean enableLosslessRule;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("EnvList")
        public GetK8sApplicationResponseBodyApplcationAppEnvList envList;

        /**
         * <p>The feature annotations. Possible values:</p>
         * <ul>
         * <li>base.combination.edas: enables EDAS integrated management solution.</li>
         * <li>base.combination.arms: enables ARMS monitoring.</li>
         * <li>base.combination.mse: enables MSE microservices governance.</li>
         * <li>base.combination.none: enables lifecycle management.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>base.combination.edas</p>
         */
        @NameInMap("FeatureAnnotations")
        public String featureAnnotations;

        /**
         * <p>The number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Instances")
        public Integer instances;

        /**
         * <p>The number of application instances before the last auto scaling operation.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InstancesBeforeScaling")
        public Integer instancesBeforeScaling;

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        /**
         * <p>The label of an application pod.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test-labelkey&quot;:&quot;test-labelvalue&quot;}</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The maximum number of CPU cores allowed. Unit: millicores. 1,000 millicores equal one CPU core.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LimitCpuM")
        public Integer limitCpuM;

        /**
         * <p>The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("LimitEphemeralStorage")
        public String limitEphemeralStorage;

        /**
         * <p>The maximum size of the memory allowed. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("LimitMem")
        public Integer limitMem;

        /**
         * <p>Indicates whether the Graceful Rolling Release and Configure Complete Service Registration before Readiness Probing feature is enabled for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LosslessRuleAligned")
        public Boolean losslessRuleAligned;

        /**
         * <p>The delay of service registration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("LosslessRuleDelayTime")
        public Integer losslessRuleDelayTime;

        /**
         * <p>The number of prefetching curves.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LosslessRuleFuncType")
        public Integer losslessRuleFuncType;

        /**
         * <p>Indicates whether the Graceful Rolling Release and Configure Complete Service Prefetching before Readiness Probing feature is enabled for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LosslessRuleRelated")
        public Boolean losslessRuleRelated;

        /**
         * <p>The service prefetching duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("LosslessRuleWarmupTime")
        public Integer losslessRuleWarmupTime;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of requested CPU cores. Unit: millicores. 1,000 millicores equal one CPU core.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RequestCpuM")
        public Integer requestCpuM;

        /**
         * <p>The size of space reserved for ephemeral storage resources. Unit: GB. Value 0 indicates that no limit is set on the space size.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequestEphemeralStorage")
        public String requestEphemeralStorage;

        /**
         * <p>The size of the reserved memory. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("RequestMem")
        public Integer requestMem;

        @NameInMap("SecurityContext")
        public String securityContext;

        /**
         * <p>The configuration information about the Server Load Balancer (SLB).</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;addressType&quot;: &quot;intranet&quot;,
         *     &quot;externalTrafficPolicy&quot;: &quot;Local&quot;,
         *     &quot;ip&quot;: &quot;192.168.254.<em><strong>&quot;,
         *     &quot;name&quot;: &quot;intranet-testapp&quot;,
         *     &quot;portMappings&quot;: [
         *       {
         *         &quot;loadBalancerProtocol&quot;: &quot;TCP&quot;,
         *         &quot;servicePort&quot;: {
         *           &quot;port&quot;: 8080,
         *           &quot;protocol&quot;: &quot;TCP&quot;,
         *           &quot;targetPort&quot;: 18081,
         *           &quot;vServerGroupName&quot;: &quot;k8s/31414/intranet-testapp/default/cc90e0c9508a44667bdae2e83d3</strong></em><em><strong>&quot;
         *         }
         *       }
         *     ],
         *     &quot;scheduler&quot;: &quot;rr&quot;,
         *     &quot;serviceType&quot;: &quot;LoadBalancer&quot;,
         *     &quot;slbId&quot;: &quot;lb-bp1ikoh3nrpgqsm</strong></em>***&quot;,
         *     &quot;source&quot;: &quot;create&quot;,
         *     &quot;specification&quot;: &quot;slb.s3.large&quot;
         *   }
         * ]</p>
         */
        @NameInMap("SlbInfo")
        public String slbInfo;

        /**
         * <p>The version of Apache Tomcat.</p>
         * 
         * <strong>example:</strong>
         * <p>8.5.55</p>
         */
        @NameInMap("TomcatVersion")
        public String tomcatVersion;

        /**
         * <p>The workload type. Valid values: Deployment and StatefulSet. If you do not specify this parameter, Deployment is used.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployment</p>
         */
        @NameInMap("WorkloadType")
        public String workloadType;

        public static GetK8sApplicationResponseBodyApplcationApp build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationApp self = new GetK8sApplicationResponseBodyApplcationApp();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationApp setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public GetK8sApplicationResponseBodyApplcationApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetK8sApplicationResponseBodyApplcationApp setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public GetK8sApplicationResponseBodyApplcationApp setBuildpackId(Integer buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public Integer getBuildpackId() {
            return this.buildpackId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCmdArgs(GetK8sApplicationResponseBodyApplcationAppCmdArgs cmdArgs) {
            this.cmdArgs = cmdArgs;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationAppCmdArgs getCmdArgs() {
            return this.cmdArgs;
        }

        public GetK8sApplicationResponseBodyApplcationApp setCsClusterId(String csClusterId) {
            this.csClusterId = csClusterId;
            return this;
        }
        public String getCsClusterId() {
            return this.csClusterId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetK8sApplicationResponseBodyApplcationApp setDevelopType(String developType) {
            this.developType = developType;
            return this;
        }
        public String getDevelopType() {
            return this.developType;
        }

        public GetK8sApplicationResponseBodyApplcationApp setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        public GetK8sApplicationResponseBodyApplcationApp setEnableEmptyPushReject(Boolean enableEmptyPushReject) {
            this.enableEmptyPushReject = enableEmptyPushReject;
            return this;
        }
        public Boolean getEnableEmptyPushReject() {
            return this.enableEmptyPushReject;
        }

        public GetK8sApplicationResponseBodyApplcationApp setEnableLosslessRule(Boolean enableLosslessRule) {
            this.enableLosslessRule = enableLosslessRule;
            return this;
        }
        public Boolean getEnableLosslessRule() {
            return this.enableLosslessRule;
        }

        public GetK8sApplicationResponseBodyApplcationApp setEnvList(GetK8sApplicationResponseBodyApplcationAppEnvList envList) {
            this.envList = envList;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationAppEnvList getEnvList() {
            return this.envList;
        }

        public GetK8sApplicationResponseBodyApplcationApp setFeatureAnnotations(String featureAnnotations) {
            this.featureAnnotations = featureAnnotations;
            return this;
        }
        public String getFeatureAnnotations() {
            return this.featureAnnotations;
        }

        public GetK8sApplicationResponseBodyApplcationApp setInstances(Integer instances) {
            this.instances = instances;
            return this;
        }
        public Integer getInstances() {
            return this.instances;
        }

        public GetK8sApplicationResponseBodyApplcationApp setInstancesBeforeScaling(Integer instancesBeforeScaling) {
            this.instancesBeforeScaling = instancesBeforeScaling;
            return this;
        }
        public Integer getInstancesBeforeScaling() {
            return this.instancesBeforeScaling;
        }

        public GetK8sApplicationResponseBodyApplcationApp setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLimitCpuM(Integer limitCpuM) {
            this.limitCpuM = limitCpuM;
            return this;
        }
        public Integer getLimitCpuM() {
            return this.limitCpuM;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLimitEphemeralStorage(String limitEphemeralStorage) {
            this.limitEphemeralStorage = limitEphemeralStorage;
            return this;
        }
        public String getLimitEphemeralStorage() {
            return this.limitEphemeralStorage;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLimitMem(Integer limitMem) {
            this.limitMem = limitMem;
            return this;
        }
        public Integer getLimitMem() {
            return this.limitMem;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLosslessRuleAligned(Boolean losslessRuleAligned) {
            this.losslessRuleAligned = losslessRuleAligned;
            return this;
        }
        public Boolean getLosslessRuleAligned() {
            return this.losslessRuleAligned;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLosslessRuleDelayTime(Integer losslessRuleDelayTime) {
            this.losslessRuleDelayTime = losslessRuleDelayTime;
            return this;
        }
        public Integer getLosslessRuleDelayTime() {
            return this.losslessRuleDelayTime;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLosslessRuleFuncType(Integer losslessRuleFuncType) {
            this.losslessRuleFuncType = losslessRuleFuncType;
            return this;
        }
        public Integer getLosslessRuleFuncType() {
            return this.losslessRuleFuncType;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLosslessRuleRelated(Boolean losslessRuleRelated) {
            this.losslessRuleRelated = losslessRuleRelated;
            return this;
        }
        public Boolean getLosslessRuleRelated() {
            return this.losslessRuleRelated;
        }

        public GetK8sApplicationResponseBodyApplcationApp setLosslessRuleWarmupTime(Integer losslessRuleWarmupTime) {
            this.losslessRuleWarmupTime = losslessRuleWarmupTime;
            return this;
        }
        public Integer getLosslessRuleWarmupTime() {
            return this.losslessRuleWarmupTime;
        }

        public GetK8sApplicationResponseBodyApplcationApp setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetK8sApplicationResponseBodyApplcationApp setRequestCpuM(Integer requestCpuM) {
            this.requestCpuM = requestCpuM;
            return this;
        }
        public Integer getRequestCpuM() {
            return this.requestCpuM;
        }

        public GetK8sApplicationResponseBodyApplcationApp setRequestEphemeralStorage(String requestEphemeralStorage) {
            this.requestEphemeralStorage = requestEphemeralStorage;
            return this;
        }
        public String getRequestEphemeralStorage() {
            return this.requestEphemeralStorage;
        }

        public GetK8sApplicationResponseBodyApplcationApp setRequestMem(Integer requestMem) {
            this.requestMem = requestMem;
            return this;
        }
        public Integer getRequestMem() {
            return this.requestMem;
        }

        public GetK8sApplicationResponseBodyApplcationApp setSecurityContext(String securityContext) {
            this.securityContext = securityContext;
            return this;
        }
        public String getSecurityContext() {
            return this.securityContext;
        }

        public GetK8sApplicationResponseBodyApplcationApp setSlbInfo(String slbInfo) {
            this.slbInfo = slbInfo;
            return this;
        }
        public String getSlbInfo() {
            return this.slbInfo;
        }

        public GetK8sApplicationResponseBodyApplcationApp setTomcatVersion(String tomcatVersion) {
            this.tomcatVersion = tomcatVersion;
            return this;
        }
        public String getTomcatVersion() {
            return this.tomcatVersion;
        }

        public GetK8sApplicationResponseBodyApplcationApp setWorkloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public String getWorkloadType() {
            return this.workloadType;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationConf extends TeaModel {
        /**
         * <p>The affinity configuration of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;nodeAffinity\&quot;:{\&quot;requiredDuringSchedulingIgnoredDuringExecution\&quot;:{\&quot;nodeSelectorTerms\&quot;:[{\&quot;matchExpressions\&quot;:[{\&quot;key\&quot;:\&quot;beta.kubernetes.io/arch\&quot;,\&quot;operator\&quot;:\&quot;NotIn\&quot;,\&quot;values\&quot;:[\&quot;arm64\&quot;,\&quot;arm32\&quot;]}]}]},\&quot;preferredDuringSchedulingIgnoredDuringExecution\&quot;:[{\&quot;weight\&quot;:5,\&quot;preference\&quot;:{\&quot;matchExpressions\&quot;:[{\&quot;key\&quot;:\&quot;kubernetes.io/os\&quot;,\&quot;operator\&quot;:\&quot;In\&quot;,\&quot;values\&quot;:[\&quot;linux\&quot;]}]}}]},\&quot;podAffinity\&quot;:{\&quot;requiredDuringSchedulingIgnoredDuringExecution\&quot;:[{\&quot;labelSelector\&quot;:{\&quot;matchExpressions\&quot;:[{\&quot;key\&quot;:\&quot;edas.oam.acname\&quot;,\&quot;operator\&quot;:\&quot;NotIn\&quot;,\&quot;values\&quot;:[\&quot;edas-test-app\&quot;]}]},\&quot;namespaces\&quot;:[\&quot;default\&quot;],\&quot;topologyKey\&quot;:\&quot;kubernetes.io/hostname\&quot;}]},\&quot;podAntiAffinity\&quot;:{\&quot;preferredDuringSchedulingIgnoredDuringExecution\&quot;:[{\&quot;weight\&quot;:15,\&quot;podAffinityTerm\&quot;:{\&quot;labelSelector\&quot;:{\&quot;matchExpressions\&quot;:[{\&quot;key\&quot;:\&quot;edas.oam.acname\&quot;,\&quot;operator\&quot;:\&quot;In\&quot;,\&quot;values\&quot;:[\&quot;edas-test-app-2\&quot;]}]},\&quot;namespaces\&quot;:[\&quot;default\&quot;],\&quot;topologyKey\&quot;:\&quot;failure-domain.beta.kubernetes.io/zone\&quot;}}]}}&quot;</p>
         */
        @NameInMap("Affinity")
        public String affinity;

        /**
         * <p>Indicates whether the application is connected to Application High Availability Service (AHAS).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AhasEnabled")
        public Boolean ahasEnabled;

        /**
         * <p>Indicates whether the application instances are deployed across nodes.</p>
         * <ul>
         * <li>Value <code>true</code> indicates that the application instances are deployed across nodes.</li>
         * <li>Other values indicate that the application instances are not deployed across nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeployAcrossNodes")
        public String deployAcrossNodes;

        /**
         * <p>Indicates whether the application instances are deployed across zones.</p>
         * <ul>
         * <li>Value <code>true</code> indicates that the application instances are deployed across zones.</li>
         * <li>Other values indicate that the application instances are not deployed across zones.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeployAcrossZones")
        public String deployAcrossZones;

        /**
         * <p>The startup parameters for a JAR application. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>-lh</p>
         */
        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        /**
         * <p>The startup options for a JAR application. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>-h</p>
         */
        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        /**
         * <p>The startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>ls</p>
         */
        @NameInMap("K8sCmd")
        public String k8sCmd;

        /**
         * <p>The parameters of the startup command.</p>
         * 
         * <strong>example:</strong>
         * <p>-lh</p>
         */
        @NameInMap("K8sCmdArgs")
        public String k8sCmdArgs;

        /**
         * <p>The information about the local storage.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;&quot;,&quot;nodePath&quot;:&quot;/mnt/&quot;,&quot;mountPath&quot;:&quot;/mnt/&quot;}]</p>
         */
        @NameInMap("K8sLocalvolumeInfo")
        public String k8sLocalvolumeInfo;

        /**
         * <p>The information about the File Storage NAS (NAS) storage.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;nasPath&quot;:&quot;/mnt/&quot;,&quot;mountPath&quot;:&quot;/mnt/&quot;}]</p>
         */
        @NameInMap("K8sNasInfo")
        public String k8sNasInfo;

        /**
         * <p>The information about the storage.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;hostPaths\&quot;:\&quot;[]\&quot;,\&quot;emptyDirs\&quot;:\&quot;[]\&quot;}&quot;</p>
         */
        @NameInMap("K8sVolumeInfo")
        public String k8sVolumeInfo;

        /**
         * <p>The information about the liveness check on the container.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;tcpSocket&quot;:{&quot;host&quot;:&quot;&quot;, &quot;port&quot;:8080}}</p>
         */
        @NameInMap("Liveness")
        public String liveness;

        /**
         * <p>The script executed after the container is started.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;ls\&quot;,\&quot;/\&quot;]}}&quot;</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script executed before the container is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;ls\&quot;,\&quot;/\&quot;]}}&quot;</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The information about the readiness check on the container.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;failureThreshold&quot;: 3,&quot;initialDelaySeconds&quot;: 5,&quot;successThreshold&quot;: 1,&quot;timeoutSeconds&quot;: 1,&quot;httpGet&quot;: {&quot;path&quot;: &quot;/consumer&quot;,&quot;port&quot;: 8080,&quot;scheme&quot;: &quot;HTTP&quot;,&quot;httpHeaders&quot;: [{&quot;name&quot;: &quot;test&quot;,&quot;value&quot;: &quot;testvalue&quot;}\]}}</p>
         */
        @NameInMap("Readiness")
        public String readiness;

        /**
         * <p>The type of the container runtime. This parameter is applicable only to clusters that use sandboxed containers.</p>
         * 
         * <strong>example:</strong>
         * <p>runc</p>
         */
        @NameInMap("RuntimeClassName")
        public String runtimeClassName;

        /**
         * <p>The scheduling tolerance configuration of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[{\&quot;key\&quot;:\&quot;edas-taint-key2\&quot;,\&quot;operator\&quot;:\&quot;Exists\&quot;,\&quot;effect\&quot;:\&quot;NoExecute\&quot;,\&quot;tolerationSeconds\&quot;:50},{\&quot;key\&quot;:\&quot;edas-taint-key\&quot;,\&quot;operator\&quot;:\&quot;Equal\&quot;,\&quot;value\&quot;:\&quot;edas-taint-value\&quot;,\&quot;effect\&quot;:\&quot;PreferNoSchedule\&quot;}]&quot;</p>
         */
        @NameInMap("Tolerations")
        public String tolerations;

        /**
         * <p>The URL of the base image. If you use a custom Java Development Kit (JDK) runtime, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>openjdk:8u302</p>
         */
        @NameInMap("UserBaseImageUrl")
        public String userBaseImageUrl;

        public static GetK8sApplicationResponseBodyApplcationConf build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationConf self = new GetK8sApplicationResponseBodyApplcationConf();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationConf setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

        public GetK8sApplicationResponseBodyApplcationConf setAhasEnabled(Boolean ahasEnabled) {
            this.ahasEnabled = ahasEnabled;
            return this;
        }
        public Boolean getAhasEnabled() {
            return this.ahasEnabled;
        }

        public GetK8sApplicationResponseBodyApplcationConf setDeployAcrossNodes(String deployAcrossNodes) {
            this.deployAcrossNodes = deployAcrossNodes;
            return this;
        }
        public String getDeployAcrossNodes() {
            return this.deployAcrossNodes;
        }

        public GetK8sApplicationResponseBodyApplcationConf setDeployAcrossZones(String deployAcrossZones) {
            this.deployAcrossZones = deployAcrossZones;
            return this;
        }
        public String getDeployAcrossZones() {
            return this.deployAcrossZones;
        }

        public GetK8sApplicationResponseBodyApplcationConf setJarStartArgs(String jarStartArgs) {
            this.jarStartArgs = jarStartArgs;
            return this;
        }
        public String getJarStartArgs() {
            return this.jarStartArgs;
        }

        public GetK8sApplicationResponseBodyApplcationConf setJarStartOptions(String jarStartOptions) {
            this.jarStartOptions = jarStartOptions;
            return this;
        }
        public String getJarStartOptions() {
            return this.jarStartOptions;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sCmd(String k8sCmd) {
            this.k8sCmd = k8sCmd;
            return this;
        }
        public String getK8sCmd() {
            return this.k8sCmd;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sCmdArgs(String k8sCmdArgs) {
            this.k8sCmdArgs = k8sCmdArgs;
            return this;
        }
        public String getK8sCmdArgs() {
            return this.k8sCmdArgs;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sLocalvolumeInfo(String k8sLocalvolumeInfo) {
            this.k8sLocalvolumeInfo = k8sLocalvolumeInfo;
            return this;
        }
        public String getK8sLocalvolumeInfo() {
            return this.k8sLocalvolumeInfo;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sNasInfo(String k8sNasInfo) {
            this.k8sNasInfo = k8sNasInfo;
            return this;
        }
        public String getK8sNasInfo() {
            return this.k8sNasInfo;
        }

        public GetK8sApplicationResponseBodyApplcationConf setK8sVolumeInfo(String k8sVolumeInfo) {
            this.k8sVolumeInfo = k8sVolumeInfo;
            return this;
        }
        public String getK8sVolumeInfo() {
            return this.k8sVolumeInfo;
        }

        public GetK8sApplicationResponseBodyApplcationConf setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public GetK8sApplicationResponseBodyApplcationConf setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public GetK8sApplicationResponseBodyApplcationConf setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public GetK8sApplicationResponseBodyApplcationConf setReadiness(String readiness) {
            this.readiness = readiness;
            return this;
        }
        public String getReadiness() {
            return this.readiness;
        }

        public GetK8sApplicationResponseBodyApplcationConf setRuntimeClassName(String runtimeClassName) {
            this.runtimeClassName = runtimeClassName;
            return this;
        }
        public String getRuntimeClassName() {
            return this.runtimeClassName;
        }

        public GetK8sApplicationResponseBodyApplcationConf setTolerations(String tolerations) {
            this.tolerations = tolerations;
            return this;
        }
        public String getTolerations() {
            return this.tolerations;
        }

        public GetK8sApplicationResponseBodyApplcationConf setUserBaseImageUrl(String userBaseImageUrl) {
            this.userBaseImageUrl = userBaseImageUrl;
            return this;
        }
        public String getUserBaseImageUrl() {
            return this.userBaseImageUrl;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents extends TeaModel {
        /**
         * <p>The component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The keyword that is included in the component name.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("ComponentKey")
        public String componentKey;

        /**
         * <p>The component type. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>JDK</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents self = new GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents setComponentKey(String componentKey) {
            this.componentKey = componentKey;
            return this;
        }
        public String getComponentKey() {
            return this.componentKey;
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents extends TeaModel {
        @NameInMap("Components")
        public java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents> components;

        public static GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents self = new GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents setComponents(java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponentsComponents> getComponents() {
            return this.components;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup extends TeaModel {
        /**
         * <p>The information about the component.</p>
         */
        @NameInMap("Components")
        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents components;

        /**
         * <p>The environment variable. This parameter is different from the EnvList parameter. This parameter specifies the referenced configuration of the ConfigMap or Secret.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[&quot;{\&quot;name\&quot;:\&quot;test1\&quot;,\&quot;valueFrom\&quot;:{\&quot;configMapKeyRef\&quot;:{\&quot;name\&quot;:\&quot;edas-demo-configmap\&quot;,\&quot;key\&quot;:\&quot;key1\&quot;}}}&quot;,&quot;{\&quot;name\&quot;:\&quot;k2\&quot;,\&quot;value\&quot;:\&quot;v2\&quot;}&quot;,&quot;{\&quot;name\&quot;:\&quot;s1\&quot;,\&quot;valueFrom\&quot;:{\&quot;secretKeyRef\&quot;:{\&quot;name\&quot;:\&quot;edas-demo-secret\&quot;,\&quot;key\&quot;:\&quot;k1\&quot;}}}&quot;]&quot;</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The source of the environment variable.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;configMapRef&quot;:{&quot;name&quot;:&quot;test-cm&quot;}}]</p>
         */
        @NameInMap("EnvFrom")
        public String envFrom;

        public static GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup self = new GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup setComponents(GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents components) {
            this.components = components;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroupComponents getComponents() {
            return this.components;
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup setEnvFrom(String envFrom) {
            this.envFrom = envFrom;
            return this;
        }
        public String getEnvFrom() {
            return this.envFrom;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationDeployGroups extends TeaModel {
        @NameInMap("DeployGroup")
        public java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup> deployGroup;

        public static GetK8sApplicationResponseBodyApplcationDeployGroups build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationDeployGroups self = new GetK8sApplicationResponseBodyApplcationDeployGroups();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationDeployGroups setDeployGroup(java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup> deployGroup) {
            this.deployGroup = deployGroup;
            return this;
        }
        public java.util.List<GetK8sApplicationResponseBodyApplcationDeployGroupsDeployGroup> getDeployGroup() {
            return this.deployGroup;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationImageInfo extends TeaModel {
        /**
         * <p>The URL of the image.</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The region ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        /**
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>131****067006888_shared_repo</p>
         */
        @NameInMap("RepoName")
        public String repoName;

        /**
         * <p>The namespace to which the image repository belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>edas-server****-user</p>
         */
        @NameInMap("RepoNamespace")
        public String repoNamespace;

        /**
         * <p>The source type of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>ALI_HUB</p>
         */
        @NameInMap("RepoOriginType")
        public String repoOriginType;

        /**
         * <p>The tag of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>5a166fbd-9d76-4f98-****-781659d9f54c_1572485443282</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static GetK8sApplicationResponseBodyApplcationImageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationImageInfo self = new GetK8sApplicationResponseBodyApplcationImageInfo();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoName(String repoName) {
            this.repoName = repoName;
            return this;
        }
        public String getRepoName() {
            return this.repoName;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoNamespace(String repoNamespace) {
            this.repoNamespace = repoNamespace;
            return this;
        }
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setRepoOriginType(String repoOriginType) {
            this.repoOriginType = repoOriginType;
            return this;
        }
        public String getRepoOriginType() {
            return this.repoOriginType;
        }

        public GetK8sApplicationResponseBodyApplcationImageInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcationLatestVersion extends TeaModel {
        /**
         * <p>The version of the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>20200720</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar">https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL of the deployment package. This parameter is required if you use a FatJar or WAR package to deploy the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar">https://e***.oss-cn-beijing.aliyuncs.com/s***-1.0-SNAPSHOT-spring-boot.jar</a></p>
         */
        @NameInMap("WarUrl")
        public String warUrl;

        public static GetK8sApplicationResponseBodyApplcationLatestVersion build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcationLatestVersion self = new GetK8sApplicationResponseBodyApplcationLatestVersion();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcationLatestVersion setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public GetK8sApplicationResponseBodyApplcationLatestVersion setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetK8sApplicationResponseBodyApplcationLatestVersion setWarUrl(String warUrl) {
            this.warUrl = warUrl;
            return this;
        }
        public String getWarUrl() {
            return this.warUrl;
        }

    }

    public static class GetK8sApplicationResponseBodyApplcation extends TeaModel {
        /**
         * <p>The basic information about the application.</p>
         */
        @NameInMap("App")
        public GetK8sApplicationResponseBodyApplcationApp app;

        /**
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>a5281053-<strong><strong>-47a5-b2ab-5c0323de</strong></strong></p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The configurations.</p>
         */
        @NameInMap("Conf")
        public GetK8sApplicationResponseBodyApplcationConf conf;

        /**
         * <p>The information about the instance group in which the application is deployed.</p>
         */
        @NameInMap("DeployGroups")
        public GetK8sApplicationResponseBodyApplcationDeployGroups deployGroups;

        /**
         * <p>The information about the image.</p>
         */
        @NameInMap("ImageInfo")
        public GetK8sApplicationResponseBodyApplcationImageInfo imageInfo;

        /**
         * <p>The information about the latest version.</p>
         */
        @NameInMap("LatestVersion")
        public GetK8sApplicationResponseBodyApplcationLatestVersion latestVersion;

        public static GetK8sApplicationResponseBodyApplcation build(java.util.Map<String, ?> map) throws Exception {
            GetK8sApplicationResponseBodyApplcation self = new GetK8sApplicationResponseBodyApplcation();
            return TeaModel.build(map, self);
        }

        public GetK8sApplicationResponseBodyApplcation setApp(GetK8sApplicationResponseBodyApplcationApp app) {
            this.app = app;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationApp getApp() {
            return this.app;
        }

        public GetK8sApplicationResponseBodyApplcation setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetK8sApplicationResponseBodyApplcation setConf(GetK8sApplicationResponseBodyApplcationConf conf) {
            this.conf = conf;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationConf getConf() {
            return this.conf;
        }

        public GetK8sApplicationResponseBodyApplcation setDeployGroups(GetK8sApplicationResponseBodyApplcationDeployGroups deployGroups) {
            this.deployGroups = deployGroups;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationDeployGroups getDeployGroups() {
            return this.deployGroups;
        }

        public GetK8sApplicationResponseBodyApplcation setImageInfo(GetK8sApplicationResponseBodyApplcationImageInfo imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationImageInfo getImageInfo() {
            return this.imageInfo;
        }

        public GetK8sApplicationResponseBodyApplcation setLatestVersion(GetK8sApplicationResponseBodyApplcationLatestVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public GetK8sApplicationResponseBodyApplcationLatestVersion getLatestVersion() {
            return this.latestVersion;
        }

    }

}
