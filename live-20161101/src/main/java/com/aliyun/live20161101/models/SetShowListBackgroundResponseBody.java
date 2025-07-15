// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetShowListBackgroundResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>987DA143-A39C-5B5D-AF5B-3B07944A0036</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetShowListBackgroundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetShowListBackgroundResponseBody self = new SetShowListBackgroundResponseBody();
        return TeaModel.build(map, self);
    }

    public SetShowListBackgroundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
