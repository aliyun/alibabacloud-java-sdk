// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyStatusResponse extends TeaModel {
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
    public QueryDevicePropertyStatusResponseData data;

    public static QueryDevicePropertyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyStatusResponse self = new QueryDevicePropertyStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertyStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePropertyStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertyStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertyStatusResponse setData(QueryDevicePropertyStatusResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePropertyStatusResponseData getData() {
        return this.data;
    }

    public static class QueryDevicePropertyStatusResponseDataListPropertyStatusInfo extends TeaModel {
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

        public static QueryDevicePropertyStatusResponseDataListPropertyStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseDataListPropertyStatusInfo self = new QueryDevicePropertyStatusResponseDataListPropertyStatusInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseDataListPropertyStatusInfo setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryDevicePropertyStatusResponseDataListPropertyStatusInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDevicePropertyStatusResponseDataListPropertyStatusInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDevicePropertyStatusResponseDataListPropertyStatusInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDevicePropertyStatusResponseDataListPropertyStatusInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryDevicePropertyStatusResponseDataListPropertyStatusInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryDevicePropertyStatusResponseDataList extends TeaModel {
        @NameInMap("PropertyStatusInfo")
        @Validation(required = true)
        public java.util.List<QueryDevicePropertyStatusResponseDataListPropertyStatusInfo> propertyStatusInfo;

        public static QueryDevicePropertyStatusResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseDataList self = new QueryDevicePropertyStatusResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseDataList setPropertyStatusInfo(java.util.List<QueryDevicePropertyStatusResponseDataListPropertyStatusInfo> propertyStatusInfo) {
            this.propertyStatusInfo = propertyStatusInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertyStatusResponseDataListPropertyStatusInfo> getPropertyStatusInfo() {
            return this.propertyStatusInfo;
        }

    }

    public static class QueryDevicePropertyStatusResponseData extends TeaModel {
        @NameInMap("List")
        @Validation(required = true)
        public QueryDevicePropertyStatusResponseDataList list;

        public static QueryDevicePropertyStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseData self = new QueryDevicePropertyStatusResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseData setList(QueryDevicePropertyStatusResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertyStatusResponseDataList getList() {
            return this.list;
        }

    }

}
