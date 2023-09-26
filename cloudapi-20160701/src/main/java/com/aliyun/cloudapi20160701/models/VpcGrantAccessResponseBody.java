// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class VpcGrantAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static VpcGrantAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcGrantAccessResponseBody self = new VpcGrantAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcGrantAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
