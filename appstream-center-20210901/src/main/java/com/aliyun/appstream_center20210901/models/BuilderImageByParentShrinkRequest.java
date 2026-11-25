// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class BuilderImageByParentShrinkRequest extends TeaModel {
    /**
     * <p>The business type to which the image belongs. <strong>Required</strong>. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: basic product</li>
     * <li><strong>2</strong>: personal cloud</li>
     * <li><strong>3</strong>: cloud office</li>
     * <li><strong>4</strong>: cloud flow</li>
     * <li><strong>10</strong>: personal edition</li>
     * <li><strong>20</strong>: business edition</li>
     * <li><strong>60</strong>: Linggou team edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The capacity of the data cloud disk in the creation environment. Unit: GiB. Specify this parameter when a data cloud disk is required and make sure that the capacity meets the cloud disk requirements of the selected resource specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DataDiskSize")
    public Integer dataDiskSize;

    /**
     * <p>The description of the new image. This helps you query and distinguish images later.</p>
     * 
     * <strong>example:</strong>
     * <p>Business image that includes office applications and standard configurations</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The operating system distribution information of the image. Enter a distribution identifier that is consistent with the parent image used.</p>
     * 
     * <strong>example:</strong>
     * <p>Ubuntu 22.04 64-bit</p>
     */
    @NameInMap("Distro")
    public String distro;

    /**
     * <p>The list of driver IDs used when creating the image. You can specify up to 200 driver IDs. When you need to specify drivers, enter the IDs of existing drivers that are applicable to the target image.</p>
     * <p><strong>If PropertyMap.DRIVER_LIST is also specified, this parameter overwrites the driver list in PropertyMap.DRIVER_LIST.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;6d4af751-f522-40d7-ab6c-4a0ae587****&quot;,&quot;b5bdf6c0-41de-4878-8963-e8324106****&quot;]</p>
     */
    @NameInMap("DriverIdList")
    public java.util.List<String> driverIdList;

    /**
     * <p>The image creation mode. Use the following mode:</p>
     * <ul>
     * <li><strong>BUILDER_MANUAL</strong>: manually enter the creation environment to install applications and configure the image.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUILDER_MANUAL</p>
     */
    @NameInMap("ImageCreateMode")
    public String imageCreateMode;

    /**
     * <p>The name of the new image. <strong>Required</strong>. The name must start with a letter or a Chinese character and can contain letters, digits, Chinese characters, colons (:), underscores (_), periods (.), and hyphens (-). It cannot start with http:// or https://. The name must be 2 to 64 characters in length. Each Chinese character counts as 3 characters, and each other character counts as 1 character.</p>
     * 
     * <strong>example:</strong>
     * <p>OfficeImage_202611</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The language of the image. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Simplified Chinese</li>
     * <li><strong>zh-HK</strong>: Traditional Chinese (Hong Kong)</li>
     * <li><strong>en-US</strong>: English</li>
     * <li><strong>ja-JP</strong>: Japanese</li>
     * <li><strong>CN</strong>: compatible value for Simplified Chinese</li>
     * <li><strong>EN</strong>: compatible value for English</li>
     * <li><strong>JP</strong>: compatible value for Japanese</li>
     * <li><strong>CN-HK</strong>: compatible value for Traditional Chinese (Hong Kong)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The ID of the node specifications for the creation resources. You can call ListNodeInstanceType to query the ID. Select node specifications that are active in the creation region and for the associated product, and that meet the CPU or GPU computing requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.general.4c8g</p>
     */
    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    /**
     * <p>The ID of the office network used by the creation resources. Specify this parameter when a specific office network is required and make sure that the office network is in the creation region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-example****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The package type of the image. Make sure that the package type is consistent with the selected parent image and creation scenario. Valid values:</p>
     * <ul>
     * <li><strong>Ecs</strong>: ECS instance image.</li>
     * <li><strong>Vhd</strong>: VHD application image.</li>
     * <li><strong>Container</strong>: container image.</li>
     * <li><strong>Ecs_Container</strong>: combined ECS and container image.</li>
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
     * <p>The ID of the parent image used to create the new image. <strong>Required</strong>. You can call ListImage to query the ID. An available distribution record of the parent image must exist in the creation region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-bp1parent****</p>
     */
    @NameInMap("ParentImageId")
    public String parentImageId;

    /**
     * <p>The computing type of the creation resources. Valid values:</p>
     * <ul>
     * <li><strong>CPU</strong>: CPU compute resources.</li>
     * <li><strong>GPU</strong>: GPU compute resources.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("PerformanceType")
    public String performanceType;

    /**
     * <p>The product to which the image belongs. <strong>Required</strong>. Use an activated product and make sure that it is consistent with the selected parent image. Valid values:</p>
     * <ul>
     * <li><strong>CloudGame</strong>: cloud gaming</li>
     * <li><strong>CloudApp</strong>: Wuying cloud application</li>
     * <li><strong>CloudBrowser</strong>: secure browser</li>
     * <li><strong>CloudDesktop</strong>: Wuying cloud desktop</li>
     * <li><strong>ImageBuilder</strong>: image creation resource</li>
     * <li><strong>ImageValidate</strong>: image validation resource</li>
     * <li><strong>AndroidCloud</strong>: Android cloud</li>
     * <li><strong>GpuRender</strong>: GPU rendering</li>
     * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering</li>
     * <li><strong>WuyingServer</strong>: enterprise edition workstation</li>
     * <li><strong>GpuProxy</strong>: GPU remote rendering proxy</li>
     * <li><strong>GpuCache</strong>: GPU remote rendering cache</li>
     * <li><strong>AIAgent</strong>: AI agent service</li>
     * <li><strong>HostedDesktop</strong>: hosted desktop</li>
     * <li><strong>WuyingWorkstation</strong>: personal edition container workstation</li>
     * <li><strong>WuyingWorkstationBusiness</strong>: business edition container workstation</li>
     * <li><strong>WuyingWorkstationTeam</strong>: Linggou container workstation team edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The extended properties of the image. Both keys and values are strings. You can omit this parameter if no extended configuration is required.</p>
     * <p>The property key for the driver list is DRIVER_LIST, and the value is a JSON string of an array of driver IDs. We recommend that you specify drivers by using DriverIdList. <strong>If both DriverIdList and PropertyMap.DRIVER_LIST are specified, DriverIdList takes precedence.</strong> Specify other extended properties only when you have confirmed their purposes and values.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;DRIVER_LIST&quot;:&quot;[&quot;6d4af751-f522-40d7-ab6c-4a0ae587****&quot;,&quot;b5bdf6c0-41de-4878-8963-e8324106****&quot;]&quot;}</p>
     */
    @NameInMap("PropertyMap")
    public String propertyMapShrink;

    /**
     * <p>The list of resources required for image creation, such as the download URLs of applications to be installed. You can specify up to 100 resources. The ResourceType and Resource of each resource must correspond to each other.</p>
     */
    @NameInMap("ResourceList")
    public java.util.List<BuilderImageByParentShrinkRequestResourceList> resourceList;

    /**
     * <p>The running mode of the image creation environment. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: normal running mode.</li>
     * <li><strong>COMPATIBLE</strong>: compatible running mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    /**
     * <p>The ID of the creation region. The selected parent image must have been distributed to this region. Available regions are also affected by the region configurations of the account and product.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The capacity of the system cloud disk in the creation environment. Unit: GiB. The capacity cannot be smaller than the system cloud disk capacity required by the parent image and must meet the cloud disk requirements of the selected resource specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The list of vSwitch IDs used by the creation resources. You can specify up to 100 vSwitch IDs. The vSwitches must belong to the selected office network and be located in the creation region.</p>
     */
    @NameInMap("VSwitchIdList")
    public java.util.List<String> vSwitchIdList;

    /**
     * <p>The display name of the new image version. This helps you distinguish different versions of the same image.</p>
     * 
     * <strong>example:</strong>
     * <p>Office environment-202611</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static BuilderImageByParentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BuilderImageByParentShrinkRequest self = new BuilderImageByParentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BuilderImageByParentShrinkRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public BuilderImageByParentShrinkRequest setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    public BuilderImageByParentShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuilderImageByParentShrinkRequest setDistro(String distro) {
        this.distro = distro;
        return this;
    }
    public String getDistro() {
        return this.distro;
    }

    public BuilderImageByParentShrinkRequest setDriverIdList(java.util.List<String> driverIdList) {
        this.driverIdList = driverIdList;
        return this;
    }
    public java.util.List<String> getDriverIdList() {
        return this.driverIdList;
    }

    public BuilderImageByParentShrinkRequest setImageCreateMode(String imageCreateMode) {
        this.imageCreateMode = imageCreateMode;
        return this;
    }
    public String getImageCreateMode() {
        return this.imageCreateMode;
    }

    public BuilderImageByParentShrinkRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public BuilderImageByParentShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public BuilderImageByParentShrinkRequest setNodeInstanceType(String nodeInstanceType) {
        this.nodeInstanceType = nodeInstanceType;
        return this;
    }
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    public BuilderImageByParentShrinkRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public BuilderImageByParentShrinkRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public BuilderImageByParentShrinkRequest setParentImageId(String parentImageId) {
        this.parentImageId = parentImageId;
        return this;
    }
    public String getParentImageId() {
        return this.parentImageId;
    }

    public BuilderImageByParentShrinkRequest setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
        return this;
    }
    public String getPerformanceType() {
        return this.performanceType;
    }

    public BuilderImageByParentShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public BuilderImageByParentShrinkRequest setPropertyMapShrink(String propertyMapShrink) {
        this.propertyMapShrink = propertyMapShrink;
        return this;
    }
    public String getPropertyMapShrink() {
        return this.propertyMapShrink;
    }

    public BuilderImageByParentShrinkRequest setResourceList(java.util.List<BuilderImageByParentShrinkRequestResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<BuilderImageByParentShrinkRequestResourceList> getResourceList() {
        return this.resourceList;
    }

    public BuilderImageByParentShrinkRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public BuilderImageByParentShrinkRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public BuilderImageByParentShrinkRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public BuilderImageByParentShrinkRequest setVSwitchIdList(java.util.List<String> vSwitchIdList) {
        this.vSwitchIdList = vSwitchIdList;
        return this;
    }
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    public BuilderImageByParentShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class BuilderImageByParentShrinkRequestResourceList extends TeaModel {
        /**
         * <p>The resource content that corresponds to ResourceType. For the URL type, enter or return an accessible resource URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/apps/business/setup.exe">https://example.com/apps/business/setup.exe</a></p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The provision method of the resource content. Valid values:</p>
         * <ul>
         * <li><strong>HOSTED</strong>: hosted resource.</li>
         * <li><strong>TEXT</strong>: text resource.</li>
         * <li><strong>URL</strong>: resource provided by using a URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static BuilderImageByParentShrinkRequestResourceList build(java.util.Map<String, ?> map) throws Exception {
            BuilderImageByParentShrinkRequestResourceList self = new BuilderImageByParentShrinkRequestResourceList();
            return TeaModel.build(map, self);
        }

        public BuilderImageByParentShrinkRequestResourceList setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public BuilderImageByParentShrinkRequestResourceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
