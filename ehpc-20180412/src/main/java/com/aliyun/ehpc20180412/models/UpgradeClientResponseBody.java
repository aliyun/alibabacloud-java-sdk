// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpgradeClientResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4994fbcd-2a09-4045-b2b2-2c3bee8e9296</p>
     */
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
