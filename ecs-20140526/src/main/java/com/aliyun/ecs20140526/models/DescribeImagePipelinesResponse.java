// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("ImagePipeline")
    @Validation(required = true)
    public DescribeImagePipelinesResponseImagePipeline imagePipeline;

    public static DescribeImagePipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelinesResponse self = new DescribeImagePipelinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelinesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImagePipelinesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeImagePipelinesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelinesResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelinesResponse setImagePipeline(DescribeImagePipelinesResponseImagePipeline imagePipeline) {
        this.imagePipeline = imagePipeline;
        return this;
    }
    public DescribeImagePipelinesResponseImagePipeline getImagePipeline() {
        return this.imagePipeline;
    }

    public static class DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag self = new DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeImagePipelinesResponseImagePipelineImagePipelineSetTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag> tag;

        public static DescribeImagePipelinesResponseImagePipelineImagePipelineSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseImagePipelineImagePipelineSetTags self = new DescribeImagePipelinesResponseImagePipelineImagePipelineSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetTags setTag(java.util.List<DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseImagePipelineImagePipelineSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeImagePipelinesResponseImagePipelineImagePipelineSetAddAccounts extends TeaModel {
        // AddAccount
        @NameInMap("AddAccount")
        @Validation(required = true)
        public java.util.List<String> addAccount;

        public static DescribeImagePipelinesResponseImagePipelineImagePipelineSetAddAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseImagePipelineImagePipelineSetAddAccounts self = new DescribeImagePipelinesResponseImagePipelineImagePipelineSetAddAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetAddAccounts setAddAccount(java.util.List<String> addAccount) {
            this.addAccount = addAccount;
            return this;
        }
        public java.util.List<String> getAddAccount() {
            return this.addAccount;
        }

    }

    public static class DescribeImagePipelinesResponseImagePipelineImagePipelineSetToRegionIds extends TeaModel {
        // ToRegionId
        @NameInMap("ToRegionId")
        @Validation(required = true)
        public java.util.List<String> toRegionId;

        public static DescribeImagePipelinesResponseImagePipelineImagePipelineSetToRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseImagePipelineImagePipelineSetToRegionIds self = new DescribeImagePipelinesResponseImagePipelineImagePipelineSetToRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetToRegionIds setToRegionId(java.util.List<String> toRegionId) {
            this.toRegionId = toRegionId;
            return this;
        }
        public java.util.List<String> getToRegionId() {
            return this.toRegionId;
        }

    }

    public static class DescribeImagePipelinesResponseImagePipelineImagePipelineSet extends TeaModel {
        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ImagePipelineId")
        @Validation(required = true)
        public String imagePipelineId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("BaseImageType")
        @Validation(required = true)
        public String baseImageType;

        @NameInMap("BaseImage")
        @Validation(required = true)
        public String baseImage;

        @NameInMap("ImageName")
        @Validation(required = true)
        public String imageName;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("InternetMaxBandwidthOut")
        @Validation(required = true)
        public Integer internetMaxBandwidthOut;

        @NameInMap("SystemDiskSize")
        @Validation(required = true)
        public Integer systemDiskSize;

        @NameInMap("DeleteInstanceOnFailure")
        @Validation(required = true)
        public Boolean deleteInstanceOnFailure;

        @NameInMap("BuildContent")
        @Validation(required = true)
        public String buildContent;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetTags tags;

        @NameInMap("AddAccounts")
        @Validation(required = true)
        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetAddAccounts addAccounts;

        @NameInMap("ToRegionIds")
        @Validation(required = true)
        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetToRegionIds toRegionIds;

        public static DescribeImagePipelinesResponseImagePipelineImagePipelineSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseImagePipelineImagePipelineSet self = new DescribeImagePipelinesResponseImagePipelineImagePipelineSet();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setImagePipelineId(String imagePipelineId) {
            this.imagePipelineId = imagePipelineId;
            return this;
        }
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setBaseImageType(String baseImageType) {
            this.baseImageType = baseImageType;
            return this;
        }
        public String getBaseImageType() {
            return this.baseImageType;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setBaseImage(String baseImage) {
            this.baseImage = baseImage;
            return this;
        }
        public String getBaseImage() {
            return this.baseImage;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
            this.deleteInstanceOnFailure = deleteInstanceOnFailure;
            return this;
        }
        public Boolean getDeleteInstanceOnFailure() {
            return this.deleteInstanceOnFailure;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setBuildContent(String buildContent) {
            this.buildContent = buildContent;
            return this;
        }
        public String getBuildContent() {
            return this.buildContent;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setTags(DescribeImagePipelinesResponseImagePipelineImagePipelineSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetTags getTags() {
            return this.tags;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setAddAccounts(DescribeImagePipelinesResponseImagePipelineImagePipelineSetAddAccounts addAccounts) {
            this.addAccounts = addAccounts;
            return this;
        }
        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetAddAccounts getAddAccounts() {
            return this.addAccounts;
        }

        public DescribeImagePipelinesResponseImagePipelineImagePipelineSet setToRegionIds(DescribeImagePipelinesResponseImagePipelineImagePipelineSetToRegionIds toRegionIds) {
            this.toRegionIds = toRegionIds;
            return this;
        }
        public DescribeImagePipelinesResponseImagePipelineImagePipelineSetToRegionIds getToRegionIds() {
            return this.toRegionIds;
        }

    }

    public static class DescribeImagePipelinesResponseImagePipeline extends TeaModel {
        @NameInMap("ImagePipelineSet")
        @Validation(required = true)
        public java.util.List<DescribeImagePipelinesResponseImagePipelineImagePipelineSet> imagePipelineSet;

        public static DescribeImagePipelinesResponseImagePipeline build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesResponseImagePipeline self = new DescribeImagePipelinesResponseImagePipeline();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesResponseImagePipeline setImagePipelineSet(java.util.List<DescribeImagePipelinesResponseImagePipelineImagePipelineSet> imagePipelineSet) {
            this.imagePipelineSet = imagePipelineSet;
            return this;
        }
        public java.util.List<DescribeImagePipelinesResponseImagePipelineImagePipelineSet> getImagePipelineSet() {
            return this.imagePipelineSet;
        }

    }

}
