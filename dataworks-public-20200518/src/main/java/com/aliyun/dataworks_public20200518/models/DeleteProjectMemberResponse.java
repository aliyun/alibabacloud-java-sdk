// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteProjectMemberResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteProjectMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectMemberResponse self = new DeleteProjectMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProjectMemberResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
