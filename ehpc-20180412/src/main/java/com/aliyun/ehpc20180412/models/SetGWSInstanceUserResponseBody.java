// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSInstanceUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetGWSInstanceUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGWSInstanceUserResponseBody self = new SetGWSInstanceUserResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGWSInstanceUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
