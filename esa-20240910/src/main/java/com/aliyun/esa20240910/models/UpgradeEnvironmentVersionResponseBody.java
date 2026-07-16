// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpgradeEnvironmentVersionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B49E6DDA-F413-422B-B58E-2FA23F286726</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeEnvironmentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEnvironmentVersionResponseBody self = new UpgradeEnvironmentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeEnvironmentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
