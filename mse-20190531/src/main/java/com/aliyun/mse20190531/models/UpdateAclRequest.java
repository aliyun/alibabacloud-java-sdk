// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateAclRequest extends TeaModel {
    @NameInMap("AclEntryList")
    public String aclEntryList;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateAclRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAclRequest self = new UpdateAclRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAclRequest setAclEntryList(String aclEntryList) {
        this.aclEntryList = aclEntryList;
        return this;
    }
    public String getAclEntryList() {
        return this.aclEntryList;
    }

    public UpdateAclRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
