// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySpeechDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySpeechDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechDeviceResponseBody self = new QuerySpeechDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySpeechDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySpeechDeviceResponseBody setData(QuerySpeechDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySpeechDeviceResponseBodyData getData() {
        return this.data;
    }

    public QuerySpeechDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySpeechDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySpeechDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySpeechDeviceResponseBodyDataListItems extends TeaModel {
        @NameInMap("AvailableSpace")
        public Float availableSpace;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        public static QuerySpeechDeviceResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechDeviceResponseBodyDataListItems self = new QuerySpeechDeviceResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySpeechDeviceResponseBodyDataListItems setAvailableSpace(Float availableSpace) {
            this.availableSpace = availableSpace;
            return this;
        }
        public Float getAvailableSpace() {
            return this.availableSpace;
        }

        public QuerySpeechDeviceResponseBodyDataListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QuerySpeechDeviceResponseBodyDataListItems setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QuerySpeechDeviceResponseBodyDataListItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class QuerySpeechDeviceResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySpeechDeviceResponseBodyDataListItems> items;

        public static QuerySpeechDeviceResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechDeviceResponseBodyDataList self = new QuerySpeechDeviceResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySpeechDeviceResponseBodyDataList setItems(java.util.List<QuerySpeechDeviceResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySpeechDeviceResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySpeechDeviceResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySpeechDeviceResponseBodyDataList list;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QuerySpeechDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySpeechDeviceResponseBodyData self = new QuerySpeechDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySpeechDeviceResponseBodyData setList(QuerySpeechDeviceResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySpeechDeviceResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySpeechDeviceResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySpeechDeviceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySpeechDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
