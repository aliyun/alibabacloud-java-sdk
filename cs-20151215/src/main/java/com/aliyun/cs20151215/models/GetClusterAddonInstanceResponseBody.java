// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterAddonInstanceResponseBody extends TeaModel {
    @NameInMap("config")
    public String config;

    @NameInMap("logging")
    public GetClusterAddonInstanceResponseBodyLogging logging;

    @NameInMap("name")
    public String name;

    @NameInMap("state")
    public String state;

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
        @NameInMap("capable")
        public Boolean capable;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("log_project")
        public String logProject;

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
