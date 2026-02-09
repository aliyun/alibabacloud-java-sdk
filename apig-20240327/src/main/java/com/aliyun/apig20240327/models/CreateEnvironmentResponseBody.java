// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateEnvironmentResponseBody extends TeaModel {
    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Schema of Response</p>
     */
    @NameInMap("data")
    public CreateEnvironmentResponseBodyData data;

    /**
     * <p>rg-acfmycs5expl7oq</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C3B9A12-3868-5EB9-8BEA-F99E03DD125C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentResponseBody self = new CreateEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEnvironmentResponseBody setData(CreateEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public CreateEnvironmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEnvironmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEnvironmentResponseBodyData extends TeaModel {
        /**
         * <p>The request ID, which is used to trace the call link.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qasrdc0</p>
         */
        @NameInMap("environmentId")
        public String environmentId;

        public static CreateEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentResponseBodyData self = new CreateEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

    }

}
