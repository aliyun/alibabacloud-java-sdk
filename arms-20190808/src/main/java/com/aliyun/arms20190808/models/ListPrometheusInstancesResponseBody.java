// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesResponseBody extends TeaModel {
    // The Prometheus instances in the region in the JSON format.
    @NameInMap("Data")
    public String data;

    // The ID of the request. You can use the ID to query logs and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesResponseBody self = new ListPrometheusInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListPrometheusInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
