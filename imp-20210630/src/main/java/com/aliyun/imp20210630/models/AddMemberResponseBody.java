// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AddMemberResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static AddMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMemberResponseBody self = new AddMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
