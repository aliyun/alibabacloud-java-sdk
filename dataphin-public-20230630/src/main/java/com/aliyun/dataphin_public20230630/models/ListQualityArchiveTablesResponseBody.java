// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityArchiveTablesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of querying the anomaly archived table list.</p>
     */
    @NameInMap("Data")
    public ListQualityArchiveTablesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListQualityArchiveTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityArchiveTablesResponseBody self = new ListQualityArchiveTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityArchiveTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQualityArchiveTablesResponseBody setData(ListQualityArchiveTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQualityArchiveTablesResponseBodyData getData() {
        return this.data;
    }

    public ListQualityArchiveTablesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityArchiveTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQualityArchiveTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityArchiveTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityArchiveTablesResponseBodyDataArchiveTableList extends TeaModel {
        /**
         * <p>The ID of the archived table. This ID is used when you update, switch to active, or delete the archived table.</p>
         * 
         * <strong>example:</strong>
         * <p>7673533</p>
         */
        @NameInMap("ArchiveTableId")
        public Long archiveTableId;

        /**
         * <p>The full table name in the format of project_name.table_name.</p>
         * 
         * <strong>example:</strong>
         * <p>Train.a01_reanme_exception_data</p>
         */
        @NameInMap("ArchiveTableName")
        public String archiveTableName;

        /**
         * <p>The DDL statement for creating the archived table, which includes dataphin_quality_* system fields and the dataphin_quality_validate_date partition field definition.</p>
         * 
         * <strong>example:</strong>
         * <p>create table mfg_fin_cdm.a_shixin_b_exception_data\n         (  \n            dataphin_quality_tenant_id varchar(64) comment \&quot;Tenant ID\&quot;\n         , \n            dataphin_quality_rule_id varchar(64) comment \&quot;Quality rule ID\&quot;\n         , \n            dataphin_quality_rule_name string comment \&quot;Quality rule name\&quot;\n         , \n            dataphin_quality_column_name varchar(1024) comment \&quot;Validation field name\&quot;\n         , \n            dataphin_quality_watch_task_id varchar(128) comment \&quot;Monitored object task ID\&quot;\n         , \n            dataphin_quality_rule_task_id varchar(64) comment \&quot;Rule task ID\&quot;\n         , \n            dataphin_quality_validate_time varchar(64) comment \&quot;Quality validation time\&quot;\n         , \n            dataphin_quality_archive_mode varchar(32) comment \&quot;Anomaly archiving mode, ONLY_ERROR_FIELD/FULL_RECORD\&quot;\n         , \n            dataphin_quality_error_data string comment \&quot;Anomaly data\&quot;\n         , \n            执行依据文号 string comment \&quot;\&quot;\n         , \n            立案时间 string comment \&quot;\&quot;\n         , \n            案号 string comment \&quot;\&quot;\n         , \n            执行法院 string comment \&quot;\&quot;\n         , \n            性别 string comment \&quot;\&quot;\n         , \n            省份 string comment \&quot;\&quot;\n         , \n            被执行人的履行情况 string comment \&quot;\&quot;\n         , \n            发布时间 string comment \&quot;\&quot;\n         , \n            姓名 string comment \&quot;\&quot;\n         , \n            身份证号 string comment \&quot;\&quot;\n         , \n            失信被执行人行为具体情形 string comment \&quot;\&quot;\n         ) \n        partitioned by (dataphin_quality_validate_date string comment \&quot;Validation date (partition field)\&quot;)</p>
         */
        @NameInMap("Ddl")
        public String ddl;

        /**
         * <p>Indicates whether this is the active archived table. At least one active archived table must exist under the same monitored object.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The lifecycle in days. An empty value indicates no lifecycle is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Lifecycle")
        public Integer lifecycle;

        /**
         * <p>The maximum number of records to archive per validation. A value of -1 indicates full archiving.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxArchiveCount")
        public Long maxArchiveCount;

        public static ListQualityArchiveTablesResponseBodyDataArchiveTableList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityArchiveTablesResponseBodyDataArchiveTableList self = new ListQualityArchiveTablesResponseBodyDataArchiveTableList();
            return TeaModel.build(map, self);
        }

        public ListQualityArchiveTablesResponseBodyDataArchiveTableList setArchiveTableId(Long archiveTableId) {
            this.archiveTableId = archiveTableId;
            return this;
        }
        public Long getArchiveTableId() {
            return this.archiveTableId;
        }

        public ListQualityArchiveTablesResponseBodyDataArchiveTableList setArchiveTableName(String archiveTableName) {
            this.archiveTableName = archiveTableName;
            return this;
        }
        public String getArchiveTableName() {
            return this.archiveTableName;
        }

        public ListQualityArchiveTablesResponseBodyDataArchiveTableList setDdl(String ddl) {
            this.ddl = ddl;
            return this;
        }
        public String getDdl() {
            return this.ddl;
        }

        public ListQualityArchiveTablesResponseBodyDataArchiveTableList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListQualityArchiveTablesResponseBodyDataArchiveTableList setLifecycle(Integer lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        public ListQualityArchiveTablesResponseBodyDataArchiveTableList setMaxArchiveCount(Long maxArchiveCount) {
            this.maxArchiveCount = maxArchiveCount;
            return this;
        }
        public Long getMaxArchiveCount() {
            return this.maxArchiveCount;
        }

    }

    public static class ListQualityArchiveTablesResponseBodyData extends TeaModel {
        /**
         * <p>The list of anomaly archived tables.</p>
         */
        @NameInMap("ArchiveTableList")
        public java.util.List<ListQualityArchiveTablesResponseBodyDataArchiveTableList> archiveTableList;

        /**
         * <p>The number of custom anomaly archived tables.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityArchiveTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQualityArchiveTablesResponseBodyData self = new ListQualityArchiveTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQualityArchiveTablesResponseBodyData setArchiveTableList(java.util.List<ListQualityArchiveTablesResponseBodyDataArchiveTableList> archiveTableList) {
            this.archiveTableList = archiveTableList;
            return this;
        }
        public java.util.List<ListQualityArchiveTablesResponseBodyDataArchiveTableList> getArchiveTableList() {
            return this.archiveTableList;
        }

        public ListQualityArchiveTablesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
