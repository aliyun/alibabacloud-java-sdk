// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSubmitRecordsResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("ListResult")
    public ListSubmitRecordsResponseBodyListResult listResult;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSubmitRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubmitRecordsResponseBody self = new ListSubmitRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubmitRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubmitRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSubmitRecordsResponseBody setListResult(ListSubmitRecordsResponseBodyListResult listResult) {
        this.listResult = listResult;
        return this;
    }
    public ListSubmitRecordsResponseBodyListResult getListResult() {
        return this.listResult;
    }

    public ListSubmitRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubmitRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubmitRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSubmitRecordsResponseBodyListResultData extends TeaModel {
        /**
         * <p>The change type. Valid values:</p>
         * <ul>
         * <li>0: create</li>
         * <li>1: update</li>
         * <li>2: delete</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChangeType")
        public Integer changeType;

        /**
         * <p>The time when the record was created. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the record was updated. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>The ID of the pending publish record.</p>
         * 
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123456</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The ID of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The name of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>Object A</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li>MAX_COMPUTE_SQL: MaxCompute SQL node</li>
         * <li>MAX_COMPUTE_MR: MaxCompute MR node</li>
         * <li>SPARK_JAR_ON_MAX_COMPUTE: Spark JAR on MaxCompute node</li>
         * <li>SHELL: Shell node</li>
         * <li>PYTHON: Python node</li>
         * <li>PERL: Perl script</li>
         * <li>CHECK: Check node</li>
         * <li>DATA_X: Data synchronization node</li>
         * <li>VIRTUAL: Virtual node</li>
         * <li>IDE_RESOURCE: Resource</li>
         * <li>UDF: Function</li>
         * <li>HIVE_SQL: Hive SQL node</li>
         * <li>HADOOP_MR: Hadoop MR node</li>
         * <li>SPARK_JAR_ON_HIVE: Spark JAR on Hive node</li>
         * <li>FLINK_SQL: Flink SQL node</li>
         * <li>FLINK_TEMPLATE_SQL: Flink SQL template node</li>
         * <li>STREAM_TEMPLATE: Stream computing template</li>
         * <li>META_TABLE: Metatable</li>
         * <li>STREAM_UDF: Stream computing function</li>
         * <li>FLINK_DATASTREAM: Real-time Flink DataStream node</li>
         * <li>STREAM_CUSTOM_DATASOURCE: Real-time custom data source</li>
         * <li>ADB_FOR_PG: AnalyticDB for PostgreSQL node</li>
         * <li>INCEPTOR_SQL: Inceptor SQL node</li>
         * <li>MIRROR_TABLE: Mirror table</li>
         * <li>MIDDLE_TABLE: Intermediate table</li>
         * <li>APPLICATION_TABLE: Application table</li>
         * <li>IMPALA_SQL: Impala SQL node</li>
         * <li>OFFLINE_PIPELINE: Offline pipeline node</li>
         * <li>REAL_TIME_PIPELINE: Real-time pipeline node</li>
         * <li>DIM_LOGICAL_TABLE: Logical dimension table</li>
         * <li>FCT_LOGICAL_TABLE: Logical fact table</li>
         * <li>BIZ_CONDITION: Business filter</li>
         * <li>ATOM_INDEX: Atomic metric</li>
         * <li>DERIVED_INDEX: Derived metric</li>
         * <li>CALC_DERIVED_INDEX: Derivative metric</li>
         * <li>PAI_DESIGNER: PAI Designer node</li>
         * <li>ARGODB_SQL: ArgoDB SQL node</li>
         * <li>HOLOGRES_SQL: Hologres SQL node</li>
         * <li>IMPALA_SQL: Impala SQL node</li>
         * <li>STARROCKS_SQL: StarRocks SQL node</li>
         * <li>DATABASE_SQL: Database SQL node</li>
         * <li>SPARK_SQL: Spark SQL node</li>
         * <li>TASK_TEMPLATE: Task template</li>
         * <li>EXTERNAL_TRIGGER: External trigger node</li>
         * <li>GAUSS_SQL: Gauss SQL node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The version of the object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObjectVersion")
        public String objectVersion;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The submission comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Submission comment</p>
         */
        @NameInMap("SubmitComment")
        public String submitComment;

        /**
         * <p>The ID of the submitter.</p>
         * 
         * <strong>example:</strong>
         * <p>307999999</p>
         */
        @NameInMap("Submitter")
        public String submitter;

        /**
         * <p>The name of the submitter.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("SubmitterName")
        public String submitterName;

        public static ListSubmitRecordsResponseBodyListResultData build(java.util.Map<String, ?> map) throws Exception {
            ListSubmitRecordsResponseBodyListResultData self = new ListSubmitRecordsResponseBodyListResultData();
            return TeaModel.build(map, self);
        }

        public ListSubmitRecordsResponseBodyListResultData setChangeType(Integer changeType) {
            this.changeType = changeType;
            return this;
        }
        public Integer getChangeType() {
            return this.changeType;
        }

        public ListSubmitRecordsResponseBodyListResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSubmitRecordsResponseBodyListResultData setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public ListSubmitRecordsResponseBodyListResultData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubmitRecordsResponseBodyListResultData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListSubmitRecordsResponseBodyListResultData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListSubmitRecordsResponseBodyListResultData setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListSubmitRecordsResponseBodyListResultData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListSubmitRecordsResponseBodyListResultData setObjectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public String getObjectVersion() {
            return this.objectVersion;
        }

        public ListSubmitRecordsResponseBodyListResultData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListSubmitRecordsResponseBodyListResultData setSubmitComment(String submitComment) {
            this.submitComment = submitComment;
            return this;
        }
        public String getSubmitComment() {
            return this.submitComment;
        }

        public ListSubmitRecordsResponseBodyListResultData setSubmitter(String submitter) {
            this.submitter = submitter;
            return this;
        }
        public String getSubmitter() {
            return this.submitter;
        }

        public ListSubmitRecordsResponseBodyListResultData setSubmitterName(String submitterName) {
            this.submitterName = submitterName;
            return this;
        }
        public String getSubmitterName() {
            return this.submitterName;
        }

    }

    public static class ListSubmitRecordsResponseBodyListResult extends TeaModel {
        /**
         * <p>The list of pending publish records.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListSubmitRecordsResponseBodyListResultData> data;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSubmitRecordsResponseBodyListResult build(java.util.Map<String, ?> map) throws Exception {
            ListSubmitRecordsResponseBodyListResult self = new ListSubmitRecordsResponseBodyListResult();
            return TeaModel.build(map, self);
        }

        public ListSubmitRecordsResponseBodyListResult setData(java.util.List<ListSubmitRecordsResponseBodyListResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSubmitRecordsResponseBodyListResultData> getData() {
            return this.data;
        }

        public ListSubmitRecordsResponseBodyListResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
