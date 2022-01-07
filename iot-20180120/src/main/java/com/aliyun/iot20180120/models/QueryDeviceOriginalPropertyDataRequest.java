// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyDataRequest extends TeaModel {
    @NameInMap("Asc")
    public Integer asc;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryDeviceOriginalPropertyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyDataRequest self = new QueryDeviceOriginalPropertyDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDeviceOriginalPropertyDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceOriginalPropertyDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDeviceOriginalPropertyDataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceOriginalPropertyDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceOriginalPropertyDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceOriginalPropertyDataRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryDeviceOriginalPropertyDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceOriginalPropertyDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceOriginalPropertyDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
