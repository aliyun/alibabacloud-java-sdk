// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetUserGuideStatusResponseBody extends TeaModel {
    // map
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetUserGuideStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGuideStatusResponseBody self = new GetUserGuideStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGuideStatusResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetUserGuideStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
