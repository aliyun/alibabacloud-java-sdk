// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProjectShareDeviceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryProjectShareDeviceListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryProjectShareDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectShareDeviceListResponseBody self = new QueryProjectShareDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectShareDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProjectShareDeviceListResponseBody setData(QueryProjectShareDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProjectShareDeviceListResponseBodyData getData() {
        return this.data;
    }

    public QueryProjectShareDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProjectShareDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectShareDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProjectShareDeviceListResponseBodyDataDeviceListItems extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Sharable")
        public Long sharable;

        public static QueryProjectShareDeviceListResponseBodyDataDeviceListItems build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectShareDeviceListResponseBodyDataDeviceListItems self = new QueryProjectShareDeviceListResponseBodyDataDeviceListItems();
            return TeaModel.build(map, self);
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceListItems setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceListItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceListItems setSharable(Long sharable) {
            this.sharable = sharable;
            return this;
        }
        public Long getSharable() {
            return this.sharable;
        }

    }

    public static class QueryProjectShareDeviceListResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("items")
        public java.util.List<QueryProjectShareDeviceListResponseBodyDataDeviceListItems> items;

        public static QueryProjectShareDeviceListResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectShareDeviceListResponseBodyDataDeviceList self = new QueryProjectShareDeviceListResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryProjectShareDeviceListResponseBodyDataDeviceList setItems(java.util.List<QueryProjectShareDeviceListResponseBodyDataDeviceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryProjectShareDeviceListResponseBodyDataDeviceListItems> getItems() {
            return this.items;
        }

    }

    public static class QueryProjectShareDeviceListResponseBodyData extends TeaModel {
        @NameInMap("DeviceList")
        public QueryProjectShareDeviceListResponseBodyDataDeviceList deviceList;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryProjectShareDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectShareDeviceListResponseBodyData self = new QueryProjectShareDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProjectShareDeviceListResponseBodyData setDeviceList(QueryProjectShareDeviceListResponseBodyDataDeviceList deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public QueryProjectShareDeviceListResponseBodyDataDeviceList getDeviceList() {
            return this.deviceList;
        }

        public QueryProjectShareDeviceListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QueryProjectShareDeviceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryProjectShareDeviceListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
