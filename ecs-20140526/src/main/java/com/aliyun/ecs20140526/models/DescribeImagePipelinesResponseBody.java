// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesResponseBody extends TeaModel {
    /**
     * <p>The information about the image templates.</p>
     */
    @NameInMap("ImagePipeline")
    public DescribeImagePipelinesResponseBodyImagePipeline imagePipeline;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. For information about how to use the return value, see the &quot;Usage notes&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image templates returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImagePipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelinesResponseBody self = new DescribeImagePipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelinesResponseBody setImagePipeline(DescribeImagePipelinesResponseBodyImagePipeline imagePipeline) {
        this.imagePipeline = imagePipeline;
        return this;
    }
    public DescribeImagePipelinesResponseBodyImagePipeline getImagePipeline() {
        return this.imagePipeline;
    }

    public DescribeImagePipelinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelinesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagePipelinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts extends TeaModel {
        @NameInMap("AddAccount")
        public java.util.List<String> addAccount;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts setAddAccount(java.util.List<String> addAccount) {
            this.addAccount = addAccount;
            return this;
        }
        public java.util.List<String> getAddAccount() {
            return this.addAccount;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag> tag;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags setTag(java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds extends TeaModel {
        @NameInMap("ToRegionId")
        public java.util.List<String> toRegionId;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds setToRegionId(java.util.List<String> toRegionId) {
            this.toRegionId = toRegionId;
            return this;
        }
        public java.util.List<String> getToRegionId() {
            return this.toRegionId;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet extends TeaModel {
        /**
         * <p>The IDs of Alibaba Cloud accounts to which to share the image that will be created based on the image template.</p>
         */
        @NameInMap("AddAccounts")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts addAccounts;

        /**
         * <p>The source image.</p>
         * <ul>
         * <li>When <code>BaseImageType</code> is set to IMAGE, the value of this parameter is the ID of a custom image.</li>
         * <li>When <code>BaseImageType</code> is set to IMAGE_FAMILY, the value of this parameter is the name of an image family.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m-bp67acfmxazb4p****</p>
         */
        @NameInMap("BaseImage")
        public String baseImage;

        /**
         * <p>The type of the source image. Valid values:</p>
         * <ul>
         * <li>IMAGE: custom image</li>
         * <li>IMAGE_FAMILY: image family</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("BaseImageType")
        public String baseImageType;

        /**
         * <p>The content of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>FROM IMAGE:m-bp67acfmxazb4p****</p>
         */
        @NameInMap("BuildContent")
        public String buildContent;

        /**
         * <p>The time when the image template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-24T06:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether to release the intermediate instance when the image fails to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteInstanceOnFailure")
        public Boolean deleteInstanceOnFailure;

        /**
         * <p>The description of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image family.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ImageFamily")
        public String imageFamily;

        /**
         * <p>The name prefix of the image to be created based on the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>testImageName</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The ID of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>ip-2ze5tsl5bp6nf2b3****</p>
         */
        @NameInMap("ImagePipelineId")
        public String imagePipelineId;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The size of the outbound public bandwidth for the intermediate instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>The name of the image template.</p>
         * 
         * <strong>example:</strong>
         * <p>testImagePipeline</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The repair mode of the image template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Standard: the standard mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RepairMode")
        public String repairMode;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The system disk size of the intermediate instance. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tags of the image template.</p>
         */
        @NameInMap("Tags")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags tags;

        /**
         * <p>The content of the image test template.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TestContent")
        public String testContent;

        /**
         * <p>The IDs of regions to which to distribute the image that will be created based on the image template.</p>
         */
        @NameInMap("ToRegionIds")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds toRegionIds;

        /**
         * <p>The ID of the vSwitch in the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp67acfmxazb4p****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setAddAccounts(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts addAccounts) {
            this.addAccounts = addAccounts;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts getAddAccounts() {
            return this.addAccounts;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBaseImage(String baseImage) {
            this.baseImage = baseImage;
            return this;
        }
        public String getBaseImage() {
            return this.baseImage;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBaseImageType(String baseImageType) {
            this.baseImageType = baseImageType;
            return this;
        }
        public String getBaseImageType() {
            return this.baseImageType;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBuildContent(String buildContent) {
            this.buildContent = buildContent;
            return this;
        }
        public String getBuildContent() {
            return this.buildContent;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
            this.deleteInstanceOnFailure = deleteInstanceOnFailure;
            return this;
        }
        public Boolean getDeleteInstanceOnFailure() {
            return this.deleteInstanceOnFailure;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImagePipelineId(String imagePipelineId) {
            this.imagePipelineId = imagePipelineId;
            return this;
        }
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setRepairMode(String repairMode) {
            this.repairMode = repairMode;
            return this;
        }
        public String getRepairMode() {
            return this.repairMode;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setTags(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags getTags() {
            return this.tags;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setTestContent(String testContent) {
            this.testContent = testContent;
            return this;
        }
        public String getTestContent() {
            return this.testContent;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setToRegionIds(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds toRegionIds) {
            this.toRegionIds = toRegionIds;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds getToRegionIds() {
            return this.toRegionIds;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeImagePipelinesResponseBodyImagePipeline extends TeaModel {
        @NameInMap("ImagePipelineSet")
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet> imagePipelineSet;

        public static DescribeImagePipelinesResponseBodyImagePipeline build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipeline self = new DescribeImagePipelinesResponseBodyImagePipeline();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipeline setImagePipelineSet(java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet> imagePipelineSet) {
            this.imagePipelineSet = imagePipelineSet;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet> getImagePipelineSet() {
            return this.imagePipelineSet;
        }

    }

}
