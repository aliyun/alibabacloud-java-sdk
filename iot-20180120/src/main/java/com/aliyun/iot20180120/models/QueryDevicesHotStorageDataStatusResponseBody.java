// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicesHotStorageDataStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDevicesHotStorageDataStatusResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicesHotStorageDataStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesHotStorageDataStatusResponseBody self = new QueryDevicesHotStorageDataStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicesHotStorageDataStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicesHotStorageDataStatusResponseBody setData(QueryDevicesHotStorageDataStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicesHotStorageDataStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicesHotStorageDataStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicesHotStorageDataStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicesHotStorageDataStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo extends TeaModel {
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Value")
        public String value;

        public static QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo self = new QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicesHotStorageDataStatusResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyStatusDataInfo")
        public java.util.List<QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo> propertyStatusDataInfo;

        public static QueryDevicesHotStorageDataStatusResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesHotStorageDataStatusResponseBodyDataList self = new QueryDevicesHotStorageDataStatusResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicesHotStorageDataStatusResponseBodyDataList setPropertyStatusDataInfo(java.util.List<QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo> propertyStatusDataInfo) {
            this.propertyStatusDataInfo = propertyStatusDataInfo;
            return this;
        }
        public java.util.List<QueryDevicesHotStorageDataStatusResponseBodyDataListPropertyStatusDataInfo> getPropertyStatusDataInfo() {
            return this.propertyStatusDataInfo;
        }

    }

    public static class QueryDevicesHotStorageDataStatusResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryDevicesHotStorageDataStatusResponseBodyDataList list;

        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDevicesHotStorageDataStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicesHotStorageDataStatusResponseBodyData self = new QueryDevicesHotStorageDataStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicesHotStorageDataStatusResponseBodyData setList(QueryDevicesHotStorageDataStatusResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDevicesHotStorageDataStatusResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDevicesHotStorageDataStatusResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDevicesHotStorageDataStatusResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

    }

}
