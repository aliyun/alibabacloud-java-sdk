// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterAddonInstanceResponseBody extends TeaModel {
    /**
     * <p>The custom parameter settings of the add-on.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sls_project_name&quot;:&quot;&quot;}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The log feature status of the add-on.</p>
     */
    @NameInMap("logging")
    public GetClusterAddonInstanceResponseBodyLogging logging;

    /**
     * <p>The name of the add-on instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ack-node-problem-detector</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The state of the add-on. Valid values:</p>
     * <ul>
     * <li>active: Installed.</li>
     * <li>updating: Updating.</li>
     * <li>upgrading: Upgrading.</li>
     * <li>deleting: Uninstalling.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The version of the add-on instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.16</p>
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
         * <p>Specifies whether the add-on supports the log feature. Valid values:</p>
         * <ul>
         * <li><p>true: Supported.</p>
         * </li>
         * <li><p>false: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("capable")
        public Boolean capable;

        /**
         * <p>Specifies whether the log feature is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The Log Service project used by the add-on log feature.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-c02b3e03be10643e8a644a843ffcb****</p>
         */
        @NameInMap("log_project")
        public String logProject;

        /**
         * <p>The Logstore used by the add-on log feature.</p>
         * 
         * <strong>example:</strong>
         * <p>my-logstore</p>
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
