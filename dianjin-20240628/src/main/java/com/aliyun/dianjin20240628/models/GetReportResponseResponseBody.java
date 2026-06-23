// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetReportResponseResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("outRequestNo")
    public String outRequestNo;

    @NameInMap("reportUrl")
    public String reportUrl;

    public static GetReportResponseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportResponseResponseBody self = new GetReportResponseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportResponseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetReportResponseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetReportResponseResponseBody setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public GetReportResponseResponseBody setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }
    public String getReportUrl() {
        return this.reportUrl;
    }

}
