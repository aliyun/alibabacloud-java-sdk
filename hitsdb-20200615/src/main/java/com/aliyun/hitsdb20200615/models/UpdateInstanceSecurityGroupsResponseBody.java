// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateInstanceSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateInstanceSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSecurityGroupsResponseBody self = new UpdateInstanceSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
