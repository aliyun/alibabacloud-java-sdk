// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryStorageOrderListRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceNoOwner")
    public Boolean deviceNoOwner;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductKey")
    public String productKey;

    public static QueryStorageOrderListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStorageOrderListRequest self = new QueryStorageOrderListRequest();
        return TeaModel.build(map, self);
    }

    public QueryStorageOrderListRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryStorageOrderListRequest setDeviceNoOwner(Boolean deviceNoOwner) {
        this.deviceNoOwner = deviceNoOwner;
        return this;
    }
    public Boolean getDeviceNoOwner() {
        return this.deviceNoOwner;
    }

    public QueryStorageOrderListRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryStorageOrderListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryStorageOrderListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryStorageOrderListRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
