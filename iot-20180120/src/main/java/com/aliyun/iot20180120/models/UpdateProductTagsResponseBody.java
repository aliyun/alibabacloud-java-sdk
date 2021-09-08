// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("InvalidProductTags")
    public UpdateProductTagsResponseBodyInvalidProductTags invalidProductTags;

    public static UpdateProductTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTagsResponseBody self = new UpdateProductTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProductTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateProductTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateProductTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProductTagsResponseBody setInvalidProductTags(UpdateProductTagsResponseBodyInvalidProductTags invalidProductTags) {
        this.invalidProductTags = invalidProductTags;
        return this;
    }
    public UpdateProductTagsResponseBodyInvalidProductTags getInvalidProductTags() {
        return this.invalidProductTags;
    }

    public static class UpdateProductTagsResponseBodyInvalidProductTagsProductTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static UpdateProductTagsResponseBodyInvalidProductTagsProductTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductTagsResponseBodyInvalidProductTagsProductTag self = new UpdateProductTagsResponseBodyInvalidProductTagsProductTag();
            return TeaModel.build(map, self);
        }

        public UpdateProductTagsResponseBodyInvalidProductTagsProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateProductTagsResponseBodyInvalidProductTagsProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateProductTagsResponseBodyInvalidProductTags extends TeaModel {
        @NameInMap("ProductTag")
        public java.util.List<UpdateProductTagsResponseBodyInvalidProductTagsProductTag> productTag;

        public static UpdateProductTagsResponseBodyInvalidProductTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductTagsResponseBodyInvalidProductTags self = new UpdateProductTagsResponseBodyInvalidProductTags();
            return TeaModel.build(map, self);
        }

        public UpdateProductTagsResponseBodyInvalidProductTags setProductTag(java.util.List<UpdateProductTagsResponseBodyInvalidProductTagsProductTag> productTag) {
            this.productTag = productTag;
            return this;
        }
        public java.util.List<UpdateProductTagsResponseBodyInvalidProductTagsProductTag> getProductTag() {
            return this.productTag;
        }

    }

}
