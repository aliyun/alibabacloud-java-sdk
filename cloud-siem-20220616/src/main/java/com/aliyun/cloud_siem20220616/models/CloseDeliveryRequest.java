// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class CloseDeliveryRequest extends TeaModel {
    /**
     * <p>The code of the log within the cloud service. For example, the process log of Security Center. For valid values, see the return value of the ListDelivery operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_siem_aegis_proc</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <p>The code of the cloud service. Valid values:</p>
     * <ul>
     * <li><p>qcloud_waf</p>
     * </li>
     * <li><p>qlcoud_cfw</p>
     * </li>
     * <li><p>hcloud_waf</p>
     * </li>
     * <li><p>hcloud_cfw</p>
     * </li>
     * <li><p>ddos</p>
     * </li>
     * <li><p>sas</p>
     * </li>
     * <li><p>cfw</p>
     * </li>
     * <li><p>config</p>
     * </li>
     * <li><p>csk</p>
     * </li>
     * <li><p>fc</p>
     * </li>
     * <li><p>rds</p>
     * </li>
     * <li><p>nas</p>
     * </li>
     * <li><p>apigateway</p>
     * </li>
     * <li><p>cdn</p>
     * </li>
     * <li><p>mongodb</p>
     * </li>
     * <li><p>eip</p>
     * </li>
     * <li><p>slb</p>
     * </li>
     * <li><p>vpc</p>
     * </li>
     * <li><p>actiontrail</p>
     * </li>
     * <li><p>waf</p>
     * </li>
     * <li><p>bastionhost</p>
     * </li>
     * <li><p>oss</p>
     * </li>
     * <li><p>polardb</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region where the data management center of threat analysis is located. Select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Select this region if your assets are in the Chinese mainland or Hong Kong (China).</p>
     * </li>
     * <li><p>ap-southeast-1: Select this region if your assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can use this parameter to switch to the perspective of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts in your enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static CloseDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDeliveryRequest self = new CloseDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public CloseDeliveryRequest setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public CloseDeliveryRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CloseDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CloseDeliveryRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CloseDeliveryRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
