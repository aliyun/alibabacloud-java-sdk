// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCertUrlByApplyIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("CertUrl")
    public String certUrl;

    public static QueryCertUrlByApplyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCertUrlByApplyIdResponseBody self = new QueryCertUrlByApplyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCertUrlByApplyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCertUrlByApplyIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCertUrlByApplyIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCertUrlByApplyIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryCertUrlByApplyIdResponseBody setCertUrl(String certUrl) {
        this.certUrl = certUrl;
        return this;
    }
    public String getCertUrl() {
        return this.certUrl;
    }

}
