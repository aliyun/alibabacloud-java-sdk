// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addons")
    public java.util.List<InstallClusterAddonsRequestAddons> addons;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static InstallClusterAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallClusterAddonsRequest self = new InstallClusterAddonsRequest();
        return TeaModel.build(map, self);
    }

    public InstallClusterAddonsRequest setAddons(java.util.List<InstallClusterAddonsRequestAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<InstallClusterAddonsRequestAddons> getAddons() {
        return this.addons;
    }

    public InstallClusterAddonsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public static class InstallClusterAddonsRequestAddonsConfigSchema extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>859e9d595b2974ed79c444658d1dea89</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>4155709cd12a09bdb8cbaca71bf03233</p>
         */
        @NameInMap("ConfigVersion")
        public String configVersion;

        /**
         * <strong>example:</strong>
         * <p>edge-csi-lite</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;}</p>
         */
        @NameInMap("Params")
        public java.util.Map<String, ?> params;

        public static InstallClusterAddonsRequestAddonsConfigSchema build(java.util.Map<String, ?> map) throws Exception {
            InstallClusterAddonsRequestAddonsConfigSchema self = new InstallClusterAddonsRequestAddonsConfigSchema();
            return TeaModel.build(map, self);
        }

        public InstallClusterAddonsRequestAddonsConfigSchema setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public InstallClusterAddonsRequestAddonsConfigSchema setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public InstallClusterAddonsRequestAddonsConfigSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallClusterAddonsRequestAddonsConfigSchema setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

    }

    public static class InstallClusterAddonsRequestAddons extends TeaModel {
        @NameInMap("ConfigSchema")
        public java.util.List<InstallClusterAddonsRequestAddonsConfigSchema> configSchema;

        /**
         * <strong>example:</strong>
         * <p>edge-csi-lite</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        public static InstallClusterAddonsRequestAddons build(java.util.Map<String, ?> map) throws Exception {
            InstallClusterAddonsRequestAddons self = new InstallClusterAddonsRequestAddons();
            return TeaModel.build(map, self);
        }

        public InstallClusterAddonsRequestAddons setConfigSchema(java.util.List<InstallClusterAddonsRequestAddonsConfigSchema> configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public java.util.List<InstallClusterAddonsRequestAddonsConfigSchema> getConfigSchema() {
            return this.configSchema;
        }

        public InstallClusterAddonsRequestAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallClusterAddonsRequestAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
