// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RestartWuyingServerRequest extends TeaModel {
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of workstation IDs.</p>
     */
    @NameInMap("WuyingServerIdList")
    public java.util.List<String> wuyingServerIdList;

    public static RestartWuyingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartWuyingServerRequest self = new RestartWuyingServerRequest();
        return TeaModel.build(map, self);
    }

    public RestartWuyingServerRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public RestartWuyingServerRequest setWuyingServerIdList(java.util.List<String> wuyingServerIdList) {
        this.wuyingServerIdList = wuyingServerIdList;
        return this;
    }
    public java.util.List<String> getWuyingServerIdList() {
        return this.wuyingServerIdList;
    }

}
