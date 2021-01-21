// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceRecordLifeCycleRequest extends TeaModel {
    @NameInMap("DeviceList")
    @Validation(required = true)
    public java.util.List<String> deviceList;

    public static QueryDeviceRecordLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRecordLifeCycleRequest self = new QueryDeviceRecordLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRecordLifeCycleRequest setDeviceList(java.util.List<String> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<String> getDeviceList() {
        return this.deviceList;
    }

}
