// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobDeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QuerySpeechPushJobDeviceResponseData data;

    public static QuerySpeechPushJobDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobDeviceResponse self = new QuerySpeechPushJobDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechPushJobDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySpeechPushJobDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechPushJobDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechPushJobDeviceResponse setData(QuerySpeechPushJobDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechPushJobDeviceResponseData getData() {
        return this.data;
    }

    public static class QuerySpeechPushJobDeviceResponseDataListItems extends TeaModel {
        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        public static QuerySpeechPushJobDeviceResponseDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobDeviceResponseDataListItems self = new QuerySpeechPushJobDeviceResponseDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobDeviceResponseDataListItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QuerySpeechPushJobDeviceResponseDataListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QuerySpeechPushJobDeviceResponseDataListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QuerySpeechPushJobDeviceResponseDataListItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QuerySpeechPushJobDeviceResponseDataListItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class QuerySpeechPushJobDeviceResponseDataList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QuerySpeechPushJobDeviceResponseDataListItems> items;

        public static QuerySpeechPushJobDeviceResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobDeviceResponseDataList self = new QuerySpeechPushJobDeviceResponseDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobDeviceResponseDataList setItems(java.util.List<QuerySpeechPushJobDeviceResponseDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechPushJobDeviceResponseDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechPushJobDeviceResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageId")
        @Validation(required = true)
        public Integer pageId;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("List")
        @Validation(required = true)
        public QuerySpeechPushJobDeviceResponseDataList list;

        public static QuerySpeechPushJobDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechPushJobDeviceResponseData self = new QuerySpeechPushJobDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechPushJobDeviceResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySpeechPushJobDeviceResponseData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechPushJobDeviceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechPushJobDeviceResponseData setList(QuerySpeechPushJobDeviceResponseDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechPushJobDeviceResponseDataList getList() {
            return this.list;
        }

    }

}
