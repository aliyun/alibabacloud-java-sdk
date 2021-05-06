// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddInstanceMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddInstanceMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceMembersResponseBody self = new AddInstanceMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddInstanceMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
