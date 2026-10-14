// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    /**
     * <p>The address type. Valid values:</p>
     * <ul>
     * <li><strong>Ipv4</strong>: IPv4.</li>
     * <li><strong>Ipv6</strong>: IPv6.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ipv4</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The burstable protection bandwidth (the Chinese mainland). Unit: Gbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The basic protection bandwidth (the Chinese mainland). Unit: Gbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BaseBandwidth")
    public String baseBandwidth;

    /**
     * <p>The number of protected domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DomainCount")
    public String domainCount;

    /**
     * <p>The mitigation plan (the Chinese mainland). Valid values:</p>
     * <ul>
     * <li><strong>coop</strong>: Professional Edition of Anti-DDoS Pro or Anti-DDoS Premium (Chinese mainland).</li>
     * <li><strong>advance</strong>: Professional Edition of Anti-DDoS Pro or Anti-DDoS Premium (Chinese mainland).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>coop</p>
     */
    @NameInMap("EditionSale")
    public String editionSale;

    /**
     * <p>The function version. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: standard features.</li>
     * <li><strong>1</strong>: enhanced features.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FunctionVersion")
    public String functionVersion;

    /**
     * <p>The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance.</p>
     * <blockquote>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the IDs of all Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-6ja1y6p5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of specification change. Valid values:</p>
     * <ul>
     * <li>UPGRADE: Upgrade.</li>
     * <li>DOWNGRADE: Downgrade.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The clean bandwidth (outside the Chinese mainland). Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("NormalBandwidth")
    public String normalBandwidth;

    /**
     * <p>The clean queries per second (QPS). Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NormalQps")
    public String normalQps;

    /**
     * <p>The number of protected ports.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PortCount")
    public String portCount;

    /**
     * <p>The mitigation plan (outside the Chinese mainland). Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Insurance mitigation plan for Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland).</li>
     * <li><strong>1</strong>: Unlimited mitigation plan for Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland).</li>
     * <li><strong>2</strong>: acceleration line for Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland).</li>
     * <li><strong>3</strong>: secure acceleration line for Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProductPlan")
    public String productPlan;

    /**
     * <p>The product type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>ddoscoo</strong>: indicates that the China site account is used for specification changes of an Anti-DDoS Pro or Anti-DDoS Premium (Chinese mainland) instance.</li>
     * <li><strong>ddoscoo_intl</strong>: indicates that the international site account is used for specification changes of an Anti-DDoS Pro or Anti-DDoS Premium (Chinese mainland) instance.</li>
     * <li><strong>ddosDip</strong>: indicates that the China site account or international site account is used for specification changes of an Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The clean bandwidth (the Chinese mainland). Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ServiceBandwidth")
    public String serviceBandwidth;

    /**
     * <p>The line resource of the instance (the Chinese mainland). Valid values:</p>
     * <ul>
     * <li><strong>coop-line-001</strong>: eight-line BGP line for Anti-DDoS Pro or Anti-DDoS Premium (Chinese mainland).</li>
     * </ul>
     * 
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
