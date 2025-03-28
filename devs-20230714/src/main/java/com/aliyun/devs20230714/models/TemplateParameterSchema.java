// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TemplateParameterSchema extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>defaultValue</p>
     */
    @NameInMap("default")
    public Object _default;

    /**
     * <strong>example:</strong>
     * <p>Parameters for testing</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("enum")
    public java.util.List<String> _enum;

    /**
     * <strong>example:</strong>
     * <p>&quot;^[a-zA-Z._-]+$&quot;</p>
     */
    @NameInMap("pattern")
    public String pattern;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("required")
    public Boolean required;

    @NameInMap("roleExtension")
    public TemplateParameterSchemaRoleExtension roleExtension;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("sensitive")
    public Boolean sensitive;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string</p>
     */
    @NameInMap("type")
    public String type;

    public static TemplateParameterSchema build(java.util.Map<String, ?> map) throws Exception {
        TemplateParameterSchema self = new TemplateParameterSchema();
        return TeaModel.build(map, self);
    }

    public TemplateParameterSchema set_default(Object _default) {
        this._default = _default;
        return this;
    }
    public Object get_default() {
        return this._default;
    }

    public TemplateParameterSchema setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TemplateParameterSchema set_enum(java.util.List<String> _enum) {
        this._enum = _enum;
        return this;
    }
    public java.util.List<String> get_enum() {
        return this._enum;
    }

    public TemplateParameterSchema setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public TemplateParameterSchema setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public TemplateParameterSchema setRoleExtension(TemplateParameterSchemaRoleExtension roleExtension) {
        this.roleExtension = roleExtension;
        return this;
    }
    public TemplateParameterSchemaRoleExtension getRoleExtension() {
        return this.roleExtension;
    }

    public TemplateParameterSchema setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
    public Boolean getSensitive() {
        return this.sensitive;
    }

    public TemplateParameterSchema setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public TemplateParameterSchema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class TemplateParameterSchemaRoleExtension extends TeaModel {
        @NameInMap("authorities")
        public java.util.List<String> authorities;

        @NameInMap("name")
        public String name;

        @NameInMap("service")
        public String service;

        public static TemplateParameterSchemaRoleExtension build(java.util.Map<String, ?> map) throws Exception {
            TemplateParameterSchemaRoleExtension self = new TemplateParameterSchemaRoleExtension();
            return TeaModel.build(map, self);
        }

        public TemplateParameterSchemaRoleExtension setAuthorities(java.util.List<String> authorities) {
            this.authorities = authorities;
            return this;
        }
        public java.util.List<String> getAuthorities() {
            return this.authorities;
        }

        public TemplateParameterSchemaRoleExtension setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TemplateParameterSchemaRoleExtension setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}
