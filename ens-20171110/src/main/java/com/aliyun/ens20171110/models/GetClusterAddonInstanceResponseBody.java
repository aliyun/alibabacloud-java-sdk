// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetClusterAddonInstanceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether associated cloud resources are automatically cleaned up.</p>
     */
    @NameInMap("CleanupCloudResources")
    public Boolean cleanupCloudResources;

    /**
     * <p>The schema of custom parameters for the add-on.</p>
     */
    @NameInMap("ConfigSchema")
    public java.util.List<GetClusterAddonInstanceResponseBodyConfigSchema> configSchema;

    /**
     * <p>The add-on name.</p>
     * 
     * <strong>example:</strong>
     * <p>edge-csi-lite</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The current component instance status. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong>: Running normally.</li>
     * <li><strong>deleting</strong>: Stopping.</li>
     * <li><strong>enabling</strong>: Starting.</li>
     * <li><strong>upgrading</strong>: In upgrade or configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("Version")
    public String version;

    public static GetClusterAddonInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAddonInstanceResponseBody self = new GetClusterAddonInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterAddonInstanceResponseBody setCleanupCloudResources(Boolean cleanupCloudResources) {
        this.cleanupCloudResources = cleanupCloudResources;
        return this;
    }
    public Boolean getCleanupCloudResources() {
        return this.cleanupCloudResources;
    }

    public GetClusterAddonInstanceResponseBody setConfigSchema(java.util.List<GetClusterAddonInstanceResponseBodyConfigSchema> configSchema) {
        this.configSchema = configSchema;
        return this;
    }
    public java.util.List<GetClusterAddonInstanceResponseBodyConfigSchema> getConfigSchema() {
        return this.configSchema;
    }

    public GetClusterAddonInstanceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetClusterAddonInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClusterAddonInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetClusterAddonInstanceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetClusterAddonInstanceResponseBodyConfigSchema extends TeaModel {
        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>d0ead1f4e28de0f9e3c86588409a88a4</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>d0ead1f4e28de0f9e3c86588409a88a4</p>
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
        public String params;

        public static GetClusterAddonInstanceResponseBodyConfigSchema build(java.util.Map<String, ?> map) throws Exception {
            GetClusterAddonInstanceResponseBodyConfigSchema self = new GetClusterAddonInstanceResponseBodyConfigSchema();
            return TeaModel.build(map, self);
        }

        public GetClusterAddonInstanceResponseBodyConfigSchema setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetClusterAddonInstanceResponseBodyConfigSchema setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public GetClusterAddonInstanceResponseBodyConfigSchema setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClusterAddonInstanceResponseBodyConfigSchema setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

    }

}
