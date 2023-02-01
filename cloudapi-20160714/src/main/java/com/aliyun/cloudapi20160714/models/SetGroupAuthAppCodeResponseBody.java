// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetGroupAuthAppCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetGroupAuthAppCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGroupAuthAppCodeResponseBody self = new SetGroupAuthAppCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGroupAuthAppCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
