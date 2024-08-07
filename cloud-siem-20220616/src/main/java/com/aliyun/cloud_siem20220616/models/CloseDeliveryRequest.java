// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class CloseDeliveryRequest extends TeaModel {
    /**
     * <p>The log code of the cloud service, such as the code of the process log for Security Center. You can obtain the log code from the response of the ListDelivery operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_siem_aegis_proc</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <p>The code of the cloud service. Valid values:</p>
     * <ul>
     * <li>qcloud_waf</li>
     * <li>qlcoud_cfw</li>
     * <li>hcloud_waf</li>
     * <li>hcloud_cfw</li>
     * <li>ddos</li>
     * <li>sas</li>
     * <li>cfw</li>
     * <li>config</li>
     * <li>csk</li>
     * <li>fc</li>
     * <li>rds</li>
     * <li>nas</li>
     * <li>apigateway</li>
     * <li>cdn</li>
     * <li>mongodb</li>
     * <li>eip</li>
     * <li>slb</li>
     * <li>vpc</li>
     * <li>actiontrail</li>
     * <li>waf</li>
     * <li>bastionhost</li>
     * <li>oss</li>
     * <li>polardb</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
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
