// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("LaunchTemplateVersion")
    public java.util.List<Long> launchTemplateVersion;

    @NameInMap("MinVersion")
    public Long minVersion;

    @NameInMap("MaxVersion")
    public Long maxVersion;

    @NameInMap("DefaultVersion")
    public Boolean defaultVersion;

    @NameInMap("DetailFlag")
    public Boolean detailFlag;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeLaunchTemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplateVersionsRequest self = new DescribeLaunchTemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

}
