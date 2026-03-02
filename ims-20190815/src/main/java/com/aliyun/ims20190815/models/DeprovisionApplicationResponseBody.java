// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeprovisionApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionApplicationResponseBody self = new DeprovisionApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeprovisionApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
