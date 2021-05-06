// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryBaseDictResponseBody extends TeaModel {
    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // data
    @NameInMap("Data")
    public QueryBaseDictResponseBodyData data;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // success
    @NameInMap("Success")
    public Boolean success;

    // exception
    @NameInMap("Exception")
    public java.util.Map<String, ?> exception;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryBaseDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBaseDictResponseBody self = new QueryBaseDictResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBaseDictResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryBaseDictResponseBody setData(QueryBaseDictResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBaseDictResponseBodyData getData() {
        return this.data;
    }

    public QueryBaseDictResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryBaseDictResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBaseDictResponseBody setException(java.util.Map<String, ?> exception) {
        this.exception = exception;
        return this;
    }
    public java.util.Map<String, ?> getException() {
        return this.exception;
    }

    public QueryBaseDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryBaseDictResponseBodyDataRows extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static QueryBaseDictResponseBodyDataRows build(java.util.Map<String, ?> map) throws Exception {
            QueryBaseDictResponseBodyDataRows self = new QueryBaseDictResponseBodyDataRows();
            return TeaModel.build(map, self);
        }

        public QueryBaseDictResponseBodyDataRows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryBaseDictResponseBodyDataRows setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryBaseDictResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public java.util.List<QueryBaseDictResponseBodyDataRows> rows;

        @NameInMap("Total")
        public Long total;

        public static QueryBaseDictResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBaseDictResponseBodyData self = new QueryBaseDictResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBaseDictResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryBaseDictResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryBaseDictResponseBodyData setRows(java.util.List<QueryBaseDictResponseBodyDataRows> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<QueryBaseDictResponseBodyDataRows> getRows() {
            return this.rows;
        }

        public QueryBaseDictResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
