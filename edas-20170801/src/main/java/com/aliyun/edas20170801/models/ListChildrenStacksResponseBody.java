// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListChildrenStacksResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListChildrenStacksResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static ListChildrenStacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChildrenStacksResponseBody self = new ListChildrenStacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChildrenStacksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChildrenStacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChildrenStacksResponseBody setData(ListChildrenStacksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChildrenStacksResponseBodyData getData() {
        return this.data;
    }

    public ListChildrenStacksResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListChildrenStacksResponseBodyDataResult extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("BuildTypes")
        public java.util.List<String> buildTypes;

        @NameInMap("Latest")
        public Boolean latest;

        @NameInMap("Name")
        public String name;

        @NameInMap("Preferred")
        public Boolean preferred;

        @NameInMap("Id")
        public Long id;

        public static ListChildrenStacksResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListChildrenStacksResponseBodyDataResult self = new ListChildrenStacksResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListChildrenStacksResponseBodyDataResult setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListChildrenStacksResponseBodyDataResult setBuildTypes(java.util.List<String> buildTypes) {
            this.buildTypes = buildTypes;
            return this;
        }
        public java.util.List<String> getBuildTypes() {
            return this.buildTypes;
        }

        public ListChildrenStacksResponseBodyDataResult setLatest(Boolean latest) {
            this.latest = latest;
            return this;
        }
        public Boolean getLatest() {
            return this.latest;
        }

        public ListChildrenStacksResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChildrenStacksResponseBodyDataResult setPreferred(Boolean preferred) {
            this.preferred = preferred;
            return this;
        }
        public Boolean getPreferred() {
            return this.preferred;
        }

        public ListChildrenStacksResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListChildrenStacksResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Result")
        public java.util.List<ListChildrenStacksResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListChildrenStacksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChildrenStacksResponseBodyData self = new ListChildrenStacksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChildrenStacksResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListChildrenStacksResponseBodyData setResult(java.util.List<ListChildrenStacksResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListChildrenStacksResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListChildrenStacksResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public ListChildrenStacksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
