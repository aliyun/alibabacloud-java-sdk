// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlansResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query information.</p>
     */
    @NameInMap("Data")
    public QueryRecordPlansResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant auth error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06DC77A0-4622-42DB-9EE0-25FIOHS82JK1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryRecordPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlansResponseBody self = new QueryRecordPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecordPlansResponseBody setData(QueryRecordPlansResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecordPlansResponseBodyData getData() {
        return this.data;
    }

    public QueryRecordPlansResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryRecordPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecordPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecordPlansResponseBodyDataList extends TeaModel {
        /**
         * <p>The name of the recording plan.</p>
         * 
         * <strong>example:</strong>
         * <p>plan1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the recording plan.</p>
         * 
         * <strong>example:</strong>
         * <p>6c5a397bc17c4b48ace86f0f0c30****</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The ID of the time template associated with the recording plan.</p>
         * 
         * <strong>example:</strong>
         * <p>693e244a038f4255bb2f5db32874****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static QueryRecordPlansResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlansResponseBodyDataList self = new QueryRecordPlansResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlansResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRecordPlansResponseBodyDataList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryRecordPlansResponseBodyDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryRecordPlansResponseBodyData extends TeaModel {
        /**
         * <p>The list of returned recording plan templates.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryRecordPlansResponseBodyDataList> list;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageCount")
        public Integer pageCount;

        /**
         * <p>The number of records returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of recording plans returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryRecordPlansResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecordPlansResponseBodyData self = new QueryRecordPlansResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecordPlansResponseBodyData setList(java.util.List<QueryRecordPlansResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryRecordPlansResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryRecordPlansResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryRecordPlansResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryRecordPlansResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRecordPlansResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
