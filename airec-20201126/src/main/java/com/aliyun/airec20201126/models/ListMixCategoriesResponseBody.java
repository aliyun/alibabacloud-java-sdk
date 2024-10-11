// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListMixCategoriesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED093A1D-1C56-57A2-B078-3C518F632F03</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public java.util.List<ListMixCategoriesResponseBodyResult> result;

    public static ListMixCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMixCategoriesResponseBody self = new ListMixCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMixCategoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMixCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMixCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMixCategoriesResponseBody setResult(java.util.List<ListMixCategoriesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMixCategoriesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListMixCategoriesResponseBodyResult extends TeaModel {
        /**
         * <p>The content type.</p>
         */
        @NameInMap("categories")
        public java.util.List<Long> categories;

        public static ListMixCategoriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMixCategoriesResponseBodyResult self = new ListMixCategoriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMixCategoriesResponseBodyResult setCategories(java.util.List<Long> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<Long> getCategories() {
            return this.categories;
        }

    }

}
