// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAuthorizedResourcesResponseBody extends TeaModel {
    @NameInMap("data")
    public ListAuthorizedResourcesResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    public static ListAuthorizedResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedResourcesResponseBody self = new ListAuthorizedResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedResourcesResponseBody setData(ListAuthorizedResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAuthorizedResourcesResponseBodyData getData() {
        return this.data;
    }

    public ListAuthorizedResourcesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListAuthorizedResourcesResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public static class ListAuthorizedResourcesResponseBodyDataList extends TeaModel {
        @NameInMap("foo")
        public String foo;

        public static ListAuthorizedResourcesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedResourcesResponseBodyDataList self = new ListAuthorizedResourcesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedResourcesResponseBodyDataList setFoo(String foo) {
            this.foo = foo;
            return this;
        }
        public String getFoo() {
            return this.foo;
        }

    }

    public static class ListAuthorizedResourcesResponseBodyData extends TeaModel {
        @NameInMap("total")
        public Long total;

        @NameInMap("pageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("list")
        public java.util.List<ListAuthorizedResourcesResponseBodyDataList> list;

        public static ListAuthorizedResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedResourcesResponseBodyData self = new ListAuthorizedResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedResourcesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListAuthorizedResourcesResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListAuthorizedResourcesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListAuthorizedResourcesResponseBodyData setList(java.util.List<ListAuthorizedResourcesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListAuthorizedResourcesResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
