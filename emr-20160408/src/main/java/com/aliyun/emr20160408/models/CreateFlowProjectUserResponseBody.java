// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateFlowProjectUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static CreateFlowProjectUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectUserResponseBody self = new CreateFlowProjectUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowProjectUserResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
