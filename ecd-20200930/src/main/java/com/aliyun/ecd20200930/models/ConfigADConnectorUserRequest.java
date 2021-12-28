// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ConfigADConnectorUserRequest extends TeaModel {
    @NameInMap("DomainPassword")
    public String domainPassword;

    @NameInMap("DomainUserName")
    public String domainUserName;

    @NameInMap("OUName")
    public String OUName;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

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
