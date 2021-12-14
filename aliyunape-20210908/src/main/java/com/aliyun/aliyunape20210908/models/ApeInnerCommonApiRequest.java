// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ApeInnerCommonApiRequest extends TeaModel {
    // appName
    @NameInMap("AppName")
    public String appName;

    // channel
    @NameInMap("Channel")
    public String channel;

    // endTime
    @NameInMap("EndTime")
    public String endTime;

    // lat
    @NameInMap("Lat")
    public String lat;

    // lon
    @NameInMap("Lon")
    public String lon;

    // pageNum
    @NameInMap("PageNum")
    public Integer pageNum;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // spCode
    @NameInMap("SpCode")
    public String spCode;

    // startTime
    @NameInMap("StartTime")
    public String startTime;

    // station
    @NameInMap("Station")
    public String station;

    public static ApeInnerCommonApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ApeInnerCommonApiRequest self = new ApeInnerCommonApiRequest();
        return TeaModel.build(map, self);
    }

    public ApeInnerCommonApiRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ApeInnerCommonApiRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ApeInnerCommonApiRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ApeInnerCommonApiRequest setLat(String lat) {
        this.lat = lat;
        return this;
    }
    public String getLat() {
        return this.lat;
    }

    public ApeInnerCommonApiRequest setLon(String lon) {
        this.lon = lon;
        return this;
    }
    public String getLon() {
        return this.lon;
    }

    public ApeInnerCommonApiRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ApeInnerCommonApiRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ApeInnerCommonApiRequest setSpCode(String spCode) {
        this.spCode = spCode;
        return this;
    }
    public String getSpCode() {
        return this.spCode;
    }

    public ApeInnerCommonApiRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ApeInnerCommonApiRequest setStation(String station) {
        this.station = station;
        return this;
    }
    public String getStation() {
        return this.station;
    }

}
