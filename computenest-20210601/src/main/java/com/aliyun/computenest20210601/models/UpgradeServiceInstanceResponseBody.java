// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpgradeServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The parameters required for the upgrade. This parameter is returned only if DryRun is set to true in the request. You can specify the required parameters based on the returned value when you perform an actual request.</p>
     */
    @NameInMap("UpgradeRequiredParameters")
    public java.util.List<String> upgradeRequiredParameters;

    public static UpgradeServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeServiceInstanceResponseBody self = new UpgradeServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeServiceInstanceResponseBody setUpgradeRequiredParameters(java.util.List<String> upgradeRequiredParameters) {
        this.upgradeRequiredParameters = upgradeRequiredParameters;
        return this;
    }
    public java.util.List<String> getUpgradeRequiredParameters() {
        return this.upgradeRequiredParameters;
    }

}
