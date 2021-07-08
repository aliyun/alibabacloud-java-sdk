// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EIP extends TeaModel {
    // ENS节点ID
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    // EIP的带宽峰值
    @NameInMap("Bandwidth")
    public Long bandwidth;

    // EIP的计费方式，取值： PrePaid：包年包月。 PostPaid（默认值）：按量计费。 当InstanceChargeType取值为PostPaid时，InternetChargeType不能为PayByBandwidth
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // EIP的计量方式，取值： PayByBandwidth（默认值）：按带宽计费。 取值：95BandwidthByMonth：月95。
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    // EIP实例名称。
    @NameInMap("Name")
    public String name;

    // 运营商信息
    @NameInMap("Isp")
    public String isp;

    public static EIP build(java.util.Map<String, ?> map) throws Exception {
        EIP self = new EIP();
        return TeaModel.build(map, self);
    }

    public EIP setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public EIP setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public EIP setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public EIP setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public EIP setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EIP setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

}
