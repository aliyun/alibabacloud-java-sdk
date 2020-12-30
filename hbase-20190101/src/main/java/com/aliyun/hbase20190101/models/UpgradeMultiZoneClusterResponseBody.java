// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMultiZoneClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UpgradingComponents")
    public String upgradingComponents;

    public static UpgradeMultiZoneClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMultiZoneClusterResponseBody self = new UpgradeMultiZoneClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeMultiZoneClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeMultiZoneClusterResponseBody setUpgradingComponents(String upgradingComponents) {
        this.upgradingComponents = upgradingComponents;
        return this;
    }
    public String getUpgradingComponents() {
        return this.upgradingComponents;
    }

}
