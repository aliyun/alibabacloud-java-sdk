// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateOrderForRdsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Success")
    public Boolean success;

    public static CreateOrderForRdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForRdsResponseBody self = new CreateOrderForRdsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderForRdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderForRdsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateOrderForRdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
