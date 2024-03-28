// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicIpSetRequest extends TeaModel {
    /**
     * <p>The ID of the acceleration region.</p>
     * <br>
     * <p>You can call the [ListAvailableBusiRegions](~~261190~~) operation to query the most recent acceleration region list.</p>
     */
    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth that you want to allocate to the acceleration region. Unit: **Mbit/s**.</p>
     * <br>
     * <p>You must allocate at least 2 Mbit/s of bandwidth to the acceleration region.</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): BGP (Multi-ISP) lines.</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines.</p>
     * <br>
     * <p>Valid values if you are allowed to use single-ISP bandwidth:</p>
     * <br>
     * <p>*   **ChinaTelecom**</p>
     * <p>*   **ChinaUnicom**</p>
     * <p>*   **ChinaMobile**</p>
     * <p>*   **ChinaTelecom_L2**</p>
     * <p>*   **ChinaUnicom_L2**</p>
     * <p>*   **ChinaMobile_L2**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If the bandwidth metering method of the GA instance is **pay-by-data-transfer**, this parameter is required.</p>
     * <br>
     * <p>*   If the acceleration region is China (Hong Kong) and a basic bandwidth plan whose bandwidth type is Premium is associated with the GA instance, the default value of IspType is BGP_PRO.</p>
     * <br>
     * <p>*   The supported single-ISP type varies based on the acceleration region.</p>
     */
    @NameInMap("IspType")
    public String ispType;

    /**
     * <p>The region ID of the basic GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicIpSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicIpSetRequest self = new CreateBasicIpSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicIpSetRequest setAccelerateRegionId(String accelerateRegionId) {
        this.accelerateRegionId = accelerateRegionId;
        return this;
    }
    public String getAccelerateRegionId() {
        return this.accelerateRegionId;
    }

    public CreateBasicIpSetRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicIpSetRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateBasicIpSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicIpSetRequest setIspType(String ispType) {
        this.ispType = ispType;
        return this;
    }
    public String getIspType() {
        return this.ispType;
    }

    public CreateBasicIpSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
