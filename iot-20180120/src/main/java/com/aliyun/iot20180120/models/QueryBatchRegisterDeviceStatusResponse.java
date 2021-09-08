// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryBatchRegisterDeviceStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryBatchRegisterDeviceStatusResponseData data;

    public static QueryBatchRegisterDeviceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegisterDeviceStatusResponse self = new QueryBatchRegisterDeviceStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegisterDeviceStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBatchRegisterDeviceStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBatchRegisterDeviceStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBatchRegisterDeviceStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryBatchRegisterDeviceStatusResponse setData(QueryBatchRegisterDeviceStatusResponseData data) {
        this.data = data;
        return this;
    }
    public QueryBatchRegisterDeviceStatusResponseData getData() {
        return this.data;
    }

    public static class QueryBatchRegisterDeviceStatusResponseDataValidList extends TeaModel {
        // Name
        @NameInMap("Name")
        @Validation(required = true)
        public java.util.List<String> name;

        public static QueryBatchRegisterDeviceStatusResponseDataValidList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseDataValidList self = new QueryBatchRegisterDeviceStatusResponseDataValidList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseDataValidList setName(java.util.List<String> name) {
            this.name = name;
            return this;
        }
        public java.util.List<String> getName() {
            return this.name;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseDataInvalidList extends TeaModel {
        // Name
        @NameInMap("Name")
        @Validation(required = true)
        public java.util.List<String> name;

        public static QueryBatchRegisterDeviceStatusResponseDataInvalidList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseDataInvalidList self = new QueryBatchRegisterDeviceStatusResponseDataInvalidList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseDataInvalidList setName(java.util.List<String> name) {
            this.name = name;
            return this;
        }
        public java.util.List<String> getName() {
            return this.name;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseData extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ValidList")
        @Validation(required = true)
        public QueryBatchRegisterDeviceStatusResponseDataValidList validList;

        @NameInMap("InvalidList")
        @Validation(required = true)
        public QueryBatchRegisterDeviceStatusResponseDataInvalidList invalidList;

        public static QueryBatchRegisterDeviceStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseData self = new QueryBatchRegisterDeviceStatusResponseData();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBatchRegisterDeviceStatusResponseData setValidList(QueryBatchRegisterDeviceStatusResponseDataValidList validList) {
            this.validList = validList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseDataValidList getValidList() {
            return this.validList;
        }

        public QueryBatchRegisterDeviceStatusResponseData setInvalidList(QueryBatchRegisterDeviceStatusResponseDataInvalidList invalidList) {
            this.invalidList = invalidList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseDataInvalidList getInvalidList() {
            return this.invalidList;
        }

    }

}
