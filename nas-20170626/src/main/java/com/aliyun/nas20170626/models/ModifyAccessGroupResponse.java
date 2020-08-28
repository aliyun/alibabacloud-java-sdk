// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAccessGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessGroupResponse self = new ModifyAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
