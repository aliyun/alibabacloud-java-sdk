// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryBatchRegisterDeviceStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryBatchRegisterDeviceStatusResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBatchRegisterDeviceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegisterDeviceStatusResponseBody self = new QueryBatchRegisterDeviceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegisterDeviceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setData(QueryBatchRegisterDeviceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBatchRegisterDeviceStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("NickName")
        public String nickName;

        public static QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList self = new QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList extends TeaModel {
        @NameInMap("invalidDetailList")
        public java.util.List<QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList;

        public static QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList self = new QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList setInvalidDetailList(java.util.List<QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public java.util.List<QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
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

    public static class QueryBatchRegisterDeviceStatusResponseBodyData extends TeaModel {
        @NameInMap("InvalidDetailList")
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList invalidDetailList;

        @NameInMap("InvalidList")
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList invalidList;

        @NameInMap("Status")
        public String status;

        @NameInMap("ValidList")
        public QueryBatchRegisterDeviceStatusResponseBodyDataValidList validList;

        public static QueryBatchRegisterDeviceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyData self = new QueryBatchRegisterDeviceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setInvalidDetailList(QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setInvalidList(QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList invalidList) {
            this.invalidList = invalidList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList getInvalidList() {
            return this.invalidList;
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

    }

}
