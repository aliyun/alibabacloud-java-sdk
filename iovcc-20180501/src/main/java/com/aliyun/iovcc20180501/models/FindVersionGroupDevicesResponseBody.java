// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionGroupDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupDeviceList")
    public FindVersionGroupDevicesResponseBodyGroupDeviceList groupDeviceList;

    public static FindVersionGroupDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindVersionGroupDevicesResponseBody self = new FindVersionGroupDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindVersionGroupDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindVersionGroupDevicesResponseBody setGroupDeviceList(FindVersionGroupDevicesResponseBodyGroupDeviceList groupDeviceList) {
        this.groupDeviceList = groupDeviceList;
        return this;
    }
    public FindVersionGroupDevicesResponseBodyGroupDeviceList getGroupDeviceList() {
        return this.groupDeviceList;
    }

    public static class FindVersionGroupDevicesResponseBodyGroupDeviceListItems extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("OriginalId")
        public String originalId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        public static FindVersionGroupDevicesResponseBodyGroupDeviceListItems build(java.util.Map<String, ?> map) throws Exception {
            FindVersionGroupDevicesResponseBodyGroupDeviceListItems self = new FindVersionGroupDevicesResponseBodyGroupDeviceListItems();
            return TeaModel.build(map, self);
        }

        public FindVersionGroupDevicesResponseBodyGroupDeviceListItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FindVersionGroupDevicesResponseBodyGroupDeviceListItems setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public FindVersionGroupDevicesResponseBodyGroupDeviceListItems setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public FindVersionGroupDevicesResponseBodyGroupDeviceListItems setOriginalId(String originalId) {
            this.originalId = originalId;
            return this;
        }
        public String getOriginalId() {
            return this.originalId;
        }

        public FindVersionGroupDevicesResponseBodyGroupDeviceListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindVersionGroupDevicesResponseBodyGroupDeviceListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

    }

    public static class FindVersionGroupDevicesResponseBodyGroupDeviceList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindVersionGroupDevicesResponseBodyGroupDeviceListItems> items;

        public static FindVersionGroupDevicesResponseBodyGroupDeviceList build(java.util.Map<String, ?> map) throws Exception {
            FindVersionGroupDevicesResponseBodyGroupDeviceList self = new FindVersionGroupDevicesResponseBodyGroupDeviceList();
            return TeaModel.build(map, self);
        }

        public FindVersionGroupDevicesResponseBodyGroupDeviceList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindVersionGroupDevicesResponseBodyGroupDeviceList setItems(java.util.List<FindVersionGroupDevicesResponseBodyGroupDeviceListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindVersionGroupDevicesResponseBodyGroupDeviceListItems> getItems() {
            return this.items;
        }

    }

}
