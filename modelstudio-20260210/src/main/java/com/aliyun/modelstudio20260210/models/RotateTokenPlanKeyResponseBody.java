// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class RotateTokenPlanKeyResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public RotateTokenPlanKeyResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RotateTokenPlanKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RotateTokenPlanKeyResponseBody self = new RotateTokenPlanKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public RotateTokenPlanKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RotateTokenPlanKeyResponseBody setData(RotateTokenPlanKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RotateTokenPlanKeyResponseBodyData getData() {
        return this.data;
    }

    public RotateTokenPlanKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RotateTokenPlanKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RotateTokenPlanKeyResponseBodyData extends TeaModel {
        /**
         * <p>The API Key ID, which is system-generated.</p>
         * 
         * <strong>example:</strong>
         * <p>ak_123456</p>
         */
        @NameInMap("ApiKeyId")
        public String apiKeyId;

        /**
         * <p>The new masked_api_key returned by BaiLian, such as sk_***cdef.</p>
         * 
         * <strong>example:</strong>
         * <p>sk_***6</p>
         */
        @NameInMap("MaskedApiKey")
        public String maskedApiKey;

        /**
         * <p>The new plaintext API Key returned by BaiLian. This value is returned only once during the reset operation.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-ws.abc123456</p>
         */
        @NameInMap("PlainApiKey")
        public String plainApiKey;

        /**
         * <p>The time when the API key was reset.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-18T03:19:17Z</p>
         */
        @NameInMap("ResetAt")
        public String resetAt;

        /**
         * <p>The source_id returned by BaiLian.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        public static RotateTokenPlanKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RotateTokenPlanKeyResponseBodyData self = new RotateTokenPlanKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RotateTokenPlanKeyResponseBodyData setApiKeyId(String apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }
        public String getApiKeyId() {
            return this.apiKeyId;
        }

        public RotateTokenPlanKeyResponseBodyData setMaskedApiKey(String maskedApiKey) {
            this.maskedApiKey = maskedApiKey;
            return this;
        }
        public String getMaskedApiKey() {
            return this.maskedApiKey;
        }

        public RotateTokenPlanKeyResponseBodyData setPlainApiKey(String plainApiKey) {
            this.plainApiKey = plainApiKey;
            return this;
        }
        public String getPlainApiKey() {
            return this.plainApiKey;
        }

        public RotateTokenPlanKeyResponseBodyData setResetAt(String resetAt) {
            this.resetAt = resetAt;
            return this;
        }
        public String getResetAt() {
            return this.resetAt;
        }

        public RotateTokenPlanKeyResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

}
