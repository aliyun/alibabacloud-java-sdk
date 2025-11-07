// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssStatusRequest extends TeaModel {
    /**
     * <p>Service code:</p>
     * <ul>
     * <li>antcloudauth: Financial-grade real-person authentication</li>
     * <li>cloudauthst (discontinued): Enhanced real-person authentication</li>
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
