// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteDiagnoseReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDiagnoseReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnoseReportResponseBody self = new DeleteDiagnoseReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnoseReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
