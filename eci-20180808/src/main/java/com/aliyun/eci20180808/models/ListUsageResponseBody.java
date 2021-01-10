// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ListUsageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    public static ListUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsageResponseBody self = new ListUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsageResponseBody setAttributes(java.util.Map<String, ?> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

}
