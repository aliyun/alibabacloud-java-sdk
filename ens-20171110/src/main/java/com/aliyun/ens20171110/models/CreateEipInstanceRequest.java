// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEipInstanceRequest extends TeaModel {
    /**
     * <p>The peak bandwidth of the EIP. Default value: 5. Valid values: 5 to 10000. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The description of the EIP.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The billing method of the EIP. Set the value to **PostPaid**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the EIP. Set the value to **95BandwidthByMonth**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The Internet service provider. Valid values:</p>
     * <br>
     * <p>*   **cmcc**: China Mobile</p>
     * <p>*   **unicom**: China Unicom</p>
     * <p>*   **telecom**: China Telecom</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The name of the EIP.</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateEipInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEipInstanceRequest self = new CreateEipInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEipInstanceRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateEipInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEipInstanceRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateEipInstanceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateEipInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateEipInstanceRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public CreateEipInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
