// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveOrgResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6C352609-EE7F-5603-B5E6-57C3EDDD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveOrgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveOrgResponseBody self = new RemoveOrgResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveOrgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
