// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLaunchTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateResponse self = new DeleteLaunchTemplateResponse();
        return TeaModel.build(map, self);
    }

}
