// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B21DC47E-8928-199A-9F32-36D45E4693B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupResponseBody self = new ChangeResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
