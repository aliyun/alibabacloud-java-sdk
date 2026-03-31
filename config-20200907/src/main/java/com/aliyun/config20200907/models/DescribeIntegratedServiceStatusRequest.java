// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeIntegratedServiceStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cadt</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static DescribeIntegratedServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntegratedServiceStatusRequest self = new DescribeIntegratedServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIntegratedServiceStatusRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
