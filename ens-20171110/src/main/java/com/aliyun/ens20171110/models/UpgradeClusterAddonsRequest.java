// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeClusterAddonsRequest extends TeaModel {
    /**
     * <p>The add-on information.</p>
     */
    @NameInMap("Addons")
    public java.util.List<UpgradeClusterAddonsRequestAddons> addons;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UpgradeClusterAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterAddonsRequest self = new UpgradeClusterAddonsRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterAddonsRequest setAddons(java.util.List<UpgradeClusterAddonsRequestAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<UpgradeClusterAddonsRequestAddons> getAddons() {
        return this.addons;
    }

    public UpgradeClusterAddonsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public static class UpgradeClusterAddonsRequestAddonsConfigSchema extends TeaModel {
        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>4155709cd12a09bdb8cbaca71bf03233</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>4155709cd12a09bdb8cbaca71bf03233</p>
         */
        @NameInMap("ConfigVersion")
        public String configVersion;

        /**
         * <p>The add-on name.</p>
         * 
         * <strong>example:</strong>
         * <p>edge-csi-lite</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The custom parameters of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;}</p>
         */
        @NameInMap("Params")
        public java.util.Map<String, ?> params;

        public static UpgradeClusterAddonsRequestAddonsConfigSchema build(java.util.Map<String, ?> map) throws Exception {
            UpgradeClusterAddonsRequestAddonsConfigSchema self = new UpgradeClusterAddonsRequestAddonsConfigSchema();
            return TeaModel.build(map, self);
        }

        public UpgradeClusterAddonsRequestAddonsConfigSchema setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public UpgradeClusterAddonsRequestAddonsConfigSchema setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public UpgradeClusterAddonsRequestAddonsConfigSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpgradeClusterAddonsRequestAddonsConfigSchema setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

    }

    public static class UpgradeClusterAddonsRequestAddons extends TeaModel {
        /**
         * <p>The schema of the custom parameters for the add-on.</p>
         */
        @NameInMap("ConfigSchema")
        public java.util.List<UpgradeClusterAddonsRequestAddonsConfigSchema> configSchema;

        /**
         * <p>The add-on name.</p>
         * 
         * <strong>example:</strong>
         * <p>edge-csi-lite</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The target version for the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("NextVersion")
        public String nextVersion;

        public static UpgradeClusterAddonsRequestAddons build(java.util.Map<String, ?> map) throws Exception {
            UpgradeClusterAddonsRequestAddons self = new UpgradeClusterAddonsRequestAddons();
            return TeaModel.build(map, self);
        }

        public UpgradeClusterAddonsRequestAddons setConfigSchema(java.util.List<UpgradeClusterAddonsRequestAddonsConfigSchema> configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public java.util.List<UpgradeClusterAddonsRequestAddonsConfigSchema> getConfigSchema() {
            return this.configSchema;
        }

        public UpgradeClusterAddonsRequestAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpgradeClusterAddonsRequestAddons setNextVersion(String nextVersion) {
            this.nextVersion = nextVersion;
            return this;
        }
        public String getNextVersion() {
            return this.nextVersion;
        }

    }

}
