// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopGWSInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopGWSInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopGWSInstanceResponseBody self = new StopGWSInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopGWSInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
