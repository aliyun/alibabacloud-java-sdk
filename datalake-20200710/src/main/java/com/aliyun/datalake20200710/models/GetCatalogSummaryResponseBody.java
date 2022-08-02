// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogSummaryResponseBody extends TeaModel {
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

    public static GetCatalogSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSummaryResponseBody self = new GetCatalogSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCatalogSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCatalogSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCatalogSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCatalogSummaryResponseBody setStorageSummary(StorageSummary storageSummary) {
        this.storageSummary = storageSummary;
        return this;
    }
    public StorageSummary getStorageSummary() {
        return this.storageSummary;
    }

    public GetCatalogSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
