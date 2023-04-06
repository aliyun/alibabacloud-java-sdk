// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicIpSetRequest extends TeaModel {
    /**
     * <p>The ID of the acceleration region.</p>
     * <br>
     * <p>You can call the [ListAvailableBusiRegions](~~261190~~) operation to query the acceleration regions available for a specified GA instance.</p>
     */
    @NameInMap("AccelerateRegionId")
    public String accelerateRegionId;

    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth allocated to the acceleration region. Unit: **Mbit/s**.</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The line type of the elastic IP address (EIP) in the acceleration region. Valid values:</p>
     * <br>
     * <p>*   **BGP**: BGP (Multi-ISP) lines</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines If the acceleration region is China (Hong Kong) and a basic bandwidth plan whose bandwidth type is Premium is associated with the GA instance, the default value of IspType is BGP_PRO.</p>
     * <br>
     * <p>If you are allowed to use single-ISP bandwidth, you can also specify one of the following values:</p>
     * <br>
     * <p>*   **ChinaTelecom**: China Telecom (single ISP)</p>
     * <p>*   **ChinaUnicom**: China Unicom (single ISP)</p>
     * <p>*   **ChinaMobile**: China Mobile (single ISP)</p>
     * <p>*   **ChinaTelecom_L2**: China Telecom \_L2 (single ISP)</p>
     * <p>*   **ChinaUnicom_L2**: China Unicom \_L2 (single ISP)</p>
     * <p>*   **ChinaMobile_L2**: China Mobile \_L2 (single ISP)</p>
     * <br>
     * <p>> Different acceleration regions support different single-ISP BGP lines.</p>
     */
    @NameInMap("IspType")
    public String ispType;

    /**
     * <p>The ID of the region where the basic GA instance is deployed. Set the value to **cn-hangzhou**.</p>
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
