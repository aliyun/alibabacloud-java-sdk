// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoInnerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListQueryRaspAppInfoInnerResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListQueryRaspAppInfoInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueryRaspAppInfoInnerResponseBody self = new ListQueryRaspAppInfoInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueryRaspAppInfoInnerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQueryRaspAppInfoInnerResponseBody setData(java.util.List<ListQueryRaspAppInfoInnerResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListQueryRaspAppInfoInnerResponseBodyData> getData() {
        return this.data;
    }

    public ListQueryRaspAppInfoInnerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQueryRaspAppInfoInnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQueryRaspAppInfoInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueryRaspAppInfoInnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQueryRaspAppInfoInnerResponseBodyData extends TeaModel {
        @NameInMap("RaspAppName")
        public String raspAppName;

        @NameInMap("RaspOnlineStatus")
        public Integer raspOnlineStatus;

        @NameInMap("RaspStatus")
        public String raspStatus;

        @NameInMap("Result")
        public String result;

        @NameInMap("Uuid")
        public String uuid;

        public static ListQueryRaspAppInfoInnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQueryRaspAppInfoInnerResponseBodyData self = new ListQueryRaspAppInfoInnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQueryRaspAppInfoInnerResponseBodyData setRaspAppName(String raspAppName) {
            this.raspAppName = raspAppName;
            return this;
        }
        public String getRaspAppName() {
            return this.raspAppName;
        }

        public ListQueryRaspAppInfoInnerResponseBodyData setRaspOnlineStatus(Integer raspOnlineStatus) {
            this.raspOnlineStatus = raspOnlineStatus;
            return this;
        }
        public Integer getRaspOnlineStatus() {
            return this.raspOnlineStatus;
        }

        public ListQueryRaspAppInfoInnerResponseBodyData setRaspStatus(String raspStatus) {
            this.raspStatus = raspStatus;
            return this;
        }
        public String getRaspStatus() {
            return this.raspStatus;
        }

        public ListQueryRaspAppInfoInnerResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListQueryRaspAppInfoInnerResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
