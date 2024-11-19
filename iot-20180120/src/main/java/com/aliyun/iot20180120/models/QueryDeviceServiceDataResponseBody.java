// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
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
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>Set</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The input parameter of the service. The value is a string in the MAP format. Syntax: <code>key:value</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;LightAdjustLevel\&quot;:123}</p>
         */
        @NameInMap("InputData")
        public String inputData;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output parameter of the service. The value is a string in the MAP format. Syntax: <code>key:value</code>.</p>
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
         * <p>If you call the QueryDeviceServiceData operation to query the service call records on the next page, you must set the <strong>StartTime</strong> parameter to the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1579335899000</p>
         */
        @NameInMap("NextTime")
        public Long nextTime;

        /**
         * <p>Indicates whether the next page exists.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>If the return value of the <strong>NextValid</strong> parameter is <strong>true</strong>, you can use the value of the <strong>NextTime</strong> parameter as the value of the <strong>StartTime</strong> parameter when you query the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
