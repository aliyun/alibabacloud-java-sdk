// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetGeneralConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetGeneralConfigResponseBodyData data;

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

    public static GetGeneralConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralConfigResponseBody self = new GetGeneralConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGeneralConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGeneralConfigResponseBody setData(GetGeneralConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGeneralConfigResponseBodyData getData() {
        return this.data;
    }

    public GetGeneralConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGeneralConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGeneralConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGeneralConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGeneralConfigResponseBodyData extends TeaModel {
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

        public static GetGeneralConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGeneralConfigResponseBodyData self = new GetGeneralConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGeneralConfigResponseBodyData setConfigDesc(String configDesc) {
            this.configDesc = configDesc;
            return this;
        }
        public String getConfigDesc() {
            return this.configDesc;
        }

        public GetGeneralConfigResponseBodyData setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public GetGeneralConfigResponseBodyData setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public GetGeneralConfigResponseBodyData setConfigValueType(String configValueType) {
            this.configValueType = configValueType;
            return this;
        }
        public String getConfigValueType() {
            return this.configValueType;
        }

    }

}
