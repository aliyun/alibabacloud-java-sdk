// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailReportResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of &quot;Success&quot; indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Query result data.</p>
     */
    @NameInMap("Data")
    public GetHotlineAgentDetailReportResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API was invoked successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Metric.</p>
         * 
         * <strong>example:</strong>
         * <p>realName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>客服姓名</p>
         */
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
        /**
         * <p>Description of returned columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<GetHotlineAgentDetailReportResponseBodyDataColumns> columns;

        /**
         * <p>Current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>Number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned data result.</p>
         */
        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
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
