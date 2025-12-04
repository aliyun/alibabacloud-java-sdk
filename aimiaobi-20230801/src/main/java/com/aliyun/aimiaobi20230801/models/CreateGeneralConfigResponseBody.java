// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateGeneralConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateGeneralConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>数据不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateGeneralConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGeneralConfigResponseBody self = new CreateGeneralConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGeneralConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGeneralConfigResponseBody setData(CreateGeneralConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGeneralConfigResponseBodyData getData() {
        return this.data;
    }

    public CreateGeneralConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateGeneralConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGeneralConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGeneralConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateGeneralConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
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
         * <p>xx</p>
         */
        @NameInMap("ConfigValue")
        public String configValue;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ConfigValueType")
        public String configValueType;

        public static CreateGeneralConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGeneralConfigResponseBodyData self = new CreateGeneralConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGeneralConfigResponseBodyData setConfigDesc(String configDesc) {
            this.configDesc = configDesc;
            return this;
        }
        public String getConfigDesc() {
            return this.configDesc;
        }

        public CreateGeneralConfigResponseBodyData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public CreateGeneralConfigResponseBodyData setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public CreateGeneralConfigResponseBodyData setConfigValueType(String configValueType) {
            this.configValueType = configValueType;
            return this;
        }
        public String getConfigValueType() {
            return this.configValueType;
        }

    }

}
