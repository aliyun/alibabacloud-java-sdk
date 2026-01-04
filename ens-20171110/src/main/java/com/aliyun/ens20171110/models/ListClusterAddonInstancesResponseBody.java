// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListClusterAddonInstancesResponseBody extends TeaModel {
    @NameInMap("Addons")
    public java.util.List<ListClusterAddonInstancesResponseBodyAddons> addons;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterAddonInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAddonInstancesResponseBody self = new ListClusterAddonInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterAddonInstancesResponseBody setAddons(java.util.List<ListClusterAddonInstancesResponseBodyAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<ListClusterAddonInstancesResponseBodyAddons> getAddons() {
        return this.addons;
    }

    public ListClusterAddonInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterAddonInstancesResponseBodyAddonsConfigSchema extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7380581386597434629002</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>4572581386436834662215</p>
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
         * <p>{&quot;key1&quot;: &quot;val1&quot;}</p>
         */
        @NameInMap("Params")
        public String params;

        public static ListClusterAddonInstancesResponseBodyAddonsConfigSchema build(java.util.Map<String, ?> map) throws Exception {
            ListClusterAddonInstancesResponseBodyAddonsConfigSchema self = new ListClusterAddonInstancesResponseBodyAddonsConfigSchema();
            return TeaModel.build(map, self);
        }

        public ListClusterAddonInstancesResponseBodyAddonsConfigSchema setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListClusterAddonInstancesResponseBodyAddonsConfigSchema setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public ListClusterAddonInstancesResponseBodyAddonsConfigSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClusterAddonInstancesResponseBodyAddonsConfigSchema setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

    }

    public static class ListClusterAddonInstancesResponseBodyAddons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CleanupCloudResources")
        public Boolean cleanupCloudResources;

        @NameInMap("ConfigSchema")
        public java.util.List<ListClusterAddonInstancesResponseBodyAddonsConfigSchema> configSchema;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListClusterAddonInstancesResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            ListClusterAddonInstancesResponseBodyAddons self = new ListClusterAddonInstancesResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public ListClusterAddonInstancesResponseBodyAddons setCleanupCloudResources(Boolean cleanupCloudResources) {
            this.cleanupCloudResources = cleanupCloudResources;
            return this;
        }
        public Boolean getCleanupCloudResources() {
            return this.cleanupCloudResources;
        }

        public ListClusterAddonInstancesResponseBodyAddons setConfigSchema(java.util.List<ListClusterAddonInstancesResponseBodyAddonsConfigSchema> configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public java.util.List<ListClusterAddonInstancesResponseBodyAddonsConfigSchema> getConfigSchema() {
            return this.configSchema;
        }

        public ListClusterAddonInstancesResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClusterAddonInstancesResponseBodyAddons setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterAddonInstancesResponseBodyAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
