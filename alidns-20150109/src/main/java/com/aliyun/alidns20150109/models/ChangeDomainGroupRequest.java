// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainGroupRequest extends TeaModel {
    /**
     * <p>The domain name.&lt;props=&quot;china&quot;&gt; Call <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomains</a> to obtain the domain name.
     * &lt;props=&quot;intl&quot;&gt;Call <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> to obtain the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the target domain name group.</p>
     * <ul>
     * <li><p>If you do not specify GroupId, the domain name is moved to the default group.</p>
     * </li>
     * <li><p>If GroupId is an empty string (&quot;&quot;), the domain name is moved to the default group.</p>
     * </li>
     * <li><p>If GroupId is defaultGroup, the domain name is moved to the default group.</p>
     * </li>
     * <li><p>If GroupId is a different value, the system checks if the group exists. If the group exists, the domain name\&quot;s group is updated. If the group does not exist, the group is not updated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60bb3ef15ace449082cf914ed3ea****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ChangeDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainGroupRequest self = new ChangeDomainGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDomainGroupRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ChangeDomainGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ChangeDomainGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
