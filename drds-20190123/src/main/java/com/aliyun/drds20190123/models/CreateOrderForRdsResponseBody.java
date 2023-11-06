// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateOrderForRdsResponseBody extends TeaModel {
    /**
     * <p>The ID of the purchased RDS instance.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOrderForRdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForRdsResponseBody self = new CreateOrderForRdsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderForRdsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateOrderForRdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderForRdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
