// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentIndexRealTimeResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data list.</p>
     */
    @NameInMap("Data")
    public GetAgentIndexRealTimeResponseBodyData data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
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
     * <p>Indicates whether the API call succeeded. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.  </li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Metric.</p>
         * 
         * <strong>example:</strong>
         * <p>客服ID</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>servicerId</p>
         */
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
        /**
         * <p>Description of returned columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<GetAgentIndexRealTimeResponseBodyDataColumns> columns;

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Returned data results.</p>
         */
        @NameInMap("Rows")
        public java.util.List<java.util.Map<String, ?>> rows;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
