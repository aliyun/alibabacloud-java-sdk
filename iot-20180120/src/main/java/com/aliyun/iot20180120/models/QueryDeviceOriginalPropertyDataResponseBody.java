// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceOriginalPropertyDataResponseBodyData data;

    public static QueryDeviceOriginalPropertyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyDataResponseBody self = new QueryDeviceOriginalPropertyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalPropertyDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceOriginalPropertyDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalPropertyDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalPropertyDataResponseBody setData(QueryDeviceOriginalPropertyDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalPropertyDataResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo self = new QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDeviceOriginalPropertyDataResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyInfo")
        public java.util.List<QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo> propertyInfo;

        public static QueryDeviceOriginalPropertyDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseBodyDataList self = new QueryDeviceOriginalPropertyDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseBodyDataList setPropertyInfo(java.util.List<QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDeviceOriginalPropertyDataResponseBodyData extends TeaModel {
        @NameInMap("NextValid")
        public Boolean nextValid;

        @NameInMap("nextPageToken")
        public String nextPageToken;

        @NameInMap("List")
        public QueryDeviceOriginalPropertyDataResponseBodyDataList list;

        public static QueryDeviceOriginalPropertyDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseBodyData self = new QueryDeviceOriginalPropertyDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceOriginalPropertyDataResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalPropertyDataResponseBodyData setList(QueryDeviceOriginalPropertyDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalPropertyDataResponseBodyDataList getList() {
            return this.list;
        }

    }

}
