// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ModifyIpControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyIpControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpControlResponseBody self = new ModifyIpControlResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyIpControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
