// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    public static UpdateDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainGroupRequest self = new UpdateDomainGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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

}
