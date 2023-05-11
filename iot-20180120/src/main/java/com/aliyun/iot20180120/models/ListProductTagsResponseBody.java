// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListProductTagsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The product tags returned if the call succeeds. For more information, see the parameters that are included in the **ProductTag** parameter.</p>
     */
    @NameInMap("Data")
    public ListProductTagsResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListProductTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductTagsResponseBody self = new ListProductTagsResponseBody();
        return TeaModel.build(map, self);
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

    public ListProductTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class ListProductTagsResponseBodyDataProductTag extends TeaModel {
        /**
         * <p>The key of each tag.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
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
