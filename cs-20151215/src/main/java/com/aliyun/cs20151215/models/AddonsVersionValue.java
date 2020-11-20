// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class AddonsVersionValue extends TeaModel {
    // 组件是否可升级
    @NameInMap("can_upgrade")
    public Boolean canUpgrade;

    // 组件是否升级过。
    @NameInMap("changed")
    public String changed;

    // 组件名称。
    @NameInMap("component_name")
    public String componentName;

    // 组件说明信息。
    @NameInMap("description")
    public String description;

    // 是否可升级的额外说明信息。
    @NameInMap("message")
    public String message;

    // 组件下一个可升级版本。
    @NameInMap("next_version")
    public String nextVersion;

    // 组件是否为必需组件
    @NameInMap("required")
    public Boolean required;

    // 组件最新模板内容。
    @NameInMap("template")
    public String template;

    // 组件当前版本。
    @NameInMap("version")
    public String version;

    public static AddonsVersionValue build(java.util.Map<String, ?> map) throws Exception {
        AddonsVersionValue self = new AddonsVersionValue();
        return TeaModel.build(map, self);
    }

    public AddonsVersionValue setCanUpgrade(Boolean canUpgrade) {
        this.canUpgrade = canUpgrade;
        return this;
    }
    public Boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public AddonsVersionValue setChanged(String changed) {
        this.changed = changed;
        return this;
    }
    public String getChanged() {
        return this.changed;
    }

    public AddonsVersionValue setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public AddonsVersionValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddonsVersionValue setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddonsVersionValue setNextVersion(String nextVersion) {
        this.nextVersion = nextVersion;
        return this;
    }
    public String getNextVersion() {
        return this.nextVersion;
    }

    public AddonsVersionValue setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public AddonsVersionValue setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public AddonsVersionValue setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
