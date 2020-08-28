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

    }

    public static class DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTagsTag> tag;

        public static DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags self = new DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSetTags();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeLaunchTemplatesResponseLaunchTemplateSets extends TeaModel {
        @NameInMap("LaunchTemplateSet")
        @Validation(required = true)
        public java.util.List<DescribeLaunchTemplatesResponseLaunchTemplateSetsLaunchTemplateSet> launchTemplateSet;

        public static DescribeLaunchTemplatesResponseLaunchTemplateSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesResponseLaunchTemplateSets self = new DescribeLaunchTemplatesResponseLaunchTemplateSets();
            return TeaModel.build(map, self);
        }

    }

}
