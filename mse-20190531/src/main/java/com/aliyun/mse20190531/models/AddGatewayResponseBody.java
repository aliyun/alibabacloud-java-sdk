// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayResponseBody extends TeaModel {
    // The return value.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public AddGatewayResponseBodyData data;

    // The HTTP status code.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The returned message.
    // 
    // *   If the request is successful, a success message is returned.
    // *   If the request fails, an error message is returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static AddGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayResponseBody self = new AddGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddGatewayResponseBody setData(AddGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddGatewayResponseBodyData getData() {
        return this.data;
    }

    public AddGatewayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddGatewayResponseBodyData extends TeaModel {
        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        public static AddGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddGatewayResponseBodyData self = new AddGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddGatewayResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

    }

}
