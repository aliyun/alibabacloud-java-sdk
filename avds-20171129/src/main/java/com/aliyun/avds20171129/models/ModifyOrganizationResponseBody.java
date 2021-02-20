// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ModifyOrganizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrganizationResponseBody self = new ModifyOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
