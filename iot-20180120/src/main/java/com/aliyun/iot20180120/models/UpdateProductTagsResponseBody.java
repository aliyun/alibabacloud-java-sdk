// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTagsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The invalid product tags returned if the call fails. The details are included in the <strong>ProductTag</strong> parameter.</p>
     */
    @NameInMap("InvalidProductTags")
    public UpdateProductTagsResponseBodyInvalidProductTags invalidProductTags;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateProductTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTagsResponseBody self = new UpdateProductTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProductTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateProductTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateProductTagsResponseBody setInvalidProductTags(UpdateProductTagsResponseBodyInvalidProductTags invalidProductTags) {
        this.invalidProductTags = invalidProductTags;
        return this;
    }
    public UpdateProductTagsResponseBodyInvalidProductTags getInvalidProductTags() {
        return this.invalidProductTags;
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

    public static class UpdateProductTagsResponseBodyInvalidProductTagsProductTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>room</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
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
