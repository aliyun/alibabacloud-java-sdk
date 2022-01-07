// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDevicePropertyStatusResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePropertyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyStatusResponseBody self = new QueryDevicePropertyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertyStatusResponseBody setData(QueryDevicePropertyStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePropertyStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePropertyStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertyStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("Time")
        public String time;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public String value;

        public static QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo self = new QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicePropertyStatusResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyStatusInfo")
        public java.util.List<QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo> propertyStatusInfo;

        public static QueryDevicePropertyStatusResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseBodyDataList self = new QueryDevicePropertyStatusResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseBodyDataList setPropertyStatusInfo(java.util.List<QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo> propertyStatusInfo) {
            this.propertyStatusInfo = propertyStatusInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo> getPropertyStatusInfo() {
            return this.propertyStatusInfo;
        }

    }

    public static class QueryDevicePropertyStatusResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryDevicePropertyStatusResponseBodyDataList list;

        public static QueryDevicePropertyStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseBodyData self = new QueryDevicePropertyStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseBodyData setList(QueryDevicePropertyStatusResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertyStatusResponseBodyDataList getList() {
            return this.list;
        }

    }

}
