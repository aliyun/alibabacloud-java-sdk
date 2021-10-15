// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class NotifyPayOrderStatusResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static NotifyPayOrderStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyPayOrderStatusResponse self = new NotifyPayOrderStatusResponse();
        return TeaModel.build(map, self);
    }

    public NotifyPayOrderStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NotifyPayOrderStatusResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
