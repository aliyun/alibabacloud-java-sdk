// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllAdminResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllAdminResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllAdminResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllAdminResponseBody self = new ListAllAdminResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllAdminResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllAdminResponseBody setData(java.util.List<ListAllAdminResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllAdminResponseBodyData> getData() {
        return this.data;
    }

    public ListAllAdminResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllAdminResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllAdminResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllAdminResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllAdminResponseBodyData extends TeaModel {
        @NameInMap("AdminId")
        public String adminId;

        @NameInMap("Name")
        public String name;

        public static ListAllAdminResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllAdminResponseBodyData self = new ListAllAdminResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllAdminResponseBodyData setAdminId(String adminId) {
            this.adminId = adminId;
            return this;
        }
        public String getAdminId() {
            return this.adminId;
        }

        public ListAllAdminResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
