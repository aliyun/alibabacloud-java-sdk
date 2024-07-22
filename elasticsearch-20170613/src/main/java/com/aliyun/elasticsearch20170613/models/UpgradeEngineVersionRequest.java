// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeEngineVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>engineVersion</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>6.7</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The moderation results.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The monitoring type. Valid values:</p>
     * <ul>
     * <li>checkClusterHealth: Cluster Health Status</li>
     * <li>checkConfigCompatible: Configuration Compatibility Status</li>
     * <li>checkClusterResource: resource space status</li>
     * <li>checkClusterSnapshot: Whether a snapshot exists</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
