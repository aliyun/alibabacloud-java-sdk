// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportCustomAlertRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static ImportCustomAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomAlertRulesResponseBody self = new ImportCustomAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportCustomAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportCustomAlertRulesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
