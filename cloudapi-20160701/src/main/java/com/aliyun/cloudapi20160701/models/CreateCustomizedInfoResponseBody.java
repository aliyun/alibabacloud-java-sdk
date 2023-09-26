// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class CreateCustomizedInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomizedInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedInfoResponseBody self = new CreateCustomizedInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
