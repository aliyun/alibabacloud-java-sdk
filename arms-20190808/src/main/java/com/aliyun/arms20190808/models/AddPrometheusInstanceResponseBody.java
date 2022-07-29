// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddPrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusInstanceResponseBody self = new AddPrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusInstanceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddPrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
