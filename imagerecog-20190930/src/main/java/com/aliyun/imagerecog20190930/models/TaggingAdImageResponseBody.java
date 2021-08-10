// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingAdImageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public TaggingAdImageResponseBodyData data;

    public static TaggingAdImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaggingAdImageResponseBody self = new TaggingAdImageResponseBody();
        return TeaModel.build(map, self);
    }

    public TaggingAdImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaggingAdImageResponseBody setData(TaggingAdImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TaggingAdImageResponseBodyData getData() {
        return this.data;
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
