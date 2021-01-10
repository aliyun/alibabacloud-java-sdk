// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListProductTagsResponseBodyData data;

    public static ListProductTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductTagsResponseBody self = new ListProductTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProductTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProductTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductTagsResponseBody setData(ListProductTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductTagsResponseBodyData getData() {
        return this.data;
    }

    public static class ListProductTagsResponseBodyDataProductTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListProductTagsResponseBodyDataProductTag build(java.util.Map<String, ?> map) throws Exception {
            ListProductTagsResponseBodyDataProductTag self = new ListProductTagsResponseBodyDataProductTag();
            return TeaModel.build(map, self);
        }

        public ListProductTagsResponseBodyDataProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListProductTagsResponseBodyDataProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListProductTagsResponseBodyData extends TeaModel {
        @NameInMap("ProductTag")
        public java.util.List<ListProductTagsResponseBodyDataProductTag> productTag;

        public static ListProductTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductTagsResponseBodyData self = new ListProductTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductTagsResponseBodyData setProductTag(java.util.List<ListProductTagsResponseBodyDataProductTag> productTag) {
            this.productTag = productTag;
            return this;
        }
        public java.util.List<ListProductTagsResponseBodyDataProductTag> getProductTag() {
            return this.productTag;
        }

    }

}
