// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLaunchTemplateVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateVersionResponse self = new DeleteLaunchTemplateVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLaunchTemplateVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
