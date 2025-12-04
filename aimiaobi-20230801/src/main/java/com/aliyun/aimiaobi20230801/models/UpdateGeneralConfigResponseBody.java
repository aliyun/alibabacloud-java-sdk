// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateGeneralConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateGeneralConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateGeneralConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGeneralConfigResponseBody self = new UpdateGeneralConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGeneralConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateGeneralConfigResponseBody setData(UpdateGeneralConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateGeneralConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdateGeneralConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateGeneralConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGeneralConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGeneralConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateGeneralConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ConfigDesc")
        public String configDesc;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ConfigKey")
        public String configKey;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ConfigValueType")
        public String configValueType;

        public static UpdateGeneralConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateGeneralConfigResponseBodyData self = new UpdateGeneralConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateGeneralConfigResponseBodyData setConfigDesc(String configDesc) {
            this.configDesc = configDesc;
            return this;
        }
        public String getConfigDesc() {
            return this.configDesc;
        }

        public UpdateGeneralConfigResponseBodyData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public UpdateGeneralConfigResponseBodyData setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public UpdateGeneralConfigResponseBodyData setConfigValueType(String configValueType) {
            this.configValueType = configValueType;
            return this;
        }
        public String getConfigValueType() {
            return this.configValueType;
        }

    }

}
