// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDagResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetDagResponseBodyData data;

    public static GetDagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDagResponseBody self = new GetDagResponseBody();
        return TeaModel.build(map, self);
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

    public GetDagResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDagResponseBody setData(GetDagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDagResponseBodyData getData() {
        return this.data;
    }

    public static class GetDagResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("Gmtdate")
        public Long gmtdate;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("Name")
        public String name;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        public static GetDagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDagResponseBodyData self = new GetDagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDagResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDagResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDagResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetDagResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDagResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDagResponseBodyData setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetDagResponseBodyData setGmtdate(Long gmtdate) {
            this.gmtdate = gmtdate;
            return this;
        }
        public Long getGmtdate() {
            return this.gmtdate;
        }

        public GetDagResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetDagResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetDagResponseBodyData setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetDagResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDagResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

    }

}
