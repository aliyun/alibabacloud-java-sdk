// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgSubdomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddOrgSubdomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddOrgSubdomainsResponseBody self = new AddOrgSubdomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddOrgSubdomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
