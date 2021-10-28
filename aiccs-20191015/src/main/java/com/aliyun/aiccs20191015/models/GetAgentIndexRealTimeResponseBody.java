// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentIndexRealTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentIndexRealTimeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentIndexRealTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentIndexRealTimeResponseBody self = new GetAgentIndexRealTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentIndexRealTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentIndexRealTimeResponseBody setData(GetAgentIndexRealTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentIndexRealTimeResponseBodyData getData() {
        return this.data;
    }

    public GetAgentIndexRealTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentIndexRealTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentIndexRealTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentIndexRealTimeResponseBodyDataColumns extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Title")
        public String title;

        public static GetAgentIndexRealTimeResponseBodyDataColumns build(java.util.Map<String, ?> map) throws Exception {
            GetAgentIndexRealTimeResponseBodyDataColumns self = new GetAgentIndexRealTimeResponseBodyDataColumns();
            return TeaModel.build(map, self);
        }

        public GetAgentIndexRealTimeResponseBodyDataColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAgentIndexRealTimeResponseBodyDataColumns setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetAgentIndexRealTimeResponseBodyData extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<GetAgentIndexRealTimeResponseBodyDataColumns> columns;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        @NameInMap("Total")
        public Integer total;

        public static GetAgentIndexRealTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentIndexRealTimeResponseBodyData self = new GetAgentIndexRealTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentIndexRealTimeResponseBodyData setColumns(java.util.List<GetAgentIndexRealTimeResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetAgentIndexRealTimeResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public GetAgentIndexRealTimeResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetAgentIndexRealTimeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAgentIndexRealTimeResponseBodyData setRows(java.util.List<java.util.Map<String, ?>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

        public GetAgentIndexRealTimeResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
