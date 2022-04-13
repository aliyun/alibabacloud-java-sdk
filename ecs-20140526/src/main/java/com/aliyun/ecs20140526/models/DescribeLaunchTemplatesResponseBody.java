// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplatesResponseBody extends TeaModel {
    @NameInMap("LaunchTemplateSets")
    public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets launchTemplateSets;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLaunchTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplatesResponseBody self = new DescribeLaunchTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplatesResponseBody setLaunchTemplateSets(DescribeLaunchTemplatesResponseBodyLaunchTemplateSets launchTemplateSets) {
        this.launchTemplateSets = launchTemplateSets;
        return this;
    }
    public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets getLaunchTemplateSets() {
        return this.launchTemplateSets;
    }

    public DescribeLaunchTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLaunchTemplatesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLaunchTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLaunchTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag self = new DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag> tag;

        public static DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTags self = new DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTags();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTags setTag(java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("DefaultVersionNumber")
        public Long defaultVersionNumber;

        @NameInMap("LatestVersionNumber")
        public Long latestVersionNumber;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("LaunchTemplateName")
        public String launchTemplateName;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTags tags;

        public static DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet self = new DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setDefaultVersionNumber(Long defaultVersionNumber) {
            this.defaultVersionNumber = defaultVersionNumber;
            return this;
        }
        public Long getDefaultVersionNumber() {
            return this.defaultVersionNumber;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setLatestVersionNumber(Long latestVersionNumber) {
            this.latestVersionNumber = latestVersionNumber;
            return this;
        }
        public Long getLatestVersionNumber() {
            return this.latestVersionNumber;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setLaunchTemplateName(String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet setTags(DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSetTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeLaunchTemplatesResponseBodyLaunchTemplateSets extends TeaModel {
        @NameInMap("LaunchTemplateSet")
        public java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet> launchTemplateSet;

        public static DescribeLaunchTemplatesResponseBodyLaunchTemplateSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseBodyLaunchTemplateSets self = new DescribeLaunchTemplatesResponseBodyLaunchTemplateSets();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setLaunchTemplateSet(java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet> launchTemplateSet) {
            this.launchTemplateSet = launchTemplateSet;
            return this;
        }
        public java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsLaunchTemplateSet> getLaunchTemplateSet() {
            return this.launchTemplateSet;
        }

    }

}
