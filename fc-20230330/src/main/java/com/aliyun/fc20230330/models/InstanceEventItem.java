// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InstanceEventItem extends TeaModel {
    @NameInMap("children")
    public java.util.List<InstanceEventItem> children;

    @NameInMap("level")
    public String level;

    @NameInMap("message")
    public String message;

    @NameInMap("time")
    public String time;

    @NameInMap("type")
    public String type;

    public static InstanceEventItem build(java.util.Map<String, ?> map) throws Exception {
        InstanceEventItem self = new InstanceEventItem();
        return TeaModel.build(map, self);
    }

    public InstanceEventItem setChildren(java.util.List<InstanceEventItem> children) {
        this.children = children;
        return this;
    }
    public java.util.List<InstanceEventItem> getChildren() {
        return this.children;
    }

    public InstanceEventItem setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public InstanceEventItem setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstanceEventItem setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public InstanceEventItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
