// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryDeviceDataListRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryDeviceDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDataListRequest self = new QueryDeviceDataListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDataListRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceDataListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDeviceDataListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
