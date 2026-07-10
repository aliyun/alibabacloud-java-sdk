// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssStatusRequest extends TeaModel {
    /**
     * <p>The service code. Valid values:</p>
     * <ul>
     * <li>antcloudauth: Chinese financial-grade ID Verification.</li>
     * <li>cloudauthst (discontinued): ID Verification Enhanced Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static DescribeOssStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStatusRequest self = new DescribeOssStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssStatusRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
