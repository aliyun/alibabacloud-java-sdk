// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssStatusV2Request extends TeaModel {
    /**
     * <p>The ServiceCode of the ID Verification cloud service. Valid values:</p>
     * <ul>
     * <li><strong>antcloudauth</strong>: Financial-grade ID Verification.</li>
     * <li><strong>cloudauthst</strong> (retired): ID Verification Enhanced Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The source IP address of the requester.</p>
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
