// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call succeeds. For more information, see the parameters of the List parameter.</p>
     */
    @NameInMap("Data")
    public QueryDeviceOriginalPropertyStatusResponseBodyData data;

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

    public static QueryDeviceOriginalPropertyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyStatusResponseBody self = new QueryDeviceOriginalPropertyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setData(QueryDeviceOriginalPropertyStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalPropertyStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalPropertyStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo extends TeaModel {
        /**
         * <p>The identifier of the property.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The time when the property was modified, in milliseconds.</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The value of the property.</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo self = new QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDeviceOriginalPropertyStatusResponseBodyDataList extends TeaModel {
        @NameInMap("PropertyStatusDataInfo")
        public java.util.List<QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo> propertyStatusDataInfo;

        public static QueryDeviceOriginalPropertyStatusResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseBodyDataList self = new QueryDeviceOriginalPropertyStatusResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyDataList setPropertyStatusDataInfo(java.util.List<QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo> propertyStatusDataInfo) {
            this.propertyStatusDataInfo = propertyStatusDataInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalPropertyStatusResponseBodyDataListPropertyStatusDataInfo> getPropertyStatusDataInfo() {
            return this.propertyStatusDataInfo;
        }

    }

    public static class QueryDeviceOriginalPropertyStatusResponseBodyData extends TeaModel {
        /**
         * <p>The array of property information. The information about each property is indicated by the **PropertyStatusInfo** parameter.</p>
         */
        @NameInMap("List")
        public QueryDeviceOriginalPropertyStatusResponseBodyDataList list;

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
         * <p>If the value ******true** is returned, you can add the value of the **NextPageToken** parameter**** to the next query. This allows you to query the data that is not returned by the current query.</p>
         */
        @NameInMap("NextValid")
        public Boolean nextValid;

        public static QueryDeviceOriginalPropertyStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseBodyData self = new QueryDeviceOriginalPropertyStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyData setList(QueryDeviceOriginalPropertyStatusResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalPropertyStatusResponseBodyDataList getList() {
            return this.list;
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalPropertyStatusResponseBodyData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

    }

}
