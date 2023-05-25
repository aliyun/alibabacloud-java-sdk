// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ResetAppCodeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAppCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAppCodeResponseBody self = new ResetAppCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAppCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
