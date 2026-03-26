// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListToolsResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListToolsOutputV2 data;

    @NameInMap("requestId")
    public String requestId;

    public static ListToolsResult build(java.util.Map<String, ?> map) throws Exception {
        ListToolsResult self = new ListToolsResult();
        return TeaModel.build(map, self);
    }

    public ListToolsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListToolsResult setData(ListToolsOutputV2 data) {
        this.data = data;
        return this;
    }
    public ListToolsOutputV2 getData() {
        return this.data;
    }

    public ListToolsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
