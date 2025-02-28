// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class CreateMajorCustomerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMajorCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMajorCustomerResponseBody self = new CreateMajorCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMajorCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
