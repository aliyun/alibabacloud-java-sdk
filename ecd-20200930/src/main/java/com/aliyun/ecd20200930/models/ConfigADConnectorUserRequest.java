// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorUserRequest extends TeaModel {
    /**
     * <p>The password of the AD user that has the permissions to join computers to domains.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("DomainPassword")
    public String domainPassword;

    /**
     * <p>The username of the AD user that has the permissions to join computers to domains.</p>
     * <p>After the username is configured, the cloud desktops in the same AD workspace are joined to the specified OU.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Administrator</p>
     */
    @NameInMap("DomainUserName")
    public String domainUserName;

    /**
     * <p>The name of the OU in the AD domain. You can call the <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> to obtain the OU name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/Domain Controllers</p>
     */
    @NameInMap("OUName")
    public String OUName;

    /**
     * <p>The ID of the AD workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-778418****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the region.</p>
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
