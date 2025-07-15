// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BanLiveMessageGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>84AF36BF-0B39-1F8A-A416-FAC7C484****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BanLiveMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BanLiveMessageGroupResponseBody self = new BanLiveMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public BanLiveMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
