// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterAddonInstanceResponseBody extends TeaModel {
    /**
     * <p>The custom parameter settings of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sls_project_name&quot;:&quot;&quot;}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The logging feature status of the component.</p>
     */
    @NameInMap("logging")
    public GetClusterAddonInstanceResponseBodyLogging logging;

    /**
     * <p>The component instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>ack-node-problem-detector</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The component status. Valid values:</p>
     * <ul>
     * <li>active: installed.</li>
     * <li>updating: being modified.</li>
     * <li>upgrading: being upgraded.</li>
     * <li>deleting: being uninstalled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The component instance version.</p>
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
         * <p>Indicates whether the component supports the logging feature.</p>
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
         * <p>Indicates whether the logging feature is enabled for the component.</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The Log Service project used by the logging feature of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-c02b3e03be10643e8a644a843ffcb****</p>
         */
        @NameInMap("log_project")
        public String logProject;

        /**
         * <p>The Log Service Logstore used by the logging feature of the component.</p>
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
