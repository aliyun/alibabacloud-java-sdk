// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCaseFileUploadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCaseFileUploadUrlResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCaseFileUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCaseFileUploadUrlResponseBody self = new GetCaseFileUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCaseFileUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCaseFileUploadUrlResponseBody setData(GetCaseFileUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCaseFileUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetCaseFileUploadUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCaseFileUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCaseFileUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCaseFileUploadUrlResponseBodyData extends TeaModel {
        @NameInMap("CaseFileKey")
        public String caseFileKey;

        @NameInMap("Url")
        public String url;

        public static GetCaseFileUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCaseFileUploadUrlResponseBodyData self = new GetCaseFileUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCaseFileUploadUrlResponseBodyData setCaseFileKey(String caseFileKey) {
            this.caseFileKey = caseFileKey;
            return this;
        }
        public String getCaseFileKey() {
            return this.caseFileKey;
        }

        public GetCaseFileUploadUrlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
