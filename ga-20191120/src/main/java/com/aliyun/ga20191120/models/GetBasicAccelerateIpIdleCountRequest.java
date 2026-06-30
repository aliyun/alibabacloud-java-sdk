// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpIdleCountRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of a request.</p>
     * <p>Generate a parameter value from your client to ensure that the value is unique among different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The acceleration region instance ID of the basic Alibaba Cloud Global Accelerator (GA) instance that you want to query.</p>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/2253380.html">GetBasicAccelerator</a> to query the acceleration region instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ips-bp11r5jb8ogp122xl****</p>
     */
    @NameInMap("IpSetId")
    public String ipSetId;

    /**
     * <p>The region ID of Global Accelerator. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetBasicAccelerateIpIdleCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpIdleCountRequest self = new GetBasicAccelerateIpIdleCountRequest();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpIdleCountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetBasicAccelerateIpIdleCountRequest setIpSetId(String ipSetId) {
        this.ipSetId = ipSetId;
        return this;
    }
    public String getIpSetId() {
        return this.ipSetId;
    }

    public GetBasicAccelerateIpIdleCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
