// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateServiceEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateServiceEndpointResponseBodyData data;

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
     * <p>2b7f1c2d-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateServiceEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceEndpointResponseBody self = new CreateServiceEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceEndpointResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateServiceEndpointResponseBody setData(CreateServiceEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateServiceEndpointResponseBodyData getData() {
        return this.data;
    }

    public CreateServiceEndpointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateServiceEndpointResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateServiceEndpointResponseBodyData extends TeaModel {
        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("Status")
        public String status;

        public static CreateServiceEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceEndpointResponseBodyData self = new CreateServiceEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateServiceEndpointResponseBodyData setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public CreateServiceEndpointResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
