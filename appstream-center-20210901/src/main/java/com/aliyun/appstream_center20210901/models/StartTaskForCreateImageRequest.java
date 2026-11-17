// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StartTaskForCreateImageRequest extends TeaModel {
    /**
     * <p>The image creation mode. Use the following mode:</p>
     * <ul>
     * <li><strong>BUILDER_MANUAL</strong>: Manually enter the creation environment to install applications and configure the image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUILDER_MANUAL</p>
     */
    @NameInMap("ImageCreateMode")
    public String imageCreateMode;

    /**
     * <p>The ID of the image. This parameter is not exposed by default.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The WUYING instance ID. The instance can be a cloud desktop instance or a workstation instance. To ensure data consistency in the image, stop the instance before starting the image creation task.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-5u87dainamz54yk10</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The step to jump to.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE_VALIDATE_ENV</p>
     */
    @NameInMap("JumpStep")
    public String jumpStep;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("PerformanceType")
    public String performanceType;

    /**
     * <p>The product type. Set this parameter to the following value when you call this operation:</p>
     * <ul>
     * <li><code>CloudApp</code>: WUYING Cloud App.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of resources required for image creation, such as the download URLs of applications to be installed. You can specify up to 100 items. The ResourceType and Resource of each item must correspond to each other.</p>
     * 
     * <strong>example:</strong>
     * <p>List of Object</p>
     */
    @NameInMap("ResourceList")
    public java.util.List<StartTaskForCreateImageRequestResourceList> resourceList;

    /**
     * <p>The retry type.</p>
     * 
     * <strong>example:</strong>
     * <p>RETRY</p>
     */
    @NameInMap("RetryType")
    public String retryType;

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
     * <p>The source region where the image is created. If you do not specify this parameter, a region is randomly selected.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    /**
     * <p>The sub-instance ID. This parameter is not applicable to cloud desktop scenarios. In workstation scenarios, you must specify the persistent session ID to locate a specific instance.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3n1l*****</p>
     */
    @NameInMap("SubInstanceId")
    public String subInstanceId;

    /**
     * <p>The size of the system cloud disk. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The ID of the image version. This parameter is not exposed.</p>
     * 
     * <strong>example:</strong>
     * <p>iv-bp1example****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static StartTaskForCreateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTaskForCreateImageRequest self = new StartTaskForCreateImageRequest();
        return TeaModel.build(map, self);
    }

    public StartTaskForCreateImageRequest setImageCreateMode(String imageCreateMode) {
        this.imageCreateMode = imageCreateMode;
        return this;
    }
    public String getImageCreateMode() {
        return this.imageCreateMode;
    }

    public StartTaskForCreateImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public StartTaskForCreateImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartTaskForCreateImageRequest setJumpStep(String jumpStep) {
        this.jumpStep = jumpStep;
        return this;
    }
    public String getJumpStep() {
        return this.jumpStep;
    }

    public StartTaskForCreateImageRequest setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
        return this;
    }
    public String getPerformanceType() {
        return this.performanceType;
    }

    public StartTaskForCreateImageRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public StartTaskForCreateImageRequest setResourceList(java.util.List<StartTaskForCreateImageRequestResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<StartTaskForCreateImageRequestResourceList> getResourceList() {
        return this.resourceList;
    }

    public StartTaskForCreateImageRequest setRetryType(String retryType) {
        this.retryType = retryType;
        return this;
    }
    public String getRetryType() {
        return this.retryType;
    }

    public StartTaskForCreateImageRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public StartTaskForCreateImageRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public StartTaskForCreateImageRequest setSubInstanceId(String subInstanceId) {
        this.subInstanceId = subInstanceId;
        return this;
    }
    public String getSubInstanceId() {
        return this.subInstanceId;
    }

    public StartTaskForCreateImageRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public StartTaskForCreateImageRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public static class StartTaskForCreateImageRequestResourceList extends TeaModel {
        /**
         * <p>The resource information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/apps/business/setup.exe">https://example.com/apps/business/setup.exe</a></p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static StartTaskForCreateImageRequestResourceList build(java.util.Map<String, ?> map) throws Exception {
            StartTaskForCreateImageRequestResourceList self = new StartTaskForCreateImageRequestResourceList();
            return TeaModel.build(map, self);
        }

        public StartTaskForCreateImageRequestResourceList setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public StartTaskForCreateImageRequestResourceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
