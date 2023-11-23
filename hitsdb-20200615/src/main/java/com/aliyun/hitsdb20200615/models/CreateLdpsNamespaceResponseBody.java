// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLdpsNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLdpsNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLdpsNamespaceResponseBody self = new CreateLdpsNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLdpsNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
