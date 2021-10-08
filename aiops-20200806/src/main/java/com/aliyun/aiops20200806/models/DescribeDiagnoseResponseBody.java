// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("DiagnoseResult")
    public java.util.Map<String, ?> diagnoseResult;

    public static DescribeDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseResponseBody self = new DescribeDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDiagnoseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnoseResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDiagnoseResponseBody setDiagnoseResult(java.util.Map<String, ?> diagnoseResult) {
        this.diagnoseResult = diagnoseResult;
        return this;
    }
    public java.util.Map<String, ?> getDiagnoseResult() {
        return this.diagnoseResult;
    }

}
