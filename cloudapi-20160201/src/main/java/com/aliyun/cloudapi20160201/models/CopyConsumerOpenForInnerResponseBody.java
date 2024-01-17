// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CopyConsumerOpenForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CopyConsumerOpenForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyConsumerOpenForInnerResponseBody self = new CopyConsumerOpenForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyConsumerOpenForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
