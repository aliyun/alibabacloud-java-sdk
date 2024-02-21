// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupResponseBody self = new ChangeResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ChangeResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
