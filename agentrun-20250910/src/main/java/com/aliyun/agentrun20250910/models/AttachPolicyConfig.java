// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AttachPolicyConfig extends TeaModel {
    @NameInMap("className")
    public String className;

    @NameInMap("config")
    public String config;

    @NameInMap("name")
    public String name;

    public static AttachPolicyConfig build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyConfig self = new AttachPolicyConfig();
        return TeaModel.build(map, self);
    }

    public AttachPolicyConfig setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public AttachPolicyConfig setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public AttachPolicyConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
