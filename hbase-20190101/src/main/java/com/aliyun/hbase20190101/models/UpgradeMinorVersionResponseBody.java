// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class UpgradeMinorVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7B8EC240-BB13-4DBC-B955-F90170E82609</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>HADOOP</p>
     */
    @NameInMap("UpgradingComponents")
    public String upgradingComponents;

    public static UpgradeMinorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMinorVersionResponseBody self = new UpgradeMinorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeMinorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeMinorVersionResponseBody setUpgradingComponents(String upgradingComponents) {
        this.upgradingComponents = upgradingComponents;
        return this;
    }
    public String getUpgradingComponents() {
        return this.upgradingComponents;
    }

}
