// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineGroupDetailReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Data")
    public GetHotlineGroupDetailReportResponseBodyData data;

    public static GetHotlineGroupDetailReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineGroupDetailReportResponseBody self = new GetHotlineGroupDetailReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineGroupDetailReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineGroupDetailReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineGroupDetailReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineGroupDetailReportResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetHotlineGroupDetailReportResponseBody setData(GetHotlineGroupDetailReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineGroupDetailReportResponseBodyData getData() {
        return this.data;
    }

    public static class GetHotlineGroupDetailReportResponseBodyDataColumns extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Title")
        public String title;

        public static GetHotlineGroupDetailReportResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineGroupDetailReportResponseBodyDataColumns self = new GetHotlineGroupDetailReportResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public GetHotlineGroupDetailReportResponseBodyDataColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetHotlineGroupDetailReportResponseBodyDataColumns setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetHotlineGroupDetailReportResponseBodyData extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("Columns")
        public java.util.List<GetHotlineGroupDetailReportResponseBodyDataColumns> columns;

        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        public static GetHotlineGroupDetailReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineGroupDetailReportResponseBodyData self = new GetHotlineGroupDetailReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineGroupDetailReportResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetHotlineGroupDetailReportResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetHotlineGroupDetailReportResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetHotlineGroupDetailReportResponseBodyData setColumns(java.util.List<GetHotlineGroupDetailReportResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetHotlineGroupDetailReportResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public GetHotlineGroupDetailReportResponseBodyData setRows(java.util.List<java.util.Map<String, ?>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

    }

}
