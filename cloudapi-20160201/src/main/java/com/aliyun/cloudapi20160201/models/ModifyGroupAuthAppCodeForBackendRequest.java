// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ModifyGroupAuthAppCodeForBackendRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AuthAppCode")
    public String authAppCode;

    @NameInMap("GroupId")
    public String groupId;

    public static ModifyGroupAuthAppCodeForBackendRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupAuthAppCodeForBackendRequest self = new ModifyGroupAuthAppCodeForBackendRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupAuthAppCodeForBackendRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public ModifyGroupAuthAppCodeForBackendRequest setAuthAppCode(String authAppCode) {
        this.authAppCode = authAppCode;
        return this;
    }
    public String getAuthAppCode() {
        return this.authAppCode;
    }

    public ModifyGroupAuthAppCodeForBackendRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
