// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainGroupRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the target domain name group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language type.</p>
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
