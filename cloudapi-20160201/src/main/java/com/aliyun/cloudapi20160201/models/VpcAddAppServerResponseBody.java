// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VpcAddAppServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VpcAddAppServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcAddAppServerResponseBody self = new VpcAddAppServerResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcAddAppServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
