// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateServiceGroupSchedulingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateServiceGroupSchedulingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceGroupSchedulingResponseBody self = new CreateServiceGroupSchedulingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceGroupSchedulingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
