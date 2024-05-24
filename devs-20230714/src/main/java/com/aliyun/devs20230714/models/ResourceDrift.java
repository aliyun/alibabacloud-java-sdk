// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ResourceDrift extends TeaModel {
    @NameInMap("address")
    public String address;

    @NameInMap("change")
    public ResourceDriftChange change;

    @NameInMap("mode")
    public String mode;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static ResourceDrift build(java.util.Map<String, ?> map) throws Exception {
        ResourceDrift self = new ResourceDrift();
        return TeaModel.build(map, self);
    }

    public ResourceDrift setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ResourceDrift setChange(ResourceDriftChange change) {
        this.change = change;
        return this;
    }
    public ResourceDriftChange getChange() {
        return this.change;
    }

    public ResourceDrift setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ResourceDrift setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResourceDrift setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ResourceDriftChange extends TeaModel {
        @NameInMap("actions")
        public java.util.List<String> actions;

        @NameInMap("after")
        public Object after;

        @NameInMap("before")
        public Object before;

        public static ResourceDriftChange build(java.util.Map<String, ?> map) throws Exception {
            ResourceDriftChange self = new ResourceDriftChange();
            return TeaModel.build(map, self);
        }

        public ResourceDriftChange setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ResourceDriftChange setAfter(Object after) {
            this.after = after;
            return this;
        }
        public Object getAfter() {
            return this.after;
        }

        public ResourceDriftChange setBefore(Object before) {
            this.before = before;
            return this;
        }
        public Object getBefore() {
            return this.before;
        }

    }

}
