// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code in the successful response.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the updated instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Data")
    public UpdateInstanceResponseBodyData data;

    /**
     * <p><strong>The HTTP status code.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p><strong>The response message.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p><strong>The request ID.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>request-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResponseBody self = new UpdateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInstanceResponseBody setData(UpdateInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateInstanceResponseBodyData getData() {
        return this.data;
    }

    public UpdateInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the AgentTeams instance.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-abc123</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The new instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>New instance name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static UpdateInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceResponseBodyData self = new UpdateInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
