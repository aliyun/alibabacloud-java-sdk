// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LaunchTemplateVersionNumber")
    @Validation(required = true)
    public Long launchTemplateVersionNumber;

    public static CreateLaunchTemplateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateVersionResponse self = new CreateLaunchTemplateVersionResponse();
        return TeaModel.build(map, self);
    }

}
