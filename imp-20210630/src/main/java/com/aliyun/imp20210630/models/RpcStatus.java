// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RpcStatus extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public Integer code;

    // 错误详情
    @NameInMap("Detail")
    public String detail;

    // 错误消息
    @NameInMap("Message")
    public String message;

    public static RpcStatus build(java.util.Map<String, ?> map) throws Exception {
        RpcStatus self = new RpcStatus();
        return TeaModel.build(map, self);
    }

    public RpcStatus setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RpcStatus setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public RpcStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
