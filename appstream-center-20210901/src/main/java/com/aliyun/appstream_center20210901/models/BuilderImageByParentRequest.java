// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BuilderImageByParentRequest extends TeaModel {
    /**
     * <p>The business type to which the image belongs. <strong>Required</strong>. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Basic product.</li>
     * <li><strong>2</strong>: Personal cloud.</li>
     * <li><strong>3</strong>: Cloud office.</li>
     * <li><strong>4</strong>: Cloud Flow.</li>
     * <li><strong>10</strong>: Personal edition.</li>
     * <li><strong>20</strong>: Business edition.</li>
     * <li><strong>60</strong>: Linggou team edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The capacity of the data cloud disk in the creation environment. Unit: GiB. Specify this parameter when a data cloud disk is required, and ensure that it meets the disk requirements of the selected resource specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    /**
     * <p>The description of the new image, which facilitates subsequent queries and differentiation of images.</p>
     * 
     * <strong>example:</strong>
     * <p>Business image that includes office applications and standard configurations</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The operating system distribution information of the image. Enter the distribution identifier that is consistent with the parent image used.</p>
     * 
     * <strong>example:</strong>
     * <p>Ubuntu 22.04 64-bit</p>
     */
    @NameInMap("Distro")
    public String distro;

    /**
     * <p>The list of driver IDs used when creating the image. A maximum of 200 items are supported. When you need to specify drivers, enter the IDs of existing drivers that are applicable to the target image.</p>
     * <p><strong>If PropertyMap.DRIVER_LIST is also specified, this parameter overwrites the driver list in it.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;6d4af751-f522-40d7-ab6c-4a0ae587****&quot;,&quot;b5bdf6c0-41de-4878-8963-e8324106****&quot;]</p>
     */
    @NameInMap("DriverIdList")
    public java.util.List<String> driverIdList;

    /**
     * <p>The image creation mode. Use the following mode:</p>
     * <ul>
     * <li><strong>BUILDER_MANUAL</strong>: Manually enter the creation environment to install applications and configure the image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUILDER_MANUAL</p>
     */
    @NameInMap("ImageCreateMode")
    public String imageCreateMode;

    /**
     * <p>The name of the new image. <strong>Required</strong>. The name must start with a letter or a Chinese character, and can contain letters, digits, Chinese characters, colons (:), underscores (_), periods (.), and hyphens (-). It cannot start with http:// or https://. The length is calculated as 3 for each Chinese character and 1 for each other character. The total length must be 2 to 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeImage_202611</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The language of the image. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Simplified Chinese.</li>
     * <li><strong>zh-HK</strong>: Traditional Chinese (Hong Kong).</li>
     * <li><strong>en-US</strong>: English.</li>
     * <li><strong>ja-JP</strong>: Japanese.</li>
     * <li><strong>CN</strong>: Compatible value for Simplified Chinese.</li>
     * <li><strong>EN</strong>: Compatible value for English.</li>
     * <li><strong>JP</strong>: Compatible value for Japanese.</li>
     * <li><strong>CN-HK</strong>: Compatible value for Traditional Chinese (Hong Kong).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the node specifications for the creation resources. You can invoke ListNodeInstanceType to query the ID. Select a specification that is active in the creation region and under the associated product, and meets the CPU or GPU computing requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.general.4c8g</p>
     */
    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    /**
     * <p>The ID of the office network used by the creation resources. Specify this parameter when a specific office network is required, and ensure that it is consistent with the creation region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-example****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The package type of the image. Keep it consistent with the selected parent image and creation scenario. Valid values:</p>
     * <ul>
     * <li><strong>Ecs</strong>: ECS instance image.</li>
     * <li><strong>Vhd</strong>: VHD application image.</li>
     * <li><strong>Container</strong>: Container image.</li>
     * <li><strong>Ecs_Container</strong>: ECS and container combined image.</li>
     * <li><strong>K8s_Node</strong>: Kubernetes node image.</li>
     * </ul>
     * <p><strong>This operation does not provide the BaseImageId parameter. You cannot explicitly specify the Vhd or Container type that requires a base image to be configured separately.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The ID of the parent image used to create the new image. <strong>Required</strong>. You can call ListImage to query the ID. An available distribution record of the parent image must exist in the region where the image is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1parent****</p>
     */
    @NameInMap("ParentImageId")
    public String parentImageId;

    /**
     * <p>The computing type of the creation resources.</p>
     * <ul>
     * <li><strong>CPU</strong>: Uses CPU compute resources.</li>
     * <li><strong>GPU</strong>: Uses GPU compute resources.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("PerformanceType")
    public String performanceType;

    /**
     * <p>The product to which the image belongs. <strong>Required</strong>. Use an activated product and keep it consistent with the selected parent image. Valid values:</p>
     * <ul>
     * <li><strong>CloudGame</strong>: Cloud game.</li>
     * <li><strong>CloudApp</strong>: Wuying Cloud App.</li>
     * <li><strong>CloudBrowser</strong>: Secure browser.</li>
     * <li><strong>CloudDesktop</strong>: Wuying Cloud Computer.</li>
     * <li><strong>ImageBuilder</strong>: Image creation resource.</li>
     * <li><strong>ImageValidate</strong>: Image validation resource.</li>
     * <li><strong>AndroidCloud</strong>: Android cloud.</li>
     * <li><strong>GpuRender</strong>: GPU rendering.</li>
     * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering.</li>
     * <li><strong>WuyingServer</strong>: Enterprise edition workstation.</li>
     * <li><strong>GpuProxy</strong>: GPU remote rendering proxy.</li>
     * <li><strong>GpuCache</strong>: GPU remote rendering cache.</li>
     * <li><strong>AIAgent</strong>: AI agent service.</li>
     * <li><strong>HostedDesktop</strong>: Hosted computer.</li>
     * <li><strong>WuyingWorkstation</strong>: Personal edition container workstation.</li>
     * <li><strong>WuyingWorkstationBusiness</strong>: Business edition container workstation.</li>
     * <li><strong>WuyingWorkstationTeam</strong>: Linggou container workstation team edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The extended properties of the image. Both keys and values are strings. This parameter can be omitted when no extended configuration is required.</p>
     * <p>The property key for the driver list is DRIVER_LIST, and the value is a JSON string of an array of driver IDs. We recommend that you specify drivers by using DriverIdList. <strong>If both DriverIdList and PropertyMap.DRIVER_LIST are specified, DriverIdList takes precedence.</strong> Specify other extended properties only when their purposes and values are confirmed.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DRIVER_LIST&quot;:&quot;[\&quot;6d4af751-f522-40d7-ab6c-4a0ae587****\&quot;,\&quot;b5bdf6c0-41de-4878-8963-e8324106****\&quot;]&quot;}</p>
     */
    @NameInMap("PropertyMap")
    public java.util.Map<String, String> propertyMap;

    /**
     * <p>The list of resources required for image creation, such as the download URLs of applications to be installed. A maximum of 100 items are supported. The ResourceType and Resource of each item must correspond to each other.</p>
     */
    @NameInMap("ResourceList")
    public java.util.List<BuilderImageByParentRequestResourceList> resourceList;

    /**
     * <p>The running mode of the image creation environment. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: Normal running mode.</li>
     * <li><strong>COMPATIBLE</strong>: Compatible running mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    /**
     * <p>The ID of the region where the image is created. The selected parent image must have been distributed to this region. Available regions are also affected by the region configurations of the account and product.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The capacity of the system cloud disk in the creation environment. Unit: GiB. The capacity cannot be smaller than the system cloud disk capacity required by the parent image, and must meet the disk requirements of the selected resource specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The list of vSwitch IDs used by the creation resources. A maximum of 100 items are supported. The vSwitches must belong to the selected office network and be located in the creation region.</p>
     */
    @NameInMap("VSwitchIdList")
    public java.util.List<String> vSwitchIdList;

    /**
     * <p>The display name of the new image version, which is used to differentiate different versions of the same image.</p>
     * 
     * <strong>example:</strong>
     * <p>Office environment-202611</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static BuilderImageByParentRequest build(java.util.Map<String, ?> map) throws Exception {
        BuilderImageByParentRequest self = new BuilderImageByParentRequest();
        return TeaModel.build(map, self);
    }

    public BuilderImageByParentRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public BuilderImageByParentRequest setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public BuilderImageByParentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuilderImageByParentRequest setDistro(String distro) {
        this.distro = distro;
        return this;
    }
    public String getDistro() {
        return this.distro;
    }

    public BuilderImageByParentRequest setDriverIdList(java.util.List<String> driverIdList) {
        this.driverIdList = driverIdList;
        return this;
    }
    public java.util.List<String> getDriverIdList() {
        return this.driverIdList;
    }

    public BuilderImageByParentRequest setImageCreateMode(String imageCreateMode) {
        this.imageCreateMode = imageCreateMode;
        return this;
    }
    public String getImageCreateMode() {
        return this.imageCreateMode;
    }

    public BuilderImageByParentRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public BuilderImageByParentRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public BuilderImageByParentRequest setNodeInstanceType(String nodeInstanceType) {
        this.nodeInstanceType = nodeInstanceType;
        return this;
    }
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    public BuilderImageByParentRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public BuilderImageByParentRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public BuilderImageByParentRequest setParentImageId(String parentImageId) {
        this.parentImageId = parentImageId;
        return this;
    }
    public String getParentImageId() {
        return this.parentImageId;
    }

    public BuilderImageByParentRequest setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
        return this;
    }
    public String getPerformanceType() {
        return this.performanceType;
    }

    public BuilderImageByParentRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public BuilderImageByParentRequest setPropertyMap(java.util.Map<String, String> propertyMap) {
        this.propertyMap = propertyMap;
        return this;
    }
    public java.util.Map<String, String> getPropertyMap() {
        return this.propertyMap;
    }

    public BuilderImageByParentRequest setResourceList(java.util.List<BuilderImageByParentRequestResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<BuilderImageByParentRequestResourceList> getResourceList() {
        return this.resourceList;
    }

    public BuilderImageByParentRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public BuilderImageByParentRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public BuilderImageByParentRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public BuilderImageByParentRequest setVSwitchIdList(java.util.List<String> vSwitchIdList) {
        this.vSwitchIdList = vSwitchIdList;
        return this;
    }
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    public BuilderImageByParentRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class BuilderImageByParentRequestResourceList extends TeaModel {
        /**
         * <p>The resource content corresponding to ResourceType. For the URL type, enter or return an accessible resource URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/apps/business/setup.exe">https://example.com/apps/business/setup.exe</a></p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The provision method of the resource content. Valid values:</p>
         * <ul>
         * <li><strong>HOSTED</strong>: Hosted resource.</li>
         * <li><strong>TEXT</strong>: Text resource.</li>
         * <li><strong>URL</strong>: Resource provided through a URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static BuilderImageByParentRequestResourceList build(java.util.Map<String, ?> map) throws Exception {
            BuilderImageByParentRequestResourceList self = new BuilderImageByParentRequestResourceList();
            return TeaModel.build(map, self);
        }

        public BuilderImageByParentRequestResourceList setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public BuilderImageByParentRequestResourceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
