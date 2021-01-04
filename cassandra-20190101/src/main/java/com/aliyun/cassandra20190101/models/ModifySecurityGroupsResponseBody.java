// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupsResponseBody self = new ModifySecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
