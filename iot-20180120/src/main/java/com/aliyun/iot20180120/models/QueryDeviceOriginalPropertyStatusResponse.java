// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyStatusResponse extends TeaModel {
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
    public QueryDeviceOriginalPropertyStatusResponseData data;

    public static QueryDeviceOriginalPropertyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyStatusResponse self = new QueryDeviceOriginalPropertyStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceOriginalPropertyStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceOriginalPropertyStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceOriginalPropertyStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceOriginalPropertyStatusResponse setData(QueryDeviceOriginalPropertyStatusResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceOriginalPropertyStatusResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo extends TeaModel {
        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Time")
        @Validation(required = true)
        public Long time;

        public static QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo self = new QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class QueryDeviceOriginalPropertyStatusResponseDataList extends TeaModel {
        @NameInMap("PropertyStatusDataInfo")
        @Validation(required = true)
        public java.util.List<QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo> propertyStatusDataInfo;

        public static QueryDeviceOriginalPropertyStatusResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseDataList self = new QueryDeviceOriginalPropertyStatusResponseDataList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseDataList setPropertyStatusDataInfo(java.util.List<QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo> propertyStatusDataInfo) {
            this.propertyStatusDataInfo = propertyStatusDataInfo;
            return this;
        }
        public java.util.List<QueryDeviceOriginalPropertyStatusResponseDataListPropertyStatusDataInfo> getPropertyStatusDataInfo() {
            return this.propertyStatusDataInfo;
        }

    }

    public static class QueryDeviceOriginalPropertyStatusResponseData extends TeaModel {
        @NameInMap("NextValid")
        @Validation(required = true)
        public Boolean nextValid;

        @NameInMap("NextPageToken")
        @Validation(required = true)
        public String nextPageToken;

        @NameInMap("List")
        @Validation(required = true)
        public QueryDeviceOriginalPropertyStatusResponseDataList list;

        public static QueryDeviceOriginalPropertyStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceOriginalPropertyStatusResponseData self = new QueryDeviceOriginalPropertyStatusResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceOriginalPropertyStatusResponseData setNextValid(Boolean nextValid) {
            this.nextValid = nextValid;
            return this;
        }
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public QueryDeviceOriginalPropertyStatusResponseData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryDeviceOriginalPropertyStatusResponseData setList(QueryDeviceOriginalPropertyStatusResponseDataList list) {
            this.list = list;
            return this;
        }
        public QueryDeviceOriginalPropertyStatusResponseDataList getList() {
            return this.list;
        }

    }

}
