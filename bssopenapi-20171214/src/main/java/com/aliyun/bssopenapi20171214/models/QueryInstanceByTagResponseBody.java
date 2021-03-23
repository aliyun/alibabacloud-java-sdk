// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceByTagResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("TagResource")
    public java.util.List<QueryInstanceByTagResponseBodyTagResource> tagResource;

    public static QueryInstanceByTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceByTagResponseBody self = new QueryInstanceByTagResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceByTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceByTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceByTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryInstanceByTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceByTagResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryInstanceByTagResponseBody setTagResource(java.util.List<QueryInstanceByTagResponseBodyTagResource> tagResource) {
        this.tagResource = tagResource;
        return this;
    }
    public java.util.List<QueryInstanceByTagResponseBodyTagResource> getTagResource() {
        return this.tagResource;
    }

    public static class QueryInstanceByTagResponseBodyTagResourceTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryInstanceByTagResponseBodyTagResourceTag build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceByTagResponseBodyTagResourceTag self = new QueryInstanceByTagResponseBodyTagResourceTag();
            return TeaModel.build(map, self);
        }

        public QueryInstanceByTagResponseBodyTagResourceTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryInstanceByTagResponseBodyTagResourceTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryInstanceByTagResponseBodyTagResource extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Tag")
        public java.util.List<QueryInstanceByTagResponseBodyTagResourceTag> tag;

        public static QueryInstanceByTagResponseBodyTagResource build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceByTagResponseBodyTagResource self = new QueryInstanceByTagResponseBodyTagResource();
            return TeaModel.build(map, self);
        }

        public QueryInstanceByTagResponseBodyTagResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryInstanceByTagResponseBodyTagResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryInstanceByTagResponseBodyTagResource setTag(java.util.List<QueryInstanceByTagResponseBodyTagResourceTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryInstanceByTagResponseBodyTagResourceTag> getTag() {
            return this.tag;
        }

    }

}
