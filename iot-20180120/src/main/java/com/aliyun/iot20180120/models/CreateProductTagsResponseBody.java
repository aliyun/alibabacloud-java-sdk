// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTagsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The invalid product tags returned if the call fails.</p>
     */
    @NameInMap("InvalidProductTags")
    public CreateProductTagsResponseBodyInvalidProductTags invalidProductTags;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful. The tags were attached to the product.</p>
     * <p>*   **false**: The call failed. This value indicates that the tags failed to be attached to the product.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateProductTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProductTagsResponseBody self = new CreateProductTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProductTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProductTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateProductTagsResponseBody setInvalidProductTags(CreateProductTagsResponseBodyInvalidProductTags invalidProductTags) {
        this.invalidProductTags = invalidProductTags;
        return this;
    }
    public CreateProductTagsResponseBodyInvalidProductTags getInvalidProductTags() {
        return this.invalidProductTags;
    }

    public CreateProductTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProductTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateProductTagsResponseBodyInvalidProductTagsProductTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static CreateProductTagsResponseBodyInvalidProductTagsProductTag build(java.util.Map<String, ?> map) throws Exception {
            CreateProductTagsResponseBodyInvalidProductTagsProductTag self = new CreateProductTagsResponseBodyInvalidProductTagsProductTag();
            return TeaModel.build(map, self);
        }

        public CreateProductTagsResponseBodyInvalidProductTagsProductTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateProductTagsResponseBodyInvalidProductTagsProductTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateProductTagsResponseBodyInvalidProductTags extends TeaModel {
        @NameInMap("ProductTag")
        public java.util.List<CreateProductTagsResponseBodyInvalidProductTagsProductTag> productTag;

        public static CreateProductTagsResponseBodyInvalidProductTags build(java.util.Map<String, ?> map) throws Exception {
            CreateProductTagsResponseBodyInvalidProductTags self = new CreateProductTagsResponseBodyInvalidProductTags();
            return TeaModel.build(map, self);
        }

        public CreateProductTagsResponseBodyInvalidProductTags setProductTag(java.util.List<CreateProductTagsResponseBodyInvalidProductTagsProductTag> productTag) {
            this.productTag = productTag;
            return this;
        }
        public java.util.List<CreateProductTagsResponseBodyInvalidProductTagsProductTag> getProductTag() {
            return this.productTag;
        }

    }

}
