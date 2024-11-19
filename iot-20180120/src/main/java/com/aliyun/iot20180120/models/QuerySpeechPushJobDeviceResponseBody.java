// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobDeviceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.speechsolution.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySpeechPushJobDeviceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>speech solution has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>AF71BF1D-B552-47CD-B34B-352557627992</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySpeechPushJobDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobDeviceResponseBody self = new QuerySpeechPushJobDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechPushJobDeviceResponseBody setData(QuerySpeechPushJobDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechPushJobDeviceResponseBodyData getData() {
        return this.data;
    }

    public QuerySpeechPushJobDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechPushJobDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechPushJobDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySpeechPushJobDeviceResponseBodyDataListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>device storage limited</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>1620624606000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static QuerySpeechPushJobDeviceResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobDeviceResponseBodyDataListItems self = new QuerySpeechPushJobDeviceResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobDeviceResponseBodyDataListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QuerySpeechPushJobDeviceResponseBodyDataListItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QuerySpeechPushJobDeviceResponseBodyDataListItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QuerySpeechPushJobDeviceResponseBodyDataListItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QuerySpeechPushJobDeviceResponseBodyDataListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QuerySpeechPushJobDeviceResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySpeechPushJobDeviceResponseBodyDataListItems> items;

        public static QuerySpeechPushJobDeviceResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobDeviceResponseBodyDataList self = new QuerySpeechPushJobDeviceResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobDeviceResponseBodyDataList setItems(java.util.List<QuerySpeechPushJobDeviceResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechPushJobDeviceResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechPushJobDeviceResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySpeechPushJobDeviceResponseBodyDataList list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySpeechPushJobDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobDeviceResponseBodyData self = new QuerySpeechPushJobDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobDeviceResponseBodyData setList(QuerySpeechPushJobDeviceResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechPushJobDeviceResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySpeechPushJobDeviceResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechPushJobDeviceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechPushJobDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
