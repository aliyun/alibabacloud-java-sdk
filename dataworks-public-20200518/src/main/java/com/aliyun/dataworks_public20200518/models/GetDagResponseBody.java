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
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
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
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The time at which the DAG was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The user who created the DAG.</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The ID of the DAG.</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The time at which the DAG finished running. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The time at which the DAG was scheduled to run.</p>
         */
        @NameInMap("Gmtdate")
        public Long gmtdate;

        /**
         * <p>The time at which the DAG was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the DAG.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The sequence number of the operation.</p>
         */
        @NameInMap("OpSeq")
        public Long opSeq;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The time at which the DAG started to run.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the DAG. Valid values: CREATED, RUNNING, FAILURE, and SUCCESS.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the DAG. Valid values: MANUAL, SMOKE_TEST, SUPPLY_DATA, and BUSINESS_PROCESS_DAG.</p>
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
