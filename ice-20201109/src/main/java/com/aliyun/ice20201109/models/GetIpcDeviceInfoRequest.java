// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetIpcDeviceInfoRequest extends TeaModel {
    /**
     * <p>The capability. Default value: understand. Valid values:</p>
     * <ul>
     * <li>understand: Understanding.</li>
     * <li>understand-reid: Understanding with ReID.</li>
     * <li>search: Search.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>understand</p>
     */
    @NameInMap("Capability")
    public String capability;

    /**
     * <p>The device ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d123</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>The end time in UTC. Format: yyyy-MM-ddTHH:mm:ssZ. The interval between the end time and the start time cannot exceed 180 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-02-11T12:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
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
