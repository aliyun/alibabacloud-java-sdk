// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateGatewayServiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9BA5586D-0EAE-5F78-B704-1A8DBADE46DA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateGatewayServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayServiceResponseBody self = new CreateGatewayServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGatewayServiceResponseBody setData(CreateGatewayServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGatewayServiceResponseBodyData getData() {
        return this.data;
    }

    public CreateGatewayServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGatewayServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGatewayServiceResponseBodyData extends TeaModel {
        @NameInMap("gatewayServiceIds")
        public java.util.List<String> gatewayServiceIds;

        public static CreateGatewayServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayServiceResponseBodyData self = new CreateGatewayServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGatewayServiceResponseBodyData setGatewayServiceIds(java.util.List<String> gatewayServiceIds) {
            this.gatewayServiceIds = gatewayServiceIds;
            return this;
        }
        public java.util.List<String> getGatewayServiceIds() {
            return this.gatewayServiceIds;
        }

    }

}
