// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDesiredPropertyResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned in the <strong>List</strong> parameter if the call is successful.</p>
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
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
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
         * 
         * <strong>example:</strong>
         * <p>int</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The identifier of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>Temperature</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The name of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>airconditioning</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the desired value of the property was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579335899000</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The unit of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>℃</p>
         */
        @NameInMap("Unit")
        public String unit;

        /**
         * <p>The desired value of the property.</p>
         * <blockquote>
         * <p> If you call the <a href="https://help.aliyun.com/document_detail/477431.html">ClearDeviceDesiredProperty</a> operation to delete the desired value of the property, the <strong>Value</strong> parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The version of the desired value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The desired property information returned in the <strong>DesiredPropertyInfo</strong> parameter.</p>
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
