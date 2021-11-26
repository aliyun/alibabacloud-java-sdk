// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateComponentIndexRequest extends TeaModel {
    @NameInMap("_meta")
    public java.util.Map<String, ?> meta;

    @NameInMap("template")
    public CreateComponentIndexRequestTemplate template;

    public static CreateComponentIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentIndexRequest self = new CreateComponentIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateComponentIndexRequest setMeta(java.util.Map<String, ?> meta) {
        this.meta = meta;
        return this;
    }
    public java.util.Map<String, ?> getMeta() {
        return this.meta;
    }

    public CreateComponentIndexRequest setTemplate(CreateComponentIndexRequestTemplate template) {
        this.template = template;
        return this;
    }
    public CreateComponentIndexRequestTemplate getTemplate() {
        return this.template;
    }

    public static class CreateComponentIndexRequestTemplate extends TeaModel {
        @NameInMap("aliases")
        public java.util.Map<String, ?> aliases;

        @NameInMap("mappings")
        public java.util.Map<String, ?> mappings;

        @NameInMap("settings")
        public java.util.Map<String, ?> settings;

        public static CreateComponentIndexRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateComponentIndexRequestTemplate self = new CreateComponentIndexRequestTemplate();
            return TeaModel.build(map, self);
        }

        public CreateComponentIndexRequestTemplate setAliases(java.util.Map<String, ?> aliases) {
            this.aliases = aliases;
            return this;
        }
        public java.util.Map<String, ?> getAliases() {
            return this.aliases;
        }

        public CreateComponentIndexRequestTemplate setMappings(java.util.Map<String, ?> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.Map<String, ?> getMappings() {
            return this.mappings;
        }

        public CreateComponentIndexRequestTemplate setSettings(java.util.Map<String, ?> settings) {
            this.settings = settings;
            return this;
        }
        public java.util.Map<String, ?> getSettings() {
            return this.settings;
        }

    }

}
