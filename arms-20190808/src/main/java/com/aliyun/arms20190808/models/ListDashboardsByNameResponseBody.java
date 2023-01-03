// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("Data")
    public String data;

    // The ID of the request. You can query logs and troubleshoot issues based on the ID.
    @NameInMap("RequestId")
    public String requestId;

    public static ListDashboardsByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsByNameResponseBody self = new ListDashboardsByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardsByNameResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListDashboardsByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
