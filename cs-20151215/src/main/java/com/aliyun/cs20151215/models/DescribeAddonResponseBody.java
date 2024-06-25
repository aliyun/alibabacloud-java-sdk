// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonResponseBody extends TeaModel {
    /**
     * <p>Architectures supported by the component. Valid values:</p>
     * <ul>
     * <li>amd64</li>
     * <li>arm64</li>
     * </ul>
     */
    @NameInMap("architecture")
    public java.util.List<String> architecture;

    /**
     * <p>The category of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>network</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The custom parameter schema of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("config_schema")
    public String configSchema;

    /**
     * <p>Indicates whether the component is automatically installed by default.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("install_by_default")
    public Boolean installByDefault;

    /**
     * <p>Indicates whether the component is fully managed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("managed")
    public Boolean managed;

    /**
     * <p>The name of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>coredns</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The latest version of the component.</p>
     */
    @NameInMap("newer_versions")
    public java.util.List<DescribeAddonResponseBodyNewerVersions> newerVersions;

    /**
     * <p>Operations supported by the component. Valid values:</p>
     * <ul>
     * <li>Install</li>
     * <li>Upgrade</li>
     * <li>Modify</li>
     * <li>Uninstall</li>
     * </ul>
     */
    @NameInMap("supported_actions")
    public java.util.List<String> supportedActions;

    /**
     * <p>The version of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.9.3.6-32932850-aliyun</p>
     */
    @NameInMap("version")
    public String version;

    public static DescribeAddonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonResponseBody self = new DescribeAddonResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddonResponseBody setArchitecture(java.util.List<String> architecture) {
        this.architecture = architecture;
        return this;
    }
    public java.util.List<String> getArchitecture() {
        return this.architecture;
    }

    public DescribeAddonResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeAddonResponseBody setConfigSchema(String configSchema) {
        this.configSchema = configSchema;
        return this;
    }
    public String getConfigSchema() {
        return this.configSchema;
    }

    public DescribeAddonResponseBody setInstallByDefault(Boolean installByDefault) {
        this.installByDefault = installByDefault;
        return this;
    }
    public Boolean getInstallByDefault() {
        return this.installByDefault;
    }

    public DescribeAddonResponseBody setManaged(Boolean managed) {
        this.managed = managed;
        return this;
    }
    public Boolean getManaged() {
        return this.managed;
    }

    public DescribeAddonResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAddonResponseBody setNewerVersions(java.util.List<DescribeAddonResponseBodyNewerVersions> newerVersions) {
        this.newerVersions = newerVersions;
        return this;
    }
    public java.util.List<DescribeAddonResponseBodyNewerVersions> getNewerVersions() {
        return this.newerVersions;
    }

    public DescribeAddonResponseBody setSupportedActions(java.util.List<String> supportedActions) {
        this.supportedActions = supportedActions;
        return this;
    }
    public java.util.List<String> getSupportedActions() {
        return this.supportedActions;
    }

    public DescribeAddonResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DescribeAddonResponseBodyNewerVersions extends TeaModel {
        /**
         * <p>The minimum cluster version required by the component version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.20.4</p>
         */
        @NameInMap("minimum_cluster_version")
        public String minimumClusterVersion;

        /**
         * <p>Indicates whether the component can be updated to the version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("upgradable")
        public Boolean upgradable;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.9.3.10-7dfca203-aliyun</p>
         */
        @NameInMap("version")
        public String version;

        public static DescribeAddonResponseBodyNewerVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonResponseBodyNewerVersions self = new DescribeAddonResponseBodyNewerVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAddonResponseBodyNewerVersions setMinimumClusterVersion(String minimumClusterVersion) {
            this.minimumClusterVersion = minimumClusterVersion;
            return this;
        }
        public String getMinimumClusterVersion() {
            return this.minimumClusterVersion;
        }

        public DescribeAddonResponseBodyNewerVersions setUpgradable(Boolean upgradable) {
            this.upgradable = upgradable;
            return this;
        }
        public Boolean getUpgradable() {
            return this.upgradable;
        }

        public DescribeAddonResponseBodyNewerVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
