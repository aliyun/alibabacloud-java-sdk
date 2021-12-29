// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllSystemContractResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAllSystemContractResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAllSystemContractResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllSystemContractResponseBody self = new ListAllSystemContractResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllSystemContractResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllSystemContractResponseBody setData(java.util.List<ListAllSystemContractResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllSystemContractResponseBodyData> getData() {
        return this.data;
    }

    public ListAllSystemContractResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAllSystemContractResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllSystemContractResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllSystemContractResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAllSystemContractResponseBodyData extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("SystemContractId")
        public String systemContractId;

        public static ListAllSystemContractResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllSystemContractResponseBodyData self = new ListAllSystemContractResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllSystemContractResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAllSystemContractResponseBodyData setSystemContractId(String systemContractId) {
            this.systemContractId = systemContractId;
            return this;
        }
        public String getSystemContractId() {
            return this.systemContractId;
        }

    }

}
