// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The service call records returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryDeviceServiceDataResponseBodyData data;

    /**
     * <p>The error message that is returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. The ID uniquely identifies the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceServiceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceServiceDataResponseBody self = new QueryDeviceServiceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceServiceDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceServiceDataResponseBody setData(QueryDeviceServiceDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceServiceDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceServiceDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class QueryDeviceServiceDataResponseBodyDataListServiceInfo extends TeaModel {
        /**
         * <p>The identifier of the service.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The input parameter of the service. The value is a string in the MAP format. Syntax: `key:value`.</p>
         */
        @NameInMap("InputData")
        public String inputData;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output parameter of the service. The value is a string in the MAP format. Syntax: `key:value`.</p>
         */
        @NameInMap("OutputData")
        public String outputData;

        /**
         * <p>The time when the service was called.</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryDeviceServiceDataResponseBodyDataListServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseBodyDataListServiceInfo self = new QueryDeviceServiceDataResponseBodyDataListServiceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

        public QueryDeviceServiceDataResponseBodyDataListServiceInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
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
        /**
         * <p>The array of service call records. Each element represents a service call record.</p>
         */
        @NameInMap("List")
        public QueryDeviceServiceDataResponseBodyDataList list;

        /**
         * <p>The start time of service call records on the next page. </p>
         * <br>
         * <p>If you call the QueryDeviceServiceData operation to query the service call records on the next page, you must set the **StartTime** parameter to the value of this parameter.</p>
         */
        @NameInMap("NextTime")
        public Long nextTime;

        /**
         * <p>Indicates whether the next page exists.</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>If the return value of the **NextValid** parameter is **true**, you can use the value of the **NextTime** parameter as the value of the **StartTime** parameter when you query the next page of results.</p>
         */
        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDeviceServiceDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceServiceDataResponseBodyData self = new QueryDeviceServiceDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceServiceDataResponseBodyData setList(QueryDeviceServiceDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceServiceDataResponseBodyDataList getList() {
            return this.list;
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

    }

}
