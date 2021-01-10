// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UnbindAIPlanWithDevicesRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("IotIdList")
    public java.util.List<String> iotIdList;

    public static UnbindAIPlanWithDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAIPlanWithDevicesRequest self = new UnbindAIPlanWithDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAIPlanWithDevicesRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UnbindAIPlanWithDevicesRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public UnbindAIPlanWithDevicesRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UnbindAIPlanWithDevicesRequest setIotIdList(java.util.List<String> iotIdList) {
        this.iotIdList = iotIdList;
        return this;
    }
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
    }

}
