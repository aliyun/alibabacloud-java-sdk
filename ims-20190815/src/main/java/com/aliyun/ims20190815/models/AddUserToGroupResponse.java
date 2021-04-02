// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddUserToGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddUserToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToGroupResponse self = new AddUserToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddUserToGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
