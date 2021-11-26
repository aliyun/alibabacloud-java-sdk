// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateComponentIndexRequest extends TeaModel {
    @NameInMap("_meta")
    public java.util.Map<String, ?> meta;

    @NameInMap("template")
    public UpdateComponentIndexRequestTemplate template;

    public static UpdateComponentIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentIndexRequest self = new UpdateComponentIndexRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComponentIndexRequest setMeta(java.util.Map<String, ?> meta) {
        this.meta = meta;
        return this;
    }
    public java.util.Map<String, ?> getMeta() {
        return this.meta;
    }

    public UpdateComponentIndexRequest setTemplate(UpdateComponentIndexRequestTemplate template) {
        this.template = template;
        return this;
    }
    public UpdateComponentIndexRequestTemplate getTemplate() {
        return this.template;
    }

    public static class UpdateComponentIndexRequestTemplate extends TeaModel {
        @NameInMap("aliases")
        public java.util.Map<String, ?> aliases;

        @NameInMap("mappings")
        public java.util.Map<String, ?> mappings;

        @NameInMap("settings")
        public java.util.Map<String, ?> settings;

        public static UpdateComponentIndexRequestTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateComponentIndexRequestTemplate self = new UpdateComponentIndexRequestTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateComponentIndexRequestTemplate setAliases(java.util.Map<String, ?> aliases) {
            this.aliases = aliases;
            return this;
        }
        public java.util.Map<String, ?> getAliases() {
            return this.aliases;
        }

        public UpdateComponentIndexRequestTemplate setMappings(java.util.Map<String, ?> mappings) {
            this.mappings = mappings;
            return this;
        }
        public java.util.Map<String, ?> getMappings() {
            return this.mappings;
        }

        public UpdateComponentIndexRequestTemplate setSettings(java.util.Map<String, ?> settings) {
            this.settings = settings;
            return this;
        }
        public java.util.Map<String, ?> getSettings() {
            return this.settings;
        }

    }

}
