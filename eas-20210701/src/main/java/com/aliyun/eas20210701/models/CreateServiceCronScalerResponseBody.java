// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceCronScalerResponseBody extends TeaModel {
    // 操作成功消息
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceCronScalerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceCronScalerResponseBody self = new CreateServiceCronScalerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceCronScalerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceCronScalerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
