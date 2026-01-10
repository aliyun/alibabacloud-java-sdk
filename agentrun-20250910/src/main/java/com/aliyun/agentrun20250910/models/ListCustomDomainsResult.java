// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCustomDomainsResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListCustomDomainsOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static ListCustomDomainsResult build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsResult self = new ListCustomDomainsResult();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCustomDomainsResult setData(ListCustomDomainsOutput data) {
        this.data = data;
        return this;
    }
    public ListCustomDomainsOutput getData() {
        return this.data;
    }

    public ListCustomDomainsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
