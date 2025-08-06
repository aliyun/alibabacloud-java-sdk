// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastEipAddressRequest extends TeaModel {
    /**
     * <p>The ID of the Anycast EIP.</p>
     * <blockquote>
     * <p>You must specify <strong>Ip</strong> or <strong>AnycastId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aeip-bp1ix34fralt4ykf3****</p>
     */
    @NameInMap("AnycastId")
    public String anycastId;

    /**
     * <p>The ID of the endpoint with which the Anycast EIP is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2zebb08phyczzawe****</p>
     */
    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    /**
     * <p>The IP address of the Anycast EIP.</p>
     * <blockquote>
     * <p>You must specify <strong>Ip</strong> or <strong>AnycastId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>139.95.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    public static DescribeAnycastEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastEipAddressRequest self = new DescribeAnycastEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastEipAddressRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public DescribeAnycastEipAddressRequest setBindInstanceId(String bindInstanceId) {
        this.bindInstanceId = bindInstanceId;
        return this;
    }
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    public DescribeAnycastEipAddressRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
