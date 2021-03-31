// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("ImagePipeline")
    public DescribeImagePipelinesResponseBodyImagePipeline imagePipeline;

    public static DescribeImagePipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelinesResponseBody self = new DescribeImagePipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelinesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeImagePipelinesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelinesResponseBody setImagePipeline(DescribeImagePipelinesResponseBodyImagePipeline imagePipeline) {
        this.imagePipeline = imagePipeline;
        return this;
    }
    public DescribeImagePipelinesResponseBodyImagePipeline getImagePipeline() {
        return this.imagePipeline;
    }

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
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

    public static class DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Tags")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags tags;

        @NameInMap("DeleteInstanceOnFailure")
        public Boolean deleteInstanceOnFailure;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ImagePipelineId")
        public String imagePipelineId;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("Description")
        public String description;

        @NameInMap("BaseImage")
        public String baseImage;

        @NameInMap("ToRegionIds")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds toRegionIds;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("BaseImageType")
        public String baseImageType;

        @NameInMap("AddAccounts")
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts addAccounts;

        @NameInMap("Name")
        public String name;

        @NameInMap("BuildContent")
        public String buildContent;

        public static DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet self = new DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setTags(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetTags getTags() {
            return this.tags;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
            this.deleteInstanceOnFailure = deleteInstanceOnFailure;
            return this;
        }
        public Boolean getDeleteInstanceOnFailure() {
            return this.deleteInstanceOnFailure;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImagePipelineId(String imagePipelineId) {
            this.imagePipelineId = imagePipelineId;
            return this;
        }
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBaseImage(String baseImage) {
            this.baseImage = baseImage;
            return this;
        }
        public String getBaseImage() {
            return this.baseImage;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setToRegionIds(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds toRegionIds) {
            this.toRegionIds = toRegionIds;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetToRegionIds getToRegionIds() {
            return this.toRegionIds;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBaseImageType(String baseImageType) {
            this.baseImageType = baseImageType;
            return this;
        }
        public String getBaseImageType() {
            return this.baseImageType;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setAddAccounts(DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts addAccounts) {
            this.addAccounts = addAccounts;
            return this;
        }
        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSetAddAccounts getAddAccounts() {
            return this.addAccounts;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImagePipelinesResponseBodyImagePipelineImagePipelineSet setBuildContent(String buildContent) {
            this.buildContent = buildContent;
            return this;
        }
        public String getBuildContent() {
            return this.buildContent;
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
