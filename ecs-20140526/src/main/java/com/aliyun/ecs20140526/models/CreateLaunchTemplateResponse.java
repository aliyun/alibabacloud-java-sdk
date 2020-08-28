// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LaunchTemplateId")
    @Validation(required = true)
    public String launchTemplateId;

    public static CreateLaunchTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateResponse self = new CreateLaunchTemplateResponse();
        return TeaModel.build(map, self);
    }

}
