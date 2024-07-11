// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMultiZoneClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C532A4D4-9451-4460-BB3E-300FEC852D3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>LINDORM</p>
     */
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
