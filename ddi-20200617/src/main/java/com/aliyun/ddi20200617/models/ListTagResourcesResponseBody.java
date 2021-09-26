// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 请求是否成功被处理
    @NameInMap("Success")
    public Boolean success;

    // 响应码
    @NameInMap("Code")
    public String code;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 响应消息
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public java.util.List<ListTagResourcesResponseBodyData> data;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
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

    public ListTagResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTagResourcesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTagResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagResourcesResponseBody setData(java.util.List<ListTagResourcesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTagResourcesResponseBodyData> getData() {
        return this.data;
    }

    public static class ListTagResourcesResponseBodyData extends TeaModel {
        // 标签键
        @NameInMap("TagKey")
        public String tagKey;

        // 标签值
        @NameInMap("TagValue")
        public String tagValue;

        // 资源类型
        @NameInMap("ResourceType")
        public String resourceType;

        // 资源ID
        @NameInMap("ResourceId")
        public String resourceId;

        public static ListTagResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyData self = new ListTagResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyData setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyData setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListTagResourcesResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
