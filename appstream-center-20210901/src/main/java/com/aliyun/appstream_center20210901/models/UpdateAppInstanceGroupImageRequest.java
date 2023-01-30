// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateAppInstanceGroupImageRequest extends TeaModel {
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("UpdateMode")
    public String updateMode;

    public static UpdateAppInstanceGroupImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInstanceGroupImageRequest self = new UpdateAppInstanceGroupImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppInstanceGroupImageRequest setAppCenterImageId(String appCenterImageId) {
        this.appCenterImageId = appCenterImageId;
        return this;
    }
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    public UpdateAppInstanceGroupImageRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public UpdateAppInstanceGroupImageRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public UpdateAppInstanceGroupImageRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UpdateAppInstanceGroupImageRequest setUpdateMode(String updateMode) {
        this.updateMode = updateMode;
        return this;
    }
    public String getUpdateMode() {
        return this.updateMode;
    }

}
