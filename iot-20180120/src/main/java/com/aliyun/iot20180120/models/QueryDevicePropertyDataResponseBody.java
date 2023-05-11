// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertyDataResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The property data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryDevicePropertyDataResponseBodyData data;

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
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePropertyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertyDataResponseBody self = new QueryDevicePropertyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertyDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePropertyDataResponseBody setData(QueryDevicePropertyDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePropertyDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePropertyDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePropertyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePropertyDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePropertyDataResponseBodyDataListPropertyInfo extends TeaModel {
        /**
         * <p>The time when the property was modified.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The value of the property.</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryDevicePropertyDataResponseBodyDataListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseBodyDataListPropertyInfo self = new QueryDevicePropertyDataResponseBodyDataListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseBodyDataListPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDevicePropertyDataResponseBodyDataListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDevicePropertyDataResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyInfo")
        public java.util.List<QueryDevicePropertyDataResponseBodyDataListPropertyInfo> propertyInfo;

        public static QueryDevicePropertyDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseBodyDataList self = new QueryDevicePropertyDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseBodyDataList setPropertyInfo(java.util.List<QueryDevicePropertyDataResponseBodyDataListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDevicePropertyDataResponseBodyDataListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDevicePropertyDataResponseBodyData extends TeaModel {
        /**
         * <p>The list of property records.</p>
         */
        @NameInMap("List")
        public QueryDevicePropertyDataResponseBodyDataList list;

        /**
         * <p>The start time of the property records on the next page. </p>
         * <br>
         * <p>- If the **Asc** parameter is set to **0**, you can specify this value for the **EndTime** parameter when you call this operation again to query the next page of property records.</p>
         * <p>- If the **Asc** parameter is set to **1**, you can specify this value for the **StartTime** parameter when you call this operation again to query the next page of property records.</p>
         */
        @NameInMap("NextTime")
        public Long nextTime;

        /**
         * <p>Indicates whether the next page exists.</p>
         * <br>
         * <p>*   **true**: The next page exists. If the return value of the NextValid parameter is true, the value of the **NextTime** parameter is returned. For more information, see the description of the **NextTime** parameter in this topic.</p>
         * <p>*   **false**: The next page does not exist.</p>
         */
        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDevicePropertyDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePropertyDataResponseBodyData self = new QueryDevicePropertyDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePropertyDataResponseBodyData setList(QueryDevicePropertyDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDevicePropertyDataResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDevicePropertyDataResponseBodyData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryDevicePropertyDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

    }

}
