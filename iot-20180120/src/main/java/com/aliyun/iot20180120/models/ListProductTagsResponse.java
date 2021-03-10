// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public ListProductTagsResponseData data;

    public static ListProductTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductTagsResponse self = new ListProductTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductTagsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProductTagsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProductTagsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductTagsResponse setData(ListProductTagsResponseData data) {
        this.data = data;
        return this;
    }
    public ListProductTagsResponseData getData() {
        return this.data;
    }

    public static class ListProductTagsResponseDataProductTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static ListProductTagsResponseDataProductTag build(java.util.Map<String, ?> map) throws Exception {
            ListProductTagsResponseDataProductTag self = new ListProductTagsResponseDataProductTag();
            return TeaModel.build(map, self);
        }

        public ListProductTagsResponseDataProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListProductTagsResponseDataProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListProductTagsResponseData extends TeaModel {
        @NameInMap("ProductTag")
        @Validation(required = true)
        public java.util.List<ListProductTagsResponseDataProductTag> productTag;

        public static ListProductTagsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListProductTagsResponseData self = new ListProductTagsResponseData();
            return TeaModel.build(map, self);
        }

        public ListProductTagsResponseData setProductTag(java.util.List<ListProductTagsResponseDataProductTag> productTag) {
            this.productTag = productTag;
            return this;
        }
        public java.util.List<ListProductTagsResponseDataProductTag> getProductTag() {
            return this.productTag;
        }

    }

}
