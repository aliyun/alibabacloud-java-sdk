// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceServiceDataRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("Asc")
    public Integer asc;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static QueryDeviceServiceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceServiceDataRequest self = new QueryDeviceServiceDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceServiceDataRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryDeviceServiceDataRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryDeviceServiceDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceServiceDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceServiceDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceServiceDataRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceServiceDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryDeviceServiceDataRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public QueryDeviceServiceDataRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDeviceServiceDataRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceServiceDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryDeviceServiceDataRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public QueryDeviceServiceDataRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

}
