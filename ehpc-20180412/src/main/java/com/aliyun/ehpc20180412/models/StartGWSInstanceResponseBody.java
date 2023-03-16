// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartGWSInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartGWSInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartGWSInstanceResponseBody self = new StartGWSInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartGWSInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
