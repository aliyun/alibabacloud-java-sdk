// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplatesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("LaunchTemplateSets")
    @Validation(required = true)
    public DescribeLaunchTemplatesResponseLaunchTemplateSets launchTemplateSets;

    public static DescribeLaunchTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplatesResponse self = new DescribeLaunchTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplatesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLaunchTemplatesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLaunchTemplatesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLaunchTemplatesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLaunchTemplatesResponse setLaunchTemplateSets(DescribeLaunchTemplatesResponseLaunchTemplateSets launchTemplateSets) {
        this.launchTemplateSets = launchTemplateSets;
        return this;
    }
    public DescribeLaunchTemplatesResponseLaunchTemplateSets getLaunchTemplateSets() {
        return this.launchTemplateSets;
    }

    public static class DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag self = new DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag> tag;

        public static DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags self = new DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags setTag(java.util.List<DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("LaunchTemplateId")
        @Validation(required = true)
        public String launchTemplateId;

        @NameInMap("LaunchTemplateName")
        @Validation(required = true)
        public String launchTemplateName;

        @NameInMap("DefaultVersionNumber")
        @Validation(required = true)
        public Long defaultVersionNumber;

        @NameInMap("LatestVersionNumber")
        @Validation(required = true)
        public Long latestVersionNumber;

        @NameInMap("CreatedBy")
        @Validation(required = true)
        public String createdBy;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags tags;

        public static DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet self = new DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setLaunchTemplateName(String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setDefaultVersionNumber(Long defaultVersionNumber) {
            this.defaultVersionNumber = defaultVersionNumber;
            return this;
        }
        public Long getDefaultVersionNumber() {
            return this.defaultVersionNumber;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setLatestVersionNumber(Long latestVersionNumber) {
            this.latestVersionNumber = latestVersionNumber;
            return this;
        }
        public Long getLatestVersionNumber() {
            return this.latestVersionNumber;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet setTags(DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeLaunchTemplatesResponseLaunchTemplateSets extends TeaModel {
        @NameInMap("LaunchTemplateSet")
        @Validation(required = true)
        public java.util.List<DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet> launchTemplateSet;

        public static DescribeLaunchTemplatesResponseLaunchTemplateSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseLaunchTemplateSets self = new DescribeLaunchTemplatesResponseLaunchTemplateSets();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseLaunchTemplateSets setLaunchTemplateSet(java.util.List<DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet> launchTemplateSet) {
            this.launchTemplateSet = launchTemplateSet;
            return this;
        }
        public java.util.List<DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet> getLaunchTemplateSet() {
            return this.launchTemplateSet;
        }

    }

}
