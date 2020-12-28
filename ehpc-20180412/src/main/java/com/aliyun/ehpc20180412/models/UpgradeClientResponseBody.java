// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpgradeClientResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClientResponseBody self = new UpgradeClientResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
