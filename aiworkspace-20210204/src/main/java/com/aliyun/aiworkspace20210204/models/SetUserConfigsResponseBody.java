// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class SetUserConfigsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dsjk****dfjksdf</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetUserConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserConfigsResponseBody self = new SetUserConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
