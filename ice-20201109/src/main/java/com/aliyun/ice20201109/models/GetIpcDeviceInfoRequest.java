// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetIpcDeviceInfoRequest extends TeaModel {
    /**
     * <p>Capability. Default value is understand. Valid values:</p>
     * <ul>
     * <li><p>understand: understanding</p>
     * </li>
     * <li><p>understand-reid: understanding with reid</p>
     * </li>
     * <li><p>search: search</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>understand</p>
     */
    @NameInMap("Capability")
    public String capability;

    /**
     * <p>Device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d123</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>End Time. UTC time in the format yyyy-MM-ddTHH:mm:ssZ. The difference between EndTime and StartTime must not exceed 180 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-02-11T12:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Page number for paging. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Page size, which specifies the number of entries displayed per page. Default value is 10. Maximum value is 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Start Time. UTC time in the format yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-11T12:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetIpcDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpcDeviceInfoRequest self = new GetIpcDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetIpcDeviceInfoRequest setCapability(String capability) {
        this.capability = capability;
        return this;
    }
    public String getCapability() {
        return this.capability;
    }

    public GetIpcDeviceInfoRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetIpcDeviceInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetIpcDeviceInfoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetIpcDeviceInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetIpcDeviceInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
