// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddFolderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Option")
    public AddFolderRequestOption option;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>140822073803</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xPar2SZ63KodG3aV</p>
     */
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public AddFolderRequestTenantContext tenantContext;

    public static AddFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFolderRequest self = new AddFolderRequest();
        return TeaModel.build(map, self);
    }

    public AddFolderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddFolderRequest setOption(AddFolderRequestOption option) {
        this.option = option;
        return this;
    }
    public AddFolderRequestOption getOption() {
        return this.option;
    }

    public AddFolderRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public AddFolderRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public AddFolderRequest setTenantContext(AddFolderRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddFolderRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class AddFolderRequestOptionAppProperties extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static AddFolderRequestOptionAppProperties build(java.util.Map<String, ?> map) throws Exception {
            AddFolderRequestOptionAppProperties self = new AddFolderRequestOptionAppProperties();
            return TeaModel.build(map, self);
        }

        public AddFolderRequestOptionAppProperties setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddFolderRequestOptionAppProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public AddFolderRequestOptionAppProperties setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class AddFolderRequestOption extends TeaModel {
        @NameInMap("AppProperties")
        public java.util.List<AddFolderRequestOptionAppProperties> appProperties;

        /**
         * <strong>example:</strong>
         * <p>AUTO_RENAME</p>
         */
        @NameInMap("ConflictStrategy")
        public String conflictStrategy;

        public static AddFolderRequestOption build(java.util.Map<String, ?> map) throws Exception {
            AddFolderRequestOption self = new AddFolderRequestOption();
            return TeaModel.build(map, self);
        }

        public AddFolderRequestOption setAppProperties(java.util.List<AddFolderRequestOptionAppProperties> appProperties) {
            this.appProperties = appProperties;
            return this;
        }
        public java.util.List<AddFolderRequestOptionAppProperties> getAppProperties() {
            return this.appProperties;
        }

        public AddFolderRequestOption setConflictStrategy(String conflictStrategy) {
            this.conflictStrategy = conflictStrategy;
            return this;
        }
        public String getConflictStrategy() {
            return this.conflictStrategy;
        }

    }

    public static class AddFolderRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static AddFolderRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddFolderRequestTenantContext self = new AddFolderRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddFolderRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
