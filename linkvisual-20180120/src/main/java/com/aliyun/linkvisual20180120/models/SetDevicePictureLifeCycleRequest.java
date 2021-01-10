// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class SetDevicePictureLifeCycleRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("Day")
    public Integer day;

    public static SetDevicePictureLifeCycleRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePictureLifeCycleRequest self = new SetDevicePictureLifeCycleRequest();
        return TeaModel.build(map, self);
    }

    public SetDevicePictureLifeCycleRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public SetDevicePictureLifeCycleRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public SetDevicePictureLifeCycleRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public SetDevicePictureLifeCycleRequest setDay(Integer day) {
        this.day = day;
        return this;
    }
    public Integer getDay() {
        return this.day;
    }

}
