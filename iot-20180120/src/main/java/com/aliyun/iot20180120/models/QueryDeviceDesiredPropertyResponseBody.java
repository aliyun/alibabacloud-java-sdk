// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDesiredPropertyResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned in the **List** parameter if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryDeviceDesiredPropertyResponseBodyData data;

    /**
     * <p>The error message that is returned if the call fails.</p>
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

    public static QueryDeviceDesiredPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDesiredPropertyResponseBody self = new QueryDeviceDesiredPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDesiredPropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDesiredPropertyResponseBody setData(QueryDeviceDesiredPropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDesiredPropertyResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceDesiredPropertyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDesiredPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDesiredPropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo extends TeaModel {
        /**
         * <p>The data type of the property.</p>
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
         * <p>The time when the desired value of the property was last modified. Unit: milliseconds.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The unit of the property.</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The desired value of the property.</p>
         * <br>
         * <p>>  If you call the [ClearDeviceDesiredProperty](~~477431~~) operation to delete the desired value of the property, the **Value** parameter is not returned.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The version of the desired value.</p>
         */
        @NameInMap("Version")
        public Long version;

        public static QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo self = new QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class QueryDeviceDesiredPropertyResponseBodyDataList extends TeaModel {
        @NameInMap("DesiredPropertyInfo")
        public java.util.List<QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo> desiredPropertyInfo;

        public static QueryDeviceDesiredPropertyResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseBodyDataList self = new QueryDeviceDesiredPropertyResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseBodyDataList setDesiredPropertyInfo(java.util.List<QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo> desiredPropertyInfo) {
            this.desiredPropertyInfo = desiredPropertyInfo;
            return this;
        }
        public java.util.List<QueryDeviceDesiredPropertyResponseBodyDataListDesiredPropertyInfo> getDesiredPropertyInfo() {
            return this.desiredPropertyInfo;
        }

    }

    public static class QueryDeviceDesiredPropertyResponseBodyData extends TeaModel {
        /**
         * <p>The desired property information returned in the **DesiredPropertyInfo** parameter.</p>
         */
        @NameInMap("List")
        public QueryDeviceDesiredPropertyResponseBodyDataList list;

        public static QueryDeviceDesiredPropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDesiredPropertyResponseBodyData self = new QueryDeviceDesiredPropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDesiredPropertyResponseBodyData setList(QueryDeviceDesiredPropertyResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceDesiredPropertyResponseBodyDataList getList() {
            return this.list;
        }

    }

}
