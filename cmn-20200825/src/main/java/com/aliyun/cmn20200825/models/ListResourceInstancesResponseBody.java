// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListResourceInstancesResponseBody extends TeaModel {
    @NameInMap("LogicResource")
    public java.util.List<ListResourceInstancesResponseBodyLogicResource> logicResource;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static ListResourceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstancesResponseBody self = new ListResourceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceInstancesResponseBody setLogicResource(java.util.List<ListResourceInstancesResponseBodyLogicResource> logicResource) {
        this.logicResource = logicResource;
        return this;
    }
    public java.util.List<ListResourceInstancesResponseBodyLogicResource> getLogicResource() {
        return this.logicResource;
    }

    public ListResourceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourceInstancesResponseBodyLogicResourceKeyList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("KeyAction")
        public String keyAction;

        @NameInMap("KeyAttribute")
        public String keyAttribute;

        @NameInMap("KeyDescription")
        public String keyDescription;

        @NameInMap("Value")
        public String value;

        public static ListResourceInstancesResponseBodyLogicResourceKeyList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceInstancesResponseBodyLogicResourceKeyList self = new ListResourceInstancesResponseBodyLogicResourceKeyList();
            return TeaModel.build(map, self);
        }

        public ListResourceInstancesResponseBodyLogicResourceKeyList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceInstancesResponseBodyLogicResourceKeyList setKeyAction(String keyAction) {
            this.keyAction = keyAction;
            return this;
        }
        public String getKeyAction() {
            return this.keyAction;
        }

        public ListResourceInstancesResponseBodyLogicResourceKeyList setKeyAttribute(String keyAttribute) {
            this.keyAttribute = keyAttribute;
            return this;
        }
        public String getKeyAttribute() {
            return this.keyAttribute;
        }

        public ListResourceInstancesResponseBodyLogicResourceKeyList setKeyDescription(String keyDescription) {
            this.keyDescription = keyDescription;
            return this;
        }
        public String getKeyDescription() {
            return this.keyDescription;
        }

        public ListResourceInstancesResponseBodyLogicResourceKeyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListResourceInstancesResponseBodyLogicResource extends TeaModel {
        @NameInMap("KeyList")
        public java.util.List<ListResourceInstancesResponseBodyLogicResourceKeyList> keyList;

        @NameInMap("ResourceAttribute")
        public String resourceAttribute;

        @NameInMap("ResourceType")
        public String resourceType;

        public static ListResourceInstancesResponseBodyLogicResource build(java.util.Map<String, ?> map) throws Exception {
            ListResourceInstancesResponseBodyLogicResource self = new ListResourceInstancesResponseBodyLogicResource();
            return TeaModel.build(map, self);
        }

        public ListResourceInstancesResponseBodyLogicResource setKeyList(java.util.List<ListResourceInstancesResponseBodyLogicResourceKeyList> keyList) {
            this.keyList = keyList;
            return this;
        }
        public java.util.List<ListResourceInstancesResponseBodyLogicResourceKeyList> getKeyList() {
            return this.keyList;
        }

        public ListResourceInstancesResponseBodyLogicResource setResourceAttribute(String resourceAttribute) {
            this.resourceAttribute = resourceAttribute;
            return this;
        }
        public String getResourceAttribute() {
            return this.resourceAttribute;
        }

        public ListResourceInstancesResponseBodyLogicResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
