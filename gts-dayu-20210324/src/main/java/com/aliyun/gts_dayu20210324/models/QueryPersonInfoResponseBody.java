// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryPersonInfoResponseBody extends TeaModel {
    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // data
    @NameInMap("Data")
    public QueryPersonInfoResponseBodyData data;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // success
    @NameInMap("Success")
    public Boolean success;

    // exception
    @NameInMap("Exception")
    public java.util.Map<String, ?> exception;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryPersonInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPersonInfoResponseBody self = new QueryPersonInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPersonInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryPersonInfoResponseBody setData(QueryPersonInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPersonInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryPersonInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryPersonInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPersonInfoResponseBody setException(java.util.Map<String, ?> exception) {
        this.exception = exception;
        return this;
    }
    public java.util.Map<String, ?> getException() {
        return this.exception;
    }

    public QueryPersonInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPersonInfoResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("IsCompleted")
        public Boolean isCompleted;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("Name")
        public String name;

        @NameInMap("Sex")
        public Long sex;

        @NameInMap("Age")
        public Long age;

        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("Email")
        public String email;

        public static QueryPersonInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPersonInfoResponseBodyData self = new QueryPersonInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPersonInfoResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryPersonInfoResponseBodyData setIsCompleted(Boolean isCompleted) {
            this.isCompleted = isCompleted;
            return this;
        }
        public Boolean getIsCompleted() {
            return this.isCompleted;
        }

        public QueryPersonInfoResponseBodyData setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public QueryPersonInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPersonInfoResponseBodyData setSex(Long sex) {
            this.sex = sex;
            return this;
        }
        public Long getSex() {
            return this.sex;
        }

        public QueryPersonInfoResponseBodyData setAge(Long age) {
            this.age = age;
            return this;
        }
        public Long getAge() {
            return this.age;
        }

        public QueryPersonInfoResponseBodyData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public QueryPersonInfoResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

}
