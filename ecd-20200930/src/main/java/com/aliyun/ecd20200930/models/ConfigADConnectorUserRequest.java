// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorUserRequest extends TeaModel {
    /**
     * <p>The password of the AD user that has the permission to join computers to the domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("DomainPassword")
    public String domainPassword;

    /**
     * <p>The username of the AD user that has the permission to join computers to the domain. After the configuration is complete, cloud computers created in the corresponding AD office network are added to the specified OU.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Administrator</p>
     */
    @NameInMap("DomainUserName")
    public String domainUserName;

    /**
     * <p>The organizational unit (OU) of the AD domain. You can call <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> to obtain the value.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/Domain Controllers</p>
     */
    @NameInMap("OUName")
    public String OUName;

    /**
     * <p>The ID of the AD office network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-778418****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ConfigADConnectorUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigADConnectorUserRequest self = new ConfigADConnectorUserRequest();
        return TeaModel.build(map, self);
    }

    public ConfigADConnectorUserRequest setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }
    public String getDomainPassword() {
        return this.domainPassword;
    }

    public ConfigADConnectorUserRequest setDomainUserName(String domainUserName) {
        this.domainUserName = domainUserName;
        return this;
    }
    public String getDomainUserName() {
        return this.domainUserName;
    }

    public ConfigADConnectorUserRequest setOUName(String OUName) {
        this.OUName = OUName;
        return this;
    }
    public String getOUName() {
        return this.OUName;
    }

    public ConfigADConnectorUserRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ConfigADConnectorUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
