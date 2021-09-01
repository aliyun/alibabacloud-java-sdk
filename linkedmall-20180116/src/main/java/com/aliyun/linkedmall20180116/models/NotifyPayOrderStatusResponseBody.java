// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class NotifyPayOrderStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static NotifyPayOrderStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyPayOrderStatusResponseBody self = new NotifyPayOrderStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyPayOrderStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NotifyPayOrderStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
