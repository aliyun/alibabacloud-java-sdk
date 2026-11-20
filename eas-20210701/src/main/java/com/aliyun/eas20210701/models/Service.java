// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Service extends TeaModel {
    /**
     * <p>The request token of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>MzJiMDI5MDliODc0MTlkYmI0ZDhlYmExYjczYTIyZTE3Zm********</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The configuration information of the application service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ModelStorage&quot;:&quot;oss&quot;}</p>
     */
    @NameInMap("AppConfig")
    public String appConfig;

    /**
     * <p>The specification name of the application service.</p>
     * 
     * <strong>example:</strong>
     * <p>llama_7b_fp16</p>
     */
    @NameInMap("AppSpecName")
    public String appSpecName;

    /**
     * <p>The type of the application service.</p>
     * 
     * <strong>example:</strong>
     * <p>LLM</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The version of the application service.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>Specifies whether elastic scaling is enabled for the service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoscalerEnabled")
    public Boolean autoscalerEnabled;

    /**
     * <p>The UID of the account that created the service.</p>
     * 
     * <strong>example:</strong>
     * <p>20123*******</p>
     */
    @NameInMap("CallerUid")
    public String callerUid;

    /**
     * <p>The number of CPUs requested for each instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The time when the service was created. The time is displayed in UTC and follows the RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-29T11:13:20Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Specifies whether scheduled scaling is enabled for the service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CronscalerEnabled")
    public Boolean cronscalerEnabled;

    /**
     * <p>The version of the model that is currently running.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentVersion")
    public Integer currentVersion;

    /**
     * <p>The extra information of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;blue_green_services&quot;:[&quot;test&quot;,&quot;testxxxx&quot;]}</p>
     */
    @NameInMap("ExtraData")
    public String extraData;

    /**
     * <p>The GPU compute capacity requested by each instance after GPU sharing is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("GPUCorePercentage")
    public Integer GPUCorePercentage;

    /**
     * <p>The GPU memory size requested by each instance after GPU sharing is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("GPUMemory")
    public Integer GPUMemory;

    /**
     * <p>The dedicated gateway ID of the service. This information is available only for services bound to a dedicated gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxxxxx</p>
     */
    @NameInMap("Gateway")
    public String gateway;

    /**
     * <p>The number of GPUs requested for each instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Gpu")
    public Integer gpu;

    /**
     * <p>The data image of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-shanghai.aliyuncs.com/eas/echo_cn-shanghai:v0.0.1-20210129111320</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The distribution of instances across different resource types.</p>
     */
    @NameInMap("InstanceCountInResource")
    public ServiceInstanceCountInResource instanceCountInResource;

    /**
     * <p>The public endpoint of the service. This field is returned only in the DescribeService operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://10123*****.cn-shanghai.aliyuncs.com/api/predict/echo">http://10123*****.cn-shanghai.aliyuncs.com/api/predict/echo</a></p>
     */
    @NameInMap("InternetEndpoint")
    public String internetEndpoint;

    /**
     * <p>The internal endpoint of the service. This field is returned only in the DescribeService operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://10123*****.vpc.cn-shanghai.aliyuncs.com/api/predict/echo">http://10123*****.vpc.cn-shanghai.aliyuncs.com/api/predict/echo</a></p>
     */
    @NameInMap("IntranetEndpoint")
    public String intranetEndpoint;

    /**
     * <p>The list of service labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<ServiceLabels> labels;

    /**
     * <p>The latest version of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LatestVersion")
    public Integer latestVersion;

    /**
     * <p>The memory requested for each instance, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The summary information of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>Service start successfully</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The namespace of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The UID of the primary account to which the account that created the service belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>11234*******</p>
     */
    @NameInMap("ParentUid")
    public String parentUid;

    /**
     * <p>The number of pending instances of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PendingInstance")
    public Integer pendingInstance;

    /**
     * <p>The quota ID of the service. This information is available only for services deployed on Lingjun resource quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>quotaxxxxx</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The reason for the service status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The region where the service is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-xxxxxxx</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The alias of the resource group to which the service belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my_resource</p>
     */
    @NameInMap("ResourceAlias")
    public String resourceAlias;

    /**
     * <p>Specifies whether the elastic resource pool is enabled for the service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceBurstable")
    public Boolean resourceBurstable;

    /**
     * <p>The service role.</p>
     * 
     * <strong>example:</strong>
     * <p>Queue</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The additional attributes of the service role. This field is returned only in the DescribeService operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ApproxMaxLength&quot;:null,&quot;Length&quot;:null,&quot;MaxPayloadBytes&quot;:null}</p>
     */
    @NameInMap("RoleAttrs")
    public String roleAttrs;

    /**
     * <p>The number of running instances of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RunningInstance")
    public Integer runningInstance;

    /**
     * <p>The service safety lock.</p>
     * 
     * <strong>example:</strong>
     * <p>dangerous</p>
     */
    @NameInMap("SafetyLock")
    public String safetyLock;

    /**
     * <p>The public endpoint for synchronous requests of asynchronous services. This field is returned only in the DescribeService operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://10123*****.cn-shanghai.aliyuncs.com/api/predict/async_path.echo">http://10123*****.cn-shanghai.aliyuncs.com/api/predict/async_path.echo</a></p>
     */
    @NameInMap("SecondaryInternetEndpoint")
    public String secondaryInternetEndpoint;

    /**
     * <p>The internal endpoint for synchronous requests of asynchronous services. This field is returned only in the DescribeService operation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://10123*****.vpc.cn-shanghai.aliyuncs.com/api/predict/async_path.echo">http://10123*****.vpc.cn-shanghai.aliyuncs.com/api/predict/async_path.echo</a></p>
     */
    @NameInMap("SecondaryIntranetEndpoint")
    public String secondaryIntranetEndpoint;

    /**
     * <p>The configuration of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;metadata&quot;:{&quot;cpu&quot;:1,&quot;instance&quot;:1,&quot;memory&quot;:1024},&quot;name&quot;:&quot;echo&quot;,&quot;processor_entry&quot;:&quot;libecho.so&quot;,&quot;processor_path&quot;:&quot;<a href="http://oss-cn-hangzhou-zmf.aliyuncs.com/059247/echo_processor_release.tar.gz%22,%22processor_type%22:%22cpp%22%7D">http://oss-cn-hangzhou-zmf.aliyuncs.com/059247/echo_processor_release.tar.gz&quot;,&quot;processor_type&quot;:&quot;cpp&quot;}</a></p>
     */
    @NameInMap("ServiceConfig")
    public String serviceConfig;

    /**
     * <p>The group to which the service belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>my_group</p>
     */
    @NameInMap("ServiceGroup")
    public String serviceGroup;

    /**
     * <p>The unique ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-m-xxasdat</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The ID of the service. This value is the same as ServiceId.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-m-xxasdat</p>
     */
    @NameInMap("ServiceUid")
    public String serviceUid;

    /**
     * <p>The deployment source of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The status of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of instances of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalInstance")
    public Integer totalInstance;

    /**
     * <p>The traffic status.</p>
     * 
     * <strong>example:</strong>
     * <p>standalone</p>
     */
    @NameInMap("TrafficState")
    public String trafficState;

    /**
     * <p>The time when the service was updated. The time is displayed in UTC and follows the RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-29T11:13:20Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The weight for the canary release of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    /**
     * <p>The workload type of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>stateless</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    /**
     * <p>The workspace ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>123445</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Service build(java.util.Map<String, ?> map) throws Exception {
        Service self = new Service();
        return TeaModel.build(map, self);
    }

    public Service setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public Service setAppConfig(String appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public String getAppConfig() {
        return this.appConfig;
    }

    public Service setAppSpecName(String appSpecName) {
        this.appSpecName = appSpecName;
        return this;
    }
    public String getAppSpecName() {
        return this.appSpecName;
    }

    public Service setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public Service setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public Service setAutoscalerEnabled(Boolean autoscalerEnabled) {
        this.autoscalerEnabled = autoscalerEnabled;
        return this;
    }
    public Boolean getAutoscalerEnabled() {
        return this.autoscalerEnabled;
    }

    public Service setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public Service setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public Service setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Service setCronscalerEnabled(Boolean cronscalerEnabled) {
        this.cronscalerEnabled = cronscalerEnabled;
        return this;
    }
    public Boolean getCronscalerEnabled() {
        return this.cronscalerEnabled;
    }

    public Service setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public Integer getCurrentVersion() {
        return this.currentVersion;
    }

    public Service setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public Service setGPUCorePercentage(Integer GPUCorePercentage) {
        this.GPUCorePercentage = GPUCorePercentage;
        return this;
    }
    public Integer getGPUCorePercentage() {
        return this.GPUCorePercentage;
    }

    public Service setGPUMemory(Integer GPUMemory) {
        this.GPUMemory = GPUMemory;
        return this;
    }
    public Integer getGPUMemory() {
        return this.GPUMemory;
    }

    public Service setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public Service setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public Service setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public Service setInstanceCountInResource(ServiceInstanceCountInResource instanceCountInResource) {
        this.instanceCountInResource = instanceCountInResource;
        return this;
    }
    public ServiceInstanceCountInResource getInstanceCountInResource() {
        return this.instanceCountInResource;
    }

    public Service setInternetEndpoint(String internetEndpoint) {
        this.internetEndpoint = internetEndpoint;
        return this;
    }
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    public Service setIntranetEndpoint(String intranetEndpoint) {
        this.intranetEndpoint = intranetEndpoint;
        return this;
    }
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    public Service setLabels(java.util.List<ServiceLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ServiceLabels> getLabels() {
        return this.labels;
    }

    public Service setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public Integer getLatestVersion() {
        return this.latestVersion;
    }

    public Service setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public Service setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Service setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Service setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public Service setPendingInstance(Integer pendingInstance) {
        this.pendingInstance = pendingInstance;
        return this;
    }
    public Integer getPendingInstance() {
        return this.pendingInstance;
    }

    public Service setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public Service setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public Service setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Service setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Service setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public Service setResourceAlias(String resourceAlias) {
        this.resourceAlias = resourceAlias;
        return this;
    }
    public String getResourceAlias() {
        return this.resourceAlias;
    }

    public Service setResourceBurstable(Boolean resourceBurstable) {
        this.resourceBurstable = resourceBurstable;
        return this;
    }
    public Boolean getResourceBurstable() {
        return this.resourceBurstable;
    }

    public Service setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public Service setRoleAttrs(String roleAttrs) {
        this.roleAttrs = roleAttrs;
        return this;
    }
    public String getRoleAttrs() {
        return this.roleAttrs;
    }

    public Service setRunningInstance(Integer runningInstance) {
        this.runningInstance = runningInstance;
        return this;
    }
    public Integer getRunningInstance() {
        return this.runningInstance;
    }

    public Service setSafetyLock(String safetyLock) {
        this.safetyLock = safetyLock;
        return this;
    }
    public String getSafetyLock() {
        return this.safetyLock;
    }

    public Service setSecondaryInternetEndpoint(String secondaryInternetEndpoint) {
        this.secondaryInternetEndpoint = secondaryInternetEndpoint;
        return this;
    }
    public String getSecondaryInternetEndpoint() {
        return this.secondaryInternetEndpoint;
    }

    public Service setSecondaryIntranetEndpoint(String secondaryIntranetEndpoint) {
        this.secondaryIntranetEndpoint = secondaryIntranetEndpoint;
        return this;
    }
    public String getSecondaryIntranetEndpoint() {
        return this.secondaryIntranetEndpoint;
    }

    public Service setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    public Service setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }
    public String getServiceGroup() {
        return this.serviceGroup;
    }

    public Service setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public Service setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public Service setServiceUid(String serviceUid) {
        this.serviceUid = serviceUid;
        return this;
    }
    public String getServiceUid() {
        return this.serviceUid;
    }

    public Service setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public Service setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Service setTotalInstance(Integer totalInstance) {
        this.totalInstance = totalInstance;
        return this;
    }
    public Integer getTotalInstance() {
        return this.totalInstance;
    }

    public Service setTrafficState(String trafficState) {
        this.trafficState = trafficState;
        return this;
    }
    public String getTrafficState() {
        return this.trafficState;
    }

    public Service setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public Service setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public Service setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

    public Service setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ServiceInstanceCountInResource extends TeaModel {
        /**
         * <p>The number of instances that use dedicated resource groups or self-managed resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Dedicated")
        public Integer dedicated;

        /**
         * <p>The number of instances that use public resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Public")
        public Integer _public;

        /**
         * <p>The number of instances that use Lingjun quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Quota")
        public Integer quota;

        public static ServiceInstanceCountInResource build(java.util.Map<String, ?> map) throws Exception {
            ServiceInstanceCountInResource self = new ServiceInstanceCountInResource();
            return TeaModel.build(map, self);
        }

        public ServiceInstanceCountInResource setDedicated(Integer dedicated) {
            this.dedicated = dedicated;
            return this;
        }
        public Integer getDedicated() {
            return this.dedicated;
        }

        public ServiceInstanceCountInResource set_public(Integer _public) {
            this._public = _public;
            return this;
        }
        public Integer get_public() {
            return this._public;
        }

        public ServiceInstanceCountInResource setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

    }

    public static class ServiceLabels extends TeaModel {
        /**
         * <p>The key of the service label.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("LabelKey")
        public String labelKey;

        /**
         * <p>The value of the service label.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("LabelValue")
        public String labelValue;

        public static ServiceLabels build(java.util.Map<String, ?> map) throws Exception {
            ServiceLabels self = new ServiceLabels();
            return TeaModel.build(map, self);
        }

        public ServiceLabels setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public ServiceLabels setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

}
