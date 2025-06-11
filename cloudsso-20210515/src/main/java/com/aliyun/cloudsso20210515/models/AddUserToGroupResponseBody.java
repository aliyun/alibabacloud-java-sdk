// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddUserToGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F76AF4FC-25E4-5CF1-B7CB-74F3CB72F0F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserToGroupResponseBody self = new AddUserToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserToGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
