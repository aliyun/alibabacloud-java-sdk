// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteModelProxyResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ModelProxy data;

    @NameInMap("requestId")
    public String requestId;

    public static DeleteModelProxyResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelProxyResult self = new DeleteModelProxyResult();
        return TeaModel.build(map, self);
    }

    public DeleteModelProxyResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteModelProxyResult setData(ModelProxy data) {
        this.data = data;
        return this;
    }
    public ModelProxy getData() {
        return this.data;
    }

    public DeleteModelProxyResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
