// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteOrganizationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrganizationsResponseBody self = new DeleteOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
