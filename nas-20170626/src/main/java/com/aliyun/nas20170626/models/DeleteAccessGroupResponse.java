// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteAccessGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessGroupResponse self = new DeleteAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
