// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyDataResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.device.InvalidIoTId</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The property records returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryDeviceOriginalPropertyDataResponseBodyData data;

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

    public static QueryDeviceOriginalPropertyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyDataResponseBody self = new QueryDeviceOriginalPropertyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalPropertyDataResponseBody setData(QueryDeviceOriginalPropertyDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalPropertyDataResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceOriginalPropertyDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalPropertyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalPropertyDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo extends TeaModel {
        /**
         * <p>The time when the property was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1516541885630</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The value of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo self = new QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDeviceOriginalPropertyDataResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyInfo")
        public java.util.List<QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo> propertyInfo;

        public static QueryDeviceOriginalPropertyDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseBodyDataList self = new QueryDeviceOriginalPropertyDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseBodyDataList setPropertyInfo(java.util.List<QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo> propertyInfo) {
            this.propertyInfo = propertyInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalPropertyDataResponseBodyDataListPropertyInfo> getPropertyInfo() {
            return this.propertyInfo;
        }

    }

    public static class QueryDeviceOriginalPropertyDataResponseBodyData extends TeaModel {
        /**
         * <p>The properties. Each element indicates a property.</p>
         */
        @NameInMap("List")
        public QueryDeviceOriginalPropertyDataResponseBodyDataList list;

        /**
         * <p>Indicates whether the next page exists. </p>
         * <ul>
         * <li><strong>true</strong>: The next page exists.</li>
         * <li><strong>false</strong>: The next page does not exist.</li>
         * </ul>
         * <p>If <strong>true</strong> is returned for the <strong>NextValid</strong> parameter, you can add the value of the <strong>NextPageToken</strong> parameter to the next request. This way, you can query the data that is not included in the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NextValid")
        public Boolean nextValid;

        /**
         * <p>The token that is used to retrieve the next page of the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>Bo***x44Qx</p>
         */
        @NameInMap("nextPageToken")
        public String nextPageToken;

        public static QueryDeviceOriginalPropertyDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyDataResponseBodyData self = new QueryDeviceOriginalPropertyDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyDataResponseBodyData setList(QueryDeviceOriginalPropertyDataResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalPropertyDataResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDeviceOriginalPropertyDataResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceOriginalPropertyDataResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

    }

}
