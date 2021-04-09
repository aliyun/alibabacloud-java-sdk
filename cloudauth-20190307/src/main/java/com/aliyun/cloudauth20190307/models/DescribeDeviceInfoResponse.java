// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("DeviceInfoList")
    @Validation(required = true)
    public DescribeDeviceInfoResponseDeviceInfoList deviceInfoList;

    public static DescribeDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoResponse self = new DescribeDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceInfoResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeviceInfoResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDeviceInfoResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDeviceInfoResponse setDeviceInfoList(DescribeDeviceInfoResponseDeviceInfoList deviceInfoList) {
        this.deviceInfoList = deviceInfoList;
        return this;
    }
    public DescribeDeviceInfoResponseDeviceInfoList getDeviceInfoList() {
        return this.deviceInfoList;
    }

    public static class DescribeDeviceInfoResponseDeviceInfoListDeviceInfo extends TeaModel {
        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("UserDeviceId")
        @Validation(required = true)
        public String userDeviceId;

        @NameInMap("BizType")
        @Validation(required = true)
        public String bizType;

        @NameInMap("BeginDay")
        @Validation(required = true)
        public String beginDay;

        @NameInMap("ExpiredDay")
        @Validation(required = true)
        public String expiredDay;

        public static DescribeDeviceInfoResponseDeviceInfoListDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceInfoResponseDeviceInfoListDeviceInfo self = new DescribeDeviceInfoResponseDeviceInfoListDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceInfoResponseDeviceInfoListDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDeviceInfoResponseDeviceInfoListDeviceInfo setUserDeviceId(String userDeviceId) {
            this.userDeviceId = userDeviceId;
            return this;
        }
        public String getUserDeviceId() {
            return this.userDeviceId;
        }

        public DescribeDeviceInfoResponseDeviceInfoListDeviceInfo setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeDeviceInfoResponseDeviceInfoListDeviceInfo setBeginDay(String beginDay) {
            this.beginDay = beginDay;
            return this;
        }
        public String getBeginDay() {
            return this.beginDay;
        }

        public DescribeDeviceInfoResponseDeviceInfoListDeviceInfo setExpiredDay(String expiredDay) {
            this.expiredDay = expiredDay;
            return this;
        }
        public String getExpiredDay() {
            return this.expiredDay;
        }

    }

    public static class DescribeDeviceInfoResponseDeviceInfoList extends TeaModel {
        @NameInMap("DeviceInfo")
        @Validation(required = true)
        public java.util.List<DescribeDeviceInfoResponseDeviceInfoListDeviceInfo> deviceInfo;

        public static DescribeDeviceInfoResponseDeviceInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceInfoResponseDeviceInfoList self = new DescribeDeviceInfoResponseDeviceInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceInfoResponseDeviceInfoList setDeviceInfo(java.util.List<DescribeDeviceInfoResponseDeviceInfoListDeviceInfo> deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }
        public java.util.List<DescribeDeviceInfoResponseDeviceInfoListDeviceInfo> getDeviceInfo() {
            return this.deviceInfo;
        }

    }

}
