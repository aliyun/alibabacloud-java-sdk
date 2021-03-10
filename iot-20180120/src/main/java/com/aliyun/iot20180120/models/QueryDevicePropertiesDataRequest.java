// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePropertiesDataRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("DeviceName")
    @Validation(required = true)
    public String deviceName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("Identifier")
    @Validation(required = true)
    public java.util.List<String> identifier;

    @NameInMap("Asc")
    @Validation(required = true)
    public Integer asc;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    public static QueryDevicePropertiesDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePropertiesDataRequest self = new QueryDevicePropertiesDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePropertiesDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDevicePropertiesDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDevicePropertiesDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDevicePropertiesDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDevicePropertiesDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryDevicePropertiesDataRequest setIdentifier(java.util.List<String> identifier) {
        this.identifier = identifier;
        return this;
    }
    public java.util.List<String> getIdentifier() {
        return this.identifier;
    }

    public QueryDevicePropertiesDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDevicePropertiesDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDevicePropertiesDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
