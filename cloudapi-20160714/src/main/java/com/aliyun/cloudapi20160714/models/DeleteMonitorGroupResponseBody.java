// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C7E2CBAA-47FF-569F-AF12-B14B80E25422</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMonitorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupResponseBody self = new DeleteMonitorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
