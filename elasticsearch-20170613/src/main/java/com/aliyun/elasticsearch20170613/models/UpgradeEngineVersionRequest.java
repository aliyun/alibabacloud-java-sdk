// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeEngineVersionRequest extends TeaModel {
    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    /**
     * <p>The moderation results.</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The monitoring type. Valid values:</p>
     * <br>
     * <p>*   checkClusterHealth: Cluster Health Status</p>
     * <p>*   checkConfigCompatible: Configuration Compatibility Status</p>
     * <p>*   checkClusterResource: resource space status</p>
     * <p>*   checkClusterSnapshot: Whether a snapshot exists</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpgradeEngineVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEngineVersionRequest self = new UpgradeEngineVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeEngineVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpgradeEngineVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpgradeEngineVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeEngineVersionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
