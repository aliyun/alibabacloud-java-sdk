// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ConfigRuntimeModelTemplateResponseBody extends TeaModel {
    /**
     * <p>The list of execution results.</p>
     */
    @NameInMap("Data")
    public java.util.List<ConfigRuntimeModelTemplateResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ConfigRuntimeModelTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigRuntimeModelTemplateResponseBody self = new ConfigRuntimeModelTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigRuntimeModelTemplateResponseBody setData(java.util.List<ConfigRuntimeModelTemplateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ConfigRuntimeModelTemplateResponseBodyData> getData() {
        return this.data;
    }

    public ConfigRuntimeModelTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigRuntimeModelTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ConfigRuntimeModelTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The error code returned when the execution fails.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The HTTP status code returned when the execution fails.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HttpStatusCode")
        public Integer httpStatusCode;

        /**
         * <p>The error message returned when the execution fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter callerUid may not be null.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The Agent runtime ID. The ID mapping is as follows:</p>
         * <p>JVS Computer: JVS Computer ID, in the format of jvs-xxxx.</p>
         * <p>OpenClaw: cloud computer ID, in the format of ecd-xxxx.</p>
         * <p>Hermes Agent: Hermes Agent ID, in the format of jvs-xxxx.</p>
         * 
         * <strong>example:</strong>
         * <p>jvs-xxxxxxxx</p>
         */
        @NameInMap("RuntimeId")
        public String runtimeId;

        /**
         * <p>Indicates whether the execution is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ConfigRuntimeModelTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfigRuntimeModelTemplateResponseBodyData self = new ConfigRuntimeModelTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfigRuntimeModelTemplateResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ConfigRuntimeModelTemplateResponseBodyData setHttpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public ConfigRuntimeModelTemplateResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ConfigRuntimeModelTemplateResponseBodyData setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public ConfigRuntimeModelTemplateResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
