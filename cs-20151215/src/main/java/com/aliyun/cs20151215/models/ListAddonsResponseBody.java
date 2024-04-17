// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListAddonsResponseBody extends TeaModel {
    /**
     * <p>The list of available components.</p>
     */
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
        /**
         * <p>Architectures supported by the component. Valid values:</p>
         * <br>
         * <p>*   amd64</p>
         * <p>*   arm64</p>
         */
        @NameInMap("architecture")
        public java.util.List<String> architecture;

        /**
         * <p>The category of the component.</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The schema of the custom parameters of the component.</p>
         */
        @NameInMap("config_schema")
        public String configSchema;

        /**
         * <p>Indicates whether the component is automatically installed by default.</p>
         */
        @NameInMap("install_by_default")
        public Boolean installByDefault;

        /**
         * <p>Indicates whether the component is fully managed.</p>
         */
        @NameInMap("managed")
        public Boolean managed;

        /**
         * <p>The component name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Operations supported by the component. Valid values:</p>
         * <br>
         * <p>*   Install</p>
         * <p>*   Upgrade</p>
         * <p>*   Modify</p>
         * <p>*   Uninstall</p>
         */
        @NameInMap("supported_actions")
        public java.util.List<String> supportedActions;

        /**
         * <p>The version number.</p>
         */
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
