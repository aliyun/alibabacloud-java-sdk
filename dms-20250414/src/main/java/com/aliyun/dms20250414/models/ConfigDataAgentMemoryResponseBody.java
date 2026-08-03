// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ConfigDataAgentMemoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public ConfigDataAgentMemoryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InvalidTid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ConfigDataAgentMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigDataAgentMemoryResponseBody self = new ConfigDataAgentMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigDataAgentMemoryResponseBody setData(ConfigDataAgentMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfigDataAgentMemoryResponseBodyData getData() {
        return this.data;
    }

    public ConfigDataAgentMemoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ConfigDataAgentMemoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ConfigDataAgentMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigDataAgentMemoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfigDataAgentMemoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RecallEnabled")
        public Boolean recallEnabled;

        public static ConfigDataAgentMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataAgentMemoryResponseBodyData self = new ConfigDataAgentMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfigDataAgentMemoryResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ConfigDataAgentMemoryResponseBodyData setRecallEnabled(Boolean recallEnabled) {
            this.recallEnabled = recallEnabled;
            return this;
        }
        public Boolean getRecallEnabled() {
            return this.recallEnabled;
        }

    }

}
