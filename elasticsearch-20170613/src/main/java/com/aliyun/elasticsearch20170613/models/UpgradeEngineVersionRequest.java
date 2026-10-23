// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeEngineVersionRequest extends TeaModel {
    /**
     * <p>The list of plug-in configurations to install or uninstall during the version upgrade.</p>
     */
    @NameInMap("plugins")
    public java.util.List<UpgradeEngineVersionRequestPlugins> plugins;

    /**
     * <p>The upgrade type. Valid values:</p>
     * <ul>
     * <li>engineVersion: Major engine version upgrade. This is the default value.</li>
     * <li>aliVersion: Kernel version upgrade.</li>
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
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the token on the client side. The token must be unique across different requests and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a pre-upgrade check. Valid values:</p>
     * <ul>
     * <li>true: Performs the check.</li>
     * <li>false: Does not perform the check. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>Warning:  The version upgrade check includes checks on the cluster YML file, plug-in configurations, cluster status, indexes, and resources. Perform a pre-upgrade check before the upgrade to prevent upgrade issues.</p>
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
     * <li>blue_green: Blue-green deployment.</li>
     * <li>normal: In-place update.</li>
     * <li>intelligent: Intelligent update.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>blue_green</p>
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
         * <p>Specifies whether to install or uninstall the plug-in. Valid values:</p>
         * <ul>
         * <li>true: Installs the plug-in.</li>
         * <li>false: Uninstalls the plug-in.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public String enable;

        /**
         * <p>The file version of the plug-in. For more information, see the response of ListUserPlugin.</p>
         */
        @NameInMap("fileVersion")
        public String fileVersion;

        /**
         * <p>The name of the plug-in.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The Elasticsearch version corresponding to the plug-in, such as 7.16.2.</p>
         * 
         * <strong>example:</strong>
         * <p>7.16.2</p>
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
