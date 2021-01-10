// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryBatchRegisterDeviceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryBatchRegisterDeviceStatusResponseBodyData data;

    public static QueryBatchRegisterDeviceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegisterDeviceStatusResponseBody self = new QueryBatchRegisterDeviceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegisterDeviceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setData(QueryBatchRegisterDeviceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBatchRegisterDeviceStatusResponseBodyData getData() {
        return this.data;
    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyDataValidList extends TeaModel {
        @NameInMap("Name")
        public java.util.List<String> name;

        public static QueryBatchRegisterDeviceStatusResponseBodyDataValidList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyDataValidList self = new QueryBatchRegisterDeviceStatusResponseBodyDataValidList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataValidList setName(java.util.List<String> name) {
            this.name = name;
            return this;
        }
        public java.util.List<String> getName() {
            return this.name;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList extends TeaModel {
        @NameInMap("Name")
        public java.util.List<String> name;

        public static QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList self = new QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList setName(java.util.List<String> name) {
            this.name = name;
            return this;
        }
        public java.util.List<String> getName() {
            return this.name;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ValidList")
        public QueryBatchRegisterDeviceStatusResponseBodyDataValidList validList;

        @NameInMap("InvalidList")
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList invalidList;

        public static QueryBatchRegisterDeviceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyData self = new QueryBatchRegisterDeviceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setValidList(QueryBatchRegisterDeviceStatusResponseBodyDataValidList validList) {
            this.validList = validList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseBodyDataValidList getValidList() {
            return this.validList;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setInvalidList(QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList invalidList) {
            this.invalidList = invalidList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList getInvalidList() {
            return this.invalidList;
        }

    }

}
