// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The components.</p>
     */
    @NameInMap("ComponentList")
    public ListComponentsResponseBodyComponentList componentList;

    /**
     * <p>The message that is returned.</p>
     */
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
        /**
         * <p>The ID of the component.</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The key of the component.</p>
         */
        @NameInMap("ComponentKey")
        public String componentKey;

        /**
         * <p>The description of the component.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Indicates whether the component has expired. Valid values:</p>
         * <br>
         * <p>*   false: The component has not expired.</p>
         * <p>*   true: The component has expired.</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <p>The type of the component. Valid values:</p>
         * <br>
         * <p>*   JDK</p>
         * <p>*   TOMCAT</p>
         * <p>*   TENGINE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version of the component.</p>
         */
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
