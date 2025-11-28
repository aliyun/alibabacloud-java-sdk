// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class BroadcastTemplate extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("id")
    public String id;

    @NameInMap("modifiedTime")
    public String modifiedTime;

    @NameInMap("name")
    public String name;

    @NameInMap("variables")
    public java.util.List<TemplateVariable> variables;

    public static BroadcastTemplate build(java.util.Map<String, ?> map) throws Exception {
        BroadcastTemplate self = new BroadcastTemplate();
        return TeaModel.build(map, self);
    }

    public BroadcastTemplate setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BroadcastTemplate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BroadcastTemplate setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public BroadcastTemplate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BroadcastTemplate setVariables(java.util.List<TemplateVariable> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<TemplateVariable> getVariables() {
        return this.variables;
    }

}
