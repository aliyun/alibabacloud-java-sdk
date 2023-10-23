// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryBatchStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryBatchStatusResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBatchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchStatusResponseBody self = new QueryBatchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBatchStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBatchStatusResponseBody setData(QueryBatchStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBatchStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryBatchStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryBatchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBatchStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBatchStatusResponseBodyDataInvalidDetailList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static QueryBatchStatusResponseBodyDataInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchStatusResponseBodyDataInvalidDetailList self = new QueryBatchStatusResponseBodyDataInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public QueryBatchStatusResponseBodyDataInvalidDetailList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryBatchStatusResponseBodyDataInvalidDetailList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class QueryBatchStatusResponseBodyData extends TeaModel {
        @NameInMap("InvalidDetailList")
        public java.util.List<QueryBatchStatusResponseBodyDataInvalidDetailList> invalidDetailList;

        @NameInMap("InvalidList")
        public java.util.List<String> invalidList;

        @NameInMap("Status")
        public String status;

        @NameInMap("ValidList")
        public java.util.List<String> validList;

        public static QueryBatchStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchStatusResponseBodyData self = new QueryBatchStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBatchStatusResponseBodyData setInvalidDetailList(java.util.List<QueryBatchStatusResponseBodyDataInvalidDetailList> invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public java.util.List<QueryBatchStatusResponseBodyDataInvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public QueryBatchStatusResponseBodyData setInvalidList(java.util.List<String> invalidList) {
            this.invalidList = invalidList;
            return this;
        }
        public java.util.List<String> getInvalidList() {
            return this.invalidList;
        }

        public QueryBatchStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBatchStatusResponseBodyData setValidList(java.util.List<String> validList) {
            this.validList = validList;
            return this;
        }
        public java.util.List<String> getValidList() {
            return this.validList;
        }

    }

}
