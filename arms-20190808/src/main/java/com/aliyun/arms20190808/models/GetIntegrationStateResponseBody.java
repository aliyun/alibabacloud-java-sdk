// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetIntegrationStateResponseBody extends TeaModel {
    /**
     * <p>状态码。200为成功，其他状态码为异常。</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>返回结果的提示信息。</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public Boolean state;

    public static GetIntegrationStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationStateResponseBody self = new GetIntegrationStateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegrationStateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetIntegrationStateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIntegrationStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIntegrationStateResponseBody setState(Boolean state) {
        this.state = state;
        return this;
    }
    public Boolean getState() {
        return this.state;
    }

}
