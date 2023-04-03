// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainGroupRequest extends TeaModel {
    /**
     * <p>The name of the domain name group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The language type.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static AddDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainGroupRequest self = new AddDomainGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddDomainGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddDomainGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
