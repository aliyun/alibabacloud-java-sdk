// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingPreviewResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 服务组排班信息
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    public static GetServiceGroupSchedulingPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingPreviewResponseBody self = new GetServiceGroupSchedulingPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSchedulingPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceGroupSchedulingPreviewResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
