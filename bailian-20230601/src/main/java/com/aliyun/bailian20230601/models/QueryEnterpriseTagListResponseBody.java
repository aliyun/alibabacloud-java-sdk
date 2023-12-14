// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class QueryEnterpriseTagListResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryEnterpriseTagListResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEnterpriseTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseTagListResponseBody self = new QueryEnterpriseTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseTagListResponseBody setData(QueryEnterpriseTagListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEnterpriseTagListResponseBodyData getData() {
        return this.data;
    }

    public QueryEnterpriseTagListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryEnterpriseTagListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryEnterpriseTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEnterpriseTagListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEnterpriseTagListResponseBodyDataList extends TeaModel {
        @NameInMap("TagId")
        public Long tagId;

        @NameInMap("TagName")
        public String tagName;

        public static QueryEnterpriseTagListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryEnterpriseTagListResponseBodyDataList self = new QueryEnterpriseTagListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryEnterpriseTagListResponseBodyDataList setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public QueryEnterpriseTagListResponseBodyDataList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class QueryEnterpriseTagListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryEnterpriseTagListResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static QueryEnterpriseTagListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEnterpriseTagListResponseBodyData self = new QueryEnterpriseTagListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEnterpriseTagListResponseBodyData setList(java.util.List<QueryEnterpriseTagListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryEnterpriseTagListResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryEnterpriseTagListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryEnterpriseTagListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEnterpriseTagListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
