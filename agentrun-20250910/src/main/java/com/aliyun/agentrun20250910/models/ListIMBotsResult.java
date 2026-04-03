// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListIMBotsResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListIMBotsOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static ListIMBotsResult build(java.util.Map<String, ?> map) throws Exception {
        ListIMBotsResult self = new ListIMBotsResult();
        return TeaModel.build(map, self);
    }

    public ListIMBotsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIMBotsResult setData(ListIMBotsOutput data) {
        this.data = data;
        return this;
    }
    public ListIMBotsOutput getData() {
        return this.data;
    }

    public ListIMBotsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
