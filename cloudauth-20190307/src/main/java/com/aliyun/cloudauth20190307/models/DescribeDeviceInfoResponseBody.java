// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DeviceInfoList")
    public DescribeDeviceInfoResponseBodyDeviceInfoList deviceInfoList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public DescribeDeviceInfoResponseBody setDeviceInfoList(DescribeDeviceInfoResponseBodyDeviceInfoList deviceInfoList) {
        this.deviceInfoList = deviceInfoList;
        return this;
    }
    public DescribeDeviceInfoResponseBodyDeviceInfoList getDeviceInfoList() {
        return this.deviceInfoList;
    }

    public DescribeDeviceInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20180101</p>
         */
        @NameInMap("BeginDay")
        public String beginDay;

        /**
         * <strong>example:</strong>
         * <p>FACE_TEST</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>wd.6ziUffspAeW5FVYbaqmexR-1qwNjM</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>20180101</p>
         */
        @NameInMap("ExpiredDay")
        public String expiredDay;

        /**
         * <strong>example:</strong>
         * <p>3iJ1AY$oHcu7mC69</p>
         */
        @NameInMap("UserDeviceId")
        public String userDeviceId;

        public static DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo self = new DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo();
            return TeaModel.build(map, self);
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

        public DescribeDeviceInfoResponseBodyDeviceInfoListDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
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
