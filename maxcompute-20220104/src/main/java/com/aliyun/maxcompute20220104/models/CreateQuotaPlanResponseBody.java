// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaPlanResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static CreateQuotaPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaPlanResponseBody self = new CreateQuotaPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaPlanResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateQuotaPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
