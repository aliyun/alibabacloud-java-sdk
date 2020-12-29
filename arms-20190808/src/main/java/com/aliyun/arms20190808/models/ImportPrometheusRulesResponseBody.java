// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportPrometheusRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static ImportPrometheusRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportPrometheusRulesResponseBody self = new ImportPrometheusRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportPrometheusRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportPrometheusRulesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
