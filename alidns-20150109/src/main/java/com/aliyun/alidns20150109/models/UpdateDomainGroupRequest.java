// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainGroupRequest extends TeaModel {
    /**
     * <p>The ID of the domain name group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The new name of the domain name group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static UpdateDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainGroupRequest self = new UpdateDomainGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateDomainGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateDomainGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
