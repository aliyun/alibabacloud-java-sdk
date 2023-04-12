// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetIntegratedServiceStatusRequest extends TeaModel {
    /**
     * <p>The product code of the cloud product. Valid values:</p>
     * <br>
     * <p>cadt: Cloud Architecture Design Tool</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetIntegratedServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntegratedServiceStatusRequest self = new GetIntegratedServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetIntegratedServiceStatusRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
