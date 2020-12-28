// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsersResponseBody self = new DeleteUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
