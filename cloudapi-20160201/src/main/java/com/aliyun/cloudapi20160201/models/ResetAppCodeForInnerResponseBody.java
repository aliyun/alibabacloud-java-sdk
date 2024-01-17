// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ResetAppCodeForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAppCodeForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAppCodeForInnerResponseBody self = new ResetAppCodeForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAppCodeForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
