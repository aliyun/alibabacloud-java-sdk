// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetAudioFileUploadParametersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAudioFileUploadParametersResponseBodyData data;

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
     * <p>C81FD1A5-4B99-470A-A527-D80150228784</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAudioFileUploadParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudioFileUploadParametersResponseBody self = new GetAudioFileUploadParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudioFileUploadParametersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAudioFileUploadParametersResponseBody setData(GetAudioFileUploadParametersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAudioFileUploadParametersResponseBodyData getData() {
        return this.data;
    }

    public GetAudioFileUploadParametersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAudioFileUploadParametersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAudioFileUploadParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAudioFileUploadParametersResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>1647313420</p>
         */
        @NameInMap("ExpireTime")
        public Integer expireTime;

        /**
         * <strong>example:</strong>
         * <p>ccc-test/test-file.wav</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com">https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com</a></p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyMi0wNi0yOVQwMDoyOTowMC42NTRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiYXVkaW8vMTU3NzI0NzExNTQ5MDQwMS9seS1vbmxpbmUvMjAyMjA2MjkwNzI5MDAvIl1d****</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <strong>example:</strong>
         * <p>HIyClras8IcVlbTV7RIJWJbU****</p>
         */
        @NameInMap("Signature")
        public String signature;

        public static GetAudioFileUploadParametersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioFileUploadParametersResponseBodyData self = new GetAudioFileUploadParametersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAudioFileUploadParametersResponseBodyData setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetAudioFileUploadParametersResponseBodyData setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Integer getExpireTime() {
            return this.expireTime;
        }

        public GetAudioFileUploadParametersResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetAudioFileUploadParametersResponseBodyData setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetAudioFileUploadParametersResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public GetAudioFileUploadParametersResponseBodyData setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

}
