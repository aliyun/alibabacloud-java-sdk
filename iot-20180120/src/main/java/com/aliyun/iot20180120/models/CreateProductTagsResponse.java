// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTagsResponse extends TeaModel {
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
    public CreateProductTagsResponseInvalidProductTags invalidProductTags;

    public static CreateProductTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductTagsResponse self = new CreateProductTagsResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProductTagsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateProductTagsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProductTagsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductTagsResponse setInvalidProductTags(CreateProductTagsResponseInvalidProductTags invalidProductTags) {
        this.invalidProductTags = invalidProductTags;
        return this;
    }
    public CreateProductTagsResponseInvalidProductTags getInvalidProductTags() {
        return this.invalidProductTags;
    }

    public static class CreateProductTagsResponseInvalidProductTagsProductTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static CreateProductTagsResponseInvalidProductTagsProductTag build(java.util.Map<String, ?> map) throws Exception {
            CreateProductTagsResponseInvalidProductTagsProductTag self = new CreateProductTagsResponseInvalidProductTagsProductTag();
            return TeaModel.build(map, self);
        }

        public CreateProductTagsResponseInvalidProductTagsProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateProductTagsResponseInvalidProductTagsProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateProductTagsResponseInvalidProductTags extends TeaModel {
        @NameInMap("ProductTag")
        @Validation(required = true)
        public java.util.List<CreateProductTagsResponseInvalidProductTagsProductTag> productTag;

        public static CreateProductTagsResponseInvalidProductTags build(java.util.Map<String, ?> map) throws Exception {
            CreateProductTagsResponseInvalidProductTags self = new CreateProductTagsResponseInvalidProductTags();
            return TeaModel.build(map, self);
        }

        public CreateProductTagsResponseInvalidProductTags setProductTag(java.util.List<CreateProductTagsResponseInvalidProductTagsProductTag> productTag) {
            this.productTag = productTag;
            return this;
        }
        public java.util.List<CreateProductTagsResponseInvalidProductTagsProductTag> getProductTag() {
            return this.productTag;
        }

    }

}
