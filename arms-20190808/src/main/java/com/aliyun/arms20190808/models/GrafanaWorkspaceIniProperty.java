// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceIniProperty extends TeaModel {
    @NameInMap("defaultValue")
    public String defaultValue;

    @NameInMap("description")
    public String description;

    @NameInMap("example")
    public String example;

    @NameInMap("key")
    public String key;

    @NameInMap("secret")
    public Boolean secret;

    @NameInMap("value")
    public String value;

    public static GrafanaWorkspaceIniProperty build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceIniProperty self = new GrafanaWorkspaceIniProperty();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceIniProperty setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public GrafanaWorkspaceIniProperty setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GrafanaWorkspaceIniProperty setExample(String example) {
        this.example = example;
        return this;
    }
    public String getExample() {
        return this.example;
    }

    public GrafanaWorkspaceIniProperty setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GrafanaWorkspaceIniProperty setSecret(Boolean secret) {
        this.secret = secret;
        return this;
    }
    public Boolean getSecret() {
        return this.secret;
    }

    public GrafanaWorkspaceIniProperty setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
