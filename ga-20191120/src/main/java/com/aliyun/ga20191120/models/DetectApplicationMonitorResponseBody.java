// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DetectApplicationMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetectApplicationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectApplicationMonitorResponseBody self = new DetectApplicationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectApplicationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
