// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListParserDataSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListParserDataSourceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

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

    /**
     * <strong>example:</strong>
     * <p>E4C0FF92-2A86-41DB-92D3-73B60310D25E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListParserDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParserDataSourceResponseBody self = new ListParserDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParserDataSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListParserDataSourceResponseBody setData(ListParserDataSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListParserDataSourceResponseBodyData getData() {
        return this.data;
    }

    public ListParserDataSourceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListParserDataSourceResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListParserDataSourceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListParserDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParserDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListParserDataSourceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListParserDataSourceResponseBodyDataDataSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>DataSource</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2022-03-27T12:45:43.000Z</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        public static ListParserDataSourceResponseBodyDataDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListParserDataSourceResponseBodyDataDataSource self = new ListParserDataSourceResponseBodyDataDataSource();
            return TeaModel.build(map, self);
        }

        public ListParserDataSourceResponseBodyDataDataSource setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ListParserDataSourceResponseBodyDataDataSource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListParserDataSourceResponseBodyDataDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParserDataSourceResponseBodyDataDataSource setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

    }

    public static class ListParserDataSourceResponseBodyData extends TeaModel {
        @NameInMap("DataSource")
        public java.util.List<ListParserDataSourceResponseBodyDataDataSource> dataSource;

        public static ListParserDataSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListParserDataSourceResponseBodyData self = new ListParserDataSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListParserDataSourceResponseBodyData setDataSource(java.util.List<ListParserDataSourceResponseBodyDataDataSource> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public java.util.List<ListParserDataSourceResponseBodyDataDataSource> getDataSource() {
            return this.dataSource;
        }

    }

}
