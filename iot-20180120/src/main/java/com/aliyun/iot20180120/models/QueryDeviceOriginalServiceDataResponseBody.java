// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalServiceDataResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.device.InvalidIoTId</p>
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
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeds.</p>
     * <ul>
     * <li>true: The call succeeded.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>Set</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The input parameter of the service. The value is a string in the MAP format. Syntax: key:value.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;LightAdjustLevel\&quot;:123}</p>
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
         * 
         * <strong>example:</strong>
         * <p>{\&quot;code\&quot;:200,\&quot;data\&quot;:{},\&quot;id\&quot;:\&quot;100686\&quot;,\&quot;message\&quot;:\&quot;success\&quot;,\&quot;version\&quot;:\&quot;1.0\&quot;}</p>
         */
        @NameInMap("OutputData")
        public String outputData;

        /**
         * <p>The time when the service was called.</p>
         * 
         * <strong>example:</strong>
         * <p>1579249499000</p>
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
         * <p>The array of service call records. Each element represents a service call record. For more information about the details of a service, see the parameters that belong to the <strong>ServiceInfo</strong> parameter.</p>
         */
        @NameInMap("List")
        public QueryDeviceOriginalServiceDataResponseBodyDataList list;

        /**
         * <p>The identifier of the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>Bo***x44Qx</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        /**
         * <p>Indicates whether the next page exists.</p>
         * <ul>
         * <li><strong>true</strong>: The next page exists.</li>
         * <li><strong>false</strong>: The next page does not exist.</li>
         * </ul>
         * <p>If the value <strong><strong><strong>true</strong> is returned, you can add the value of the <strong>NextPageToken</strong> parameter</strong></strong> to the next request. This allows you to query the data that is not included in the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
