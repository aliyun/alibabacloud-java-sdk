// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLaunchTemplateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateVersionResponseBody self = new DeleteLaunchTemplateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLaunchTemplateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
