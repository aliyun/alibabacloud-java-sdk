// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("Bandwidth")
    public String bandwidth;

    @NameInMap("BaseBandwidth")
    public String baseBandwidth;

    @NameInMap("DomainCount")
    public String domainCount;

    @NameInMap("EditionSale")
    public String editionSale;

    @NameInMap("FunctionVersion")
    public String functionVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("NormalBandwidth")
    public String normalBandwidth;

    @NameInMap("NormalQps")
    public String normalQps;

    @NameInMap("PortCount")
    public String portCount;

    @NameInMap("ProductPlan")
    public String productPlan;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ServiceBandwidth")
    public String serviceBandwidth;

    @NameInMap("ServicePartner")
    public String servicePartner;

    public static ModifyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRequest self = new ModifyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public ModifyInstanceRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public ModifyInstanceRequest setBaseBandwidth(String baseBandwidth) {
        this.baseBandwidth = baseBandwidth;
        return this;
    }
    public String getBaseBandwidth() {
        return this.baseBandwidth;
    }

    public ModifyInstanceRequest setDomainCount(String domainCount) {
        this.domainCount = domainCount;
        return this;
    }
    public String getDomainCount() {
        return this.domainCount;
    }

    public ModifyInstanceRequest setEditionSale(String editionSale) {
        this.editionSale = editionSale;
        return this;
    }
    public String getEditionSale() {
        return this.editionSale;
    }

    public ModifyInstanceRequest setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }
    public String getFunctionVersion() {
        return this.functionVersion;
    }

    public ModifyInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyInstanceRequest setNormalBandwidth(String normalBandwidth) {
        this.normalBandwidth = normalBandwidth;
        return this;
    }
    public String getNormalBandwidth() {
        return this.normalBandwidth;
    }

    public ModifyInstanceRequest setNormalQps(String normalQps) {
        this.normalQps = normalQps;
        return this;
    }
    public String getNormalQps() {
        return this.normalQps;
    }

    public ModifyInstanceRequest setPortCount(String portCount) {
        this.portCount = portCount;
        return this;
    }
    public String getPortCount() {
        return this.portCount;
    }

    public ModifyInstanceRequest setProductPlan(String productPlan) {
        this.productPlan = productPlan;
        return this;
    }
    public String getProductPlan() {
        return this.productPlan;
    }

    public ModifyInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyInstanceRequest setServiceBandwidth(String serviceBandwidth) {
        this.serviceBandwidth = serviceBandwidth;
        return this;
    }
    public String getServiceBandwidth() {
        return this.serviceBandwidth;
    }

    public ModifyInstanceRequest setServicePartner(String servicePartner) {
        this.servicePartner = servicePartner;
        return this;
    }
    public String getServicePartner() {
        return this.servicePartner;
    }

}
