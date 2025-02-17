// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateUserInformationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserInformationResponseBody self = new UpdateUserInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
