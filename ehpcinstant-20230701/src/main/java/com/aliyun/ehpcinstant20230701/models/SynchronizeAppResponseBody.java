// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class SynchronizeAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SynchronizeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeAppResponseBody self = new SynchronizeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SynchronizeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
