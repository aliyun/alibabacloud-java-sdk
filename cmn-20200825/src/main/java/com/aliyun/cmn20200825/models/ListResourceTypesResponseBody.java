// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 资源类型
    @NameInMap("ResourceType")
    public java.util.List<ListResourceTypesResponseBodyResourceType> resourceType;

    public static ListResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponseBody self = new ListResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypesResponseBody setResourceType(java.util.List<ListResourceTypesResponseBodyResourceType> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.List<ListResourceTypesResponseBodyResourceType> getResourceType() {
        return this.resourceType;
    }

    public static class ListResourceTypesResponseBodyResourceType extends TeaModel {
        @NameInMap("Key")
        public String key;

        // 资源类型
        @NameInMap("ResourceType")
        public String resourceType;

        // 资源名称
        @NameInMap("ResourceTypeName")
        public String resourceTypeName;

        public static ListResourceTypesResponseBodyResourceType build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceType self = new ListResourceTypesResponseBodyResourceType();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceType setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceTypesResponseBodyResourceType setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceTypesResponseBodyResourceType setResourceTypeName(String resourceTypeName) {
            this.resourceTypeName = resourceTypeName;
            return this;
        }
        public String getResourceTypeName() {
            return this.resourceTypeName;
        }

    }

}
