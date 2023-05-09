// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageFromAppInstanceGroupRequest extends TeaModel {
    @NameInMap("AppCenterImageName")
    public String appCenterImageName;

    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("ProductType")
    public String productType;

    public static CreateImageFromAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageFromAppInstanceGroupRequest self = new CreateImageFromAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageFromAppInstanceGroupRequest setAppCenterImageName(String appCenterImageName) {
        this.appCenterImageName = appCenterImageName;
        return this;
    }
    public String getAppCenterImageName() {
        return this.appCenterImageName;
    }

    public CreateImageFromAppInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public CreateImageFromAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
