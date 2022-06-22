// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListApplicationNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListApplicationNameResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListApplicationNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationNameResponseBody self = new ListApplicationNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApplicationNameResponseBody setData(java.util.List<ListApplicationNameResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListApplicationNameResponseBodyData> getData() {
        return this.data;
    }

    public ListApplicationNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApplicationNameResponseBodyData extends TeaModel {
        @NameInMap("currentPage")
        public Integer currentPage;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("result")
        public java.util.List<String> result;

        @NameInMap("totalItem")
        public Integer totalItem;

        @NameInMap("totalPage")
        public Integer totalPage;

        public static ListApplicationNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationNameResponseBodyData self = new ListApplicationNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationNameResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListApplicationNameResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApplicationNameResponseBodyData setResult(java.util.List<String> result) {
            this.result = result;
            return this;
        }
        public java.util.List<String> getResult() {
            return this.result;
        }

        public ListApplicationNameResponseBodyData setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

        public ListApplicationNameResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
