// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainGroupRequest extends TeaModel {
    /**
     * <p>The domain name. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains </a>operation to obtain the domain name.</p>
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
     * <li>If you do not specify GroupId, the domain name belongs to the default group.</li>
     * <li>If you specify an empty string &quot;&quot; for GroupId, the domain name belongs to the default group.</li>
     * <li>If you set GroupId to defaultGroup, the domain name belongs to the default group.</li>
     * <li>If you specify GroupId to another value and the value is verified existent, the value of GroupId for the target domain name is updated. If the value is verified inexistent, the value of GroupId for the target domain name is not updated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2223</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en</p>
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
