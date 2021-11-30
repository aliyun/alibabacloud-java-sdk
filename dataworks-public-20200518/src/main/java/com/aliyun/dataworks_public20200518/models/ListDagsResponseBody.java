// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDagsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListDagsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DagId")
        public Long dagId;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("Gmtdate")
        public Long gmtdate;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OpSeq")
        public Long opSeq;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

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
