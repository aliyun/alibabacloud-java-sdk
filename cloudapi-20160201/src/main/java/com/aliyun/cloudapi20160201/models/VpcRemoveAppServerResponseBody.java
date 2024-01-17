// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcRemoveAppServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VpcRemoveAppServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcRemoveAppServerResponseBody self = new VpcRemoveAppServerResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcRemoveAppServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
