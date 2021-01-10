// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UnbindPictureSearchAppWithDevicesRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("DeviceIotIds")
    public java.util.List<String> deviceIotIds;

    public static UnbindPictureSearchAppWithDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPictureSearchAppWithDevicesRequest self = new UnbindPictureSearchAppWithDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPictureSearchAppWithDevicesRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UnbindPictureSearchAppWithDevicesRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public UnbindPictureSearchAppWithDevicesRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public UnbindPictureSearchAppWithDevicesRequest setDeviceIotIds(java.util.List<String> deviceIotIds) {
        this.deviceIotIds = deviceIotIds;
        return this;
    }
    public java.util.List<String> getDeviceIotIds() {
        return this.deviceIotIds;
    }

}
