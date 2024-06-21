// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("Data")
    public AddGatewayResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * <ul>
     * <li>If the request is successful, a success message is returned.</li>
     * <li>If the request fails, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request is successfully processed.</p>
     * 
     * <strong>example:</strong>
     * <p>The return value.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2F46B9E7-67EF-5C8A-BA52-D38D5B32AF2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>gw-5017305290e14cebbrvec4a5****</p>
         */
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
