// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCaseFileUploadUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCaseFileUploadUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ccc-test/namelist.csv</p>
         */
        @NameInMap("CaseFileKey")
        public String caseFileKey;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-test/namelist.csv?Expires=1642067227&OSSAccessKeyId=****&Signature=">https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-test/namelist.csv?Expires=1642067227&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
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
