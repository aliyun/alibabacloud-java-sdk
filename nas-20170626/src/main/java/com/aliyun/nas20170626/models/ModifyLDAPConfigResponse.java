// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyLDAPConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyLDAPConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLDAPConfigResponse self = new ModifyLDAPConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLDAPConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
