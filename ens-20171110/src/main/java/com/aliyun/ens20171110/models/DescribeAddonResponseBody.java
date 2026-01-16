// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeAddonResponseBody extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Addons")
    public java.util.List<DescribeAddonResponseBodyAddons> addons;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAddonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonResponseBody self = new DescribeAddonResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddonResponseBody setAddons(java.util.List<DescribeAddonResponseBodyAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<DescribeAddonResponseBodyAddons> getAddons() {
        return this.addons;
    }

    public DescribeAddonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAddonResponseBodyAddonsConfigSchema extends TeaModel {
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
         * <p>{&quot;key1&quot;:&quot;val1&quot;}</p>
         */
        @NameInMap("Params")
        public Object params;

        public static DescribeAddonResponseBodyAddonsConfigSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonResponseBodyAddonsConfigSchema self = new DescribeAddonResponseBodyAddonsConfigSchema();
            return TeaModel.build(map, self);
        }

        public DescribeAddonResponseBodyAddonsConfigSchema setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public DescribeAddonResponseBodyAddonsConfigSchema setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public DescribeAddonResponseBodyAddonsConfigSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAddonResponseBodyAddonsConfigSchema setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

    }

    public static class DescribeAddonResponseBodyAddons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CleanupCloudResources")
        public String cleanupCloudResources;

        @NameInMap("ConfigSchema")
        public java.util.List<DescribeAddonResponseBodyAddonsConfigSchema> configSchema;

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

        public static DescribeAddonResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonResponseBodyAddons self = new DescribeAddonResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public DescribeAddonResponseBodyAddons setCleanupCloudResources(String cleanupCloudResources) {
            this.cleanupCloudResources = cleanupCloudResources;
            return this;
        }
        public String getCleanupCloudResources() {
            return this.cleanupCloudResources;
        }

        public DescribeAddonResponseBodyAddons setConfigSchema(java.util.List<DescribeAddonResponseBodyAddonsConfigSchema> configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public java.util.List<DescribeAddonResponseBodyAddonsConfigSchema> getConfigSchema() {
            return this.configSchema;
        }

        public DescribeAddonResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAddonResponseBodyAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
