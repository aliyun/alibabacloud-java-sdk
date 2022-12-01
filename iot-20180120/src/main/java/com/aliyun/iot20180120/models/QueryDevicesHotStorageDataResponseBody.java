// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicesHotStorageDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDevicesHotStorageDataResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicesHotStorageDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesHotStorageDataResponseBody self = new QueryDevicesHotStorageDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicesHotStorageDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicesHotStorageDataResponseBody setData(QueryDevicesHotStorageDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicesHotStorageDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicesHotStorageDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicesHotStorageDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicesHotStorageDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo self = new QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicesHotStorageDataResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyInfo")
        public java.util.List<QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo> propertyInfo;

        public static QueryDevicesHotStorageDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesHotStorageDataResponseBodyDataList self = new QueryDevicesHotStorageDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicesHotStorageDataResponseBodyDataList setPropertyInfo(java.util.List<QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDevicesHotStorageDataResponseBodyDataListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDevicesHotStorageDataResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryDevicesHotStorageDataResponseBodyDataList list;

        @NameInMap("NextValid")
        public Boolean nextValid;

        @NameInMap("nextPageToken")
        public String nextPageToken;

        public static QueryDevicesHotStorageDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesHotStorageDataResponseBodyData self = new QueryDevicesHotStorageDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicesHotStorageDataResponseBodyData setList(QueryDevicesHotStorageDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDevicesHotStorageDataResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDevicesHotStorageDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDevicesHotStorageDataResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

    }

}
