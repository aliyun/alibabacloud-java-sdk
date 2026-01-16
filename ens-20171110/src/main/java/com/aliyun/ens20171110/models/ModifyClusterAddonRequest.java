// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyClusterAddonRequest extends TeaModel {
    @NameInMap("Addon")
    public ModifyClusterAddonRequestAddon addon;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edge-csi-lite</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    public static ModifyClusterAddonRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterAddonRequest self = new ModifyClusterAddonRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterAddonRequest setAddon(ModifyClusterAddonRequestAddon addon) {
        this.addon = addon;
        return this;
    }
    public ModifyClusterAddonRequestAddon getAddon() {
        return this.addon;
    }

    public ModifyClusterAddonRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterAddonRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public static class ModifyClusterAddonRequestAddonConfigSchema extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d0ead1f4e28de0f9e3c86588409a88a4</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>d0ead1f4e28de0f9e3c86588409a88a4</p>
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

        public static ModifyClusterAddonRequestAddonConfigSchema build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterAddonRequestAddonConfigSchema self = new ModifyClusterAddonRequestAddonConfigSchema();
            return TeaModel.build(map, self);
        }

        public ModifyClusterAddonRequestAddonConfigSchema setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ModifyClusterAddonRequestAddonConfigSchema setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public ModifyClusterAddonRequestAddonConfigSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyClusterAddonRequestAddonConfigSchema setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

    }

    public static class ModifyClusterAddonRequestAddon extends TeaModel {
        @NameInMap("ConfigSchema")
        public java.util.List<ModifyClusterAddonRequestAddonConfigSchema> configSchema;

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

        public static ModifyClusterAddonRequestAddon build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterAddonRequestAddon self = new ModifyClusterAddonRequestAddon();
            return TeaModel.build(map, self);
        }

        public ModifyClusterAddonRequestAddon setConfigSchema(java.util.List<ModifyClusterAddonRequestAddonConfigSchema> configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public java.util.List<ModifyClusterAddonRequestAddonConfigSchema> getConfigSchema() {
            return this.configSchema;
        }

        public ModifyClusterAddonRequestAddon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyClusterAddonRequestAddon setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
