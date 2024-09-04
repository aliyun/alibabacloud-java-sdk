// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetPersonsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GetPersonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPersonsResponseBody self = new GetPersonsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPersonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
