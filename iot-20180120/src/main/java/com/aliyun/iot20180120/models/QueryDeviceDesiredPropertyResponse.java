// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDesiredPropertyResponse extends TeaModel {
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
    public QueryDeviceDesiredPropertyResponseData data;

    public static QueryDeviceDesiredPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDesiredPropertyResponse self = new QueryDeviceDesiredPropertyResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDesiredPropertyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDesiredPropertyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceDesiredPropertyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDesiredPropertyResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDesiredPropertyResponse setData(QueryDeviceDesiredPropertyResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDesiredPropertyResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo extends TeaModel {
        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("DataType")
        @Validation(required = true)
        public String dataType;

        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Version")
        @Validation(required = true)
        public Long version;

        public static QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo self = new QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class QueryDeviceDesiredPropertyResponseDataList extends TeaModel {
        @NameInMap("DesiredPropertyInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo> desiredPropertyInfo;

        public static QueryDeviceDesiredPropertyResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseDataList self = new QueryDeviceDesiredPropertyResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseDataList setDesiredPropertyInfo(java.util.List<QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo> desiredPropertyInfo) {
            this.desiredPropertyInfo = desiredPropertyInfo;
            return this;
        }
        public java.util.List<QueryDeviceDesiredPropertyResponseDataListDesiredPropertyInfo> getDesiredPropertyInfo() {
            return this.desiredPropertyInfo;
        }

    }

    public static class QueryDeviceDesiredPropertyResponseData extends TeaModel {
        @NameInMap("List")
        @Validation(required = true)
        public QueryDeviceDesiredPropertyResponseDataList list;

        public static QueryDeviceDesiredPropertyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseData self = new QueryDeviceDesiredPropertyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseData setList(QueryDeviceDesiredPropertyResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceDesiredPropertyResponseDataList getList() {
            return this.list;
        }

    }

}
