// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DisableInstanceAccessControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableInstanceAccessControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableInstanceAccessControlResponseBody self = new DisableInstanceAccessControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableInstanceAccessControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
