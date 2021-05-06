// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteInstanceMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstanceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceMembersResponseBody self = new DeleteInstanceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
