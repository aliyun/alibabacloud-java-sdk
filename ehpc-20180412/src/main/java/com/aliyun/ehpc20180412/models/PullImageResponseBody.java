// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class PullImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>29d3d9Ee-8eCB-5013-A1c2-1CeD19C6CfFe</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PullImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PullImageResponseBody self = new PullImageResponseBody();
        return TeaModel.build(map, self);
    }

    public PullImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
