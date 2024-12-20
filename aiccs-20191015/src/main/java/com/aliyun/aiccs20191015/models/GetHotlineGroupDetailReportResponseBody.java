// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineGroupDetailReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHotlineGroupDetailReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("Success")
    public String success;

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

    public GetHotlineGroupDetailReportResponseBody setData(GetHotlineGroupDetailReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineGroupDetailReportResponseBodyData getData() {
        return this.data;
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

    public static class GetHotlineGroupDetailReportResponseBodyDataColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>skillGroupName</p>
         */
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
        @NameInMap("Columns")
        public java.util.List<GetHotlineGroupDetailReportResponseBodyDataColumns> columns;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetHotlineGroupDetailReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineGroupDetailReportResponseBodyData self = new GetHotlineGroupDetailReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineGroupDetailReportResponseBodyData setColumns(java.util.List<GetHotlineGroupDetailReportResponseBodyDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetHotlineGroupDetailReportResponseBodyDataColumns> getColumns() {
            return this.columns;
        }

        public GetHotlineGroupDetailReportResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetHotlineGroupDetailReportResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetHotlineGroupDetailReportResponseBodyData setRows(java.util.List<java.util.Map<String, ?>> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

        public GetHotlineGroupDetailReportResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
