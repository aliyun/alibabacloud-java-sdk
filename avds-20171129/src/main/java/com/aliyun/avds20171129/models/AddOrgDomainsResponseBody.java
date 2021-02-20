// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgDomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddOrgDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddOrgDomainsResponseBody self = new AddOrgDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddOrgDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
