// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainOfDnsProductRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully attach the domain name.
     * Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: No</p>
     * </li>
     * <li><p><strong>true</strong>: Yes</p>
     * </li>
     * </ul>
     * <p>The default value is <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the Cloud DNS product.
     * You can obtain the ID by calling <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-listcloudgtminstances?spm=a2c63.p38356.help-menu-search-29697.d_0">ListCloudGtmInstances</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-7XX</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the request and response.
     * Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * <p>The default value is <strong>zh</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The domain name that you want to attach. If you leave this parameter empty, the currently attached domain name is detached.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("NewDomain")
    public String newDomain;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
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
