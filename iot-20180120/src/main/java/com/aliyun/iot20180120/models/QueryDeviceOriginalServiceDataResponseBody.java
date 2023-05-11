// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalServiceDataResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The service call records returned if the call succeeds.</p>
     */
    @NameInMap("Data")
    public QueryDeviceOriginalServiceDataResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeds.</p>
     * <br>
     * <p>*   true: The call succeeded.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceOriginalServiceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalServiceDataResponseBody self = new QueryDeviceOriginalServiceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalServiceDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalServiceDataResponseBody setData(QueryDeviceOriginalServiceDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalServiceDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceOriginalServiceDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalServiceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalServiceDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo extends TeaModel {
        /**
         * <p>The identifier of the service.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The input parameter of the service. The value is a string in the MAP format. Syntax: key:value.</p>
         */
        @NameInMap("InputData")
        public String inputData;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output parameter of the service. The value is a string in the MAP format. Syntax: key:value.</p>
         */
        @NameInMap("OutputData")
        public String outputData;

        /**
         * <p>The time when the service was called.</p>
         */
        @NameInMap("Time")
        public String time;

        public static QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo self = new QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setInputData(String inputData) {
            this.inputData = inputData;
            return this;
        }
        public String getInputData() {
            return this.inputData;
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setOutputData(String outputData) {
            this.outputData = outputData;
            return this;
        }
        public String getOutputData() {
            return this.outputData;
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryDeviceOriginalServiceDataResponseBodyDataList extends TeaModel {
        @NameInMap("ServiceInfo")
        public java.util.List<QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo> serviceInfo;

        public static QueryDeviceOriginalServiceDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseBodyDataList self = new QueryDeviceOriginalServiceDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseBodyDataList setServiceInfo(java.util.List<QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo> serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalServiceDataResponseBodyDataListServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

    }

    public static class QueryDeviceOriginalServiceDataResponseBodyData extends TeaModel {
        /**
         * <p>The array of service call records. Each element represents a service call record. For more information about the details of a service, see the parameters that belong to the **ServiceInfo** parameter.</p>
         */
        @NameInMap("List")
        public QueryDeviceOriginalServiceDataResponseBodyDataList list;

        /**
         * <p>The identifier of the next page.</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        /**
         * <p>Indicates whether the next page exists.</p>
         * <br>
         * <p>*   **true**: The next page exists.</p>
         * <p>*   **false**: The next page does not exist.</p>
         * <br>
         * <p>If the value ******true** is returned, you can add the value of the **NextPageToken** parameter**** to the next request. This allows you to query the data that is not included in the current query.</p>
         */
        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDeviceOriginalServiceDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalServiceDataResponseBodyData self = new QueryDeviceOriginalServiceDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalServiceDataResponseBodyData setList(QueryDeviceOriginalServiceDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalServiceDataResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDeviceOriginalServiceDataResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalServiceDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

    }

}
