// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnSubTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCdnSubTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnSubTaskResponseBody self = new CreateCdnSubTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdnSubTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
