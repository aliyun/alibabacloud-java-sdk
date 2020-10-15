// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpgradeApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeApplicationResponse self = new UpgradeApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
