// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataResponse extends TeaModel {
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
    public QueryDeviceServiceDataResponseData data;

    public static QueryDeviceServiceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceServiceDataResponse self = new QueryDeviceServiceDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceServiceDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceServiceDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceServiceDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceServiceDataResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceServiceDataResponse setData(QueryDeviceServiceDataResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceServiceDataResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceServiceDataResponseDataListServiceInfo extends TeaModel {
        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("InputData")
        @Validation(required = true)
        public String inputData;

        @NameInMap("OutputData")
        @Validation(required = true)
        public String outputData;

        public static QueryDeviceServiceDataResponseDataListServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseDataListServiceInfo self = new QueryDeviceServiceDataResponseDataListServiceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseDataListServiceInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceServiceDataResponseDataListServiceInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceServiceDataResponseDataListServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceServiceDataResponseDataListServiceInfo setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public QueryDeviceServiceDataResponseDataListServiceInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

    }

    public static class QueryDeviceServiceDataResponseDataList extends TeaModel {
        @NameInMap("ServiceInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceServiceDataResponseDataListServiceInfo> serviceInfo;

        public static QueryDeviceServiceDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseDataList self = new QueryDeviceServiceDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseDataList setServiceInfo(java.util.List<QueryDeviceServiceDataResponseDataListServiceInfo> serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceServiceDataResponseDataListServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

    }

    public static class QueryDeviceServiceDataResponseData extends TeaModel {
        @NameInMap("NextTime")
        @Validation(required = true)
        public Long nextTime;

        @NameInMap("NextValid")
        @Validation(required = true)
        public Boolean nextValid;

        @NameInMap("List")
        @Validation(required = true)
        public QueryDeviceServiceDataResponseDataList list;

        public static QueryDeviceServiceDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseData self = new QueryDeviceServiceDataResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDeviceServiceDataResponseData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceServiceDataResponseData setList(QueryDeviceServiceDataResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceServiceDataResponseDataList getList() {
            return this.list;
        }

    }

}
