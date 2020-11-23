// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupResponse self = new DeleteGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
