// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyDataResponse extends TeaModel {
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
    public QueryDeviceOriginalPropertyDataResponseData data;

    public static QueryDeviceOriginalPropertyDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyDataResponse self = new QueryDeviceOriginalPropertyDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalPropertyDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceOriginalPropertyDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalPropertyDataResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalPropertyDataResponse setData(QueryDeviceOriginalPropertyDataResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalPropertyDataResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo extends TeaModel {
        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo self = new QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDeviceOriginalPropertyDataResponseDataList extends TeaModel {
        @NameInMap("PropertyInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo> propertyInfo;

        public static QueryDeviceOriginalPropertyDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseDataList self = new QueryDeviceOriginalPropertyDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseDataList setPropertyInfo(java.util.List<QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalPropertyDataResponseDataListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDeviceOriginalPropertyDataResponseData extends TeaModel {
        @NameInMap("NextValid")
        @Validation(required = true)
        public Boolean nextValid;

        @NameInMap("nextPageToken")
        @Validation(required = true)
        public String nextPageToken;

        @NameInMap("List")
        @Validation(required = true)
        public QueryDeviceOriginalPropertyDataResponseDataList list;

        public static QueryDeviceOriginalPropertyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseData self = new QueryDeviceOriginalPropertyDataResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceOriginalPropertyDataResponseData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalPropertyDataResponseData setList(QueryDeviceOriginalPropertyDataResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalPropertyDataResponseDataList getList() {
            return this.list;
        }

    }

}
