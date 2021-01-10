// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceRecordLifeCycleRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("DeviceList")
    public java.util.List<String> deviceList;

    public static QueryDeviceRecordLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRecordLifeCycleRequest self = new QueryDeviceRecordLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRecordLifeCycleRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryDeviceRecordLifeCycleRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryDeviceRecordLifeCycleRequest setDeviceList(java.util.List<String> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<String> getDeviceList() {
        return this.deviceList;
    }

}
