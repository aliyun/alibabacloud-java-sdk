// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyLDAPConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLDAPConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLDAPConfigResponseBody self = new ModifyLDAPConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLDAPConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
