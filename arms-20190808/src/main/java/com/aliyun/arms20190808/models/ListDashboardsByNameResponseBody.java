// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

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
