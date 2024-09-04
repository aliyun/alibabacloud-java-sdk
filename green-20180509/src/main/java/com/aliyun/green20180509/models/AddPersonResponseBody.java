// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddPersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPersonResponseBody self = new AddPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
