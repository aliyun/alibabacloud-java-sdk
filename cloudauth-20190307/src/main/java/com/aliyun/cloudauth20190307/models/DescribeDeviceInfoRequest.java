// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("UserDeviceId")
    public String userDeviceId;

    @NameInMap("ExpiredStartDay")
    public String expiredStartDay;

    @NameInMap("ExpiredEndDay")
    public String expiredEndDay;

    public static DescribeDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoRequest self = new DescribeDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeviceInfoRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDeviceInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DescribeDeviceInfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeDeviceInfoRequest setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

    public DescribeDeviceInfoRequest setExpiredStartDay(String expiredStartDay) {
        this.expiredStartDay = expiredStartDay;
        return this;
    }
    public String getExpiredStartDay() {
        return this.expiredStartDay;
    }

    public DescribeDeviceInfoRequest setExpiredEndDay(String expiredEndDay) {
        this.expiredEndDay = expiredEndDay;
        return this;
    }
    public String getExpiredEndDay() {
        return this.expiredEndDay;
    }

}
