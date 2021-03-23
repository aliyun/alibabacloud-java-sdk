// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionWhiteDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceList")
    public FindVersionWhiteDevicesResponseBodyDeviceList deviceList;

    public static FindVersionWhiteDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindVersionWhiteDevicesResponseBody self = new FindVersionWhiteDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindVersionWhiteDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindVersionWhiteDevicesResponseBody setDeviceList(FindVersionWhiteDevicesResponseBodyDeviceList deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public FindVersionWhiteDevicesResponseBodyDeviceList getDeviceList() {
        return this.deviceList;
    }

    public static class FindVersionWhiteDevicesResponseBodyDeviceListItems extends TeaModel {
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

        public static FindVersionWhiteDevicesResponseBodyDeviceListItems build(java.util.Map<String, ?> map) throws Exception {
            FindVersionWhiteDevicesResponseBodyDeviceListItems self = new FindVersionWhiteDevicesResponseBodyDeviceListItems();
            return TeaModel.build(map, self);
        }

        public FindVersionWhiteDevicesResponseBodyDeviceListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindVersionWhiteDevicesResponseBodyDeviceListItems setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public FindVersionWhiteDevicesResponseBodyDeviceListItems setOriginalId(String originalId) {
            this.originalId = originalId;
            return this;
        }
        public String getOriginalId() {
            return this.originalId;
        }

        public FindVersionWhiteDevicesResponseBodyDeviceListItems setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public FindVersionWhiteDevicesResponseBodyDeviceListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindVersionWhiteDevicesResponseBodyDeviceListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

    }

    public static class FindVersionWhiteDevicesResponseBodyDeviceList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindVersionWhiteDevicesResponseBodyDeviceListItems> items;

        public static FindVersionWhiteDevicesResponseBodyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            FindVersionWhiteDevicesResponseBodyDeviceList self = new FindVersionWhiteDevicesResponseBodyDeviceList();
            return TeaModel.build(map, self);
        }

        public FindVersionWhiteDevicesResponseBodyDeviceList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindVersionWhiteDevicesResponseBodyDeviceList setItems(java.util.List<FindVersionWhiteDevicesResponseBodyDeviceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindVersionWhiteDevicesResponseBodyDeviceListItems> getItems() {
            return this.items;
        }

    }

}
