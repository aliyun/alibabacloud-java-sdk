// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplatesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TemplateTag")
    public java.util.List<DescribeLaunchTemplatesRequestTemplateTag> templateTag;

    @NameInMap("LaunchTemplateId")
    public java.util.List<String> launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public java.util.List<String> launchTemplateName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TemplateResourceGroupId")
    public String templateResourceGroupId;

    public static DescribeLaunchTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplatesRequest self = new DescribeLaunchTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeLaunchTemplatesRequestTemplateTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeLaunchTemplatesRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesRequestTemplateTag self = new DescribeLaunchTemplatesRequestTemplateTag();
            return TeaModel.build(map, self);
        }

    }

}
