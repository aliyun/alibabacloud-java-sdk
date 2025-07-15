// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UnbanLiveMessageGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84AF36BF-0B39-1F8A-A416-FAC7C484****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbanLiveMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbanLiveMessageGroupResponseBody self = new UnbanLiveMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbanLiveMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
