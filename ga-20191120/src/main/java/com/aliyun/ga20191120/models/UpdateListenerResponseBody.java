// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateListenerResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerResponseBody self = new UpdateListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
