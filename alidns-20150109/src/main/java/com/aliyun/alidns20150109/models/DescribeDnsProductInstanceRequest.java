// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID. &lt;props=&quot;china&quot;&gt;You can call <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomaininfo?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomainInfo</a> to obtain the instance ID.&lt;props=&quot;intl&quot;&gt;You can call <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomaininfo?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainInfo</a> to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-8fxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.0</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DescribeDnsProductInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstanceRequest self = new DescribeDnsProductInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsProductInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsProductInstanceRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
