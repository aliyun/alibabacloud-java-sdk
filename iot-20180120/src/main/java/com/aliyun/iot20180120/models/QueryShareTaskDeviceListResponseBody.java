// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryShareTaskDeviceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryShareTaskDeviceListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryShareTaskDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryShareTaskDeviceListResponseBody self = new QueryShareTaskDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryShareTaskDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryShareTaskDeviceListResponseBody setData(QueryShareTaskDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryShareTaskDeviceListResponseBodyData getData() {
        return this.data;
    }

    public QueryShareTaskDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryShareTaskDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryShareTaskDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryShareTaskDeviceListResponseBodyDataDeviceListItems extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("GmtAdded")
        public Long gmtAdded;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        public static QueryShareTaskDeviceListResponseBodyDataDeviceListItems build(java.util.Map<String, ?> map) throws Exception {
            QueryShareTaskDeviceListResponseBodyDataDeviceListItems self = new QueryShareTaskDeviceListResponseBodyDataDeviceListItems();
            return TeaModel.build(map, self);
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceListItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceListItems setGmtAdded(Long gmtAdded) {
            this.gmtAdded = gmtAdded;
            return this;
        }
        public Long getGmtAdded() {
            return this.gmtAdded;
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceListItems setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceListItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class QueryShareTaskDeviceListResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("items")
        public java.util.List<QueryShareTaskDeviceListResponseBodyDataDeviceListItems> items;

        public static QueryShareTaskDeviceListResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryShareTaskDeviceListResponseBodyDataDeviceList self = new QueryShareTaskDeviceListResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryShareTaskDeviceListResponseBodyDataDeviceList setItems(java.util.List<QueryShareTaskDeviceListResponseBodyDataDeviceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryShareTaskDeviceListResponseBodyDataDeviceListItems> getItems() {
            return this.items;
        }

    }

    public static class QueryShareTaskDeviceListResponseBodyData extends TeaModel {
        @NameInMap("DeviceList")
        public QueryShareTaskDeviceListResponseBodyDataDeviceList deviceList;

        @NameInMap("PageId")
        public Integer pageId;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryShareTaskDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryShareTaskDeviceListResponseBodyData self = new QueryShareTaskDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryShareTaskDeviceListResponseBodyData setDeviceList(QueryShareTaskDeviceListResponseBodyDataDeviceList deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public QueryShareTaskDeviceListResponseBodyDataDeviceList getDeviceList() {
            return this.deviceList;
        }

        public QueryShareTaskDeviceListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QueryShareTaskDeviceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryShareTaskDeviceListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
