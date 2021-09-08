// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDesiredPropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceDesiredPropertyResponseBodyData data;

    public static QueryDeviceDesiredPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDesiredPropertyResponseBody self = new QueryDeviceDesiredPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDesiredPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDesiredPropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceDesiredPropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDesiredPropertyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDesiredPropertyResponseBody setData(QueryDeviceDesiredPropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDesiredPropertyResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo extends TeaModel {
        @NameInMap("Unit")
        public String unit;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        @NameInMap("Version")
        public Long version;

        public static QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo self = new QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class QueryDeviceDesiredPropertyResponseBodyDataList extends TeaModel {
        @NameInMap("DesiredPropertyInfo")
        public java.util.List<QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo> desiredPropertyInfo;

        public static QueryDeviceDesiredPropertyResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseBodyDataList self = new QueryDeviceDesiredPropertyResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseBodyDataList setDesiredPropertyInfo(java.util.List<QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo> desiredPropertyInfo) {
            this.desiredPropertyInfo = desiredPropertyInfo;
            return this;
        }
        public java.util.List<QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo> getDesiredPropertyInfo() {
            return this.desiredPropertyInfo;
        }

    }

    public static class QueryDeviceDesiredPropertyResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QueryDeviceDesiredPropertyResponseBodyDataList list;

        public static QueryDeviceDesiredPropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseBodyData self = new QueryDeviceDesiredPropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseBodyData setList(QueryDeviceDesiredPropertyResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceDesiredPropertyResponseBodyDataList getList() {
            return this.list;
        }

    }

}
