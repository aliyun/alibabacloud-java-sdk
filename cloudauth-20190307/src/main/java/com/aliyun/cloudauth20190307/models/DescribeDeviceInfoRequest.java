// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FACE_TEST</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>wd.6ziUffspAeW5FVYbaqmexR-1qwNjM</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>20200330</p>
     */
    @NameInMap("ExpiredEndDay")
    public String expiredEndDay;

    /**
     * <strong>example:</strong>
     * <p>20190401</p>
     */
    @NameInMap("ExpiredStartDay")
    public String expiredStartDay;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>3iJ1AY$oHcu7mC69</p>
     */
    @NameInMap("UserDeviceId")
    public String userDeviceId;

    public static DescribeDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoRequest self = new DescribeDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
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

    public DescribeDeviceInfoRequest setExpiredEndDay(String expiredEndDay) {
        this.expiredEndDay = expiredEndDay;
        return this;
    }
    public String getExpiredEndDay() {
        return this.expiredEndDay;
    }

    public DescribeDeviceInfoRequest setExpiredStartDay(String expiredStartDay) {
        this.expiredStartDay = expiredStartDay;
        return this;
    }
    public String getExpiredStartDay() {
        return this.expiredStartDay;
    }

    public DescribeDeviceInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeviceInfoRequest setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

}
