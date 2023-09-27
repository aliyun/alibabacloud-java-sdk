// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class VpcModifyAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VpcModifyAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcModifyAccessResponseBody self = new VpcModifyAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcModifyAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
