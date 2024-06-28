// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceByTagResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>PARAM_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>param is null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token that determines the start point of the query. The return value is the value of the NextToken response parameter that was returned last time the QueryInstanceByTag operation was called.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCm</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9EC6C0B7-3397-5FAE-9915-8972CDDB1211</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The instances returned.</p>
     */
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

    public QueryInstanceByTagResponseBody setTagResource(java.util.List<QueryInstanceByTagResponseBodyTagResource> tagResource) {
        this.tagResource = tagResource;
        return this;
    }
    public java.util.List<QueryInstanceByTagResponseBodyTagResource> getTagResource() {
        return this.tagResource;
    }

    public static class QueryInstanceByTagResponseBodyTagResourceTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>spn-xxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource. The returned resource type indicates a savings plan instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags.</p>
         */
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
