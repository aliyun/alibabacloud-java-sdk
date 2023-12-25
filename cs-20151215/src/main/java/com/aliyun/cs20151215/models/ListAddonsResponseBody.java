// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListAddonsResponseBody extends TeaModel {
    @NameInMap("addons")
    public java.util.List<ListAddonsResponseBodyAddons> addons;

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

    public static class ListAddonsResponseBodyAddons extends TeaModel {
        @NameInMap("architecture")
        public java.util.List<String> architecture;

        @NameInMap("category")
        public String category;

        @NameInMap("config_schema")
        public String configSchema;

        @NameInMap("install_by_default")
        public Boolean installByDefault;

        @NameInMap("managed")
        public Boolean managed;

        @NameInMap("name")
        public String name;

        @NameInMap("supported_actions")
        public java.util.List<String> supportedActions;

        @NameInMap("version")
        public String version;

        public static ListAddonsResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            ListAddonsResponseBodyAddons self = new ListAddonsResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public ListAddonsResponseBodyAddons setArchitecture(java.util.List<String> architecture) {
            this.architecture = architecture;
            return this;
        }
        public java.util.List<String> getArchitecture() {
            return this.architecture;
        }

        public ListAddonsResponseBodyAddons setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListAddonsResponseBodyAddons setConfigSchema(String configSchema) {
            this.configSchema = configSchema;
            return this;
        }
        public String getConfigSchema() {
            return this.configSchema;
        }

        public ListAddonsResponseBodyAddons setInstallByDefault(Boolean installByDefault) {
            this.installByDefault = installByDefault;
            return this;
        }
        public Boolean getInstallByDefault() {
            return this.installByDefault;
        }

        public ListAddonsResponseBodyAddons setManaged(Boolean managed) {
            this.managed = managed;
            return this;
        }
        public Boolean getManaged() {
            return this.managed;
        }

        public ListAddonsResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddonsResponseBodyAddons setSupportedActions(java.util.List<String> supportedActions) {
            this.supportedActions = supportedActions;
            return this;
        }
        public java.util.List<String> getSupportedActions() {
            return this.supportedActions;
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
