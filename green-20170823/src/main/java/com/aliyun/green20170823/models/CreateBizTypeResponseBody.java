// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateBizTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBizTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBizTypeResponseBody self = new CreateBizTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBizTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
