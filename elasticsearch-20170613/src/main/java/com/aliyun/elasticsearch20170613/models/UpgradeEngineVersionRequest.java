// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeEngineVersionRequest extends TeaModel {
    @NameInMap("plugins")
    public java.util.List<UpgradeEngineVersionRequestPlugins> plugins;

    /**
     * <p>The upgrade type. Valid values:</p>
     * <ul>
     * <li>engineVersion (default): major engine version upgrade.</li>
     * <li>aliVersion: kernel version upgrade.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>engineVersion</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The version after the upgrade. If type is set to engineVersion, the value is the instance version, such as 6.7. If type is set to aliVersion, the value is the kernel version, such as ali1.2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>6.7</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a pre-upgrade check. Valid values:</p>
     * <ul>
     * <li>true: performs a check.</li>
     * <li>false (default): does not perform a check.</li>
     * </ul>
     * <blockquote>
     * <p>Warning:  The version upgrade check involves checks on cluster YML, plug-in configurations, cluster status, indexes, and resources. Perform a pre-upgrade check before upgrading. Otherwise, upgrade issues may occur.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    /**
     * <p>The update strategy. Valid values:</p>
     * <ul>
     * <li>blue_green: blue-green deployment.</li>
     * <li>normal: in-place update.</li>
     * <li>intelligent: intelligent update.</li>
     * </ul>
     */
    @NameInMap("updateStrategy")
    public String updateStrategy;

    public static UpgradeEngineVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeEngineVersionRequest self = new UpgradeEngineVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeEngineVersionRequest setPlugins(java.util.List<UpgradeEngineVersionRequestPlugins> plugins) {
        this.plugins = plugins;
        return this;
    }
    public java.util.List<UpgradeEngineVersionRequestPlugins> getPlugins() {
        return this.plugins;
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

    public UpgradeEngineVersionRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public static class UpgradeEngineVersionRequestPlugins extends TeaModel {
        /**
         * <p>Specifies whether to install or uninstall the plug-in. A value of true indicates install, and a value of false indicates uninstall.</p>
         */
        @NameInMap("enable")
        public String enable;

        /**
         * <p>The fileVersion of the plug-in. Refer to the response of ListUserPlugin.</p>
         */
        @NameInMap("fileVersion")
        public String fileVersion;

        /**
         * <p>The plug-in name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The Elasticsearch version for the plug-in, such as 7.16.2.</p>
         */
        @NameInMap("version")
        public String version;

        public static UpgradeEngineVersionRequestPlugins build(java.util.Map<String, ?> map) throws Exception {
            UpgradeEngineVersionRequestPlugins self = new UpgradeEngineVersionRequestPlugins();
            return TeaModel.build(map, self);
        }

        public UpgradeEngineVersionRequestPlugins setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public UpgradeEngineVersionRequestPlugins setFileVersion(String fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public String getFileVersion() {
            return this.fileVersion;
        }

        public UpgradeEngineVersionRequestPlugins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpgradeEngineVersionRequestPlugins setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
