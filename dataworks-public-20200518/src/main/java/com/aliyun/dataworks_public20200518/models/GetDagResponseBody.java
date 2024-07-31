// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDagResponseBody extends TeaModel {
    /**
     * <p>The details of the DAG.</p>
     */
    @NameInMap("Data")
    public GetDagResponseBodyData data;

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
     * <p>The request ID.</p>
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

    public static GetDagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDagResponseBody self = new GetDagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDagResponseBody setData(GetDagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDagResponseBodyData getData() {
        return this.data;
    }

    public GetDagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDagResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDagResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDagResponseBodyData extends TeaModel {
        /**
         * <p>The data timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The time when the DAG was created.</p>
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
         * <p>The time when the DAG finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The time when the DAG was scheduled to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("Gmtdate")
        public Long gmtdate;

        /**
         * <p>The time when the DAG was last modified.</p>
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
         * <p>The time when the DAG started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1605052800000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the DAG. Valid values: CREATED, RUNNING, FAILURE, and SUCCESS.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILURE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the DAG. Valid values: MANUAL, SMOKE_TEST, SUPPLY_DATA, and BUSINESS_PROCESS_DAG. The value MANUAL indicates the DAG for a manually triggered workflow. The value SMOKE_TEST indicates the DAG for a smoke testing workflow. The value SUPPLY_DATA indicates the DAG for a data backfill instance. The value BUSINESS_PROCESS_DAG indicates the DAG for a one-time workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL_FLOW</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDagResponseBodyData self = new GetDagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDagResponseBodyData setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetDagResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDagResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetDagResponseBodyData setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetDagResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetDagResponseBodyData setGmtdate(Long gmtdate) {
            this.gmtdate = gmtdate;
            return this;
        }
        public Long getGmtdate() {
            return this.gmtdate;
        }

        public GetDagResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetDagResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDagResponseBodyData setOpSeq(Long opSeq) {
            this.opSeq = opSeq;
            return this;
        }
        public Long getOpSeq() {
            return this.opSeq;
        }

        public GetDagResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDagResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetDagResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDagResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
