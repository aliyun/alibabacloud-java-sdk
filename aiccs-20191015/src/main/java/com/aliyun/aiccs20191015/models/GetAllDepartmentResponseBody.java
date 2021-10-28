// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAllDepartmentResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public java.util.List<GetAllDepartmentResponseBodyData> data;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static GetAllDepartmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllDepartmentResponseBody self = new GetAllDepartmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllDepartmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAllDepartmentResponseBody setData(java.util.List<GetAllDepartmentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAllDepartmentResponseBodyData> getData() {
        return this.data;
    }

    public GetAllDepartmentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAllDepartmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllDepartmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllDepartmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAllDepartmentResponseBodyData extends TeaModel {
        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("DepartmentName")
        public String departmentName;

        public static GetAllDepartmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAllDepartmentResponseBodyData self = new GetAllDepartmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAllDepartmentResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetAllDepartmentResponseBodyData setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

    }

}
