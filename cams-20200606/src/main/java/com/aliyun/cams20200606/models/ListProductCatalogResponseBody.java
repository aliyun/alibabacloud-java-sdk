// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListProductCatalogResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ListProductCatalogResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProductCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductCatalogResponseBody self = new ListProductCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductCatalogResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListProductCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductCatalogResponseBody setModel(ListProductCatalogResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ListProductCatalogResponseBodyModel getModel() {
        return this.model;
    }

    public ListProductCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductCatalogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProductCatalogResponseBodyModelPagingCursors extends TeaModel {
        @NameInMap("After")
        public String after;

        @NameInMap("Before")
        public String before;

        public static ListProductCatalogResponseBodyModelPagingCursors build(java.util.Map<String, ?> map) throws Exception {
            ListProductCatalogResponseBodyModelPagingCursors self = new ListProductCatalogResponseBodyModelPagingCursors();
            return TeaModel.build(map, self);
        }

        public ListProductCatalogResponseBodyModelPagingCursors setAfter(String after) {
            this.after = after;
            return this;
        }
        public String getAfter() {
            return this.after;
        }

        public ListProductCatalogResponseBodyModelPagingCursors setBefore(String before) {
            this.before = before;
            return this;
        }
        public String getBefore() {
            return this.before;
        }

    }

    public static class ListProductCatalogResponseBodyModelPaging extends TeaModel {
        @NameInMap("Cursors")
        public ListProductCatalogResponseBodyModelPagingCursors cursors;

        public static ListProductCatalogResponseBodyModelPaging build(java.util.Map<String, ?> map) throws Exception {
            ListProductCatalogResponseBodyModelPaging self = new ListProductCatalogResponseBodyModelPaging();
            return TeaModel.build(map, self);
        }

        public ListProductCatalogResponseBodyModelPaging setCursors(ListProductCatalogResponseBodyModelPagingCursors cursors) {
            this.cursors = cursors;
            return this;
        }
        public ListProductCatalogResponseBodyModelPagingCursors getCursors() {
            return this.cursors;
        }

    }

    public static class ListProductCatalogResponseBodyModel extends TeaModel {
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        @NameInMap("Paging")
        public ListProductCatalogResponseBodyModelPaging paging;

        public static ListProductCatalogResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListProductCatalogResponseBodyModel self = new ListProductCatalogResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListProductCatalogResponseBodyModel setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public ListProductCatalogResponseBodyModel setPaging(ListProductCatalogResponseBodyModelPaging paging) {
            this.paging = paging;
            return this;
        }
        public ListProductCatalogResponseBodyModelPaging getPaging() {
            return this.paging;
        }

    }

}
