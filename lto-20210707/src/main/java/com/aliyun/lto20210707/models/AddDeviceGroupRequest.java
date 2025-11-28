// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddDeviceGroupRequest extends TeaModel {
    @NameInMap("AuthorizedCount")
    public Integer authorizedCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Remark")
    public String remark;

    public static AddDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceGroupRequest self = new AddDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceGroupRequest setAuthorizedCount(Integer authorizedCount) {
        this.authorizedCount = authorizedCount;
        return this;
    }
    public Integer getAuthorizedCount() {
        return this.authorizedCount;
    }

    public AddDeviceGroupRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public AddDeviceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddDeviceGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
