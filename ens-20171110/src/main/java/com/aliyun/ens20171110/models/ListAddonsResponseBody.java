// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListAddonsResponseBody extends TeaModel {
    @NameInMap("Addons")
    public java.util.List<ListAddonsResponseBodyAddons> addons;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAddonsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddonsResponseBody self = new ListAddonsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddonsResponseBody setAddons(java.util.List<ListAddonsResponseBodyAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<ListAddonsResponseBodyAddons> getAddons() {
        return this.addons;
    }

    public ListAddonsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAddonsResponseBodyAddonsConfigSchema extends TeaModel {
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
        public java.util.Map<String, ?> params;

        public static ListAddonsResponseBodyAddonsConfigSchema build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddonsConfigSchema self = new ListAddonsResponseBodyAddonsConfigSchema();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddonsConfigSchema setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListAddonsResponseBodyAddonsConfigSchema setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public ListAddonsResponseBodyAddonsConfigSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyAddonsConfigSchema setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

    }

    public static class ListAddonsResponseBodyAddons extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CleanupCloudResources")
        public Boolean cleanupCloudResources;

        @NameInMap("ConfigSchema")
        public java.util.List<ListAddonsResponseBodyAddonsConfigSchema> configSchema;

        /**
         * <strong>example:</strong>
         * <p>edge-csi-lite</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAddonsResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddons self = new ListAddonsResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddons setCleanupCloudResources(Boolean cleanupCloudResources) {
            this.cleanupCloudResources = cleanupCloudResources;
            return this;
        }
        public Boolean getCleanupCloudResources() {
            return this.cleanupCloudResources;
        }

        public ListAddonsResponseBodyAddons setConfigSchema(java.util.List<ListAddonsResponseBodyAddonsConfigSchema> configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public java.util.List<ListAddonsResponseBodyAddonsConfigSchema> getConfigSchema() {
            return this.configSchema;
        }

        public ListAddonsResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
