// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetVpcAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetVpcAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVpcAccessResponseBody self = new SetVpcAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVpcAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
