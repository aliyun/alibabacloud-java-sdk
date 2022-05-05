// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusGlobalViewResponseBody self = new ListPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusGlobalViewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
