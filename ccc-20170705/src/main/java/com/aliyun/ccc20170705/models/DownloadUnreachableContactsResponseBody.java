// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadUnreachableContactsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DownloadParams")
    public DownloadUnreachableContactsResponseBodyDownloadParams downloadParams;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DownloadUnreachableContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadUnreachableContactsResponseBody self = new DownloadUnreachableContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadUnreachableContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadUnreachableContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadUnreachableContactsResponseBody setDownloadParams(DownloadUnreachableContactsResponseBodyDownloadParams downloadParams) {
        this.downloadParams = downloadParams;
        return this;
    }
    public DownloadUnreachableContactsResponseBodyDownloadParams getDownloadParams() {
        return this.downloadParams;
    }

    public DownloadUnreachableContactsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadUnreachableContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadUnreachableContactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadUnreachableContactsResponseBodyDownloadParams extends TeaModel {
        @NameInMap("SignatureUrl")
        public String signatureUrl;

        public static DownloadUnreachableContactsResponseBodyDownloadParams build(java.util.Map<String, ?> map) throws Exception {
            DownloadUnreachableContactsResponseBodyDownloadParams self = new DownloadUnreachableContactsResponseBodyDownloadParams();
            return TeaModel.build(map, self);
        }

        public DownloadUnreachableContactsResponseBodyDownloadParams setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

    }

}
