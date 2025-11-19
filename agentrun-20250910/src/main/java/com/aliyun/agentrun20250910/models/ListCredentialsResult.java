// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCredentialsResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListCredentialsOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static ListCredentialsResult build(java.util.Map<String, ?> map) throws Exception {
        ListCredentialsResult self = new ListCredentialsResult();
        return TeaModel.build(map, self);
    }

    public ListCredentialsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCredentialsResult setData(ListCredentialsOutput data) {
        this.data = data;
        return this;
    }
    public ListCredentialsOutput getData() {
        return this.data;
    }

    public ListCredentialsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
