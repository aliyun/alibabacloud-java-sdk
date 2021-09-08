// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("DeviceInfoList")
    public DescribeDeviceInfoResponseBodyDeviceInfoList deviceInfoList;

    public static DescribeDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoResponseBody self = new DescribeDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeviceInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDeviceInfoResponseBody setDeviceInfoList(DescribeDeviceInfoResponseBodyDeviceInfoList deviceInfoList) {
        this.deviceInfoList = deviceInfoList;
        return this;
    }
    public DescribeDeviceInfoResponseBodyDeviceInfoList getDeviceInfoList() {
        return this.deviceInfoList;
    }

    public static class DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo extends TeaModel {
        @NameInMap("ExpiredDay")
        public String expiredDay;

        @NameInMap("UserDeviceId")
        public String userDeviceId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("BeginDay")
        public String beginDay;

        @NameInMap("BizType")
        public String bizType;

        public static DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo self = new DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo setExpiredDay(String expiredDay) {
            this.expiredDay = expiredDay;
            return this;
        }
        public String getExpiredDay() {
            return this.expiredDay;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo setUserDeviceId(String userDeviceId) {
            this.userDeviceId = userDeviceId;
            return this;
        }
        public String getUserDeviceId() {
            return this.userDeviceId;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo setBeginDay(String beginDay) {
            this.beginDay = beginDay;
            return this;
        }
        public String getBeginDay() {
            return this.beginDay;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

    public static class DescribeDeviceInfoResponseBodyDeviceInfoList extends TeaModel {
        @NameInMap("DeviceInfo")
        public java.util.List<DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo> deviceInfo;

        public static DescribeDeviceInfoResponseBodyDeviceInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceInfoResponseBodyDeviceInfoList self = new DescribeDeviceInfoResponseBodyDeviceInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceInfoResponseBodyDeviceInfoList setDeviceInfo(java.util.List<DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo> deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }
        public java.util.List<DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo> getDeviceInfo() {
            return this.deviceInfo;
        }

    }

}
