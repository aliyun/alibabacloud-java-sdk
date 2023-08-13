// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information of the diagnostics reports. Valid values:</p>
     * <br>
     * <p>*   **total**: the number of diagnostics reports.</p>
     * <p>*   **score**: the health score.</p>
     * <p>*   **diagnosticTime**: the time when the diagnostics report was generated. The time is displayed in UTC.</p>
     * <p>*   **startTime**: the start time of the query. The time is displayed in UTC.</p>
     * <p>*   **endTime**: the end time of the query. The time is displayed in UTC.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("Synchro")
    public String synchro;

    public static DescribeDiagnosticReportListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportListResponseBody self = new DescribeDiagnosticReportListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticReportListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDiagnosticReportListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDiagnosticReportListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDiagnosticReportListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosticReportListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeDiagnosticReportListResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

}
