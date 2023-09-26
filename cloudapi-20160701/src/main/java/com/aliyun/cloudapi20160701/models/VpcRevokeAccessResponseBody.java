// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class VpcRevokeAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VpcRevokeAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcRevokeAccessResponseBody self = new VpcRevokeAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcRevokeAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
