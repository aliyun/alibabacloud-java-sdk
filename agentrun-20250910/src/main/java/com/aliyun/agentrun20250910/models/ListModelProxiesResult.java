// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelProxiesResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListModelProxiesOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static ListModelProxiesResult build(java.util.Map<String, ?> map) throws Exception {
        ListModelProxiesResult self = new ListModelProxiesResult();
        return TeaModel.build(map, self);
    }

    public ListModelProxiesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelProxiesResult setData(ListModelProxiesOutput data) {
        this.data = data;
        return this;
    }
    public ListModelProxiesOutput getData() {
        return this.data;
    }

    public ListModelProxiesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
