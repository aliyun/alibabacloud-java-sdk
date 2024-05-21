// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesResponseBody extends TeaModel {
    /**
     * <p>Details about the image templates.</p>
     */
    @NameInMap("ImagePipeline")
    public DescribeImagePipelinesResponseBodyImagePipeline imagePipeline;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. For information about how to use the return value, see the "Usage notes" section of this topic.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image templates returned.</p>
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
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
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
         * <br>
         * <p>*   When `BaseImageType` is set to IMAGE, the value of this parameter is the ID of a custom image.</p>
         * <p>*   When `BaseImageType` is set to IMAGE_FAMILY, the value of this parameter is the name of an image family.</p>
         */
        @NameInMap("BaseImage")
        public String baseImage;

        /**
         * <p>The type of the source image. Valid values:</p>
         * <br>
         * <p>*   IMAGE: custom image</p>
         * <p>*   IMAGE_FAMILY: image family</p>
         */
        @NameInMap("BaseImageType")
        public String baseImageType;

        /**
         * <p>The content of the image template.</p>
         */
        @NameInMap("BuildContent")
        public String buildContent;

        /**
         * <p>The time when the image template was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether to release the intermediate instance when the image fails to be created.</p>
         */
        @NameInMap("DeleteInstanceOnFailure")
        public Boolean deleteInstanceOnFailure;

        /**
         * <p>The description of the image template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name prefix of the image to be created based on the image template.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The ID of the image template.</p>
         */
        @NameInMap("ImagePipelineId")
        public String imagePipelineId;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The size of the outbound public bandwidth for the intermediate instance. Unit: Mbit/s.</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>The name of the image template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The system disk size of the intermediate instance. Unit: GiB</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The tags of the image template.</p>
         */
        @NameInMap("Tags")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags tags;

        /**
         * <p>The IDs of regions to which to distribute the image that will be created based on the image template.</p>
         */
        @NameInMap("ToRegionIds")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds toRegionIds;

        /**
         * <p>The ID of the vSwitch in the virtual private cloud (VPC).</p>
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
