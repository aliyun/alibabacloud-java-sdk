// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLDAPConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLDAPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDAPConfigResponse self = new DeleteLDAPConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDAPConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
