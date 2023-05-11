// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call succeeds. For more information, see **List**.</p>
     */
    @NameInMap("Data")
    public QueryDevicePropertyStatusResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePropertyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyStatusResponseBody self = new QueryDevicePropertyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertyStatusResponseBody setData(QueryDevicePropertyStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePropertyStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePropertyStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertyStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo extends TeaModel {
        /**
         * <p>The data type of the property. Valid values:</p>
         * <br>
         * <p>*   **int**: integer</p>
         * <p>*   **float**: single-precision floating-point number</p>
         * <p>*   **double**: double-precision floating-point number</p>
         * <p>*   **enum**: enumeration</p>
         * <p>*   **bool**: Boolean</p>
         * <p>*   **text**: character</p>
         * <p>*   **date**: time (string-type UTC timestamp in milliseconds)</p>
         * <p>*   **array**: array</p>
         * <p>*   **struct**: structure</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The identifier of the property.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The name of the property.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the property was modified, in milliseconds.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The unit of the property value.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The value of the property.</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo self = new QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicePropertyStatusResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyStatusInfo")
        public java.util.List<QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo> propertyStatusInfo;

        public static QueryDevicePropertyStatusResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseBodyDataList self = new QueryDevicePropertyStatusResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseBodyDataList setPropertyStatusInfo(java.util.List<QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo> propertyStatusInfo) {
            this.propertyStatusInfo = propertyStatusInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertyStatusResponseBodyDataListPropertyStatusInfo> getPropertyStatusInfo() {
            return this.propertyStatusInfo;
        }

    }

    public static class QueryDevicePropertyStatusResponseBodyData extends TeaModel {
        /**
         * <p>The array of property information. The information about each property is indicated by the **PropertyStatusInfo** parameter.</p>
         */
        @NameInMap("List")
        public QueryDevicePropertyStatusResponseBodyDataList list;

        public static QueryDevicePropertyStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyStatusResponseBodyData self = new QueryDevicePropertyStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyStatusResponseBodyData setList(QueryDevicePropertyStatusResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertyStatusResponseBodyDataList getList() {
            return this.list;
        }

    }

}
