// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ExportPrometheusRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static ExportPrometheusRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportPrometheusRulesResponseBody self = new ExportPrometheusRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportPrometheusRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportPrometheusRulesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
