// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTagResourcesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTagResourcesResponseBody setData(ListTagResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTagResourcesResponseBodyData getData() {
        return this.data;
    }

    public ListTagResourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTagResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTagResourcesResponseBodyDataTagResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyDataTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyDataTagResources self = new ListTagResourcesResponseBodyDataTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyDataTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyDataTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyDataTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyDataTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesResponseBodyData extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TagResources")
        public java.util.List<ListTagResourcesResponseBodyDataTagResources> tagResources;

        public static ListTagResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyData self = new ListTagResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListTagResourcesResponseBodyData setTagResources(java.util.List<ListTagResourcesResponseBodyDataTagResources> tagResources) {
            this.tagResources = tagResources;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyDataTagResources> getTagResources() {
            return this.tagResources;
        }

    }

}
