// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmInstanceGlobalConfigRequest extends TeaModel {
    /**
     * <p>The alert group of the GTM instance. Currently, only one alert group is supported.</p>
     * <br>
     * <p>>  This parameter is required for the first update, but is optional for later updates.</p>
     */
    @NameInMap("AlertGroup")
    public String alertGroup;

    /**
     * <p>The CNAME record of a domain name, which must be the primary domain name. When **CnameMode** is **CUSTOM**, this parameter is required for access.</p>
     */
    @NameInMap("CnameCustomDomainName")
    public String cnameCustomDomainName;

    /**
     * <p>Specifies whether the CNAME record is user-defined or automatically assigned by the system. Valid values:</p>
     * <br>
     * <p>*   **SYSTEM_ASSIGN**: Assigned by the system</p>
     * <p>*   **CUSTOM**: User-defined</p>
     */
    @NameInMap("CnameMode")
    public String cnameMode;

    /**
     * <p>The ID of the GTM instance whose configuration you want to modify.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the GTM instance.</p>
     * <br>
     * <p>>  This parameter is required for the first update, but is not required for later updates.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The load balancing policy. Valid values:</p>
     * <br>
     * <p>*   **ALL_RR**: Load balancing</p>
     * <br>
     * <p>*   **RATIO**: Weighted round robin</p>
     * <br>
     * <p>> This parameter is required for the first update, but is optional for later updates.</p>
     */
    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    /**
     * <p>The time when the modification takes effect.</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The primary domain name.</p>
     * <br>
     * <p>>  This parameter is required for the first update, but is optional for later updates.</p>
     */
    @NameInMap("UserDomainName")
    public String userDomainName;

    public static UpdateGtmInstanceGlobalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmInstanceGlobalConfigRequest self = new UpdateGtmInstanceGlobalConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmInstanceGlobalConfigRequest setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public String getAlertGroup() {
        return this.alertGroup;
    }

    public UpdateGtmInstanceGlobalConfigRequest setCnameCustomDomainName(String cnameCustomDomainName) {
        this.cnameCustomDomainName = cnameCustomDomainName;
        return this;
    }
    public String getCnameCustomDomainName() {
        return this.cnameCustomDomainName;
    }

    public UpdateGtmInstanceGlobalConfigRequest setCnameMode(String cnameMode) {
        this.cnameMode = cnameMode;
        return this;
    }
    public String getCnameMode() {
        return this.cnameMode;
    }

    public UpdateGtmInstanceGlobalConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateGtmInstanceGlobalConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateGtmInstanceGlobalConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmInstanceGlobalConfigRequest setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public UpdateGtmInstanceGlobalConfigRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public UpdateGtmInstanceGlobalConfigRequest setUserDomainName(String userDomainName) {
        this.userDomainName = userDomainName;
        return this;
    }
    public String getUserDomainName() {
        return this.userDomainName;
    }

}
