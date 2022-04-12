// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRootStacksResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListRootStacksResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListRootStacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRootStacksResponseBody self = new ListRootStacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRootStacksResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListRootStacksResponseBody setData(ListRootStacksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRootStacksResponseBodyData getData() {
        return this.data;
    }

    public ListRootStacksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRootStacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRootStacksResponseBodyDataResultChildren extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListRootStacksResponseBodyDataResultChildren build(java.util.Map<String, ?> map) throws Exception {
            ListRootStacksResponseBodyDataResultChildren self = new ListRootStacksResponseBodyDataResultChildren();
            return TeaModel.build(map, self);
        }

        public ListRootStacksResponseBodyDataResultChildren setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListRootStacksResponseBodyDataResultChildren setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListRootStacksResponseBodyDataResultChildren setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRootStacksResponseBodyDataResultChildren setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRootStacksResponseBodyDataResultRoot extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListRootStacksResponseBodyDataResultRoot build(java.util.Map<String, ?> map) throws Exception {
            ListRootStacksResponseBodyDataResultRoot self = new ListRootStacksResponseBodyDataResultRoot();
            return TeaModel.build(map, self);
        }

        public ListRootStacksResponseBodyDataResultRoot setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRootStacksResponseBodyDataResultRoot setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRootStacksResponseBodyDataResult extends TeaModel {
        @NameInMap("Children")
        public java.util.List<ListRootStacksResponseBodyDataResultChildren> children;

        @NameInMap("Root")
        public ListRootStacksResponseBodyDataResultRoot root;

        public static ListRootStacksResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListRootStacksResponseBodyDataResult self = new ListRootStacksResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListRootStacksResponseBodyDataResult setChildren(java.util.List<ListRootStacksResponseBodyDataResultChildren> children) {
            this.children = children;
            return this;
        }
        public java.util.List<ListRootStacksResponseBodyDataResultChildren> getChildren() {
            return this.children;
        }

        public ListRootStacksResponseBodyDataResult setRoot(ListRootStacksResponseBodyDataResultRoot root) {
            this.root = root;
            return this;
        }
        public ListRootStacksResponseBodyDataResultRoot getRoot() {
            return this.root;
        }

    }

    public static class ListRootStacksResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListRootStacksResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListRootStacksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRootStacksResponseBodyData self = new ListRootStacksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRootStacksResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListRootStacksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRootStacksResponseBodyData setResult(java.util.List<ListRootStacksResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListRootStacksResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListRootStacksResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
