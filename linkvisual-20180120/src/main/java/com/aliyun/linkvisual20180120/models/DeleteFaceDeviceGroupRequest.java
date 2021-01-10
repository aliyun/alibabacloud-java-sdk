// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceDeviceGroupRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static DeleteFaceDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceDeviceGroupRequest self = new DeleteFaceDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceDeviceGroupRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public DeleteFaceDeviceGroupRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public DeleteFaceDeviceGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public DeleteFaceDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
