// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterAddonInstanceResponseBody extends TeaModel {
    /**
     * <p>The custom configurations of the component.</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The status of Simple Log Service.</p>
     */
    @NameInMap("logging")
    public GetClusterAddonInstanceResponseBodyLogging logging;

    /**
     * <p>The name of the component instance.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The status of the component. Valid values:</p>
     * <br>
     * <p>*   active: The component is installed.</p>
     * <p>*   updating: The component is being modified.</p>
     * <p>*   upgrading: The component is being updated.</p>
     * <p>*   deleting: The component is being uninstalled.</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The version of the component instance.</p>
     */
    @NameInMap("version")
    public String version;

    public static GetClusterAddonInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAddonInstanceResponseBody self = new GetClusterAddonInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterAddonInstanceResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetClusterAddonInstanceResponseBody setLogging(GetClusterAddonInstanceResponseBodyLogging logging) {
        this.logging = logging;
        return this;
    }
    public GetClusterAddonInstanceResponseBodyLogging getLogging() {
        return this.logging;
    }

    public GetClusterAddonInstanceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetClusterAddonInstanceResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetClusterAddonInstanceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetClusterAddonInstanceResponseBodyLogging extends TeaModel {
        /**
         * <p>Indicates whether Simple Log Service is supported by the component.</p>
         */
        @NameInMap("capable")
        public Boolean capable;

        /**
         * <p>Indicates whether Simple Log Service is enabled for the component.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The Simple Log Service project that is used to collect logs for the component.</p>
         */
        @NameInMap("log_project")
        public String logProject;

        /**
         * <p>The Simple Log Service Logstore that is used to collect logs for the component.</p>
         */
        @NameInMap("logstore")
        public String logstore;

        public static GetClusterAddonInstanceResponseBodyLogging build(java.util.Map<String, ?> map) throws Exception {
            GetClusterAddonInstanceResponseBodyLogging self = new GetClusterAddonInstanceResponseBodyLogging();
            return TeaModel.build(map, self);
        }

        public GetClusterAddonInstanceResponseBodyLogging setCapable(Boolean capable) {
            this.capable = capable;
            return this;
        }
        public Boolean getCapable() {
            return this.capable;
        }

        public GetClusterAddonInstanceResponseBodyLogging setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetClusterAddonInstanceResponseBodyLogging setLogProject(String logProject) {
            this.logProject = logProject;
            return this;
        }
        public String getLogProject() {
            return this.logProject;
        }

        public GetClusterAddonInstanceResponseBodyLogging setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

    }

}
