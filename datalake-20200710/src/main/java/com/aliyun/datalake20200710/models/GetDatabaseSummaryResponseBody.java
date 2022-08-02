// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetDatabaseSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageSummary")
    public StorageSummary storageSummary;

    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseSummaryResponseBody self = new GetDatabaseSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDatabaseSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDatabaseSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseSummaryResponseBody setStorageSummary(StorageSummary storageSummary) {
        this.storageSummary = storageSummary;
        return this;
    }
    public StorageSummary getStorageSummary() {
        return this.storageSummary;
    }

    public GetDatabaseSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
