// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceOriginalPropertyStatusResponseBodyData data;

    public static QueryDeviceOriginalPropertyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyStatusResponseBody self = new QueryDeviceOriginalPropertyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setData(QueryDeviceOriginalPropertyStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalPropertyStatusResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo extends TeaModel {
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Value")
        public String value;

        @NameInMap("Time")
        public Long time;

        public static QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo self = new QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class QueryDeviceOriginalPropertyStatusResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyStatusDataInfo")
        public java.util.List<QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo> propertyStatusDataInfo;

        public static QueryDeviceOriginalPropertyStatusResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseBodyDataList self = new QueryDeviceOriginalPropertyStatusResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyDataList setPropertyStatusDataInfo(java.util.List<QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo> propertyStatusDataInfo) {
            this.propertyStatusDataInfo = propertyStatusDataInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo> getPropertyStatusDataInfo() {
            return this.propertyStatusDataInfo;
        }

    }

    public static class QueryDeviceOriginalPropertyStatusResponseBodyData extends TeaModel {
        @NameInMap("NextValid")
        public Boolean nextValid;

        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("List")
        public QueryDeviceOriginalPropertyStatusResponseBodyDataList list;

        public static QueryDeviceOriginalPropertyStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseBodyData self = new QueryDeviceOriginalPropertyStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyData setList(QueryDeviceOriginalPropertyStatusResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalPropertyStatusResponseBodyDataList getList() {
            return this.list;
        }

    }

}
