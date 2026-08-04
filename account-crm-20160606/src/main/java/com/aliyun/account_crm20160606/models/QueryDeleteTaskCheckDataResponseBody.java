// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryDeleteTaskCheckDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskCheckDataDtoList")
    public java.util.List<QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList> taskCheckDataDtoList;

    public static QueryDeleteTaskCheckDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeleteTaskCheckDataResponseBody self = new QueryDeleteTaskCheckDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeleteTaskCheckDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeleteTaskCheckDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDeleteTaskCheckDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeleteTaskCheckDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeleteTaskCheckDataResponseBody setTaskCheckDataDtoList(java.util.List<QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList> taskCheckDataDtoList) {
        this.taskCheckDataDtoList = taskCheckDataDtoList;
        return this;
    }
    public java.util.List<QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList> getTaskCheckDataDtoList() {
        return this.taskCheckDataDtoList;
    }

    public static class QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList extends TeaModel {
        @NameInMap("CheckerDesc")
        public String checkerDesc;

        @NameInMap("CheckerName")
        public String checkerName;

        @NameInMap("CheckerUniKey")
        public String checkerUniKey;

        @NameInMap("DependencyLevel")
        public String dependencyLevel;

        public static QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList self = new QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList();
            return TeaModel.build(map, self);
        }

        public QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList setCheckerDesc(String checkerDesc) {
            this.checkerDesc = checkerDesc;
            return this;
        }
        public String getCheckerDesc() {
            return this.checkerDesc;
        }

        public QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList setCheckerName(String checkerName) {
            this.checkerName = checkerName;
            return this;
        }
        public String getCheckerName() {
            return this.checkerName;
        }

        public QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList setCheckerUniKey(String checkerUniKey) {
            this.checkerUniKey = checkerUniKey;
            return this;
        }
        public String getCheckerUniKey() {
            return this.checkerUniKey;
        }

        public QueryDeleteTaskCheckDataResponseBodyTaskCheckDataDtoList setDependencyLevel(String dependencyLevel) {
            this.dependencyLevel = dependencyLevel;
            return this;
        }
        public String getDependencyLevel() {
            return this.dependencyLevel;
        }

    }

}
