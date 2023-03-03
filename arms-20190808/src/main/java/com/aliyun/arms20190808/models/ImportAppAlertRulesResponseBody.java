// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportAppAlertRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the alert rule.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportAppAlertRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportAppAlertRulesResponseBody self = new ImportAppAlertRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportAppAlertRulesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportAppAlertRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
