// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ComponentList")
    public ListComponentsResponseBodyComponentList componentList;

    @NameInMap("Message")
    public String message;

    public static ListComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsResponseBody self = new ListComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListComponentsResponseBody setComponentList(ListComponentsResponseBodyComponentList componentList) {
        this.componentList = componentList;
        return this;
    }
    public ListComponentsResponseBodyComponentList getComponentList() {
        return this.componentList;
    }

    public ListComponentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class ListComponentsResponseBodyComponentListComponent extends TeaModel {
        @NameInMap("ComponentId")
        public String componentId;

        @NameInMap("ComponentKey")
        public String componentKey;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static ListComponentsResponseBodyComponentListComponent build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyComponentListComponent self = new ListComponentsResponseBodyComponentListComponent();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyComponentListComponent setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public ListComponentsResponseBodyComponentListComponent setComponentKey(String componentKey) {
            this.componentKey = componentKey;
            return this;
        }
        public String getComponentKey() {
            return this.componentKey;
        }

        public ListComponentsResponseBodyComponentListComponent setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListComponentsResponseBodyComponentListComponent setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public ListComponentsResponseBodyComponentListComponent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListComponentsResponseBodyComponentListComponent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListComponentsResponseBodyComponentList extends TeaModel {
        @NameInMap("Component")
        public java.util.List<ListComponentsResponseBodyComponentListComponent> component;

        public static ListComponentsResponseBodyComponentList build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyComponentList self = new ListComponentsResponseBodyComponentList();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyComponentList setComponent(java.util.List<ListComponentsResponseBodyComponentListComponent> component) {
            this.component = component;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyComponentListComponent> getComponent() {
            return this.component;
        }

    }

}
