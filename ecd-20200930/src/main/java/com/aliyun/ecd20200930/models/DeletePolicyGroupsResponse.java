// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeletePolicyGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeletePolicyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyGroupsResponse self = new DeletePolicyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
