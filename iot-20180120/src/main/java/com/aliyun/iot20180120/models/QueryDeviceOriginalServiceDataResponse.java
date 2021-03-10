// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalServiceDataResponse extends TeaModel {
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
    public QueryDeviceOriginalServiceDataResponseData data;

    public static QueryDeviceOriginalServiceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalServiceDataResponse self = new QueryDeviceOriginalServiceDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalServiceDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalServiceDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceOriginalServiceDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalServiceDataResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalServiceDataResponse setData(QueryDeviceOriginalServiceDataResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalServiceDataResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceOriginalServiceDataResponseDataListServiceInfo extends TeaModel {
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

        public static QueryDeviceOriginalServiceDataResponseDataListServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseDataListServiceInfo self = new QueryDeviceOriginalServiceDataResponseDataListServiceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseDataListServiceInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceOriginalServiceDataResponseDataListServiceInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalServiceDataResponseDataListServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceOriginalServiceDataResponseDataListServiceInfo setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public QueryDeviceOriginalServiceDataResponseDataListServiceInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

    }

    public static class QueryDeviceOriginalServiceDataResponseDataList extends TeaModel {
        @NameInMap("ServiceInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceOriginalServiceDataResponseDataListServiceInfo> serviceInfo;

        public static QueryDeviceOriginalServiceDataResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseDataList self = new QueryDeviceOriginalServiceDataResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseDataList setServiceInfo(java.util.List<QueryDeviceOriginalServiceDataResponseDataListServiceInfo> serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalServiceDataResponseDataListServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

    }

    public static class QueryDeviceOriginalServiceDataResponseData extends TeaModel {
        @NameInMap("NextPageToken")
        @Validation(required = true)
        public String nextPageToken;

        @NameInMap("NextValid")
        @Validation(required = true)
        public Boolean nextValid;

        @NameInMap("List")
        @Validation(required = true)
        public QueryDeviceOriginalServiceDataResponseDataList list;

        public static QueryDeviceOriginalServiceDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseData self = new QueryDeviceOriginalServiceDataResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalServiceDataResponseData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceOriginalServiceDataResponseData setList(QueryDeviceOriginalServiceDataResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalServiceDataResponseDataList getList() {
            return this.list;
        }

    }

}
