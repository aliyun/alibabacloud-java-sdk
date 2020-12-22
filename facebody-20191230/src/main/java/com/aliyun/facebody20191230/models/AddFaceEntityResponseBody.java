// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceEntityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddFaceEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceEntityResponseBody self = new AddFaceEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
