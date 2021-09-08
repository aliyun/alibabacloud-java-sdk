// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTagsResponse extends TeaModel {
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

    @NameInMap("InvalidProductTags")
    @Validation(required = true)
    public UpdateProductTagsResponseInvalidProductTags invalidProductTags;

    public static UpdateProductTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTagsResponse self = new UpdateProductTagsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateProductTagsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateProductTagsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateProductTagsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProductTagsResponse setInvalidProductTags(UpdateProductTagsResponseInvalidProductTags invalidProductTags) {
        this.invalidProductTags = invalidProductTags;
        return this;
    }
    public UpdateProductTagsResponseInvalidProductTags getInvalidProductTags() {
        return this.invalidProductTags;
    }

    public static class UpdateProductTagsResponseInvalidProductTagsProductTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static UpdateProductTagsResponseInvalidProductTagsProductTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductTagsResponseInvalidProductTagsProductTag self = new UpdateProductTagsResponseInvalidProductTagsProductTag();
            return TeaModel.build(map, self);
        }

        public UpdateProductTagsResponseInvalidProductTagsProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateProductTagsResponseInvalidProductTagsProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class UpdateProductTagsResponseInvalidProductTags extends TeaModel {
        @NameInMap("ProductTag")
        @Validation(required = true)
        public java.util.List<UpdateProductTagsResponseInvalidProductTagsProductTag> productTag;

        public static UpdateProductTagsResponseInvalidProductTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductTagsResponseInvalidProductTags self = new UpdateProductTagsResponseInvalidProductTags();
            return TeaModel.build(map, self);
        }

        public UpdateProductTagsResponseInvalidProductTags setProductTag(java.util.List<UpdateProductTagsResponseInvalidProductTagsProductTag> productTag) {
            this.productTag = productTag;
            return this;
        }
        public java.util.List<UpdateProductTagsResponseInvalidProductTagsProductTag> getProductTag() {
            return this.productTag;
        }

    }

}
