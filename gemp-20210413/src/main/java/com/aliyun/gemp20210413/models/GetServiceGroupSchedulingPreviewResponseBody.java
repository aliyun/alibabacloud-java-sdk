// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingPreviewResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetServiceGroupSchedulingPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingPreviewResponseBody self = new GetServiceGroupSchedulingPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSchedulingPreviewResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetServiceGroupSchedulingPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
