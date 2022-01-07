// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceOriginalPropertyStatusRequest extends TeaModel {
    @NameInMap("Asc")
    public Integer asc;

    @NameInMap("DeviceName")
    public String deviceName;

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

    public static QueryDeviceOriginalPropertyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceOriginalPropertyStatusRequest self = new QueryDeviceOriginalPropertyStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceOriginalPropertyStatusRequest setAsc(Integer asc) {
        this.asc = asc;
        return this;
    }
    public Integer getAsc() {
        return this.asc;
    }

    public QueryDeviceOriginalPropertyStatusRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceOriginalPropertyStatusRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceOriginalPropertyStatusRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceOriginalPropertyStatusRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryDeviceOriginalPropertyStatusRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceOriginalPropertyStatusRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
