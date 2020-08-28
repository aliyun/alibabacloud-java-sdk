// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public TaggingImageResponseData data;

    public static TaggingImageResponse build(java.util.Map<String, ?> map) throws Exception {
        TaggingImageResponse self = new TaggingImageResponse();
        return TeaModel.build(map, self);
    }

    public static class TaggingImageResponseDataTags extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Double confidence;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static TaggingImageResponseDataTags build(java.util.Map<String, ?> map) throws Exception {
            TaggingImageResponseDataTags self = new TaggingImageResponseDataTags();
            return TeaModel.build(map, self);
        }

    }

    public static class TaggingImageResponseData extends TeaModel {
        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<TaggingImageResponseDataTags> tags;

        public static TaggingImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            TaggingImageResponseData self = new TaggingImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
