// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechDeviceResponse extends TeaModel {
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
    public QuerySpeechDeviceResponseData data;

    public static QuerySpeechDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechDeviceResponse self = new QuerySpeechDeviceResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySpeechDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechDeviceResponse setData(QuerySpeechDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechDeviceResponseData getData() {
        return this.data;
    }

    public static class QuerySpeechDeviceResponseDataListItems extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("AvailableSpace")
        @Validation(required = true)
        public Float availableSpace;

        public static QuerySpeechDeviceResponseDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechDeviceResponseDataListItems self = new QuerySpeechDeviceResponseDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechDeviceResponseDataListItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QuerySpeechDeviceResponseDataListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QuerySpeechDeviceResponseDataListItems setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QuerySpeechDeviceResponseDataListItems setAvailableSpace(Float availableSpace) {
            this.availableSpace = availableSpace;
            return this;
        }
        public Float getAvailableSpace() {
            return this.availableSpace;
        }

    }

    public static class QuerySpeechDeviceResponseDataList extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QuerySpeechDeviceResponseDataListItems> items;

        public static QuerySpeechDeviceResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechDeviceResponseDataList self = new QuerySpeechDeviceResponseDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechDeviceResponseDataList setItems(java.util.List<QuerySpeechDeviceResponseDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechDeviceResponseDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechDeviceResponseData extends TeaModel {
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
        public QuerySpeechDeviceResponseDataList list;

        public static QuerySpeechDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechDeviceResponseData self = new QuerySpeechDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechDeviceResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QuerySpeechDeviceResponseData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechDeviceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechDeviceResponseData setList(QuerySpeechDeviceResponseDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechDeviceResponseDataList getList() {
            return this.list;
        }

    }

}
