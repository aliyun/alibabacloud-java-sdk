// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobTemplateDownloadParamsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DownloadParams")
    public GetJobTemplateDownloadParamsResponseBodyDownloadParams downloadParams;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobTemplateDownloadParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobTemplateDownloadParamsResponseBody self = new GetJobTemplateDownloadParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobTemplateDownloadParamsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobTemplateDownloadParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobTemplateDownloadParamsResponseBody setDownloadParams(GetJobTemplateDownloadParamsResponseBodyDownloadParams downloadParams) {
        this.downloadParams = downloadParams;
        return this;
    }
    public GetJobTemplateDownloadParamsResponseBodyDownloadParams getDownloadParams() {
        return this.downloadParams;
    }

    public GetJobTemplateDownloadParamsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobTemplateDownloadParamsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobTemplateDownloadParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobTemplateDownloadParamsResponseBodyDownloadParams extends TeaModel {
        @NameInMap("SignatureUrl")
        public String signatureUrl;

        public static GetJobTemplateDownloadParamsResponseBodyDownloadParams build(java.util.Map<String, ?> map) throws Exception {
            GetJobTemplateDownloadParamsResponseBodyDownloadParams self = new GetJobTemplateDownloadParamsResponseBodyDownloadParams();
            return TeaModel.build(map, self);
        }

        public GetJobTemplateDownloadParamsResponseBodyDownloadParams setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

    }

}
