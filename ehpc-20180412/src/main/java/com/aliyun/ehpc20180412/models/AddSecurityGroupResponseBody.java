// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSecurityGroupResponseBody self = new AddSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
