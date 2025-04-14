// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyInstanceRequest extends TeaModel {
    /**
     * <p>Address type. Values:</p>
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
     * <p>Elastic protection bandwidth (Mainland China). Unit: Gbps.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>Guaranteed protection bandwidth (Mainland China). Unit: Gbps.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("BaseBandwidth")
    public String baseBandwidth;

    /**
     * <p>Number of protected domains.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DomainCount")
    public String domainCount;

    /**
     * <p>Protection package (Mainland China). Values:</p>
     * <ul>
     * <li><strong>coop</strong>: Indicates the DDoS High Defense (Mainland China) Professional Edition.</li>
     * <li><strong>advance</strong>: Indicates the DDoS High Defense (Mainland China) Professional Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>coop</p>
     */
    @NameInMap("EditionSale")
    public String editionSale;

    /**
     * <p>Function version, with values:</p>
     * <ul>
     * <li><strong>0</strong>: Standard function.</li>
     * <li><strong>1</strong>: Enhanced function.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FunctionVersion")
    public String functionVersion;

    /**
     * <p>The ID of the DDoS High Defense instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> to query the ID information of all DDoS High Defense instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-6ja1y6p5****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Adjustment type, with values</p>
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
     * <p>Business bandwidth (outside Mainland China). Unit: Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("NormalBandwidth")
    public String normalBandwidth;

    /**
     * <p>Business QPS. Unit: Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NormalQps")
    public String normalQps;

    /**
     * <p>Number of protected ports.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PortCount")
    public String portCount;

    /**
     * <p>Protection package (outside Mainland China). Values:</p>
     * <ul>
     * <li><strong>0</strong>: Indicates the DDoS High Defense (outside Mainland China) Insurance Edition.</li>
     * <li><strong>1</strong>: Indicates the DDoS High Defense (outside Mainland China) Worry-Free Edition.</li>
     * <li><strong>2</strong>: Indicates the DDoS High Defense (outside Mainland China) Acceleration Line.</li>
     * <li><strong>3</strong>: Indicates the DDoS High Defense (outside Mainland China) Secure Acceleration Line.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProductPlan")
    public String productPlan;

    /**
     * <p>Product type.
     * Values:</p>
     * <ul>
     * <li><strong>ddoscoo</strong>: Indicates that the DDoS High Defense (Mainland China) instance is being adjusted for a China site account.</li>
     * <li><strong>ddoscoo_intl</strong>: Indicates that the DDoS High Defense (Mainland China) instance is being adjusted for an international site account.</li>
     * <li><strong>ddosDip</strong>: Indicates that the DDoS High Defense (outside Mainland China) instance is being adjusted for either a China or international site account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Business bandwidth (Mainland China). Unit: Mbps.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("ServiceBandwidth")
    public String serviceBandwidth;

    /**
     * <p>Line resources of the instance (Mainland China). Values:</p>
     * <ul>
     * <li><strong>coop-line-001</strong>: Indicates the DDoS High Defense (Mainland China) 8-line BGP line.</li>
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
