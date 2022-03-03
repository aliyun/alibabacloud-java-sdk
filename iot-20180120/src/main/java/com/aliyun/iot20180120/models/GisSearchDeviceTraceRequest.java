// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GisSearchDeviceTraceRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("MapMatch")
    public Integer mapMatch;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("StartTime")
    public Long startTime;

    public static GisSearchDeviceTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GisSearchDeviceTraceRequest self = new GisSearchDeviceTraceRequest();
        return TeaModel.build(map, self);
    }

    public GisSearchDeviceTraceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GisSearchDeviceTraceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GisSearchDeviceTraceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GisSearchDeviceTraceRequest setMapMatch(Integer mapMatch) {
        this.mapMatch = mapMatch;
        return this;
    }
    public Integer getMapMatch() {
        return this.mapMatch;
    }

    public GisSearchDeviceTraceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public GisSearchDeviceTraceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
