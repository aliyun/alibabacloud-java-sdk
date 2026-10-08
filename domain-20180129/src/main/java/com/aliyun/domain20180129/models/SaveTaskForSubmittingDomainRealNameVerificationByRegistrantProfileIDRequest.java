// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest extends TeaModel {
    /**
     * <p>The domain name to submit for real-name verification.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the domain name instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the error message to return. Valid values: <code>zh</code> (Chinese) and <code>en</code> (English). Default value: <code>en</code>.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the registrant profile to use for real-name verification.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>The IP address of the client that makes the request.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest self = new SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
