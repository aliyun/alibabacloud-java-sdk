// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class RemoveTagsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The operation that you want to perform. Set the value to RemoveTags.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tag")
    public RemoveTagsResponseBodyTag tag;

    public static RemoveTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsResponseBody self = new RemoveTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveTagsResponseBody setTag(RemoveTagsResponseBodyTag tag) {
        this.tag = tag;
        return this;
    }
    public RemoveTagsResponseBodyTag getTag() {
        return this.tag;
    }

    public static class RemoveTagsResponseBodyTag extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static RemoveTagsResponseBodyTag build(java.util.Map<String, ?> map) throws Exception {
            RemoveTagsResponseBodyTag self = new RemoveTagsResponseBodyTag();
            return TeaModel.build(map, self);
        }

        public RemoveTagsResponseBodyTag setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
