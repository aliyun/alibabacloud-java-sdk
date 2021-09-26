// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowProjectUserResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFlowProjectUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectUserResponseBody self = new CreateFlowProjectUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectUserResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateFlowProjectUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
