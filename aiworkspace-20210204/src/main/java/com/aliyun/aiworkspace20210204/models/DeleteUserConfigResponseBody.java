// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteUserConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>dsjk****dfjksdf</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserConfigResponseBody self = new DeleteUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
