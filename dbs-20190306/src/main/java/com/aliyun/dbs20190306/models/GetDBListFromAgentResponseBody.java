// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class GetDBListFromAgentResponseBody extends TeaModel {
    @NameInMap("DbList")
    public GetDBListFromAgentResponseBodyDbList dbList;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDBListFromAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDBListFromAgentResponseBody self = new GetDBListFromAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDBListFromAgentResponseBody setDbList(GetDBListFromAgentResponseBodyDbList dbList) {
        this.dbList = dbList;
        return this;
    }
    public GetDBListFromAgentResponseBodyDbList getDbList() {
        return this.dbList;
    }

    public GetDBListFromAgentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDBListFromAgentResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetDBListFromAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDBListFromAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDBListFromAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDBListFromAgentResponseBodyDbList extends TeaModel {
        @NameInMap("dbName")
        public java.util.List<String> dbName;

        public static GetDBListFromAgentResponseBodyDbList build(java.util.Map<String, ?> map) throws Exception {
            GetDBListFromAgentResponseBodyDbList self = new GetDBListFromAgentResponseBodyDbList();
            return TeaModel.build(map, self);
        }

        public GetDBListFromAgentResponseBodyDbList setDbName(java.util.List<String> dbName) {
            this.dbName = dbName;
            return this;
        }
        public java.util.List<String> getDbName() {
            return this.dbName;
        }

    }

}
