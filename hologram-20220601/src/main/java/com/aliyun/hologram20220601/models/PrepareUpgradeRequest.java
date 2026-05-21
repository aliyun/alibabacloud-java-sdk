// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class PrepareUpgradeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>r5.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static PrepareUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        PrepareUpgradeRequest self = new PrepareUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public PrepareUpgradeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PrepareUpgradeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public PrepareUpgradeRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
