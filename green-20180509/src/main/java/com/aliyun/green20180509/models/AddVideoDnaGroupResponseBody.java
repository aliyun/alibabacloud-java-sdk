// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddVideoDnaGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddVideoDnaGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVideoDnaGroupResponseBody self = new AddVideoDnaGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVideoDnaGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
