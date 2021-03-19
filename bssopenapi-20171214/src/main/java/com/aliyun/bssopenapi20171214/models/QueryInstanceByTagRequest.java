// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceByTagRequest extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("Tag")
    public java.util.List<QueryInstanceByTagRequestTag> tag;

    public static QueryInstanceByTagRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceByTagRequest self = new QueryInstanceByTagRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceByTagRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QueryInstanceByTagRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public QueryInstanceByTagRequest setTag(java.util.List<QueryInstanceByTagRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QueryInstanceByTagRequestTag> getTag() {
        return this.tag;
    }

    public static class QueryInstanceByTagRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryInstanceByTagRequestTag build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceByTagRequestTag self = new QueryInstanceByTagRequestTag();
            return TeaModel.build(map, self);
        }

        public QueryInstanceByTagRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryInstanceByTagRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
