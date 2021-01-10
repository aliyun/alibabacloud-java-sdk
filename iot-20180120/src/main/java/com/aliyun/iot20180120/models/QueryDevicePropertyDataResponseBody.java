// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDevicePropertyDataResponseBodyData data;

    public static QueryDevicePropertyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyDataResponseBody self = new QueryDevicePropertyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertyDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePropertyDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertyDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertyDataResponseBody setData(QueryDevicePropertyDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePropertyDataResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDevicePropertyDataResponseBodyDataListPropertyInfo extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static QueryDevicePropertyDataResponseBodyDataListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseBodyDataListPropertyInfo self = new QueryDevicePropertyDataResponseBodyDataListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseBodyDataListPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDevicePropertyDataResponseBodyDataListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicePropertyDataResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyInfo")
        public java.util.List<QueryDevicePropertyDataResponseBodyDataListPropertyInfo> propertyInfo;

        public static QueryDevicePropertyDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseBodyDataList self = new QueryDevicePropertyDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseBodyDataList setPropertyInfo(java.util.List<QueryDevicePropertyDataResponseBodyDataListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertyDataResponseBodyDataListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDevicePropertyDataResponseBodyData extends TeaModel {
        @NameInMap("NextValid")
        public Boolean nextValid;

        @NameInMap("NextTime")
        public Long nextTime;

        @NameInMap("List")
        public QueryDevicePropertyDataResponseBodyDataList list;

        public static QueryDevicePropertyDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseBodyData self = new QueryDevicePropertyDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDevicePropertyDataResponseBodyData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDevicePropertyDataResponseBodyData setList(QueryDevicePropertyDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertyDataResponseBodyDataList getList() {
            return this.list;
        }

    }

}
