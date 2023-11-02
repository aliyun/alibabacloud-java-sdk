// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetLogsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogsResponseBody self = new GetLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLogsResponseBody setData(GetLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLogsResponseBodyData getData() {
        return this.data;
    }

    public GetLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLogsResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetLogsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLogsResponseBodyDataPageInfo self = new GetLogsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public GetLogsResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetLogsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetLogsResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetLogsResponseBodyDataResponseData extends TeaModel {
        @NameInMap("CompleteOrNot")
        public Boolean completeOrNot;

        @NameInMap("Cost")
        public Long cost;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("HasSql")
        public Boolean hasSql;

        @NameInMap("Keys")
        public java.util.List<String> keys;

        @NameInMap("Lines")
        public java.util.List<?> lines;

        public static GetLogsResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetLogsResponseBodyDataResponseData self = new GetLogsResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public GetLogsResponseBodyDataResponseData setCompleteOrNot(Boolean completeOrNot) {
            this.completeOrNot = completeOrNot;
            return this;
        }
        public Boolean getCompleteOrNot() {
            return this.completeOrNot;
        }

        public GetLogsResponseBodyDataResponseData setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public GetLogsResponseBodyDataResponseData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetLogsResponseBodyDataResponseData setHasSql(Boolean hasSql) {
            this.hasSql = hasSql;
            return this;
        }
        public Boolean getHasSql() {
            return this.hasSql;
        }

        public GetLogsResponseBodyDataResponseData setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public GetLogsResponseBodyDataResponseData setLines(java.util.List<?> lines) {
            this.lines = lines;
            return this;
        }
        public java.util.List<?> getLines() {
            return this.lines;
        }

    }

    public static class GetLogsResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public GetLogsResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public GetLogsResponseBodyDataResponseData responseData;

        public static GetLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLogsResponseBodyData self = new GetLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLogsResponseBodyData setPageInfo(GetLogsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public GetLogsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public GetLogsResponseBodyData setResponseData(GetLogsResponseBodyDataResponseData responseData) {
            this.responseData = responseData;
            return this;
        }
        public GetLogsResponseBodyDataResponseData getResponseData() {
            return this.responseData;
        }

    }

}
