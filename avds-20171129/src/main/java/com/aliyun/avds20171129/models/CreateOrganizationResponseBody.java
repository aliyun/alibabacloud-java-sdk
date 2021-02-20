// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateOrganizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationResponseBody self = new CreateOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
