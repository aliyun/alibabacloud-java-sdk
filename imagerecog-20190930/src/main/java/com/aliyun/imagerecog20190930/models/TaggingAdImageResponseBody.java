// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingAdImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public TaggingAdImageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static TaggingAdImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaggingAdImageResponseBody self = new TaggingAdImageResponseBody();
        return TeaModel.build(map, self);
    }

    public TaggingAdImageResponseBody setData(TaggingAdImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TaggingAdImageResponseBodyData getData() {
        return this.data;
    }

    public TaggingAdImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaggingAdImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TaggingAdImageResponseBodyData extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.Map<String, ?> tagInfo;

        public static TaggingAdImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TaggingAdImageResponseBodyData self = new TaggingAdImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TaggingAdImageResponseBodyData setTagInfo(java.util.Map<String, ?> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.Map<String, ?> getTagInfo() {
            return this.tagInfo;
        }

    }

}
