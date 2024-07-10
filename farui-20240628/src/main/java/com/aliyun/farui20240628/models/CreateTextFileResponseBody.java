// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class CreateTextFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Request.Signature.Error</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateTextFileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>81E6F6D2-8ACB-5BDA-9C7C-4D6268CD9652</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTextFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTextFileResponseBody self = new CreateTextFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTextFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTextFileResponseBody setData(CreateTextFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTextFileResponseBodyData getData() {
        return this.data;
    }

    public CreateTextFileResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTextFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTextFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTextFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTextFileResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>36d6447d277c4a1c9fd0def1d16341f1</p>
         */
        @NameInMap("TextFileId")
        public String textFileId;

        @NameInMap("TextFileName")
        public String textFileName;

        @NameInMap("TextFileUrl")
        public String textFileUrl;

        public static CreateTextFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTextFileResponseBodyData self = new CreateTextFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTextFileResponseBodyData setTextFileId(String textFileId) {
            this.textFileId = textFileId;
            return this;
        }
        public String getTextFileId() {
            return this.textFileId;
        }

        public CreateTextFileResponseBodyData setTextFileName(String textFileName) {
            this.textFileName = textFileName;
            return this;
        }
        public String getTextFileName() {
            return this.textFileName;
        }

        public CreateTextFileResponseBodyData setTextFileUrl(String textFileUrl) {
            this.textFileUrl = textFileUrl;
            return this;
        }
        public String getTextFileUrl() {
            return this.textFileUrl;
        }

    }

}
