// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsRequest extends TeaModel {
    // Addon列表。
    @NameInMap("body")
    public java.util.List<InstallClusterAddonsRequestBody> body;

    public static InstallClusterAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallClusterAddonsRequest self = new InstallClusterAddonsRequest();
        return TeaModel.build(map, self);
    }

    public InstallClusterAddonsRequest setBody(java.util.List<InstallClusterAddonsRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<InstallClusterAddonsRequestBody> getBody() {
        return this.body;
    }

    public static class InstallClusterAddonsRequestBody extends TeaModel {
        // 组件配置信息。
        @NameInMap("config")
        public String config;

        // 组件名称。
        @NameInMap("name")
        public String name;

        // 组件版本号。
        @NameInMap("version")
        public String version;

        public static InstallClusterAddonsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            InstallClusterAddonsRequestBody self = new InstallClusterAddonsRequestBody();
            return TeaModel.build(map, self);
        }

        public InstallClusterAddonsRequestBody setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public InstallClusterAddonsRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallClusterAddonsRequestBody setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UnInstallClusterAddonsRequestAddons extends TeaModel {
        // 组件名称。
        @NameInMap("name")
        public String name;

        public static UnInstallClusterAddonsRequestAddons build(java.util.Map<String, ?> map) throws Exception {
            UnInstallClusterAddonsRequestAddons self = new UnInstallClusterAddonsRequestAddons();
            return TeaModel.build(map, self);
        }

        public UnInstallClusterAddonsRequestAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
