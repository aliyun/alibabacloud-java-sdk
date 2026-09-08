// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDoNotCallFileUploadParametersResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public GetDoNotCallFileUploadParametersResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDoNotCallFileUploadParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDoNotCallFileUploadParametersResponseBody self = new GetDoNotCallFileUploadParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDoNotCallFileUploadParametersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDoNotCallFileUploadParametersResponseBody setData(GetDoNotCallFileUploadParametersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDoNotCallFileUploadParametersResponseBodyData getData() {
        return this.data;
    }

    public GetDoNotCallFileUploadParametersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDoNotCallFileUploadParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDoNotCallFileUploadParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDoNotCallFileUploadParametersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDoNotCallFileUploadParametersResponseBodyData extends TeaModel {
        /**
         * <p>AccessKeyId used for signing.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>Expiration time, formatted as a Unix timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1647313420</p>
         */
        @NameInMap("ExpireTime")
        public Integer expireTime;

        /**
         * <p>Key of the OSS file.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test/blacklist.xlsx</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>Endpoint domain name of OSS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com">https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Signature policy.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyMi0wMy0xNVQwMzowMzo0MC4zMTJaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwidGVtcC9ibGFja2xpc3QvaW1wb3J0LzE1NzcyNDcxMTU0OTA0MDEvY2NjVjIta216LzIwMjIE1MTAwMzQwLyJd****</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>Signature information of the temporary credential for file upload, used to authenticate validity during upload.</p>
         * 
         * <strong>example:</strong>
         * <p>zi31STIMtIfa/UN2l+6lww****</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static GetDoNotCallFileUploadParametersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDoNotCallFileUploadParametersResponseBodyData self = new GetDoNotCallFileUploadParametersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Integer getExpireTime() {
            return this.expireTime;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetDoNotCallFileUploadParametersResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
