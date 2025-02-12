// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ipv4</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BaseBandwidth")
    public String baseBandwidth;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DomainCount")
    public String domainCount;

    /**
     * <strong>example:</strong>
     * <p>coop</p>
     */
    @NameInMap("EditionSale")
    public String editionSale;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FunctionVersion")
    public String functionVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-6ja1y6p5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("NormalBandwidth")
    public String normalBandwidth;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NormalQps")
    public String normalQps;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PortCount")
    public String portCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProductPlan")
    public String productPlan;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ServiceBandwidth")
    public String serviceBandwidth;

    /**
     * <strong>example:</strong>
     * <p>coop-line-001</p>
     */
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
