// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeDeviceListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceList")
    public java.util.List<DescribeDeviceListResponseBodyDeviceList> deviceList;

    public static DescribeDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceListResponseBody self = new DescribeDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceListResponseBody setDeviceList(java.util.List<DescribeDeviceListResponseBodyDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<DescribeDeviceListResponseBodyDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public static class DescribeDeviceListResponseBodyDeviceList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("MemoName")
        public String memoName;

        @NameInMap("IotId")
        public String iotId;

        public static DescribeDeviceListResponseBodyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceListResponseBodyDeviceList self = new DescribeDeviceListResponseBodyDeviceList();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceListResponseBodyDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeDeviceListResponseBodyDeviceList setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public DescribeDeviceListResponseBodyDeviceList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeDeviceListResponseBodyDeviceList setMemoName(String memoName) {
            this.memoName = memoName;
            return this;
        }
        public String getMemoName() {
            return this.memoName;
        }

        public DescribeDeviceListResponseBodyDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
