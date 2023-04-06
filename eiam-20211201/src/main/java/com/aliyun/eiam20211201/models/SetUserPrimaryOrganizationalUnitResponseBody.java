// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetUserPrimaryOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetUserPrimaryOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserPrimaryOrganizationalUnitResponseBody self = new SetUserPrimaryOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserPrimaryOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
