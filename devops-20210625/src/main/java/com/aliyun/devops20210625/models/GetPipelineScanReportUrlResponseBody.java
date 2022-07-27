// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineScanReportUrlResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("reportUrl")
    public String reportUrl;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetPipelineScanReportUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineScanReportUrlResponseBody self = new GetPipelineScanReportUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineScanReportUrlResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineScanReportUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineScanReportUrlResponseBody setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }
    public String getReportUrl() {
        return this.reportUrl;
    }

    public GetPipelineScanReportUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineScanReportUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
