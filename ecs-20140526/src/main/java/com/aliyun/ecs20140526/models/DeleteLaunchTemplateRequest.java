// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    public static DeleteLaunchTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateRequest self = new DeleteLaunchTemplateRequest();
        return TeaModel.build(map, self);
    }

}
