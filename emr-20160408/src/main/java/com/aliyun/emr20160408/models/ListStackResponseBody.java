// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListStackResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("StackList")
    public ListStackResponseBodyStackList stackList;

    public static ListStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackResponseBody self = new ListStackResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackResponseBody setStackList(ListStackResponseBodyStackList stackList) {
        this.stackList = stackList;
        return this;
    }
    public ListStackResponseBodyStackList getStackList() {
        return this.stackList;
    }

    public static class ListStackResponseBodyStackListStack extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        @NameInMap("Name")
        public String name;

        public static ListStackResponseBodyStackListStack build(java.util.Map<String, ?> map) throws Exception {
            ListStackResponseBodyStackListStack self = new ListStackResponseBodyStackListStack();
            return TeaModel.build(map, self);
        }

        public ListStackResponseBodyStackListStack setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackResponseBodyStackListStack setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListStackResponseBodyStackListStack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListStackResponseBodyStackList extends TeaModel {
        @NameInMap("Stack")
        public java.util.List<ListStackResponseBodyStackListStack> stack;

        public static ListStackResponseBodyStackList build(java.util.Map<String, ?> map) throws Exception {
            ListStackResponseBodyStackList self = new ListStackResponseBodyStackList();
            return TeaModel.build(map, self);
        }

        public ListStackResponseBodyStackList setStack(java.util.List<ListStackResponseBodyStackListStack> stack) {
            this.stack = stack;
            return this;
        }
        public java.util.List<ListStackResponseBodyStackListStack> getStack() {
            return this.stack;
        }

    }

}
