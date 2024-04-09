// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteRdMemberListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRdMemberListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRdMemberListResponseBody self = new DeleteRdMemberListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRdMemberListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
