// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachPluginResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachPluginResponseBody self = new DetachPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
