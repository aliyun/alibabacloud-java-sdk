// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDoNotCallNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDoNotCallNumbersResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDoNotCallNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDoNotCallNumbersResponseBody self = new ListDoNotCallNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDoNotCallNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDoNotCallNumbersResponseBody setData(ListDoNotCallNumbersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDoNotCallNumbersResponseBodyData getData() {
        return this.data;
    }

    public ListDoNotCallNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDoNotCallNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDoNotCallNumbersResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListDoNotCallNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDoNotCallNumbersResponseBodyDataList extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Number")
        public String number;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Scope")
        public String scope;

        public static ListDoNotCallNumbersResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDoNotCallNumbersResponseBodyDataList self = new ListDoNotCallNumbersResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListDoNotCallNumbersResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDoNotCallNumbersResponseBodyDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListDoNotCallNumbersResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListDoNotCallNumbersResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListDoNotCallNumbersResponseBodyDataList setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

    public static class ListDoNotCallNumbersResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListDoNotCallNumbersResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDoNotCallNumbersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDoNotCallNumbersResponseBodyData self = new ListDoNotCallNumbersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDoNotCallNumbersResponseBodyData setList(java.util.List<ListDoNotCallNumbersResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDoNotCallNumbersResponseBodyDataList> getList() {
            return this.list;
        }

        public ListDoNotCallNumbersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDoNotCallNumbersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDoNotCallNumbersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
