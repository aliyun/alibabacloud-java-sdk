// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionBlackDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceList")
    public FindVersionBlackDevicesResponseBodyDeviceList deviceList;

    public static FindVersionBlackDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindVersionBlackDevicesResponseBody self = new FindVersionBlackDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindVersionBlackDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindVersionBlackDevicesResponseBody setDeviceList(FindVersionBlackDevicesResponseBodyDeviceList deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public FindVersionBlackDevicesResponseBodyDeviceList getDeviceList() {
        return this.deviceList;
    }

    public static class FindVersionBlackDevicesResponseBodyDeviceListItems extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("OriginalId")
        public String originalId;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        public static FindVersionBlackDevicesResponseBodyDeviceListItems build(java.util.Map<String, ?> map) throws Exception {
            FindVersionBlackDevicesResponseBodyDeviceListItems self = new FindVersionBlackDevicesResponseBodyDeviceListItems();
            return TeaModel.build(map, self);
        }

        public FindVersionBlackDevicesResponseBodyDeviceListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindVersionBlackDevicesResponseBodyDeviceListItems setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public FindVersionBlackDevicesResponseBodyDeviceListItems setOriginalId(String originalId) {
            this.originalId = originalId;
            return this;
        }
        public String getOriginalId() {
            return this.originalId;
        }

        public FindVersionBlackDevicesResponseBodyDeviceListItems setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public FindVersionBlackDevicesResponseBodyDeviceListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindVersionBlackDevicesResponseBodyDeviceListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

    }

    public static class FindVersionBlackDevicesResponseBodyDeviceList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindVersionBlackDevicesResponseBodyDeviceListItems> items;

        public static FindVersionBlackDevicesResponseBodyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            FindVersionBlackDevicesResponseBodyDeviceList self = new FindVersionBlackDevicesResponseBodyDeviceList();
            return TeaModel.build(map, self);
        }

        public FindVersionBlackDevicesResponseBodyDeviceList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindVersionBlackDevicesResponseBodyDeviceList setItems(java.util.List<FindVersionBlackDevicesResponseBodyDeviceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindVersionBlackDevicesResponseBodyDeviceListItems> getItems() {
            return this.items;
        }

    }

}
