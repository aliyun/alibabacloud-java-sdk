// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListProductResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ListProductResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("After")
        public String after;

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
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

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
