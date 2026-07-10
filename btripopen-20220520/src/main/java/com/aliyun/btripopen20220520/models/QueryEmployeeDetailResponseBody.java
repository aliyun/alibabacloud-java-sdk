// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryEmployeeDetailResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public QueryEmployeeDetailResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static QueryEmployeeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEmployeeDetailResponseBody self = new QueryEmployeeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEmployeeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEmployeeDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryEmployeeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryEmployeeDetailResponseBody setModule(QueryEmployeeDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryEmployeeDetailResponseBodyModule getModule() {
        return this.module;
    }

    public QueryEmployeeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEmployeeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEmployeeDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class QueryEmployeeDetailResponseBodyModule extends TeaModel {
        @NameInMap("email")
        public String email;

        @NameInMap("is_leave")
        public Boolean isLeave;

        @NameInMap("job_number")
        public String jobNumber;

        @NameInMap("nick_name")
        public String nickName;

        @NameInMap("out_dept_id")
        public String outDeptId;

        @NameInMap("out_dept_id_list")
        public java.util.List<String> outDeptIdList;

        @NameInMap("out_employee_id")
        public String outEmployeeId;

        @NameInMap("phone_no")
        public String phoneNo;

        @NameInMap("real_name")
        public String realName;

        @NameInMap("real_name_en")
        public String realNameEn;

        public static QueryEmployeeDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryEmployeeDetailResponseBodyModule self = new QueryEmployeeDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryEmployeeDetailResponseBodyModule setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryEmployeeDetailResponseBodyModule setIsLeave(Boolean isLeave) {
            this.isLeave = isLeave;
            return this;
        }
        public Boolean getIsLeave() {
            return this.isLeave;
        }

        public QueryEmployeeDetailResponseBodyModule setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public String getJobNumber() {
            return this.jobNumber;
        }

        public QueryEmployeeDetailResponseBodyModule setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryEmployeeDetailResponseBodyModule setOutDeptId(String outDeptId) {
            this.outDeptId = outDeptId;
            return this;
        }
        public String getOutDeptId() {
            return this.outDeptId;
        }

        public QueryEmployeeDetailResponseBodyModule setOutDeptIdList(java.util.List<String> outDeptIdList) {
            this.outDeptIdList = outDeptIdList;
            return this;
        }
        public java.util.List<String> getOutDeptIdList() {
            return this.outDeptIdList;
        }

        public QueryEmployeeDetailResponseBodyModule setOutEmployeeId(String outEmployeeId) {
            this.outEmployeeId = outEmployeeId;
            return this;
        }
        public String getOutEmployeeId() {
            return this.outEmployeeId;
        }

        public QueryEmployeeDetailResponseBodyModule setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public QueryEmployeeDetailResponseBodyModule setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public QueryEmployeeDetailResponseBodyModule setRealNameEn(String realNameEn) {
            this.realNameEn = realNameEn;
            return this;
        }
        public String getRealNameEn() {
            return this.realNameEn;
        }

    }

}
