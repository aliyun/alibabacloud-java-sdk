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

    public CreateLaunchTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLaunchTemplateResponse setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

}
