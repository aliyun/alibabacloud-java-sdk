// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateImageBuildRequest extends TeaModel {
    /**
     * <p>An idempotence token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The visibility of the image.</p>
     * <ul>
     * <li><p><strong>PUBLIC</strong>: The image is public.</p>
     * </li>
     * <li><p><strong>PRIVATE</strong>: The image is private.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p><strong>The build configuration. Specify the content of the Dockerfile to be built.</strong></p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BuildConfig")
    public CreateImageBuildRequestBuildConfig buildConfig;

    /**
     * <p>The metadata of the image.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Image")
    public CreateImageBuildRequestImage image;

    /**
     * <p>The name of the image build task.</p>
     * 
     * <strong>example:</strong>
     * <p>build-my-image</p>
     */
    @NameInMap("ImageBuildJobName")
    public String imageBuildJobName;

    /**
     * <p>Specifies whether to overwrite an existing image version in the image repository.</p>
     */
    @NameInMap("OverwriteImageTag")
    public Boolean overwriteImageTag;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resources used to run the task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resource")
    public CreateImageBuildRequestResource resource;

    /**
     * <p><strong>The configuration of the target image repository.</strong></p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetRegistry")
    public CreateImageBuildRequestTargetRegistry targetRegistry;

    /**
     * <p>The information about the user\&quot;s virtual private cloud (VPC). This parameter is required when you use the public resource group.</p>
     */
    @NameInMap("UserVpc")
    public CreateImageBuildRequestUserVpc userVpc;

    /**
     * <p>The workspace ID.</p>
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
         * <p>The build type. The following types are supported:</p>
         * <ul>
         * <li><p><strong>PackageInstallation</strong>: Installs software packages based on a specified image.</p>
         * </li>
         * <li><p><strong>CustomDockerfile</strong>: Builds an image based on a custom Dockerfile.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageInstallation</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        /**
         * <p>The content of the Dockerfile to be built.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FROM ubuntu:18:04
         * RUN pip3 install numpy==1.19.5</p>
         */
        @NameInMap("Dockerfile")
        public String dockerfile;

        /**
         * <p>The authentication information for the private image repository. You can specify the authentication information for an ACR image repository that does not belong to you. The format is \<code>{&quot;user_registry_domain&quot;:{&quot;Auth&quot;:&quot;base64 encoded auth&quot;}}\\</code>.</p>
         * 
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
         * <p>The key of the image label.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the image label.</p>
         * 
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
        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Build test image</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image labels.</p>
         */
        @NameInMap("Labels")
        public java.util.List<CreateImageBuildRequestImageLabels> labels;

        /**
         * <p>The name of the image. The name must meet the following requirements:</p>
         * <ul>
         * <li><p>The name must be 1 to 50 characters in length.</p>
         * </li>
         * <li><p>The name can contain lowercase letters, digits, and hyphens (-). It must start with a letter.</p>
         * </li>
         * <li><p>The name must be unique within the same workspace.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-v1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The image URL.</p>
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
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The memory size.</p>
         * 
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
         * <p>The instance type of the pay-as-you-go resource. This parameter is required when you use the public resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("EcsSpec")
        public String ecsSpec;

        /**
         * <p>The resource configuration. Specify this parameter when you use subscription resources. Leave it empty when you use the public resource group.</p>
         */
        @NameInMap("ResourceConfig")
        public CreateImageBuildRequestResourceResourceConfig resourceConfig;

        /**
         * <p>The resource quota ID. This parameter applies only to subscription resources. Do not set this parameter for pay-as-you-go resources.</p>
         * 
         * <strong>example:</strong>
         * <p>quotaadzoqup693z</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the subscription resource. Currently, only Lingjun resources are supported. Specify this parameter when you use subscription resources.</p>
         * 
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
         * <p>The ID of the image repository instance. This parameter is required when you use ACR as the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-**abcd</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the target image repository. Only ACR Enterprise Edition is supported.</p>
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
         * <p>The default route.</p>
         * <ul>
         * <li>eth1: Indicates that the user\&quot;s elastic network interface (ENI) is used to access the external network through a private gateway. For more information, see <a href="https://help.aliyun.com/zh/pai/user-guide/configure-a-dsw-instance-to-access-the-internet-through-a-private-nat-gateway?spm=a2c4g.11186623.0.0.3b3965f6SZWm85">Configure a Distribution Switch (DSW) instance to access the Internet through a private NAT gateway</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eth1</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <p>The extended CIDR blocks.</p>
         * <ul>
         * <li><p>If you do not specify a vSwitch ID, you can leave this parameter empty. The system automatically obtains all CIDR blocks of the VPC.</p>
         * </li>
         * <li><p>If you specify a vSwitch ID, you must specify this parameter. For best results, include all CIDR blocks of the VPC.</p>
         * </li>
         * </ul>
         */
        @NameInMap("ExtendedCidrs")
        public java.util.List<String> extendedCidrs;

        /**
         * <p>The security group ID. This parameter is required when you configure a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-abcdef**</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>vs-abcdef**</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>The VPC ID. If the build task needs to access your ACR Enterprise Edition instance, specify a VPC that is in the access control list of the instance.</p>
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
