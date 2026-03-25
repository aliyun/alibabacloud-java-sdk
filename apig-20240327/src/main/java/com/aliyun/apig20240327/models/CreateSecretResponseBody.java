// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateSecretResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CreateSecretResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to upload data. Please try again</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CFF809D7-045D-502F-BF6C-947Exxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretResponseBody self = new CreateSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecretResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSecretResponseBody setData(CreateSecretResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSecretResponseBodyData getData() {
        return this.data;
    }

    public CreateSecretResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSecretResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>sec-d5e6shmm1hkoxxxxxxxx</p>
         */
        @NameInMap("secretId")
        public String secretId;

        public static CreateSecretResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSecretResponseBodyData self = new CreateSecretResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSecretResponseBodyData setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

    }

}
