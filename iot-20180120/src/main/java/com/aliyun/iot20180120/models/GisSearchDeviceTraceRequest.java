// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GisSearchDeviceTraceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mock_device_name</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1645071254000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>iot-a****13l</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MapMatch")
    public Integer mapMatch;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>g3r****Vjta</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1645071254000</p>
     */
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
