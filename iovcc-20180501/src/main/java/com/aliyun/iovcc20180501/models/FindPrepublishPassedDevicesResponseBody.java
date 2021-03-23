// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishPassedDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceList")
    public FindPrepublishPassedDevicesResponseBodyDeviceList deviceList;

    public static FindPrepublishPassedDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishPassedDevicesResponseBody self = new FindPrepublishPassedDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindPrepublishPassedDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindPrepublishPassedDevicesResponseBody setDeviceList(FindPrepublishPassedDevicesResponseBodyDeviceList deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public FindPrepublishPassedDevicesResponseBodyDeviceList getDeviceList() {
        return this.deviceList;
    }

    public static class FindPrepublishPassedDevicesResponseBodyDeviceListItems extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        public static FindPrepublishPassedDevicesResponseBodyDeviceListItems build(java.util.Map<String, ?> map) throws Exception {
            FindPrepublishPassedDevicesResponseBodyDeviceListItems self = new FindPrepublishPassedDevicesResponseBodyDeviceListItems();
            return TeaModel.build(map, self);
        }

        public FindPrepublishPassedDevicesResponseBodyDeviceListItems setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public FindPrepublishPassedDevicesResponseBodyDeviceListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindPrepublishPassedDevicesResponseBodyDeviceListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

    }

    public static class FindPrepublishPassedDevicesResponseBodyDeviceList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindPrepublishPassedDevicesResponseBodyDeviceListItems> items;

        public static FindPrepublishPassedDevicesResponseBodyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            FindPrepublishPassedDevicesResponseBodyDeviceList self = new FindPrepublishPassedDevicesResponseBodyDeviceList();
            return TeaModel.build(map, self);
        }

        public FindPrepublishPassedDevicesResponseBodyDeviceList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindPrepublishPassedDevicesResponseBodyDeviceList setItems(java.util.List<FindPrepublishPassedDevicesResponseBodyDeviceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindPrepublishPassedDevicesResponseBodyDeviceListItems> getItems() {
            return this.items;
        }

    }

}
