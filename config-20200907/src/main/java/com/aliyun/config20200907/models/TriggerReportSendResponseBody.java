// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class TriggerReportSendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DE9FFFE5-FCAD-4B24-9546-BF49273C562B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TriggerReportSendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerReportSendResponseBody self = new TriggerReportSendResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerReportSendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
