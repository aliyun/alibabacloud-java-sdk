// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetSpareIpRequest extends TeaModel {
    /**
     * <p>The instance ID of the Alibaba Cloud Global Accelerator (GA) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of a request.</p>
     * <p>Generate a unique value from your client to ensure that different requests have unique ClientToken values. ClientToken supports only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1F4B6A4A-C89E-489E-BAF1-52777EE148EF</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without actually creating the resource. The system checks the required parameters, request syntax, and business limitations. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the check passes, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The region ID of the Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The CNAME spare IP address. When an acceleration area is abnormal, traffic is switched to this IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("SpareIp")
    public String spareIp;

    public static GetSpareIpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpareIpRequest self = new GetSpareIpRequest();
        return TeaModel.build(map, self);
    }

    public GetSpareIpRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetSpareIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetSpareIpRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GetSpareIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSpareIpRequest setSpareIp(String spareIp) {
        this.spareIp = spareIp;
        return this;
    }
    public String getSpareIp() {
        return this.spareIp;
    }

}
