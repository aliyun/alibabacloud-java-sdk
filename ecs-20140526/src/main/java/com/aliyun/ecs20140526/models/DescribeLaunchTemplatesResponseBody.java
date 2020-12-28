// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplatesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("LaunchTemplateSets")
    public java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSets> launchTemplateSets;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeLaunchTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplatesResponseBody self = new DescribeLaunchTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLaunchTemplatesResponseBody setLaunchTemplateSets(java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSets> launchTemplateSets) {
        this.launchTemplateSets = launchTemplateSets;
        return this;
    }
    public java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSets> getLaunchTemplateSets() {
        return this.launchTemplateSets;
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

    public DescribeLaunchTemplatesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags self = new DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeLaunchTemplatesResponseBodyLaunchTemplateSets extends TeaModel {
        @NameInMap("LaunchTemplateName")
        public String launchTemplateName;

        @NameInMap("DefaultVersionNumber")
        public Long defaultVersionNumber;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("Tags")
        public java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags> tags;

        @NameInMap("LatestVersionNumber")
        public Long latestVersionNumber;

        public static DescribeLaunchTemplatesResponseBodyLaunchTemplateSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseBodyLaunchTemplateSets self = new DescribeLaunchTemplatesResponseBodyLaunchTemplateSets();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setLaunchTemplateName(String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public String getLaunchTemplateName() {
            return this.launchTemplateName;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setDefaultVersionNumber(Long defaultVersionNumber) {
            this.defaultVersionNumber = defaultVersionNumber;
            return this;
        }
        public Long getDefaultVersionNumber() {
            return this.defaultVersionNumber;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setTags(java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeLaunchTemplatesResponseBodyLaunchTemplateSetsTags> getTags() {
            return this.tags;
        }

        public DescribeLaunchTemplatesResponseBodyLaunchTemplateSets setLatestVersionNumber(Long latestVersionNumber) {
            this.latestVersionNumber = latestVersionNumber;
            return this;
        }
        public Long getLatestVersionNumber() {
            return this.latestVersionNumber;
        }

    }

}
