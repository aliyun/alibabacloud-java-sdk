// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticReportListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Synchro")
    @Validation(required = true)
    public String synchro;

    public static DescribeDiagnosticReportListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticReportListResponse self = new DescribeDiagnosticReportListResponse();
        return TeaModel.build(map, self);
    }

}
