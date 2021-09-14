// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteWorkspaceMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceMemberResponseBody self = new DeleteWorkspaceMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkspaceMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
