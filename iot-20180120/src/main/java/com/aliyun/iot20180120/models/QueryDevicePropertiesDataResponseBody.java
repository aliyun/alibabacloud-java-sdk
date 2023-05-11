// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertiesDataResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The start time to query on the next page.</p>
     * <br>
     * <p>You can use the value of the **NextTime** parameter as the value of the **StartTime** parameter when you query the next page of results.</p>
     */
    @NameInMap("NextTime")
    public Long nextTime;

    /**
     * <p>Indicates whether the next page exists.</p>
     * <br>
     * <p>*   **true**: The next page exists.</p>
     * <p>*   **false**: The next page does not exist.</p>
     * <br>
     * <p>If the return value of the **NextValid** parameter is **true**, you can use the value of the **NextTime** parameter as the value of the **StartTime** parameter when you query the next page of results.</p>
     */
    @NameInMap("NextValid")
    public Boolean nextValid;

    /**
     * <p>The list of property records returned if the call is successful. For more information, see **PropertyDataInfo**.</p>
     */
    @NameInMap("PropertyDataInfos")
    public QueryDevicePropertiesDataResponseBodyPropertyDataInfos propertyDataInfos;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. </p>
     * <br>
     * <p>- **true**: The call was successful.</p>
     * <p>- **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePropertiesDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertiesDataResponseBody self = new QueryDevicePropertiesDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertiesDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertiesDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertiesDataResponseBody setNextTime(Long nextTime) {
        this.nextTime = nextTime;
        return this;
    }
    public Long getNextTime() {
        return this.nextTime;
    }

    public QueryDevicePropertiesDataResponseBody setNextValid(Boolean nextValid) {
        this.nextValid = nextValid;
        return this;
    }
    public Boolean getNextValid() {
        return this.nextValid;
    }

    public QueryDevicePropertiesDataResponseBody setPropertyDataInfos(QueryDevicePropertiesDataResponseBodyPropertyDataInfos propertyDataInfos) {
        this.propertyDataInfos = propertyDataInfos;
        return this;
    }
    public QueryDevicePropertiesDataResponseBodyPropertyDataInfos getPropertyDataInfos() {
        return this.propertyDataInfos;
    }

    public QueryDevicePropertiesDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertiesDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo extends TeaModel {
        /**
         * <p>The time when the property was submitted. The value is a timestamp in milliseconds, such as 1579249499000.</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The value of the property.</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo self = new QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList extends TeaModel {
        @NameInMap("PropertyInfo")
        public java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo> propertyInfo;

        public static QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList self = new QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList setPropertyInfo(java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo extends TeaModel {
        /**
         * <p>The identifier of the property.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The list of property records.</p>
         */
        @NameInMap("List")
        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList list;

        public static QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo self = new QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo setList(QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfoList getList() {
            return this.list;
        }

    }

    public static class QueryDevicePropertiesDataResponseBodyPropertyDataInfos extends TeaModel {
        @NameInMap("PropertyDataInfo")
        public java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo> propertyDataInfo;

        public static QueryDevicePropertiesDataResponseBodyPropertyDataInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertiesDataResponseBodyPropertyDataInfos self = new QueryDevicePropertiesDataResponseBodyPropertyDataInfos();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertiesDataResponseBodyPropertyDataInfos setPropertyDataInfo(java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo> propertyDataInfo) {
            this.propertyDataInfo = propertyDataInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertiesDataResponseBodyPropertyDataInfosPropertyDataInfo> getPropertyDataInfo() {
            return this.propertyDataInfo;
        }

    }

}
