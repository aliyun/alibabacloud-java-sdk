// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableRecycleBinResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E15E394-38A6-457A-A62A-D9797C9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableRecycleBinResponseBody self = new EnableRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
