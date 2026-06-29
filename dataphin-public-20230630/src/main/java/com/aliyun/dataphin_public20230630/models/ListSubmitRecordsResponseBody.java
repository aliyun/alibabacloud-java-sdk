// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSubmitRecordsResponseBody extends TeaModel {
    /**
     * <p>Error code. OK indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Query result.</p>
     */
    @NameInMap("ListResult")
    public ListSubmitRecordsResponseBodyListResult listResult;

    /**
     * <p>Error message.</p>
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
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the request is successful.</p>
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
         * <p>Change type. 0: Create / 1: Update / 2: Delete.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChangeType")
        public Integer changeType;

        /**
         * <p>Creation time in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtModify")
        public String gmtModify;

        /**
         * <p>Pending deployment record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_123456</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>Object name.</p>
         * 
         * <strong>example:</strong>
         * <p>对象A</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>Object type. Valid values:</p>
         * <ul>
         * <li>MaxCompute SQL task: MAX_COMPUTE_SQL</li>
         * <li>MaxCompute MR task: MAX_COMPUTE_MR</li>
         * <li>Spark JAR on MaxCompute: SPARK_JAR_ON_MAX_COMPUTE</li>
         * <li>Shell task: SHELL</li>
         * <li>Python task: PYTHON</li>
         * <li>Perl script: PERL</li>
         * <li>Check: CHECK</li>
         * <li>Sync task: DATA_X</li>
         * <li>Virtual node: VIRTUAL</li>
         * <li>Resource: IDE_RESOURCE</li>
         * <li>Function: UDF</li>
         * <li>Hive SQL task: HIVE_SQL</li>
         * <li>Hadoop MR task: HADOOP_MR</li>
         * <li>Spark JAR on Hive task: SPARK_JAR_ON_HIVE</li>
         * <li>Flink SQL task: FLINK_SQL</li>
         * <li>Flink SQL template task: FLINK_TEMPLATE_SQL</li>
         * <li>Stream computing template: STREAM_TEMPLATE</li>
         * <li>Metatable: META_TABLE</li>
         * <li>Stream computing function: STREAM_UDF</li>
         * <li>Real-time Flink DataStream: FLINK_DATASTREAM</li>
         * <li>Real-time custom data source: STREAM_CUSTOM_DATASOURCE</li>
         * <li>AnalyticDB for PostgreSQL task: ADB_FOR_PG</li>
         * <li>TDH SQL task: INCEPTOR_SQL</li>
         * <li>Mirror table: MIRROR_TABLE</li>
         * <li>Intermediate table: MIDDLE_TABLE</li>
         * <li>Application table: APPLICATION_TABLE</li>
         * <li>Impala SQL task: IMPALA_SQL</li>
         * <li>Offline pipeline task: OFFLINE_PIPELINE</li>
         * <li>Real-time pipeline task: REAL_TIME_PIPELINE</li>
         * <li>Dimension logical table: DIM_LOGICAL_TABLE</li>
         * <li>Fact logical table: FCT_LOGICAL_TABLE</li>
         * <li>Business condition: BIZ_CONDITION</li>
         * <li>Atomic metric: ATOM_INDEX</li>
         * <li>Derived metric: DERIVED_INDEX</li>
         * <li>Calculated derived metric: CALC_DERIVED_INDEX</li>
         * <li>PAI task: PAI_DESIGNER</li>
         * <li>ArgoDB SQL task: ARGODB_SQL</li>
         * <li>Hologres SQL task: HOLOGRES_SQL</li>
         * <li>Impala SQL task: IMPALA_SQL</li>
         * <li>StarRocks SQL task: STARROCKS_SQL</li>
         * <li>Database SQL task: DATABASE_SQL</li>
         * <li>Spark SQL task: SPARK_SQL</li>
         * <li>Compute template: TASK_TEMPLATE</li>
         * <li>External trigger node: EXTERNAL_TRIGGER</li>
         * <li>Gauss SQL task: GAUSS_SQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>Object version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObjectVersion")
        public String objectVersion;

        /**
         * <p>Project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1241844456</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>Submission comment.</p>
         * 
         * <strong>example:</strong>
         * <p>提交信息</p>
         */
        @NameInMap("SubmitComment")
        public String submitComment;

        /**
         * <p>Submitter ID.</p>
         * 
         * <strong>example:</strong>
         * <p>307999999</p>
         */
        @NameInMap("Submitter")
        public String submitter;

        /**
         * <p>Submitter name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
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
         * <p>List of pending deployment records.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListSubmitRecordsResponseBodyListResultData> data;

        /**
         * <p>Total count.</p>
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
