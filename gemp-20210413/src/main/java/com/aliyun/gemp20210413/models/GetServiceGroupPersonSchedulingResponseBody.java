// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupPersonSchedulingResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetServiceGroupPersonSchedulingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupPersonSchedulingResponseBody self = new GetServiceGroupPersonSchedulingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupPersonSchedulingResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetServiceGroupPersonSchedulingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
