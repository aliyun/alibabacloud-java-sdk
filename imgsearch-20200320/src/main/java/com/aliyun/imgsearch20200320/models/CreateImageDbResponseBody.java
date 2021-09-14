// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class CreateImageDbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateImageDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDbResponseBody self = new CreateImageDbResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
