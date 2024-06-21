// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateRumAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateRumAppResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static UpdateRumAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRumAppResponseBody self = new UpdateRumAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRumAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateRumAppResponseBody setData(UpdateRumAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateRumAppResponseBodyData getData() {
        return this.data;
    }

    public UpdateRumAppResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateRumAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateRumAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRumAppResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UpdateRumAppResponseBodyData extends TeaModel {
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Limited")
        public Boolean limited;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        public static UpdateRumAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRumAppResponseBodyData self = new UpdateRumAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateRumAppResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public UpdateRumAppResponseBodyData setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public UpdateRumAppResponseBodyData setLimited(Boolean limited) {
            this.limited = limited;
            return this;
        }
        public Boolean getLimited() {
            return this.limited;
        }

        public UpdateRumAppResponseBodyData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

    }

}
