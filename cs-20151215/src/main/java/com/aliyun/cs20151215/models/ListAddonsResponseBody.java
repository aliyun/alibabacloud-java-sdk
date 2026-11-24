// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListAddonsResponseBody extends TeaModel {
    /**
     * <p>The list of available add-ons.</p>
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
         * <p>The CPU architectures supported by the add-on.</p>
         */
        @NameInMap("architecture")
        public java.util.List<String> architecture;

        /**
         * <p>The category of the add-on. Valid values:</p>
         * <ul>
         * <li>core: Core add-on.</li>
         * <li>network: Network add-on.</li>
         * <li>security: Security add-on.</li>
         * <li>storage: Storage add-on.</li>
         * <li>monitor: Logging and monitoring add-on.</li>
         * <li>application: Application add-on.
         * An empty value indicates that the add-on type is other.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>monitor</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The schema of custom parameters for the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("config_schema")
        public String configSchema;

        /**
         * <p>Indicates whether the add-on is installed by default. Valid values:</p>
         * <ul>
         * <li>true: The add-on is installed by default when the cluster is created.</li>
         * <li>false: The add-on is not installed by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("install_by_default")
        public Boolean installByDefault;

        /**
         * <p>Indicates whether the add-on is managed. Valid values:</p>
         * <ul>
         * <li>true: The add-on is managed.</li>
         * <li>false: The add-on is not managed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("managed")
        public Boolean managed;

        /**
         * <p>The name of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prometheus</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operations supported by the add-on.</p>
         */
        @NameInMap("supported_actions")
        public java.util.List<String> supportedActions;

        /**
         * <p>The version of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.9</p>
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
