// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class BindAIPlanWithDevicesRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("IotIdList")
    public java.util.List<String> iotIdList;

    public static BindAIPlanWithDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAIPlanWithDevicesRequest self = new BindAIPlanWithDevicesRequest();
        return TeaModel.build(map, self);
    }

    public BindAIPlanWithDevicesRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BindAIPlanWithDevicesRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public BindAIPlanWithDevicesRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public BindAIPlanWithDevicesRequest setIotIdList(java.util.List<String> iotIdList) {
        this.iotIdList = iotIdList;
        return this;
    }
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
    }

}
