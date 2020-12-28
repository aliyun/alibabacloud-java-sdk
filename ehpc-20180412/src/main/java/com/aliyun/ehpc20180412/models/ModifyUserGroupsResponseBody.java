// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyUserGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserGroupsResponseBody self = new ModifyUserGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
