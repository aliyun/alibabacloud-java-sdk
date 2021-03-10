// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceServiceDataResponseBodyData data;

    public static QueryDeviceServiceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceServiceDataResponseBody self = new QueryDeviceServiceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceServiceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceServiceDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceServiceDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceServiceDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceServiceDataResponseBody setData(QueryDeviceServiceDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceServiceDataResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceServiceDataResponseBodyDataListServiceInfo extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("InputData")
        public String inputData;

        @NameInMap("OutputData")
        public String outputData;

        public static QueryDeviceServiceDataResponseBodyDataListServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseBodyDataListServiceInfo self = new QueryDeviceServiceDataResponseBodyDataListServiceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

    }

    public static class QueryDeviceServiceDataResponseBodyDataList extends TeaModel {
        @NameInMap("ServiceInfo")
        public java.util.List<QueryDeviceServiceDataResponseBodyDataListServiceInfo> serviceInfo;

        public static QueryDeviceServiceDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseBodyDataList self = new QueryDeviceServiceDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseBodyDataList setServiceInfo(java.util.List<QueryDeviceServiceDataResponseBodyDataListServiceInfo> serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceServiceDataResponseBodyDataListServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

    }

    public static class QueryDeviceServiceDataResponseBodyData extends TeaModel {
        @NameInMap("NextTime")
        public Long nextTime;

        @NameInMap("NextValid")
        public Boolean nextValid;

        @NameInMap("List")
        public QueryDeviceServiceDataResponseBodyDataList list;

        public static QueryDeviceServiceDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseBodyData self = new QueryDeviceServiceDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseBodyData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDeviceServiceDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceServiceDataResponseBodyData setList(QueryDeviceServiceDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceServiceDataResponseBodyDataList getList() {
            return this.list;
        }

    }

}
