// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateImageBuildRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>镜像构建的可见性，可能值： - PUBLIC：当前工作空间所有成员都可以操作。 - PRIVATE：只有创建者可以操作。</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>构建配置，指定待构建的 Dockerfile 文件内容。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BuildConfig")
    public CreateImageBuildRequestBuildConfig buildConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Image")
    public CreateImageBuildRequestImage image;

    /**
     * <strong>example:</strong>
     * <p>build-my-image</p>
     */
    @NameInMap("ImageBuildJobName")
    public String imageBuildJobName;

    /**
     * <p>是否覆盖更新 ACR 镜像仓库中已存在的镜像 tag。</p>
     */
    @NameInMap("OverwriteImageTag")
    public Boolean overwriteImageTag;

    /**
     * <p>代表region的资源属性字段</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>构建任务运行资源</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resource")
    public CreateImageBuildRequestResource resource;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetRegistry")
    public CreateImageBuildRequestTargetRegistry targetRegistry;

    /**
     * <p>用户专有网络信息。使用企业版 ACR 实例时，此参数必填，指定在用户 ACR 实例的访问控制里已添加的专有网络。</p>
     */
    @NameInMap("UserVpc")
    public CreateImageBuildRequestUserVpc userVpc;

    /**
     * <p>镜像构建所属的工作空间ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateImageBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageBuildRequest self = new CreateImageBuildRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageBuildRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageBuildRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateImageBuildRequest setBuildConfig(CreateImageBuildRequestBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public CreateImageBuildRequestBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public CreateImageBuildRequest setImage(CreateImageBuildRequestImage image) {
        this.image = image;
        return this;
    }
    public CreateImageBuildRequestImage getImage() {
        return this.image;
    }

    public CreateImageBuildRequest setImageBuildJobName(String imageBuildJobName) {
        this.imageBuildJobName = imageBuildJobName;
        return this;
    }
    public String getImageBuildJobName() {
        return this.imageBuildJobName;
    }

    public CreateImageBuildRequest setOverwriteImageTag(Boolean overwriteImageTag) {
        this.overwriteImageTag = overwriteImageTag;
        return this;
    }
    public Boolean getOverwriteImageTag() {
        return this.overwriteImageTag;
    }

    public CreateImageBuildRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateImageBuildRequest setResource(CreateImageBuildRequestResource resource) {
        this.resource = resource;
        return this;
    }
    public CreateImageBuildRequestResource getResource() {
        return this.resource;
    }

    public CreateImageBuildRequest setTargetRegistry(CreateImageBuildRequestTargetRegistry targetRegistry) {
        this.targetRegistry = targetRegistry;
        return this;
    }
    public CreateImageBuildRequestTargetRegistry getTargetRegistry() {
        return this.targetRegistry;
    }

    public CreateImageBuildRequest setUserVpc(CreateImageBuildRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public CreateImageBuildRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateImageBuildRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateImageBuildRequestBuildConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageInstallation</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        /**
         * <p>Dockerfile文件内容</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FROM ubuntu:18:04
         * RUN pip3 install numpy==1.19.5</p>
         */
        @NameInMap("Dockerfile")
        public String dockerfile;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;user-test-registry-vpc.cn-wulanchabu.cr.aliyuncs.com&quot;: {
         *     &quot;Auth&quot;: &quot;dXNlcjp0ZXN0&quot;
         *   }
         * }</p>
         */
        @NameInMap("RegistryAuths")
        public java.util.Map<String, ?> registryAuths;

        public static CreateImageBuildRequestBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateImageBuildRequestBuildConfig self = new CreateImageBuildRequestBuildConfig();
            return TeaModel.build(map, self);
        }

        public CreateImageBuildRequestBuildConfig setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public CreateImageBuildRequestBuildConfig setDockerfile(String dockerfile) {
            this.dockerfile = dockerfile;
            return this;
        }
        public String getDockerfile() {
            return this.dockerfile;
        }

        public CreateImageBuildRequestBuildConfig setRegistryAuths(java.util.Map<String, ?> registryAuths) {
            this.registryAuths = registryAuths;
            return this;
        }
        public java.util.Map<String, ?> getRegistryAuths() {
            return this.registryAuths;
        }

    }

    public static class CreateImageBuildRequestImageLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateImageBuildRequestImageLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateImageBuildRequestImageLabels self = new CreateImageBuildRequestImageLabels();
            return TeaModel.build(map, self);
        }

        public CreateImageBuildRequestImageLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImageBuildRequestImageLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateImageBuildRequestImage extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Labels")
        public java.util.List<CreateImageBuildRequestImageLabels> labels;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-v1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user-test-registry-vpc.cn-wulanchabu.cr.aliyuncs.com/pai-test/pai-test:test-v1</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static CreateImageBuildRequestImage build(java.util.Map<String, ?> map) throws Exception {
            CreateImageBuildRequestImage self = new CreateImageBuildRequestImage();
            return TeaModel.build(map, self);
        }

        public CreateImageBuildRequestImage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateImageBuildRequestImage setLabels(java.util.List<CreateImageBuildRequestImageLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateImageBuildRequestImageLabels> getLabels() {
            return this.labels;
        }

        public CreateImageBuildRequestImage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateImageBuildRequestImage setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class CreateImageBuildRequestResourceResourceConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("Memory")
        public String memory;

        public static CreateImageBuildRequestResourceResourceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateImageBuildRequestResourceResourceConfig self = new CreateImageBuildRequestResourceResourceConfig();
            return TeaModel.build(map, self);
        }

        public CreateImageBuildRequestResourceResourceConfig setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public CreateImageBuildRequestResourceResourceConfig setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

    }

    public static class CreateImageBuildRequestResource extends TeaModel {
        /**
         * <p>后付费资源规格</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("EcsSpec")
        public String ecsSpec;

        @NameInMap("ResourceConfig")
        public CreateImageBuildRequestResourceResourceConfig resourceConfig;

        /**
         * <strong>example:</strong>
         * <p>quotaadzoqup693z</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>Lingjun</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateImageBuildRequestResource build(java.util.Map<String, ?> map) throws Exception {
            CreateImageBuildRequestResource self = new CreateImageBuildRequestResource();
            return TeaModel.build(map, self);
        }

        public CreateImageBuildRequestResource setEcsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        public CreateImageBuildRequestResource setResourceConfig(CreateImageBuildRequestResourceResourceConfig resourceConfig) {
            this.resourceConfig = resourceConfig;
            return this;
        }
        public CreateImageBuildRequestResourceResourceConfig getResourceConfig() {
            return this.resourceConfig;
        }

        public CreateImageBuildRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateImageBuildRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class CreateImageBuildRequestTargetRegistry extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cri-**abcd</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AcrEnterprise</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateImageBuildRequestTargetRegistry build(java.util.Map<String, ?> map) throws Exception {
            CreateImageBuildRequestTargetRegistry self = new CreateImageBuildRequestTargetRegistry();
            return TeaModel.build(map, self);
        }

        public CreateImageBuildRequestTargetRegistry setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateImageBuildRequestTargetRegistry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateImageBuildRequestUserVpc extends TeaModel {
        /**
         * <p>默认路由网卡出口</p>
         * 
         * <strong>example:</strong>
         * <p>eth1</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <p>扩展网段</p>
         */
        @NameInMap("ExtendedCidrs")
        public java.util.List<String> extendedCidrs;

        /**
         * <p>安全组 ID</p>
         * 
         * <strong>example:</strong>
         * <p>sg-abcdef**</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>交换机 ID</p>
         * 
         * <strong>example:</strong>
         * <p>vs-abcdef**</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>专有网络 ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-abcdef**</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateImageBuildRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateImageBuildRequestUserVpc self = new CreateImageBuildRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateImageBuildRequestUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public CreateImageBuildRequestUserVpc setExtendedCidrs(java.util.List<String> extendedCidrs) {
            this.extendedCidrs = extendedCidrs;
            return this;
        }
        public java.util.List<String> getExtendedCidrs() {
            return this.extendedCidrs;
        }

        public CreateImageBuildRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateImageBuildRequestUserVpc setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public CreateImageBuildRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
