// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListProductResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   Other values indicate that the request failed. For more information, see [Error codes](https://help.aliyun.com/document_detail/196974.html).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Model")
    public ListProductResponseBodyModel model;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductResponseBody self = new ListProductResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductResponseBody setModel(ListProductResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ListProductResponseBodyModel getModel() {
        return this.model;
    }

    public ListProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProductResponseBodyModelPagingCursors extends TeaModel {
        /**
         * <p>The cursor that points to the end of the page of the returned data.</p>
         */
        @NameInMap("After")
        public String after;

        /**
         * <p>The cursor that points to the beginning of the page of the returned data.</p>
         */
        @NameInMap("Before")
        public String before;

        public static ListProductResponseBodyModelPagingCursors build(java.util.Map<String, ?> map) throws Exception {
            ListProductResponseBodyModelPagingCursors self = new ListProductResponseBodyModelPagingCursors();
            return TeaModel.build(map, self);
        }

        public ListProductResponseBodyModelPagingCursors setAfter(String after) {
            this.after = after;
            return this;
        }
        public String getAfter() {
            return this.after;
        }

        public ListProductResponseBodyModelPagingCursors setBefore(String before) {
            this.before = before;
            return this;
        }
        public String getBefore() {
            return this.before;
        }

    }

    public static class ListProductResponseBodyModelPaging extends TeaModel {
        /**
         * <p>The cursors for pagination.</p>
         */
        @NameInMap("Cursors")
        public ListProductResponseBodyModelPagingCursors cursors;

        public static ListProductResponseBodyModelPaging build(java.util.Map<String, ?> map) throws Exception {
            ListProductResponseBodyModelPaging self = new ListProductResponseBodyModelPaging();
            return TeaModel.build(map, self);
        }

        public ListProductResponseBodyModelPaging setCursors(ListProductResponseBodyModelPagingCursors cursors) {
            this.cursors = cursors;
            return this;
        }
        public ListProductResponseBodyModelPagingCursors getCursors() {
            return this.cursors;
        }

    }

    public static class ListProductResponseBodyModel extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        /**
         * <p>The pagination details.</p>
         */
        @NameInMap("Paging")
        public ListProductResponseBodyModelPaging paging;

        public static ListProductResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListProductResponseBodyModel self = new ListProductResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListProductResponseBodyModel setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public ListProductResponseBodyModel setPaging(ListProductResponseBodyModelPaging paging) {
            this.paging = paging;
            return this;
        }
        public ListProductResponseBodyModelPaging getPaging() {
            return this.paging;
        }

    }

}
