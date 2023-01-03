// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusGlobalViewResponseBody extends TeaModel {
    // The response parameters in the JSON format.
    @NameInMap("Data")
    public String data;

    // The ID of the request. You can use the ID to query logs and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusGlobalViewResponseBody self = new DeletePrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusGlobalViewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeletePrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
