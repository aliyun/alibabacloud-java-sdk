// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssStatusV2Request extends TeaModel {
    /**
     * <p>ServiceCode for Real Person Cloud products:</p>
     * <ul>
     * <li><strong>antcloudauth</strong>: Financial-grade real person authentication</li>
     * <li><strong>cloudauthst (discontinued)</strong>: Enhanced real person authentication</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Visitor\&quot;s source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>120.25.41.25</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeOssStatusV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStatusV2Request self = new DescribeOssStatusV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeOssStatusV2Request setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeOssStatusV2Request setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
