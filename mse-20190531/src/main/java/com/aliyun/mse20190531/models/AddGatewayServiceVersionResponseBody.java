// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayServiceVersionResponseBody extends TeaModel {
    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>system error</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>illegal request:%s</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>systemError</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddGatewayServiceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayServiceVersionResponseBody self = new AddGatewayServiceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGatewayServiceVersionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddGatewayServiceVersionResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public AddGatewayServiceVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddGatewayServiceVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddGatewayServiceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddGatewayServiceVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
