// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDagsResponseBody extends TeaModel {
    /**
     * <p>The details of DAGs.</p>
     */
    @NameInMap("Data")
    public ListDagsResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7782a299-b291-4fee-8424-cf8058efa8e8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDagsResponseBody self = new ListDagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDagsResponseBody setData(ListDagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDagsResponseBodyData getData() {
        return this.data;
    }

    public ListDagsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDagsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDagsResponseBodyDataDags extends TeaModel {
        /**
         * <p>The data timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1736629400048545</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The DAG ID.</p>
         * 
         * <strong>example:</strong>
         * <p>351249682</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The actual running time.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("Gmtdate")
        public Long gmtdate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the DAG.</p>
         * 
         * <strong>example:</strong>
         * <p>test_dag</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sequence number of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("OpSeq")
        public Long opSeq;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112345</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the DAG. Valid values:</p>
         * <ul>
         * <li>CREATED</li>
         * <li>RUNNING</li>
         * <li>FAILURE</li>
         * <li>SUCCESS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILURE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the DAG. Valid values:</p>
         * <ul>
         * <li>MANUAL: DAG for a manually triggered workflow</li>
         * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
         * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
         * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL_FLOW</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDagsResponseBodyDataDags build(java.util.Map<String, ?> map) throws Exception {
            ListDagsResponseBodyDataDags self = new ListDagsResponseBodyDataDags();
            return TeaModel.build(map, self);
        }

        public ListDagsResponseBodyDataDags setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListDagsResponseBodyDataDags setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDagsResponseBodyDataDags setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDagsResponseBodyDataDags setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public ListDagsResponseBodyDataDags setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListDagsResponseBodyDataDags setGmtdate(Long gmtdate) {
            this.gmtdate = gmtdate;
            return this;
        }
        public Long getGmtdate() {
            return this.gmtdate;
        }

        public ListDagsResponseBodyDataDags setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListDagsResponseBodyDataDags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDagsResponseBodyDataDags setOpSeq(Long opSeq) {
            this.opSeq = opSeq;
            return this;
        }
        public Long getOpSeq() {
            return this.opSeq;
        }

        public ListDagsResponseBodyDataDags setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDagsResponseBodyDataDags setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListDagsResponseBodyDataDags setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDagsResponseBodyDataDags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDagsResponseBodyData extends TeaModel {
        /**
         * <p>The entities returned.</p>
         */
        @NameInMap("Dags")
        public java.util.List<ListDagsResponseBodyDataDags> dags;

        public static ListDagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDagsResponseBodyData self = new ListDagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDagsResponseBodyData setDags(java.util.List<ListDagsResponseBodyDataDags> dags) {
            this.dags = dags;
            return this;
        }
        public java.util.List<ListDagsResponseBodyDataDags> getDags() {
            return this.dags;
        }

    }

}
