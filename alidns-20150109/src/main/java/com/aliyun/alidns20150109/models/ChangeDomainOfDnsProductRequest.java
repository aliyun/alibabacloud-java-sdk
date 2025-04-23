// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly bind a domain name to the instance. Valid values:</p>
     * <ul>
     * <li><strong>false</strong><strong>: no</strong></li>
     * <li><strong>true</strong>: <strong>yes</strong></li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the Alibaba Cloud Domain Name System (DNS) instance.</p>
     * <p>You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-listcloudgtminstances?spm=a2c63.p38356.help-menu-search-29697.d_0">ListCloudGtmInstances </a>operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-7sb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>zh</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The domain name that you want to bind to the instance. If you leave this parameter empty, the domain name that is bound to the instance is unbound from the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>newdomain.com</p>
     */
    @NameInMap("NewDomain")
    public String newDomain;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ChangeDomainOfDnsProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainOfDnsProductRequest self = new ChangeDomainOfDnsProductRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDomainOfDnsProductRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public ChangeDomainOfDnsProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeDomainOfDnsProductRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ChangeDomainOfDnsProductRequest setNewDomain(String newDomain) {
        this.newDomain = newDomain;
        return this;
    }
    public String getNewDomain() {
        return this.newDomain;
    }

    public ChangeDomainOfDnsProductRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
