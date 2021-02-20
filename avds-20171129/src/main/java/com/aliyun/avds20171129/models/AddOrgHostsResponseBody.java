// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgHostsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddOrgHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddOrgHostsResponseBody self = new AddOrgHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddOrgHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
