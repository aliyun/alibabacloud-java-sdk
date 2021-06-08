// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDeliverTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnDeliverTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDeliverTaskResponseBody self = new CreateDcdnDeliverTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDeliverTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
