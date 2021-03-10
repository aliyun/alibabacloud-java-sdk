// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyDataResponse extends TeaModel {
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
    public QueryDevicePropertyDataResponseData data;

    public static QueryDevicePropertyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyDataResponse self = new QueryDevicePropertyDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertyDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePropertyDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertyDataResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertyDataResponse setData(QueryDevicePropertyDataResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePropertyDataResponseData getData() {
        return this.data;
    }

    public static class QueryDevicePropertyDataResponseDataListPropertyInfo extends TeaModel {
        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static QueryDevicePropertyDataResponseDataListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseDataListPropertyInfo self = new QueryDevicePropertyDataResponseDataListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseDataListPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDevicePropertyDataResponseDataListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicePropertyDataResponseDataList extends TeaModel {
        @NameInMap("PropertyInfo")
        @Validation(required = true)
        public java.util.List<QueryDevicePropertyDataResponseDataListPropertyInfo> propertyInfo;

        public static QueryDevicePropertyDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseDataList self = new QueryDevicePropertyDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseDataList setPropertyInfo(java.util.List<QueryDevicePropertyDataResponseDataListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertyDataResponseDataListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDevicePropertyDataResponseData extends TeaModel {
        @NameInMap("NextValid")
        @Validation(required = true)
        public Boolean nextValid;

        @NameInMap("NextTime")
        @Validation(required = true)
        public Long nextTime;

        @NameInMap("List")
        @Validation(required = true)
        public QueryDevicePropertyDataResponseDataList list;

        public static QueryDevicePropertyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseData self = new QueryDevicePropertyDataResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDevicePropertyDataResponseData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDevicePropertyDataResponseData setList(QueryDevicePropertyDataResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertyDataResponseDataList getList() {
            return this.list;
        }

    }

}
