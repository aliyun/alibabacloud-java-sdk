// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUsersResponseBody self = new AddUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
