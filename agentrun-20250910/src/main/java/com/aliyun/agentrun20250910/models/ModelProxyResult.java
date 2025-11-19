// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelProxyResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ModelProxy data;

    @NameInMap("requestId")
    public String requestId;

    public static ModelProxyResult build(java.util.Map<String, ?> map) throws Exception {
        ModelProxyResult self = new ModelProxyResult();
        return TeaModel.build(map, self);
    }

    public ModelProxyResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModelProxyResult setData(ModelProxy data) {
        this.data = data;
        return this;
    }
    public ModelProxy getData() {
        return this.data;
    }

    public ModelProxyResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
