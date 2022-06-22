// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySwitchDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySwitchDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySwitchDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySwitchDetailResponseBody self = new QuerySwitchDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySwitchDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySwitchDetailResponseBody setData(QuerySwitchDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySwitchDetailResponseBodyData getData() {
        return this.data;
    }

    public QuerySwitchDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySwitchDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySwitchDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySwitchDetailResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static QuerySwitchDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySwitchDetailResponseBodyData self = new QuerySwitchDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySwitchDetailResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public QuerySwitchDetailResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QuerySwitchDetailResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QuerySwitchDetailResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
