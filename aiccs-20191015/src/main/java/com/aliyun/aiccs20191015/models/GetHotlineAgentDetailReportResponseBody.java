// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHotlineAgentDetailReportResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetHotlineAgentDetailReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentDetailReportResponseBody self = new GetHotlineAgentDetailReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentDetailReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineAgentDetailReportResponseBody setData(GetHotlineAgentDetailReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineAgentDetailReportResponseBodyData getData() {
        return this.data;
    }

    public GetHotlineAgentDetailReportResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHotlineAgentDetailReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineAgentDetailReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineAgentDetailReportResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetHotlineAgentDetailReportResponseBodyDataColumns extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Title")
        public String title;

        public static GetHotlineAgentDetailReportResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineAgentDetailReportResponseBodyDataColumns self = new GetHotlineAgentDetailReportResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public GetHotlineAgentDetailReportResponseBodyDataColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetHotlineAgentDetailReportResponseBodyDataColumns setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetHotlineAgentDetailReportResponseBodyData extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<GetHotlineAgentDetailReportResponseBodyDataColumns> columns;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        @NameInMap("Total")
        public Integer total;

        public static GetHotlineAgentDetailReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineAgentDetailReportResponseBodyData self = new GetHotlineAgentDetailReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineAgentDetailReportResponseBodyData setColumns(java.util.List<GetHotlineAgentDetailReportResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetHotlineAgentDetailReportResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public GetHotlineAgentDetailReportResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetHotlineAgentDetailReportResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetHotlineAgentDetailReportResponseBodyData setRows(java.util.List<java.util.Map<String, ?>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

        public GetHotlineAgentDetailReportResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
